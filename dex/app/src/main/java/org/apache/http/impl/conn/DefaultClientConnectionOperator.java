package org.apache.http.impl.conn;

import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeLayeredSocketFactory;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class DefaultClientConnectionOperator implements ClientConnectionOperator {
    protected final DnsResolver dnsResolver;
    private final Log log = LogFactory.getLog(getClass());
    protected final SchemeRegistry schemeRegistry;

    public DefaultClientConnectionOperator(SchemeRegistry schemeRegistry) {
        Args.notNull(schemeRegistry, "Scheme registry");
        this.schemeRegistry = schemeRegistry;
        this.dnsResolver = new SystemDefaultDnsResolver();
    }

    public DefaultClientConnectionOperator(SchemeRegistry schemeRegistry, DnsResolver dnsResolver) {
        Args.notNull(schemeRegistry, "Scheme registry");
        Args.notNull(dnsResolver, "DNS resolver");
        this.schemeRegistry = schemeRegistry;
        this.dnsResolver = dnsResolver;
    }

    @Override // org.apache.http.conn.ClientConnectionOperator
    public OperatedClientConnection createConnection() {
        return new DefaultClientConnection();
    }

    private SchemeRegistry getSchemeRegistry(HttpContext httpContext) {
        SchemeRegistry schemeRegistry = (SchemeRegistry) httpContext.getAttribute(ClientContext.SCHEME_REGISTRY);
        return schemeRegistry == null ? this.schemeRegistry : schemeRegistry;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7 A[SYNTHETIC] */
    @Override // org.apache.http.conn.ClientConnectionOperator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void openConnection(org.apache.http.conn.OperatedClientConnection r12, org.apache.http.HttpHost r13, java.net.InetAddress r14, org.apache.http.protocol.HttpContext r15, org.apache.http.params.HttpParams r16) throws java.net.SocketException, org.apache.http.conn.ConnectTimeoutException {
        /*
            r11 = this;
            java.lang.String r0 = "Connection"
            org.apache.http.util.Args.notNull(r12, r0)
            java.lang.String r0 = "Target host"
            org.apache.http.util.Args.notNull(r13, r0)
            java.lang.String r0 = "HTTP parameters"
            r1 = r16
            org.apache.http.util.Args.notNull(r1, r0)
            boolean r0 = r12.isOpen()
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            java.lang.String r1 = "Connection must not be open"
            org.apache.http.util.Asserts.check(r0, r1)
            org.apache.http.conn.scheme.SchemeRegistry r0 = r11.getSchemeRegistry(r15)
            java.lang.String r1 = r13.getSchemeName()
            org.apache.http.conn.scheme.Scheme r3 = r0.getScheme(r1)
            org.apache.http.conn.scheme.SchemeSocketFactory r4 = r3.getSchemeSocketFactory()
            java.lang.String r0 = r13.getHostName()
            java.net.InetAddress[] r5 = r11.resolveHostname(r0)
            int r0 = r13.getPort()
            int r3 = r3.resolvePort(r0)
            r6 = 0
        L40:
            int r0 = r5.length
            if (r6 >= r0) goto Lcb
            r7 = r5[r6]
            int r0 = r5.length
            int r0 = r0 + (-1)
            if (r6 != r0) goto L4c
            r8 = 1
            goto L4d
        L4c:
            r8 = 0
        L4d:
            r0 = r16
            java.net.Socket r9 = r4.createSocket(r0)
            r12.opening(r9, r13)
            org.apache.http.conn.HttpInetSocketAddress r0 = new org.apache.http.conn.HttpInetSocketAddress
            r0.<init>(r13, r7, r3)
            r7 = r0
            r10 = 0
            if (r14 == 0) goto L65
            java.net.InetSocketAddress r10 = new java.net.InetSocketAddress
            r0 = 0
            r10.<init>(r14, r0)
        L65:
            org.apache.commons.logging.Log r0 = r11.log
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto L81
            org.apache.commons.logging.Log r0 = r11.log
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Connecting to "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.debug(r1)
        L81:
            r0 = r16
            java.net.Socket r10 = r4.connectSocket(r9, r7, r10, r0)     // Catch: java.net.ConnectException -> L9c org.apache.http.conn.ConnectTimeoutException -> La1
            if (r9 == r10) goto L8d
            r9 = r10
            r12.opening(r9, r13)     // Catch: java.net.ConnectException -> L9c org.apache.http.conn.ConnectTimeoutException -> La1
        L8d:
            r0 = r16
            r11.prepareSocket(r9, r15, r0)     // Catch: java.net.ConnectException -> L9c org.apache.http.conn.ConnectTimeoutException -> La1
            boolean r0 = r4.isSecure(r9)     // Catch: java.net.ConnectException -> L9c org.apache.http.conn.ConnectTimeoutException -> La1
            r1 = r16
            r12.openCompleted(r0, r1)     // Catch: java.net.ConnectException -> L9c org.apache.http.conn.ConnectTimeoutException -> La1
            return
        L9c:
            r10 = move-exception
            if (r8 == 0) goto La0
            throw r10
        La0:
            goto La5
        La1:
            r10 = move-exception
            if (r8 == 0) goto La5
            throw r10
        La5:
            org.apache.commons.logging.Log r0 = r11.log
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto Lc7
            org.apache.commons.logging.Log r0 = r11.log
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Connect to "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r2 = " timed out. Connection will be retried using another IP address"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.debug(r1)
        Lc7:
            int r6 = r6 + 1
            goto L40
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(org.apache.http.conn.OperatedClientConnection, org.apache.http.HttpHost, java.net.InetAddress, org.apache.http.protocol.HttpContext, org.apache.http.params.HttpParams):void");
    }

    @Override // org.apache.http.conn.ClientConnectionOperator
    public void updateSecureConnection(OperatedClientConnection operatedClientConnection, HttpHost httpHost, HttpContext httpContext, HttpParams httpParams) throws SocketException {
        Args.notNull(operatedClientConnection, "Connection");
        Args.notNull(httpHost, "Target host");
        Args.notNull(httpParams, "Parameters");
        Asserts.check(operatedClientConnection.isOpen(), "Connection must be open");
        Scheme scheme = getSchemeRegistry(httpContext).getScheme(httpHost.getSchemeName());
        Asserts.check(scheme.getSchemeSocketFactory() instanceof SchemeLayeredSocketFactory, "Socket factory must implement SchemeLayeredSocketFactory");
        SchemeLayeredSocketFactory schemeLayeredSocketFactory = (SchemeLayeredSocketFactory) scheme.getSchemeSocketFactory();
        Socket socketCreateLayeredSocket = schemeLayeredSocketFactory.createLayeredSocket(operatedClientConnection.getSocket(), httpHost.getHostName(), scheme.resolvePort(httpHost.getPort()), httpParams);
        prepareSocket(socketCreateLayeredSocket, httpContext, httpParams);
        operatedClientConnection.update(socketCreateLayeredSocket, httpHost, schemeLayeredSocketFactory.isSecure(socketCreateLayeredSocket), httpParams);
    }

    protected void prepareSocket(Socket socket, HttpContext httpContext, HttpParams httpParams) throws SocketException {
        socket.setTcpNoDelay(HttpConnectionParams.getTcpNoDelay(httpParams));
        socket.setSoTimeout(HttpConnectionParams.getSoTimeout(httpParams));
        int linger = HttpConnectionParams.getLinger(httpParams);
        if (linger >= 0) {
            socket.setSoLinger(linger > 0, linger);
        }
    }

    protected InetAddress[] resolveHostname(String str) {
        return this.dnsResolver.resolve(str);
    }
}
