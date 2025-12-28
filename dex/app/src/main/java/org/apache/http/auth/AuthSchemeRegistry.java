package org.apache.http.auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.config.Lookup;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class AuthSchemeRegistry implements Lookup<AuthSchemeProvider> {
    private final ConcurrentHashMap<String, AuthSchemeFactory> registeredSchemes = new ConcurrentHashMap<>();

    public final void register(String str, AuthSchemeFactory authSchemeFactory) {
        Args.notNull(str, "Name");
        Args.notNull(authSchemeFactory, "Authentication scheme factory");
        this.registeredSchemes.put(str.toLowerCase(Locale.ENGLISH), authSchemeFactory);
    }

    public final void unregister(String str) {
        Args.notNull(str, "Name");
        this.registeredSchemes.remove(str.toLowerCase(Locale.ENGLISH));
    }

    public final AuthScheme getAuthScheme(String str, HttpParams httpParams) {
        Args.notNull(str, "Name");
        AuthSchemeFactory authSchemeFactory = this.registeredSchemes.get(str.toLowerCase(Locale.ENGLISH));
        if (authSchemeFactory != null) {
            return authSchemeFactory.newInstance(httpParams);
        }
        throw new IllegalStateException("Unsupported authentication scheme: " + str);
    }

    public final List<String> getSchemeNames() {
        return new ArrayList(this.registeredSchemes.keySet());
    }

    public final void setItems(Map<String, AuthSchemeFactory> map) {
        if (map == null) {
            return;
        }
        this.registeredSchemes.clear();
        this.registeredSchemes.putAll(map);
    }

    @Override // org.apache.http.config.Lookup
    public final AuthSchemeProvider lookup(final String str) {
        return new AuthSchemeProvider() { // from class: org.apache.http.auth.AuthSchemeRegistry.1
            @Override // org.apache.http.auth.AuthSchemeProvider
            public AuthScheme create(HttpContext httpContext) {
                return AuthSchemeRegistry.this.getAuthScheme(str, ((HttpRequest) httpContext.getAttribute("http.request")).getParams());
            }
        };
    }
}
