package org.apache.http.impl.client;

import java.security.Principal;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpConnection;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class DefaultUserTokenHandler implements UserTokenHandler {
    public static final DefaultUserTokenHandler INSTANCE = new DefaultUserTokenHandler();

    @Override // org.apache.http.client.UserTokenHandler
    public Object getUserToken(HttpContext httpContext) {
        SSLSession sSLSession;
        HttpClientContext httpClientContextAdapt = HttpClientContext.adapt(httpContext);
        Principal authPrincipal = null;
        AuthState targetAuthState = httpClientContextAdapt.getTargetAuthState();
        if (targetAuthState != null && (authPrincipal = getAuthPrincipal(targetAuthState)) == null) {
            authPrincipal = getAuthPrincipal(httpClientContextAdapt.getProxyAuthState());
        }
        if (authPrincipal == null) {
            HttpConnection connection = httpClientContextAdapt.getConnection();
            if (connection.isOpen() && (connection instanceof ManagedHttpClientConnection) && (sSLSession = ((ManagedHttpClientConnection) connection).getSSLSession()) != null) {
                return sSLSession.getLocalPrincipal();
            }
            return authPrincipal;
        }
        return authPrincipal;
    }

    private static Principal getAuthPrincipal(AuthState authState) {
        Credentials credentials;
        AuthScheme authScheme = authState.getAuthScheme();
        if (authScheme != null && authScheme.isComplete() && authScheme.isConnectionBased() && (credentials = authState.getCredentials()) != null) {
            return credentials.getUserPrincipal();
        }
        return null;
    }
}
