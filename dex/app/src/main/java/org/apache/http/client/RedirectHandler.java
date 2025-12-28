package org.apache.http.client;

import java.net.URI;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface RedirectHandler {
    URI getLocationURI(HttpResponse httpResponse, HttpContext httpContext);

    boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext);
}
