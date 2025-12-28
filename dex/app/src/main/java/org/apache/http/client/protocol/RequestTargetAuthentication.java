package org.apache.http.client.protocol;

import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthState;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class RequestTargetAuthentication extends RequestAuthenticationBase {
    @Override // org.apache.http.HttpRequestInterceptor
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpContext, "HTTP context");
        if (httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT") || httpRequest.containsHeader("Authorization")) {
            return;
        }
        AuthState authState = (AuthState) httpContext.getAttribute("http.auth.target-scope");
        if (authState == null) {
            this.log.debug("Target auth state not set in the context");
            return;
        }
        if (this.log.isDebugEnabled()) {
            this.log.debug("Target auth state: " + authState.getState());
        }
        process(authState, httpRequest, httpContext);
    }
}
