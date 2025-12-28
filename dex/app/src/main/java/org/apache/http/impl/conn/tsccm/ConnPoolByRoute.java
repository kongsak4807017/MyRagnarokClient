package org.apache.http.impl.conn.tsccm;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class ConnPoolByRoute extends AbstractConnPool {
    protected final ConnPerRoute connPerRoute;
    private final long connTTL;
    private final TimeUnit connTTLTimeUnit;
    protected final Queue<BasicPoolEntry> freeConnections;
    protected final Set<BasicPoolEntry> leasedConnections;
    private final Log log;
    protected volatile int maxTotalConnections;
    protected volatile int numConnections;
    protected final ClientConnectionOperator operator;
    private final Lock poolLock;
    protected final Map<HttpRoute, RouteSpecificPool> routeToPool;
    protected volatile boolean shutdown;
    protected final Queue<WaitingThread> waitingThreads;

    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, ConnPerRoute connPerRoute, int i) {
        this(clientConnectionOperator, connPerRoute, i, -1L, TimeUnit.MILLISECONDS);
    }

    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, ConnPerRoute connPerRoute, int i, long j, TimeUnit timeUnit) {
        this.log = LogFactory.getLog(getClass());
        Args.notNull(clientConnectionOperator, "Connection operator");
        Args.notNull(connPerRoute, "Connections per route");
        this.poolLock = super.poolLock;
        this.leasedConnections = super.leasedConnections;
        this.operator = clientConnectionOperator;
        this.connPerRoute = connPerRoute;
        this.maxTotalConnections = i;
        this.freeConnections = createFreeConnQueue();
        this.waitingThreads = createWaitingThreadQueue();
        this.routeToPool = createRouteToPoolMap();
        this.connTTL = j;
        this.connTTLTimeUnit = timeUnit;
    }

    protected Lock getLock() {
        return this.poolLock;
    }

    @Deprecated
    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, HttpParams httpParams) {
        this(clientConnectionOperator, ConnManagerParams.getMaxConnectionsPerRoute(httpParams), ConnManagerParams.getMaxTotalConnections(httpParams));
    }

    protected Queue<BasicPoolEntry> createFreeConnQueue() {
        return new LinkedList();
    }

    protected Queue<WaitingThread> createWaitingThreadQueue() {
        return new LinkedList();
    }

    protected Map<HttpRoute, RouteSpecificPool> createRouteToPoolMap() {
        return new HashMap();
    }

    protected RouteSpecificPool newRouteSpecificPool(HttpRoute httpRoute) {
        return new RouteSpecificPool(httpRoute, this.connPerRoute);
    }

    protected WaitingThread newWaitingThread(Condition condition, RouteSpecificPool routeSpecificPool) {
        return new WaitingThread(condition, routeSpecificPool);
    }

    private void closeConnection(BasicPoolEntry basicPoolEntry) {
        OperatedClientConnection connection = basicPoolEntry.getConnection();
        if (connection != null) {
            try {
                connection.close();
            } catch (IOException e) {
                this.log.debug("I/O error closing connection", e);
            }
        }
    }

    protected RouteSpecificPool getRoutePool(HttpRoute httpRoute, boolean z) {
        this.poolLock.lock();
        try {
            RouteSpecificPool routeSpecificPoolNewRouteSpecificPool = this.routeToPool.get(httpRoute);
            if (routeSpecificPoolNewRouteSpecificPool == null && z) {
                routeSpecificPoolNewRouteSpecificPool = newRouteSpecificPool(httpRoute);
                this.routeToPool.put(httpRoute, routeSpecificPoolNewRouteSpecificPool);
            }
            return routeSpecificPoolNewRouteSpecificPool;
        } finally {
            this.poolLock.unlock();
        }
    }

    public int getConnectionsInPool(HttpRoute httpRoute) {
        this.poolLock.lock();
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, false);
            return routePool != null ? routePool.getEntryCount() : 0;
        } finally {
            this.poolLock.unlock();
        }
    }

    public int getConnectionsInPool() {
        this.poolLock.lock();
        try {
            return this.numConnections;
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public PoolEntryRequest requestPoolEntry(final HttpRoute httpRoute, final Object obj) {
        final WaitingThreadAborter waitingThreadAborter = new WaitingThreadAborter();
        return new PoolEntryRequest() { // from class: org.apache.http.impl.conn.tsccm.ConnPoolByRoute.1
            @Override // org.apache.http.impl.conn.tsccm.PoolEntryRequest
            public void abortRequest() {
                ConnPoolByRoute.this.poolLock.lock();
                try {
                    waitingThreadAborter.abort();
                } finally {
                    ConnPoolByRoute.this.poolLock.unlock();
                }
            }

            @Override // org.apache.http.impl.conn.tsccm.PoolEntryRequest
            public BasicPoolEntry getPoolEntry(long j, TimeUnit timeUnit) {
                return ConnPoolByRoute.this.getEntryBlocking(httpRoute, obj, j, timeUnit, waitingThreadAborter);
            }
        };
    }

    protected BasicPoolEntry getEntryBlocking(HttpRoute httpRoute, Object obj, long j, TimeUnit timeUnit, WaitingThreadAborter waitingThreadAborter) {
        Date date = null;
        if (j > 0) {
            date = new Date(System.currentTimeMillis() + timeUnit.toMillis(j));
        }
        BasicPoolEntry freeEntry = null;
        this.poolLock.lock();
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, true);
            WaitingThread waitingThreadNewWaitingThread = null;
            while (freeEntry == null) {
                Asserts.check(!this.shutdown, "Connection pool shut down");
                if (this.log.isDebugEnabled()) {
                    this.log.debug("[" + httpRoute + "] total kept alive: " + this.freeConnections.size() + ", total issued: " + this.leasedConnections.size() + ", total allocated: " + this.numConnections + " out of " + this.maxTotalConnections);
                }
                freeEntry = getFreeEntry(routePool, obj);
                if (freeEntry != null) {
                    break;
                }
                boolean z = routePool.getCapacity() > 0;
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Available capacity: " + routePool.getCapacity() + " out of " + routePool.getMaxEntries() + " [" + httpRoute + "][" + obj + "]");
                }
                if (z && this.numConnections < this.maxTotalConnections) {
                    freeEntry = createEntry(routePool, this.operator);
                } else if (z && !this.freeConnections.isEmpty()) {
                    deleteLeastUsedEntry();
                    routePool = getRoutePool(httpRoute, true);
                    freeEntry = createEntry(routePool, this.operator);
                } else {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Need to wait for connection [" + httpRoute + "][" + obj + "]");
                    }
                    if (waitingThreadNewWaitingThread == null) {
                        waitingThreadNewWaitingThread = newWaitingThread(this.poolLock.newCondition(), routePool);
                        waitingThreadAborter.setWaitingThread(waitingThreadNewWaitingThread);
                    }
                    try {
                        routePool.queueThread(waitingThreadNewWaitingThread);
                        this.waitingThreads.add(waitingThreadNewWaitingThread);
                        boolean zAwait = waitingThreadNewWaitingThread.await(date);
                        routePool.removeThread(waitingThreadNewWaitingThread);
                        this.waitingThreads.remove(waitingThreadNewWaitingThread);
                        if (!zAwait && date != null && date.getTime() <= System.currentTimeMillis()) {
                            throw new ConnectionPoolTimeoutException("Timeout waiting for connection from pool");
                        }
                    } catch (Throwable th) {
                        routePool.removeThread(waitingThreadNewWaitingThread);
                        this.waitingThreads.remove(waitingThreadNewWaitingThread);
                        throw th;
                    }
                }
            }
            return freeEntry;
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void freeEntry(BasicPoolEntry basicPoolEntry, boolean z, long j, TimeUnit timeUnit) {
        String str;
        HttpRoute plannedRoute = basicPoolEntry.getPlannedRoute();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Releasing connection [" + plannedRoute + "][" + basicPoolEntry.getState() + "]");
        }
        this.poolLock.lock();
        try {
            if (this.shutdown) {
                closeConnection(basicPoolEntry);
                return;
            }
            this.leasedConnections.remove(basicPoolEntry);
            RouteSpecificPool routePool = getRoutePool(plannedRoute, true);
            if (z && routePool.getCapacity() >= 0) {
                if (this.log.isDebugEnabled()) {
                    if (j > 0) {
                        str = "for " + j + " " + timeUnit;
                    } else {
                        str = "indefinitely";
                    }
                    this.log.debug("Pooling connection [" + plannedRoute + "][" + basicPoolEntry.getState() + "]; keep alive " + str);
                }
                routePool.freeEntry(basicPoolEntry);
                basicPoolEntry.updateExpiry(j, timeUnit);
                this.freeConnections.add(basicPoolEntry);
            } else {
                closeConnection(basicPoolEntry);
                routePool.dropEntry();
                this.numConnections--;
            }
            notifyWaitingThread(routePool);
        } finally {
            this.poolLock.unlock();
        }
    }

    protected BasicPoolEntry getFreeEntry(RouteSpecificPool routeSpecificPool, Object obj) {
        BasicPoolEntry basicPoolEntryAllocEntry = null;
        this.poolLock.lock();
        boolean z = false;
        while (!z) {
            try {
                basicPoolEntryAllocEntry = routeSpecificPool.allocEntry(obj);
                if (basicPoolEntryAllocEntry != null) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Getting free connection [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                    }
                    this.freeConnections.remove(basicPoolEntryAllocEntry);
                    if (basicPoolEntryAllocEntry.isExpired(System.currentTimeMillis())) {
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Closing expired free connection [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                        }
                        closeConnection(basicPoolEntryAllocEntry);
                        routeSpecificPool.dropEntry();
                        this.numConnections--;
                    } else {
                        this.leasedConnections.add(basicPoolEntryAllocEntry);
                        z = true;
                    }
                } else {
                    z = true;
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("No free connections [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                    }
                }
            } finally {
                this.poolLock.unlock();
            }
        }
        return basicPoolEntryAllocEntry;
    }

    protected BasicPoolEntry createEntry(RouteSpecificPool routeSpecificPool, ClientConnectionOperator clientConnectionOperator) {
        if (this.log.isDebugEnabled()) {
            this.log.debug("Creating new connection [" + routeSpecificPool.getRoute() + "]");
        }
        BasicPoolEntry basicPoolEntry = new BasicPoolEntry(clientConnectionOperator, routeSpecificPool.getRoute(), this.connTTL, this.connTTLTimeUnit);
        this.poolLock.lock();
        try {
            routeSpecificPool.createdEntry(basicPoolEntry);
            this.numConnections++;
            this.leasedConnections.add(basicPoolEntry);
            return basicPoolEntry;
        } finally {
            this.poolLock.unlock();
        }
    }

    protected void deleteEntry(BasicPoolEntry basicPoolEntry) {
        HttpRoute plannedRoute = basicPoolEntry.getPlannedRoute();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Deleting connection [" + plannedRoute + "][" + basicPoolEntry.getState() + "]");
        }
        this.poolLock.lock();
        try {
            closeConnection(basicPoolEntry);
            RouteSpecificPool routePool = getRoutePool(plannedRoute, true);
            routePool.deleteEntry(basicPoolEntry);
            this.numConnections--;
            if (routePool.isUnused()) {
                this.routeToPool.remove(plannedRoute);
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    protected void deleteLeastUsedEntry() {
        this.poolLock.lock();
        try {
            BasicPoolEntry basicPoolEntryRemove = this.freeConnections.remove();
            if (basicPoolEntryRemove != null) {
                deleteEntry(basicPoolEntryRemove);
            } else if (this.log.isDebugEnabled()) {
                this.log.debug("No free connection to delete");
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    protected void handleLostEntry(HttpRoute httpRoute) {
        this.poolLock.lock();
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, true);
            routePool.dropEntry();
            if (routePool.isUnused()) {
                this.routeToPool.remove(httpRoute);
            }
            this.numConnections--;
            notifyWaitingThread(routePool);
        } finally {
            this.poolLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:4:0x0008, B:6:0x000e, B:8:0x0016, B:9:0x0034, B:20:0x006b, B:10:0x0039, B:12:0x0041, B:14:0x0049, B:15:0x0050, B:16:0x005a, B:18:0x0062), top: B:26:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void notifyWaitingThread(org.apache.http.impl.conn.tsccm.RouteSpecificPool r5) {
        /*
            r4 = this;
            r3 = 0
            java.util.concurrent.locks.Lock r0 = r4.poolLock
            r0.lock()
            if (r5 == 0) goto L39
            boolean r0 = r5.hasThread()     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L39
            org.apache.commons.logging.Log r0 = r4.log     // Catch: java.lang.Throwable -> L74
            boolean r0 = r0.isDebugEnabled()     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L34
            org.apache.commons.logging.Log r0 = r4.log     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = "Notifying thread waiting on pool ["
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L74
            org.apache.http.conn.routing.HttpRoute r2 = r5.getRoute()     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = "]"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L74
            r0.debug(r1)     // Catch: java.lang.Throwable -> L74
        L34:
            org.apache.http.impl.conn.tsccm.WaitingThread r3 = r5.nextThread()     // Catch: java.lang.Throwable -> L74
            goto L69
        L39:
            java.util.Queue<org.apache.http.impl.conn.tsccm.WaitingThread> r0 = r4.waitingThreads     // Catch: java.lang.Throwable -> L74
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L5a
            org.apache.commons.logging.Log r0 = r4.log     // Catch: java.lang.Throwable -> L74
            boolean r0 = r0.isDebugEnabled()     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L50
            org.apache.commons.logging.Log r0 = r4.log     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "Notifying thread waiting on any pool"
            r0.debug(r1)     // Catch: java.lang.Throwable -> L74
        L50:
            java.util.Queue<org.apache.http.impl.conn.tsccm.WaitingThread> r0 = r4.waitingThreads     // Catch: java.lang.Throwable -> L74
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L74
            org.apache.http.impl.conn.tsccm.WaitingThread r0 = (org.apache.http.impl.conn.tsccm.WaitingThread) r0     // Catch: java.lang.Throwable -> L74
            r3 = r0
            goto L69
        L5a:
            org.apache.commons.logging.Log r0 = r4.log     // Catch: java.lang.Throwable -> L74
            boolean r0 = r0.isDebugEnabled()     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L69
            org.apache.commons.logging.Log r0 = r4.log     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "Notifying no-one, there are no waiting threads"
            r0.debug(r1)     // Catch: java.lang.Throwable -> L74
        L69:
            if (r3 == 0) goto L6e
            r3.wakeup()     // Catch: java.lang.Throwable -> L74
        L6e:
            java.util.concurrent.locks.Lock r0 = r4.poolLock
            r0.unlock()
            return
        L74:
            r5 = move-exception
            java.util.concurrent.locks.Lock r0 = r4.poolLock
            r0.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.tsccm.ConnPoolByRoute.notifyWaitingThread(org.apache.http.impl.conn.tsccm.RouteSpecificPool):void");
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void deleteClosedConnections() {
        this.poolLock.lock();
        try {
            Iterator<BasicPoolEntry> it = this.freeConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                if (!next.getConnection().isOpen()) {
                    it.remove();
                    deleteEntry(next);
                }
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        Args.notNull(timeUnit, "Time unit");
        long j2 = j > 0 ? j : 0L;
        if (this.log.isDebugEnabled()) {
            this.log.debug("Closing connections idle longer than " + j2 + " " + timeUnit);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - timeUnit.toMillis(j2);
        this.poolLock.lock();
        try {
            Iterator<BasicPoolEntry> it = this.freeConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                if (next.getUpdated() <= jCurrentTimeMillis) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Closing connection last used @ " + new Date(next.getUpdated()));
                    }
                    it.remove();
                    deleteEntry(next);
                }
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void closeExpiredConnections() {
        this.log.debug("Closing expired connections");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.poolLock.lock();
        try {
            Iterator<BasicPoolEntry> it = this.freeConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                if (next.isExpired(jCurrentTimeMillis)) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Closing connection expired @ " + new Date(next.getExpiry()));
                    }
                    it.remove();
                    deleteEntry(next);
                }
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void shutdown() {
        this.poolLock.lock();
        try {
            if (this.shutdown) {
                return;
            }
            this.shutdown = true;
            Iterator<BasicPoolEntry> it = this.leasedConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                it.remove();
                closeConnection(next);
            }
            Iterator<BasicPoolEntry> it2 = this.freeConnections.iterator();
            while (it2.hasNext()) {
                BasicPoolEntry next2 = it2.next();
                it2.remove();
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Closing connection [" + next2.getPlannedRoute() + "][" + next2.getState() + "]");
                }
                closeConnection(next2);
            }
            Iterator<WaitingThread> it3 = this.waitingThreads.iterator();
            while (it3.hasNext()) {
                WaitingThread next3 = it3.next();
                it3.remove();
                next3.wakeup();
            }
            this.routeToPool.clear();
        } finally {
            this.poolLock.unlock();
        }
    }

    public void setMaxTotalConnections(int i) {
        this.poolLock.lock();
        try {
            this.maxTotalConnections = i;
        } finally {
            this.poolLock.unlock();
        }
    }

    public int getMaxTotalConnections() {
        return this.maxTotalConnections;
    }
}
