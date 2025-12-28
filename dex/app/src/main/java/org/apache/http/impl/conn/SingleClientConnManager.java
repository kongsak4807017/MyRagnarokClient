package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class SingleClientConnManager implements ClientConnectionManager {
    public static final String MISUSE_MESSAGE = "Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
    protected final boolean alwaysShutDown;
    protected final ClientConnectionOperator connOperator;
    protected volatile long connectionExpiresTime;
    protected volatile boolean isShutDown;
    protected volatile long lastReleaseTime;
    private final Log log;
    protected volatile ConnAdapter managedConn;
    protected final SchemeRegistry schemeRegistry;
    protected volatile PoolEntry uniquePoolEntry;

    @Deprecated
    public SingleClientConnManager(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        this(schemeRegistry);
    }

    public SingleClientConnManager(SchemeRegistry schemeRegistry) {
        this.log = LogFactory.getLog(getClass());
        Args.notNull(schemeRegistry, "Scheme registry");
        this.schemeRegistry = schemeRegistry;
        this.connOperator = createConnectionOperator(schemeRegistry);
        this.uniquePoolEntry = new PoolEntry();
        this.managedConn = null;
        this.lastReleaseTime = -1L;
        this.alwaysShutDown = false;
        this.isShutDown = false;
    }

    public SingleClientConnManager() {
        this(SchemeRegistryFactory.createDefault());
    }

    protected void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    protected ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        return new DefaultClientConnectionOperator(schemeRegistry);
    }

    protected final void assertStillUp() {
        Asserts.check(!this.isShutDown, "Manager is shut down");
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public final ClientConnectionRequest requestConnection(final HttpRoute httpRoute, final Object obj) {
        return new ClientConnectionRequest() { // from class: org.apache.http.impl.conn.SingleClientConnManager.1
            @Override // org.apache.http.conn.ClientConnectionRequest
            public void abortRequest() {
            }

            @Override // org.apache.http.conn.ClientConnectionRequest
            public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
                return SingleClientConnManager.this.getConnection(httpRoute, obj);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[Catch: all -> 0x007d, TryCatch #1 {, blocks: (B:7:0x0026, B:11:0x002d, B:13:0x0041, B:15:0x0047, B:23:0x0059, B:26:0x0060, B:28:0x0069, B:29:0x0070, B:30:0x007b), top: B:37:0x0026, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.http.conn.ManagedClientConnection getConnection(org.apache.http.conn.routing.HttpRoute r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Route"
            org.apache.http.util.Args.notNull(r6, r0)
            r5.assertStillUp()
            org.apache.commons.logging.Log r0 = r5.log
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto L24
            org.apache.commons.logging.Log r0 = r5.log
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Get connection for route "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.debug(r1)
        L24:
            r7 = r5
            monitor-enter(r5)
            org.apache.http.impl.conn.SingleClientConnManager$ConnAdapter r0 = r5.managedConn     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            java.lang.String r1 = "Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one."
            org.apache.http.util.Asserts.check(r0, r1)     // Catch: java.lang.Throwable -> L7d
            r3 = 0
            r4 = 0
            r5.closeExpiredConnections()     // Catch: java.lang.Throwable -> L7d
            org.apache.http.impl.conn.SingleClientConnManager$PoolEntry r0 = r5.uniquePoolEntry     // Catch: java.lang.Throwable -> L7d
            org.apache.http.conn.OperatedClientConnection r0 = r0.connection     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L55
            org.apache.http.impl.conn.SingleClientConnManager$PoolEntry r0 = r5.uniquePoolEntry     // Catch: java.lang.Throwable -> L7d
            org.apache.http.conn.routing.RouteTracker r4 = r0.tracker     // Catch: java.lang.Throwable -> L7d
            if (r4 == 0) goto L51
            org.apache.http.conn.routing.HttpRoute r0 = r4.toRoute()     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.equals(r6)     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L53
        L51:
            r4 = 1
            goto L54
        L53:
            r4 = 0
        L54:
            goto L56
        L55:
            r3 = 1
        L56:
            if (r4 == 0) goto L67
            r3 = 1
            org.apache.http.impl.conn.SingleClientConnManager$PoolEntry r0 = r5.uniquePoolEntry     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7d
            r0.shutdown()     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7d
            goto L67
        L5f:
            r4 = move-exception
            org.apache.commons.logging.Log r0 = r5.log     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = "Problem shutting down connection."
            r0.debug(r1, r4)     // Catch: java.lang.Throwable -> L7d
        L67:
            if (r3 == 0) goto L70
            org.apache.http.impl.conn.SingleClientConnManager$PoolEntry r0 = new org.apache.http.impl.conn.SingleClientConnManager$PoolEntry     // Catch: java.lang.Throwable -> L7d
            r0.<init>()     // Catch: java.lang.Throwable -> L7d
            r5.uniquePoolEntry = r0     // Catch: java.lang.Throwable -> L7d
        L70:
            org.apache.http.impl.conn.SingleClientConnManager$ConnAdapter r0 = new org.apache.http.impl.conn.SingleClientConnManager$ConnAdapter     // Catch: java.lang.Throwable -> L7d
            org.apache.http.impl.conn.SingleClientConnManager$PoolEntry r1 = r5.uniquePoolEntry     // Catch: java.lang.Throwable -> L7d
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> L7d
            r5.managedConn = r0     // Catch: java.lang.Throwable -> L7d
            org.apache.http.impl.conn.SingleClientConnManager$ConnAdapter r0 = r5.managedConn     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L7d
            return r0
        L7d:
            r6 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L7d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.SingleClientConnManager.getConnection(org.apache.http.conn.routing.HttpRoute, java.lang.Object):org.apache.http.conn.ManagedClientConnection");
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void releaseConnection(ManagedClientConnection managedClientConnection, long j, TimeUnit timeUnit) {
        Args.check(managedClientConnection instanceof ConnAdapter, "Connection class mismatch, connection not obtained from this manager");
        assertStillUp();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Releasing connection " + managedClientConnection);
        }
        ConnAdapter connAdapter = (ConnAdapter) managedClientConnection;
        synchronized (connAdapter) {
            if (connAdapter.poolEntry == null) {
                return;
            }
            Asserts.check(connAdapter.getManager() == this, "Connection not obtained from this manager");
            try {
                try {
                    if (connAdapter.isOpen() && (this.alwaysShutDown || !connAdapter.isMarkedReusable())) {
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Released connection open but not reusable.");
                        }
                        connAdapter.shutdown();
                    }
                    connAdapter.detach();
                    synchronized (this) {
                        this.managedConn = null;
                        this.lastReleaseTime = System.currentTimeMillis();
                        if (j > 0) {
                            this.connectionExpiresTime = timeUnit.toMillis(j) + this.lastReleaseTime;
                        } else {
                            this.connectionExpiresTime = Long.MAX_VALUE;
                        }
                    }
                } catch (IOException e) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Exception shutting down released connection.", e);
                    }
                    connAdapter.detach();
                    synchronized (this) {
                        this.managedConn = null;
                        this.lastReleaseTime = System.currentTimeMillis();
                        if (j > 0) {
                            this.connectionExpiresTime = timeUnit.toMillis(j) + this.lastReleaseTime;
                        } else {
                            this.connectionExpiresTime = Long.MAX_VALUE;
                        }
                    }
                }
            } catch (Throwable th) {
                connAdapter.detach();
                synchronized (this) {
                    this.managedConn = null;
                    this.lastReleaseTime = System.currentTimeMillis();
                    if (j > 0) {
                        this.connectionExpiresTime = timeUnit.toMillis(j) + this.lastReleaseTime;
                    } else {
                        this.connectionExpiresTime = Long.MAX_VALUE;
                    }
                    throw th;
                }
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        if (System.currentTimeMillis() >= this.connectionExpiresTime) {
            closeIdleConnections(0L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[Catch: all -> 0x0038, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000e, B:8:0x0018, B:10:0x0028, B:13:0x002f, B:14:0x0036), top: B:19:0x000a, inners: #1 }] */
    @Override // org.apache.http.conn.ClientConnectionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void closeIdleConnections(long r8, java.util.concurrent.TimeUnit r10) {
        /*
            r7 = this;
            r7.assertStillUp()
            java.lang.String r0 = "Time unit"
            org.apache.http.util.Args.notNull(r10, r0)
            r4 = r7
            monitor-enter(r7)
            org.apache.http.impl.conn.SingleClientConnManager$ConnAdapter r0 = r7.managedConn     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L36
            org.apache.http.impl.conn.SingleClientConnManager$PoolEntry r0 = r7.uniquePoolEntry     // Catch: java.lang.Throwable -> L38
            org.apache.http.conn.OperatedClientConnection r0 = r0.connection     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L36
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L38
            long r2 = r10.toMillis(r8)     // Catch: java.lang.Throwable -> L38
            long r5 = r0 - r2
            long r0 = r7.lastReleaseTime     // Catch: java.lang.Throwable -> L38
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto L36
            org.apache.http.impl.conn.SingleClientConnManager$PoolEntry r0 = r7.uniquePoolEntry     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L38
            r0.close()     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L38
            goto L36
        L2e:
            r8 = move-exception
            org.apache.commons.logging.Log r0 = r7.log     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "Problem closing idle connection."
            r0.debug(r1, r8)     // Catch: java.lang.Throwable -> L38
        L36:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            return
        L38:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.SingleClientConnManager.closeIdleConnections(long, java.util.concurrent.TimeUnit):void");
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void shutdown() {
        this.isShutDown = true;
        synchronized (this) {
            try {
                try {
                    if (this.uniquePoolEntry != null) {
                        this.uniquePoolEntry.shutdown();
                    }
                    this.uniquePoolEntry = null;
                    this.managedConn = null;
                } catch (IOException e) {
                    this.log.debug("Problem while shutting down manager.", e);
                    this.uniquePoolEntry = null;
                    this.managedConn = null;
                }
            } catch (Throwable th) {
                this.uniquePoolEntry = null;
                this.managedConn = null;
                throw th;
            }
        }
    }

    protected void revokeConnection() {
        ConnAdapter connAdapter = this.managedConn;
        if (connAdapter == null) {
            return;
        }
        connAdapter.detach();
        synchronized (this) {
            try {
                this.uniquePoolEntry.shutdown();
            } catch (IOException e) {
                this.log.debug("Problem while shutting down connection.", e);
            }
        }
    }

    public class PoolEntry extends AbstractPoolEntry {
        protected PoolEntry() {
            super(SingleClientConnManager.this.connOperator, null);
        }

        protected void close() {
            shutdownEntry();
            if (this.connection.isOpen()) {
                this.connection.close();
            }
        }

        protected void shutdown() {
            shutdownEntry();
            if (this.connection.isOpen()) {
                this.connection.shutdown();
            }
        }
    }

    public class ConnAdapter extends AbstractPooledConnAdapter {
        protected ConnAdapter(PoolEntry poolEntry, HttpRoute httpRoute) {
            super(SingleClientConnManager.this, poolEntry);
            markReusable();
            poolEntry.route = httpRoute;
        }
    }
}
