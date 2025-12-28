package org.apache.http.client;

import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScheme;
import org.apache.http.protocol.HttpContext;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface AuthenticationHandler {
    Map<String, Header> getChallenges(HttpResponse httpResponse, HttpContext httpContext);

    boolean isAuthenticationRequested(HttpResponse httpResponse, HttpContext httpContext);

    AuthScheme selectScheme(Map<String, Header> map, HttpResponse httpResponse, HttpContext httpContext);
}
