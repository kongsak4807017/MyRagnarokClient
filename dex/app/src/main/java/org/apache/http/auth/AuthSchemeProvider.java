package org.apache.http.auth;

import org.apache.http.protocol.HttpContext;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface AuthSchemeProvider {
    AuthScheme create(HttpContext httpContext);
}
