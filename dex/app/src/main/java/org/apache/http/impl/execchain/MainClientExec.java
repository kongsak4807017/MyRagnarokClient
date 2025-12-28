package org.apache.http.impl.execchain;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthState;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.routing.BasicRouteDirector;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRouteDirector;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.impl.auth.HttpAuthenticator;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class MainClientExec implements ClientExecChain {
    private final HttpAuthenticator authenticator;
    private final HttpClientConnectionManager connManager;
    private final ConnectionKeepAliveStrategy keepAliveStrategy;
    private final Log log;
    private final AuthenticationStrategy proxyAuthStrategy;
    private final HttpProcessor proxyHttpProcessor;
    private final HttpRequestExecutor requestExecutor;
    private final ConnectionReuseStrategy reuseStrategy;
    private final HttpRouteDirector routeDirector;
    private final AuthenticationStrategy targetAuthStrategy;
    private final UserTokenHandler userTokenHandler;

    public MainClientExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpProcessor httpProcessor, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler) {
        this.log = LogFactory.getLog(getClass());
        Args.notNull(httpRequestExecutor, "HTTP request executor");
        Args.notNull(httpClientConnectionManager, "Client connection manager");
        Args.notNull(connectionReuseStrategy, "Connection reuse strategy");
        Args.notNull(connectionKeepAliveStrategy, "Connection keep alive strategy");
        Args.notNull(httpProcessor, "Proxy HTTP processor");
        Args.notNull(authenticationStrategy, "Target authentication strategy");
        Args.notNull(authenticationStrategy2, "Proxy authentication strategy");
        Args.notNull(userTokenHandler, "User token handler");
        this.authenticator = new HttpAuthenticator();
        this.routeDirector = new BasicRouteDirector();
        this.requestExecutor = httpRequestExecutor;
        this.connManager = httpClientConnectionManager;
        this.reuseStrategy = connectionReuseStrategy;
        this.keepAliveStrategy = connectionKeepAliveStrategy;
        this.proxyHttpProcessor = httpProcessor;
        this.targetAuthStrategy = authenticationStrategy;
        this.proxyAuthStrategy = authenticationStrategy2;
        this.userTokenHandler = userTokenHandler;
    }

    public MainClientExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler) {
        this(httpRequestExecutor, httpClientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, new ImmutableHttpProcessor(new RequestTargetHost()), authenticationStrategy, authenticationStrategy2, userTokenHandler);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0287 A[Catch: ConnectionShutdownException -> 0x033e, HttpException -> 0x034a, IOException -> 0x034f, RuntimeException -> 0x0366, Error -> 0x037d, TryCatch #4 {IOException -> 0x034f, Error -> 0x037d, HttpException -> 0x034a, ConnectionShutdownException -> 0x033e, RuntimeException -> 0x0366, blocks: (B:43:0x00e8, B:47:0x00f1, B:49:0x00f9, B:50:0x0100, B:52:0x0103, B:54:0x010b, B:55:0x0112, B:56:0x0113, B:58:0x0119, B:59:0x0131, B:62:0x0140, B:64:0x014a, B:65:0x0155, B:125:0x030c, B:127:0x031f, B:128:0x0322, B:130:0x0328, B:134:0x0338, B:132:0x032e, B:66:0x015b, B:68:0x0161, B:70:0x0166, B:72:0x016e, B:73:0x0175, B:74:0x0176, B:76:0x0180, B:77:0x019c, B:79:0x01a6, B:81:0x01b0, B:82:0x01ca, B:83:0x01d5, B:85:0x01df, B:87:0x01e7, B:89:0x01f1, B:90:0x020b, B:91:0x0216, B:93:0x022e, B:97:0x0248, B:99:0x0267, B:100:0x027d, B:102:0x028a, B:104:0x0299, B:106:0x02a3, B:117:0x02de, B:119:0x02ee, B:120:0x02f5, B:122:0x02ff, B:123:0x0306, B:107:0x02a7, B:109:0x02b2, B:111:0x02b8, B:112:0x02c4, B:114:0x02cc, B:116:0x02d2, B:101:0x0287), top: B:165:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0299 A[Catch: ConnectionShutdownException -> 0x033e, HttpException -> 0x034a, IOException -> 0x034f, RuntimeException -> 0x0366, Error -> 0x037d, TryCatch #4 {IOException -> 0x034f, Error -> 0x037d, HttpException -> 0x034a, ConnectionShutdownException -> 0x033e, RuntimeException -> 0x0366, blocks: (B:43:0x00e8, B:47:0x00f1, B:49:0x00f9, B:50:0x0100, B:52:0x0103, B:54:0x010b, B:55:0x0112, B:56:0x0113, B:58:0x0119, B:59:0x0131, B:62:0x0140, B:64:0x014a, B:65:0x0155, B:125:0x030c, B:127:0x031f, B:128:0x0322, B:130:0x0328, B:134:0x0338, B:132:0x032e, B:66:0x015b, B:68:0x0161, B:70:0x0166, B:72:0x016e, B:73:0x0175, B:74:0x0176, B:76:0x0180, B:77:0x019c, B:79:0x01a6, B:81:0x01b0, B:82:0x01ca, B:83:0x01d5, B:85:0x01df, B:87:0x01e7, B:89:0x01f1, B:90:0x020b, B:91:0x0216, B:93:0x022e, B:97:0x0248, B:99:0x0267, B:100:0x027d, B:102:0x028a, B:104:0x0299, B:106:0x02a3, B:117:0x02de, B:119:0x02ee, B:120:0x02f5, B:122:0x02ff, B:123:0x0306, B:107:0x02a7, B:109:0x02b2, B:111:0x02b8, B:112:0x02c4, B:114:0x02cc, B:116:0x02d2, B:101:0x0287), top: B:165:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x030a A[EDGE_INSN: B:169:0x030a->B:124:0x030a BREAK  A[LOOP:0: B:45:0x00ee->B:123:0x0306], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0161 A[Catch: ConnectionShutdownException -> 0x033e, HttpException -> 0x034a, IOException -> 0x034f, RuntimeException -> 0x0366, Error -> 0x037d, TryCatch #4 {IOException -> 0x034f, Error -> 0x037d, HttpException -> 0x034a, ConnectionShutdownException -> 0x033e, RuntimeException -> 0x0366, blocks: (B:43:0x00e8, B:47:0x00f1, B:49:0x00f9, B:50:0x0100, B:52:0x0103, B:54:0x010b, B:55:0x0112, B:56:0x0113, B:58:0x0119, B:59:0x0131, B:62:0x0140, B:64:0x014a, B:65:0x0155, B:125:0x030c, B:127:0x031f, B:128:0x0322, B:130:0x0328, B:134:0x0338, B:132:0x032e, B:66:0x015b, B:68:0x0161, B:70:0x0166, B:72:0x016e, B:73:0x0175, B:74:0x0176, B:76:0x0180, B:77:0x019c, B:79:0x01a6, B:81:0x01b0, B:82:0x01ca, B:83:0x01d5, B:85:0x01df, B:87:0x01e7, B:89:0x01f1, B:90:0x020b, B:91:0x0216, B:93:0x022e, B:97:0x0248, B:99:0x0267, B:100:0x027d, B:102:0x028a, B:104:0x0299, B:106:0x02a3, B:117:0x02de, B:119:0x02ee, B:120:0x02f5, B:122:0x02ff, B:123:0x0306, B:107:0x02a7, B:109:0x02b2, B:111:0x02b8, B:112:0x02c4, B:114:0x02cc, B:116:0x02d2, B:101:0x0287), top: B:165:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0180 A[Catch: ConnectionShutdownException -> 0x033e, HttpException -> 0x034a, IOException -> 0x034f, RuntimeException -> 0x0366, Error -> 0x037d, TryCatch #4 {IOException -> 0x034f, Error -> 0x037d, HttpException -> 0x034a, ConnectionShutdownException -> 0x033e, RuntimeException -> 0x0366, blocks: (B:43:0x00e8, B:47:0x00f1, B:49:0x00f9, B:50:0x0100, B:52:0x0103, B:54:0x010b, B:55:0x0112, B:56:0x0113, B:58:0x0119, B:59:0x0131, B:62:0x0140, B:64:0x014a, B:65:0x0155, B:125:0x030c, B:127:0x031f, B:128:0x0322, B:130:0x0328, B:134:0x0338, B:132:0x032e, B:66:0x015b, B:68:0x0161, B:70:0x0166, B:72:0x016e, B:73:0x0175, B:74:0x0176, B:76:0x0180, B:77:0x019c, B:79:0x01a6, B:81:0x01b0, B:82:0x01ca, B:83:0x01d5, B:85:0x01df, B:87:0x01e7, B:89:0x01f1, B:90:0x020b, B:91:0x0216, B:93:0x022e, B:97:0x0248, B:99:0x0267, B:100:0x027d, B:102:0x028a, B:104:0x0299, B:106:0x02a3, B:117:0x02de, B:119:0x02ee, B:120:0x02f5, B:122:0x02ff, B:123:0x0306, B:107:0x02a7, B:109:0x02b2, B:111:0x02b8, B:112:0x02c4, B:114:0x02cc, B:116:0x02d2, B:101:0x0287), top: B:165:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a6 A[Catch: ConnectionShutdownException -> 0x033e, HttpException -> 0x034a, IOException -> 0x034f, RuntimeException -> 0x0366, Error -> 0x037d, TryCatch #4 {IOException -> 0x034f, Error -> 0x037d, HttpException -> 0x034a, ConnectionShutdownException -> 0x033e, RuntimeException -> 0x0366, blocks: (B:43:0x00e8, B:47:0x00f1, B:49:0x00f9, B:50:0x0100, B:52:0x0103, B:54:0x010b, B:55:0x0112, B:56:0x0113, B:58:0x0119, B:59:0x0131, B:62:0x0140, B:64:0x014a, B:65:0x0155, B:125:0x030c, B:127:0x031f, B:128:0x0322, B:130:0x0328, B:134:0x0338, B:132:0x032e, B:66:0x015b, B:68:0x0161, B:70:0x0166, B:72:0x016e, B:73:0x0175, B:74:0x0176, B:76:0x0180, B:77:0x019c, B:79:0x01a6, B:81:0x01b0, B:82:0x01ca, B:83:0x01d5, B:85:0x01df, B:87:0x01e7, B:89:0x01f1, B:90:0x020b, B:91:0x0216, B:93:0x022e, B:97:0x0248, B:99:0x0267, B:100:0x027d, B:102:0x028a, B:104:0x0299, B:106:0x02a3, B:117:0x02de, B:119:0x02ee, B:120:0x02f5, B:122:0x02ff, B:123:0x0306, B:107:0x02a7, B:109:0x02b2, B:111:0x02b8, B:112:0x02c4, B:114:0x02cc, B:116:0x02d2, B:101:0x0287), top: B:165:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f1 A[Catch: ConnectionShutdownException -> 0x033e, HttpException -> 0x034a, IOException -> 0x034f, RuntimeException -> 0x0366, Error -> 0x037d, TryCatch #4 {IOException -> 0x034f, Error -> 0x037d, HttpException -> 0x034a, ConnectionShutdownException -> 0x033e, RuntimeException -> 0x0366, blocks: (B:43:0x00e8, B:47:0x00f1, B:49:0x00f9, B:50:0x0100, B:52:0x0103, B:54:0x010b, B:55:0x0112, B:56:0x0113, B:58:0x0119, B:59:0x0131, B:62:0x0140, B:64:0x014a, B:65:0x0155, B:125:0x030c, B:127:0x031f, B:128:0x0322, B:130:0x0328, B:134:0x0338, B:132:0x032e, B:66:0x015b, B:68:0x0161, B:70:0x0166, B:72:0x016e, B:73:0x0175, B:74:0x0176, B:76:0x0180, B:77:0x019c, B:79:0x01a6, B:81:0x01b0, B:82:0x01ca, B:83:0x01d5, B:85:0x01df, B:87:0x01e7, B:89:0x01f1, B:90:0x020b, B:91:0x0216, B:93:0x022e, B:97:0x0248, B:99:0x0267, B:100:0x027d, B:102:0x028a, B:104:0x0299, B:106:0x02a3, B:117:0x02de, B:119:0x02ee, B:120:0x02f5, B:122:0x02ff, B:123:0x0306, B:107:0x02a7, B:109:0x02b2, B:111:0x02b8, B:112:0x02c4, B:114:0x02cc, B:116:0x02d2, B:101:0x0287), top: B:165:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022e A[Catch: ConnectionShutdownException -> 0x033e, HttpException -> 0x034a, IOException -> 0x034f, RuntimeException -> 0x0366, Error -> 0x037d, TryCatch #4 {IOException -> 0x034f, Error -> 0x037d, HttpException -> 0x034a, ConnectionShutdownException -> 0x033e, RuntimeException -> 0x0366, blocks: (B:43:0x00e8, B:47:0x00f1, B:49:0x00f9, B:50:0x0100, B:52:0x0103, B:54:0x010b, B:55:0x0112, B:56:0x0113, B:58:0x0119, B:59:0x0131, B:62:0x0140, B:64:0x014a, B:65:0x0155, B:125:0x030c, B:127:0x031f, B:128:0x0322, B:130:0x0328, B:134:0x0338, B:132:0x032e, B:66:0x015b, B:68:0x0161, B:70:0x0166, B:72:0x016e, B:73:0x0175, B:74:0x0176, B:76:0x0180, B:77:0x019c, B:79:0x01a6, B:81:0x01b0, B:82:0x01ca, B:83:0x01d5, B:85:0x01df, B:87:0x01e7, B:89:0x01f1, B:90:0x020b, B:91:0x0216, B:93:0x022e, B:97:0x0248, B:99:0x0267, B:100:0x027d, B:102:0x028a, B:104:0x0299, B:106:0x02a3, B:117:0x02de, B:119:0x02ee, B:120:0x02f5, B:122:0x02ff, B:123:0x0306, B:107:0x02a7, B:109:0x02b2, B:111:0x02b8, B:112:0x02c4, B:114:0x02cc, B:116:0x02d2, B:101:0x0287), top: B:165:0x00e8 }] */
    @Override // org.apache.http.impl.execchain.ClientExecChain
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.http.client.methods.CloseableHttpResponse execute(org.apache.http.conn.routing.HttpRoute r18, org.apache.http.client.methods.HttpRequestWrapper r19, org.apache.http.client.protocol.HttpClientContext r20, org.apache.http.client.methods.HttpExecutionAware r21) throws org.apache.http.HttpException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.execchain.MainClientExec.execute(org.apache.http.conn.routing.HttpRoute, org.apache.http.client.methods.HttpRequestWrapper, org.apache.http.client.protocol.HttpClientContext, org.apache.http.client.methods.HttpExecutionAware):org.apache.http.client.methods.CloseableHttpResponse");
    }

    void establishRoute(AuthState authState, HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpRequest httpRequest, HttpClientContext httpClientContext) throws HttpException, IOException {
        int iNextStep;
        int connectTimeout = httpClientContext.getRequestConfig().getConnectTimeout();
        RouteTracker routeTracker = new RouteTracker(httpRoute);
        do {
            HttpRoute route = routeTracker.toRoute();
            iNextStep = this.routeDirector.nextStep(httpRoute, route);
            switch (iNextStep) {
                case -1:
                    throw new HttpException("Unable to establish route: planned = " + httpRoute + "; current = " + route);
                case 0:
                    this.connManager.routeComplete(httpClientConnection, httpRoute, httpClientContext);
                    break;
                case 1:
                    this.connManager.connect(httpClientConnection, httpRoute, connectTimeout > 0 ? connectTimeout : 0, httpClientContext);
                    routeTracker.connectTarget(httpRoute.isSecure());
                    break;
                case 2:
                    this.connManager.connect(httpClientConnection, httpRoute, connectTimeout > 0 ? connectTimeout : 0, httpClientContext);
                    routeTracker.connectProxy(httpRoute.getProxyHost(), false);
                    break;
                case 3:
                    boolean zCreateTunnelToTarget = createTunnelToTarget(authState, httpClientConnection, httpRoute, httpRequest, httpClientContext);
                    this.log.debug("Tunnel to target created.");
                    routeTracker.tunnelTarget(zCreateTunnelToTarget);
                    break;
                case 4:
                    int hopCount = route.getHopCount() - 1;
                    boolean zCreateTunnelToProxy = createTunnelToProxy(httpRoute, hopCount, httpClientContext);
                    this.log.debug("Tunnel to proxy created.");
                    routeTracker.tunnelProxy(httpRoute.getHopTarget(hopCount), zCreateTunnelToProxy);
                    break;
                case 5:
                    this.connManager.upgrade(httpClientConnection, httpRoute, httpClientContext);
                    routeTracker.layerProtocol(httpRoute.isSecure());
                    break;
                default:
                    throw new IllegalStateException("Unknown step indicator " + iNextStep + " from RouteDirector.");
            }
        } while (iNextStep > 0);
    }

    private boolean createTunnelToTarget(AuthState authState, HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpRequest httpRequest, HttpClientContext httpClientContext) throws HttpException, IOException {
        RequestConfig requestConfig = httpClientContext.getRequestConfig();
        int connectTimeout = requestConfig.getConnectTimeout();
        HttpHost targetHost = httpRoute.getTargetHost();
        HttpHost proxyHost = httpRoute.getProxyHost();
        HttpResponse httpResponseExecute = null;
        BasicHttpRequest basicHttpRequest = new BasicHttpRequest("CONNECT", targetHost.toHostString(), httpRequest.getProtocolVersion());
        this.requestExecutor.preProcess(basicHttpRequest, this.proxyHttpProcessor, httpClientContext);
        while (httpResponseExecute == null) {
            if (!httpClientConnection.isOpen()) {
                this.connManager.connect(httpClientConnection, httpRoute, connectTimeout > 0 ? connectTimeout : 0, httpClientContext);
            }
            basicHttpRequest.removeHeaders("Proxy-Authorization");
            this.authenticator.generateAuthResponse(basicHttpRequest, authState, httpClientContext);
            httpResponseExecute = this.requestExecutor.execute(basicHttpRequest, httpClientConnection, httpClientContext);
            this.requestExecutor.postProcess(httpResponseExecute, this.proxyHttpProcessor, httpClientContext);
            if (httpResponseExecute.getStatusLine().getStatusCode() < 200) {
                throw new HttpException("Unexpected response to CONNECT request: " + httpResponseExecute.getStatusLine());
            }
            if (requestConfig.isAuthenticationEnabled() && this.authenticator.isAuthenticationRequested(proxyHost, httpResponseExecute, this.proxyAuthStrategy, authState, httpClientContext) && this.authenticator.handleAuthChallenge(proxyHost, httpResponseExecute, this.proxyAuthStrategy, authState, httpClientContext)) {
                if (this.reuseStrategy.keepAlive(httpResponseExecute, httpClientContext)) {
                    this.log.debug("Connection kept alive");
                    EntityUtils.consume(httpResponseExecute.getEntity());
                } else {
                    httpClientConnection.close();
                }
                httpResponseExecute = null;
            }
        }
        if (httpResponseExecute.getStatusLine().getStatusCode() > 299) {
            HttpEntity entity = httpResponseExecute.getEntity();
            if (entity != null) {
                httpResponseExecute.setEntity(new BufferedHttpEntity(entity));
            }
            httpClientConnection.close();
            throw new TunnelRefusedException("CONNECT refused by proxy: " + httpResponseExecute.getStatusLine(), httpResponseExecute);
        }
        return false;
    }

    private boolean createTunnelToProxy(HttpRoute httpRoute, int i, HttpClientContext httpClientContext) throws HttpException {
        throw new HttpException("Proxy chains are not supported.");
    }

    private boolean needAuthentication(AuthState authState, AuthState authState2, HttpRoute httpRoute, HttpResponse httpResponse, HttpClientContext httpClientContext) {
        if (httpClientContext.getRequestConfig().isAuthenticationEnabled()) {
            HttpHost targetHost = httpClientContext.getTargetHost();
            if (targetHost == null) {
                targetHost = httpRoute.getTargetHost();
            }
            if (targetHost.getPort() < 0) {
                targetHost = new HttpHost(targetHost.getHostName(), httpRoute.getTargetHost().getPort(), targetHost.getSchemeName());
            }
            boolean zIsAuthenticationRequested = this.authenticator.isAuthenticationRequested(targetHost, httpResponse, this.targetAuthStrategy, authState, httpClientContext);
            HttpHost proxyHost = httpRoute.getProxyHost();
            if (proxyHost == null) {
                proxyHost = httpRoute.getTargetHost();
            }
            boolean zIsAuthenticationRequested2 = this.authenticator.isAuthenticationRequested(proxyHost, httpResponse, this.proxyAuthStrategy, authState2, httpClientContext);
            if (zIsAuthenticationRequested) {
                return this.authenticator.handleAuthChallenge(targetHost, httpResponse, this.targetAuthStrategy, authState, httpClientContext);
            }
            if (zIsAuthenticationRequested2) {
                return this.authenticator.handleAuthChallenge(proxyHost, httpResponse, this.proxyAuthStrategy, authState2, httpClientContext);
            }
            return false;
        }
        return false;
    }
}
