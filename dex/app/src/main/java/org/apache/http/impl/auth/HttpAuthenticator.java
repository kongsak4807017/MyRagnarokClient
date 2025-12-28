package org.apache.http.impl.auth;

import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthOption;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ContextAwareAuthScheme;
import org.apache.http.auth.Credentials;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Asserts;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class HttpAuthenticator {
    private final Log log;

    public HttpAuthenticator(Log log) {
        this.log = log != null ? log : LogFactory.getLog(getClass());
    }

    public HttpAuthenticator() {
        this(null);
    }

    public boolean isAuthenticationRequested(HttpHost httpHost, HttpResponse httpResponse, AuthenticationStrategy authenticationStrategy, AuthState authState, HttpContext httpContext) {
        if (authenticationStrategy.isAuthenticationRequested(httpHost, httpResponse, httpContext)) {
            this.log.debug("Authentication required");
            if (authState.getState() == AuthProtocolState.SUCCESS) {
                authenticationStrategy.authFailed(httpHost, authState.getAuthScheme(), httpContext);
                return true;
            }
            return true;
        }
        switch (authState.getState()) {
            case CHALLENGED:
            case HANDSHAKE:
                this.log.debug("Authentication succeeded");
                authState.setState(AuthProtocolState.SUCCESS);
                authenticationStrategy.authSucceeded(httpHost, authState.getAuthScheme(), httpContext);
                return false;
            case SUCCESS:
                return false;
            default:
                authState.setState(AuthProtocolState.UNCHALLENGED);
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: MalformedChallengeException -> 0x00f3, TryCatch #0 {MalformedChallengeException -> 0x00f3, blocks: (B:2:0x0000, B:4:0x0008, B:5:0x0024, B:7:0x002e, B:10:0x0037, B:11:0x0047, B:32:0x00bf, B:34:0x00c5, B:36:0x00cb, B:38:0x00d3, B:39:0x00e7, B:15:0x005c, B:17:0x0063, B:21:0x007a, B:23:0x008d, B:25:0x009d, B:28:0x00b5, B:31:0x00bc), top: B:50:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5 A[Catch: MalformedChallengeException -> 0x00f3, TryCatch #0 {MalformedChallengeException -> 0x00f3, blocks: (B:2:0x0000, B:4:0x0008, B:5:0x0024, B:7:0x002e, B:10:0x0037, B:11:0x0047, B:32:0x00bf, B:34:0x00c5, B:36:0x00cb, B:38:0x00d3, B:39:0x00e7, B:15:0x005c, B:17:0x0063, B:21:0x007a, B:23:0x008d, B:25:0x009d, B:28:0x00b5, B:31:0x00bc), top: B:50:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean handleAuthChallenge(org.apache.http.HttpHost r7, org.apache.http.HttpResponse r8, org.apache.http.client.AuthenticationStrategy r9, org.apache.http.auth.AuthState r10, org.apache.http.protocol.HttpContext r11) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.auth.HttpAuthenticator.handleAuthChallenge(org.apache.http.HttpHost, org.apache.http.HttpResponse, org.apache.http.client.AuthenticationStrategy, org.apache.http.auth.AuthState, org.apache.http.protocol.HttpContext):boolean");
    }

    public void generateAuthResponse(HttpRequest httpRequest, AuthState authState, HttpContext httpContext) {
        AuthScheme authScheme = authState.getAuthScheme();
        Credentials credentials = authState.getCredentials();
        switch (authState.getState()) {
            case CHALLENGED:
                Queue<AuthOption> authOptions = authState.getAuthOptions();
                if (authOptions != null) {
                    while (!authOptions.isEmpty()) {
                        AuthOption authOptionRemove = authOptions.remove();
                        AuthScheme authScheme2 = authOptionRemove.getAuthScheme();
                        Credentials credentials2 = authOptionRemove.getCredentials();
                        authState.update(authScheme2, credentials2);
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Generating response to an authentication challenge using " + authScheme2.getSchemeName() + " scheme");
                        }
                        try {
                            httpRequest.addHeader(doAuth(authScheme2, credentials2, httpRequest, httpContext));
                            return;
                        } catch (AuthenticationException e) {
                            if (this.log.isWarnEnabled()) {
                                this.log.warn(authScheme2 + " authentication error: " + e.getMessage());
                            }
                        }
                    }
                    return;
                }
                ensureAuthScheme(authScheme);
                break;
            case SUCCESS:
                ensureAuthScheme(authScheme);
                if (authScheme.isConnectionBased()) {
                    return;
                }
                break;
            case FAILURE:
                return;
        }
        if (authScheme != null) {
            try {
                httpRequest.addHeader(doAuth(authScheme, credentials, httpRequest, httpContext));
            } catch (AuthenticationException e2) {
                if (this.log.isErrorEnabled()) {
                    this.log.error(authScheme + " authentication error: " + e2.getMessage());
                }
            }
        }
    }

    private void ensureAuthScheme(AuthScheme authScheme) {
        Asserts.notNull(authScheme, "Auth scheme");
    }

    private Header doAuth(AuthScheme authScheme, Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        if (authScheme instanceof ContextAwareAuthScheme) {
            return ((ContextAwareAuthScheme) authScheme).authenticate(credentials, httpRequest, httpContext);
        }
        return authScheme.authenticate(credentials, httpRequest);
    }
}
