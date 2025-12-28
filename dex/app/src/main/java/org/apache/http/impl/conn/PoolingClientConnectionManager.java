package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.pool.ConnPoolControl;
import org.apache.http.pool.PoolStats;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class PoolingClientConnectionManager implements ClientConnectionManager, ConnPoolControl<HttpRoute> {
    private final DnsResolver dnsResolver;
    private final Log log;
    private final ClientConnectionOperator operator;
    private final HttpConnPool pool;
    private final SchemeRegistry schemeRegistry;

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry) {
        this(schemeRegistry, -1L, TimeUnit.MILLISECONDS);
    }

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry, DnsResolver dnsResolver) {
        this(schemeRegistry, -1L, TimeUnit.MILLISECONDS, dnsResolver);
    }

    public PoolingClientConnectionManager() {
        this(SchemeRegistryFactory.createDefault());
    }

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry, long j, TimeUnit timeUnit) {
        this(schemeRegistry, j, timeUnit, new SystemDefaultDnsResolver());
    }

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry, long j, TimeUnit timeUnit, DnsResolver dnsResolver) {
        this.log = LogFactory.getLog(getClass());
        Args.notNull(schemeRegistry, "Scheme registry");
        Args.notNull(dnsResolver, "DNS resolver");
        this.schemeRegistry = schemeRegistry;
        this.dnsResolver = dnsResolver;
        this.operator = createConnectionOperator(schemeRegistry);
        this.pool = new HttpConnPool(this.log, this.operator, 2, 20, j, timeUnit);
    }

    protected void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    protected ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        return new DefaultClientConnectionOperator(schemeRegistry, this.dnsResolver);
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    private String format(HttpRoute httpRoute, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("[route: ").append(httpRoute).append("]");
        if (obj != null) {
            sb.append("[state: ").append(obj).append("]");
        }
        return sb.toString();
    }

    private String formatStats(HttpRoute httpRoute) {
        StringBuilder sb = new StringBuilder();
        PoolStats totalStats = this.pool.getTotalStats();
        PoolStats stats = this.pool.getStats(httpRoute);
        sb.append("[total kept alive: ").append(totalStats.getAvailable()).append("; ");
        sb.append("route allocated: ").append(stats.getLeased() + stats.getAvailable());
        sb.append(" of ").append(stats.getMax()).append("; ");
        sb.append("total allocated: ").append(totalStats.getLeased() + totalStats.getAvailable());
        sb.append(" of ").append(totalStats.getMax()).append("]");
        return sb.toString();
    }

    private String format(HttpPoolEntry httpPoolEntry) {
        StringBuilder sb = new StringBuilder();
        sb.append("[id: ").append(httpPoolEntry.getId()).append("]");
        sb.append("[route: ").append(httpPoolEntry.getRoute()).append("]");
        Object state = httpPoolEntry.getState();
        if (state != null) {
            sb.append("[state: ").append(state).append("]");
        }
        return sb.toString();
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
        Args.notNull(httpRoute, "HTTP route");
        if (this.log.isDebugEnabled()) {
            this.log.debug("Connection request: " + format(httpRoute, obj) + formatStats(httpRoute));
        }
        final Future<HttpPoolEntry> futureLease = this.pool.lease(httpRoute, obj);
        return new ClientConnectionRequest() { // from class: org.apache.http.impl.conn.PoolingClientConnectionManager.1
            @Override // org.apache.http.conn.ClientConnectionRequest
            public void abortRequest() {
                futureLease.cancel(true);
            }

            @Override // org.apache.http.conn.ClientConnectionRequest
            public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
                return PoolingClientConnectionManager.this.leaseConnection(futureLease, j, timeUnit);
            }
        };
    }

    ManagedClientConnection leaseConnection(Future<HttpPoolEntry> future, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, ConnectionPoolTimeoutException, TimeoutException {
        try {
            HttpPoolEntry httpPoolEntry = future.get(j, timeUnit);
            if (httpPoolEntry == null || future.isCancelled()) {
                throw new InterruptedException();
            }
            Asserts.check(httpPoolEntry.getConnection() != null, "Pool entry with no connection");
            if (this.log.isDebugEnabled()) {
                this.log.debug("Connection leased: " + format(httpPoolEntry) + formatStats(httpPoolEntry.getRoute()));
            }
            return new ManagedClientConnectionImpl(this, this.operator, httpPoolEntry);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = e;
            }
            this.log.error("Unexpected exception leasing connection from pool", cause);
            throw new InterruptedException();
        } catch (TimeoutException unused) {
            throw new ConnectionPoolTimeoutException("Timeout waiting for connection from pool");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb A[Catch: all -> 0x00e3, TryCatch #0 {, blocks: (B:8:0x001b, B:10:0x0021, B:34:0x009e, B:38:0x00b3, B:40:0x00bb, B:41:0x00e1, B:36:0x00a9, B:37:0x00b2, B:12:0x0023, B:14:0x0029, B:16:0x002f, B:19:0x0034, B:21:0x003c, B:22:0x0043, B:27:0x004f, B:31:0x0060, B:33:0x007c, B:26:0x004d), top: B:46:0x001b, inners: #2 }] */
    @Override // org.apache.http.conn.ClientConnectionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void releaseConnection(org.apache.http.conn.ManagedClientConnection r7, long r8, java.util.concurrent.TimeUnit r10) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof org.apache.http.impl.conn.ManagedClientConnectionImpl
            java.lang.String r1 = "Connection class mismatch, connection not obtained from this manager"
            org.apache.http.util.Args.check(r0, r1)
            r0 = r7
            org.apache.http.impl.conn.ManagedClientConnectionImpl r0 = (org.apache.http.impl.conn.ManagedClientConnectionImpl) r0
            r7 = r0
            org.apache.http.conn.ClientConnectionManager r0 = r0.getManager()
            if (r0 != r6) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            java.lang.String r1 = "Connection not obtained from this manager"
            org.apache.http.util.Asserts.check(r0, r1)
            r3 = r7
            monitor-enter(r7)
            org.apache.http.impl.conn.HttpPoolEntry r4 = r7.detach()     // Catch: java.lang.Throwable -> Le3
            if (r4 != 0) goto L23
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Le3
            return
        L23:
            boolean r0 = r7.isOpen()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L43
            boolean r0 = r7.isMarkedReusable()     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto L43
            r7.shutdown()     // Catch: java.io.IOException -> L33 java.lang.Throwable -> La8
            goto L43
        L33:
            r5 = move-exception
            org.apache.commons.logging.Log r0 = r6.log     // Catch: java.lang.Throwable -> La8
            boolean r0 = r0.isDebugEnabled()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L43
            org.apache.commons.logging.Log r0 = r6.log     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = "I/O exception shutting down released connection"
            r0.debug(r1, r5)     // Catch: java.lang.Throwable -> La8
        L43:
            boolean r0 = r7.isMarkedReusable()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L9e
            if (r10 == 0) goto L4d
            r0 = r10
            goto L4f
        L4d:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> La8
        L4f:
            r4.updateExpiry(r8, r0)     // Catch: java.lang.Throwable -> La8
            org.apache.commons.logging.Log r0 = r6.log     // Catch: java.lang.Throwable -> La8
            boolean r0 = r0.isDebugEnabled()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L9e
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L7a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = "for "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La8
            java.lang.StringBuilder r0 = r0.append(r8)     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> La8
            java.lang.StringBuilder r0 = r0.append(r10)     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> La8
            goto L7c
        L7a:
            java.lang.String r5 = "indefinitely"
        L7c:
            org.apache.commons.logging.Log r0 = r6.log     // Catch: java.lang.Throwable -> La8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "Connection "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = r6.format(r4)     // Catch: java.lang.Throwable -> La8
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = " can be kept alive "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La8
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La8
            r0.debug(r1)     // Catch: java.lang.Throwable -> La8
        L9e:
            org.apache.http.impl.conn.HttpConnPool r0 = r6.pool     // Catch: java.lang.Throwable -> Le3
            boolean r1 = r7.isMarkedReusable()     // Catch: java.lang.Throwable -> Le3
            r0.release(r4, r1)     // Catch: java.lang.Throwable -> Le3
            goto Lb3
        La8:
            r8 = move-exception
            org.apache.http.impl.conn.HttpConnPool r0 = r6.pool     // Catch: java.lang.Throwable -> Le3
            boolean r1 = r7.isMarkedReusable()     // Catch: java.lang.Throwable -> Le3
            r0.release(r4, r1)     // Catch: java.lang.Throwable -> Le3
            throw r8     // Catch: java.lang.Throwable -> Le3
        Lb3:
            org.apache.commons.logging.Log r0 = r6.log     // Catch: java.lang.Throwable -> Le3
            boolean r0 = r0.isDebugEnabled()     // Catch: java.lang.Throwable -> Le3
            if (r0 == 0) goto Le1
            org.apache.commons.logging.Log r0 = r6.log     // Catch: java.lang.Throwable -> Le3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le3
            java.lang.String r2 = "Connection released: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r2 = r6.format(r4)     // Catch: java.lang.Throwable -> Le3
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Le3
            java.lang.Object r2 = r4.getRoute()     // Catch: java.lang.Throwable -> Le3
            org.apache.http.conn.routing.HttpRoute r2 = (org.apache.http.conn.routing.HttpRoute) r2     // Catch: java.lang.Throwable -> Le3
            java.lang.String r2 = r6.formatStats(r2)     // Catch: java.lang.Throwable -> Le3
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le3
            r0.debug(r1)     // Catch: java.lang.Throwable -> Le3
        Le1:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Le3
            return
        Le3:
            r7 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Le3
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.PoolingClientConnectionManager.releaseConnection(org.apache.http.conn.ManagedClientConnection, long, java.util.concurrent.TimeUnit):void");
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void shutdown() {
        this.log.debug("Connection manager is shutting down");
        try {
            this.pool.shutdown();
        } catch (IOException e) {
            this.log.debug("I/O exception shutting down connection manager", e);
        }
        this.log.debug("Connection manager shut down");
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        if (this.log.isDebugEnabled()) {
            this.log.debug("Closing connections idle longer than " + j + " " + timeUnit);
        }
        this.pool.closeIdle(j, timeUnit);
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        this.log.debug("Closing expired connections");
        this.pool.closeExpired();
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getMaxTotal() {
        return this.pool.getMaxTotal();
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setMaxTotal(int i) {
        this.pool.setMaxTotal(i);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getDefaultMaxPerRoute() {
        return this.pool.getDefaultMaxPerRoute();
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setDefaultMaxPerRoute(int i) {
        this.pool.setDefaultMaxPerRoute(i);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getMaxPerRoute(HttpRoute httpRoute) {
        return this.pool.getMaxPerRoute(httpRoute);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setMaxPerRoute(HttpRoute httpRoute, int i) {
        this.pool.setMaxPerRoute(httpRoute, i);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public PoolStats getTotalStats() {
        return this.pool.getTotalStats();
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public PoolStats getStats(HttpRoute httpRoute) {
        return this.pool.getStats(httpRoute);
    }
}
