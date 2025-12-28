package org.apache.http.protocol;

import java.util.Map;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class HttpRequestHandlerRegistry implements HttpRequestHandlerResolver {
    private final UriPatternMatcher<HttpRequestHandler> matcher = new UriPatternMatcher<>();

    public void register(String str, HttpRequestHandler httpRequestHandler) {
        Args.notNull(str, "URI request pattern");
        Args.notNull(httpRequestHandler, "Request handler");
        this.matcher.register(str, httpRequestHandler);
    }

    public void unregister(String str) {
        this.matcher.unregister(str);
    }

    public void setHandlers(Map<String, HttpRequestHandler> map) {
        this.matcher.setObjects(map);
    }

    public Map<String, HttpRequestHandler> getHandlers() {
        return this.matcher.getObjects();
    }

    @Override // org.apache.http.protocol.HttpRequestHandlerResolver
    public HttpRequestHandler lookup(String str) {
        return this.matcher.lookup(str);
    }
}
