package org.apache.http.impl.conn;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class DefaultProxyRoutePlanner extends DefaultRoutePlanner {
    private final HttpHost proxy;

    public DefaultProxyRoutePlanner(HttpHost httpHost, SchemePortResolver schemePortResolver) {
        super(schemePortResolver);
        this.proxy = (HttpHost) Args.notNull(httpHost, "Proxy host");
    }

    public DefaultProxyRoutePlanner(HttpHost httpHost) {
        this(httpHost, null);
    }

    @Override // org.apache.http.impl.conn.DefaultRoutePlanner
    protected HttpHost determineProxy(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.proxy;
    }
}
