package org.apache.http.protocol;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.HttpStatus;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.ProtocolException;
import org.apache.http.UnsupportedHttpVersionException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.EncodingUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class HttpService {
    private volatile ConnectionReuseStrategy connStrategy;
    private volatile HttpExpectationVerifier expectationVerifier;
    private volatile HttpRequestHandlerMapper handlerMapper;
    private volatile HttpParams params;
    private volatile HttpProcessor processor;
    private volatile HttpResponseFactory responseFactory;

    @Deprecated
    public HttpService(HttpProcessor httpProcessor, ConnectionReuseStrategy connectionReuseStrategy, HttpResponseFactory httpResponseFactory, HttpRequestHandlerResolver httpRequestHandlerResolver, HttpExpectationVerifier httpExpectationVerifier, HttpParams httpParams) {
        this(httpProcessor, connectionReuseStrategy, httpResponseFactory, new HttpRequestHandlerResolverAdapter(httpRequestHandlerResolver), httpExpectationVerifier);
        this.params = httpParams;
    }

    @Deprecated
    public HttpService(HttpProcessor httpProcessor, ConnectionReuseStrategy connectionReuseStrategy, HttpResponseFactory httpResponseFactory, HttpRequestHandlerResolver httpRequestHandlerResolver, HttpParams httpParams) {
        this(httpProcessor, connectionReuseStrategy, httpResponseFactory, new HttpRequestHandlerResolverAdapter(httpRequestHandlerResolver), (HttpExpectationVerifier) null);
        this.params = httpParams;
    }

    @Deprecated
    public HttpService(HttpProcessor httpProcessor, ConnectionReuseStrategy connectionReuseStrategy, HttpResponseFactory httpResponseFactory) {
        this.params = null;
        this.processor = null;
        this.handlerMapper = null;
        this.connStrategy = null;
        this.responseFactory = null;
        this.expectationVerifier = null;
        setHttpProcessor(httpProcessor);
        setConnReuseStrategy(connectionReuseStrategy);
        setResponseFactory(httpResponseFactory);
    }

    public HttpService(HttpProcessor httpProcessor, ConnectionReuseStrategy connectionReuseStrategy, HttpResponseFactory httpResponseFactory, HttpRequestHandlerMapper httpRequestHandlerMapper, HttpExpectationVerifier httpExpectationVerifier) {
        this.params = null;
        this.processor = null;
        this.handlerMapper = null;
        this.connStrategy = null;
        this.responseFactory = null;
        this.expectationVerifier = null;
        this.processor = (HttpProcessor) Args.notNull(httpProcessor, "HTTP processor");
        this.connStrategy = connectionReuseStrategy != null ? connectionReuseStrategy : DefaultConnectionReuseStrategy.INSTANCE;
        this.responseFactory = httpResponseFactory != null ? httpResponseFactory : DefaultHttpResponseFactory.INSTANCE;
        this.handlerMapper = httpRequestHandlerMapper;
        this.expectationVerifier = httpExpectationVerifier;
    }

    public HttpService(HttpProcessor httpProcessor, ConnectionReuseStrategy connectionReuseStrategy, HttpResponseFactory httpResponseFactory, HttpRequestHandlerMapper httpRequestHandlerMapper) {
        this(httpProcessor, connectionReuseStrategy, httpResponseFactory, httpRequestHandlerMapper, (HttpExpectationVerifier) null);
    }

    public HttpService(HttpProcessor httpProcessor, HttpRequestHandlerMapper httpRequestHandlerMapper) {
        this(httpProcessor, (ConnectionReuseStrategy) null, (HttpResponseFactory) null, httpRequestHandlerMapper, (HttpExpectationVerifier) null);
    }

    @Deprecated
    public void setHttpProcessor(HttpProcessor httpProcessor) {
        Args.notNull(httpProcessor, "HTTP processor");
        this.processor = httpProcessor;
    }

    @Deprecated
    public void setConnReuseStrategy(ConnectionReuseStrategy connectionReuseStrategy) {
        Args.notNull(connectionReuseStrategy, "Connection reuse strategy");
        this.connStrategy = connectionReuseStrategy;
    }

    @Deprecated
    public void setResponseFactory(HttpResponseFactory httpResponseFactory) {
        Args.notNull(httpResponseFactory, "Response factory");
        this.responseFactory = httpResponseFactory;
    }

    @Deprecated
    public void setParams(HttpParams httpParams) {
        this.params = httpParams;
    }

    @Deprecated
    public void setHandlerResolver(HttpRequestHandlerResolver httpRequestHandlerResolver) {
        this.handlerMapper = new HttpRequestHandlerResolverAdapter(httpRequestHandlerResolver);
    }

    @Deprecated
    public void setExpectationVerifier(HttpExpectationVerifier httpExpectationVerifier) {
        this.expectationVerifier = httpExpectationVerifier;
    }

    @Deprecated
    public HttpParams getParams() {
        return this.params;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleRequest(org.apache.http.HttpServerConnection r7, org.apache.http.protocol.HttpContext r8) {
        /*
            r6 = this;
            java.lang.String r0 = "http.connection"
            r8.setAttribute(r0, r7)
            r3 = 0
            r4 = 0
            org.apache.http.HttpRequest r0 = r7.receiveRequestHeader()     // Catch: org.apache.http.HttpException -> L7c
            r3 = r0
            boolean r0 = r0 instanceof org.apache.http.HttpEntityEnclosingRequest     // Catch: org.apache.http.HttpException -> L7c
            if (r0 == 0) goto L54
            r0 = r3
            org.apache.http.HttpEntityEnclosingRequest r0 = (org.apache.http.HttpEntityEnclosingRequest) r0     // Catch: org.apache.http.HttpException -> L7c
            boolean r0 = r0.expectContinue()     // Catch: org.apache.http.HttpException -> L7c
            if (r0 == 0) goto L4e
            org.apache.http.HttpResponseFactory r0 = r6.responseFactory     // Catch: org.apache.http.HttpException -> L7c
            org.apache.http.HttpVersion r1 = org.apache.http.HttpVersion.HTTP_1_1     // Catch: org.apache.http.HttpException -> L7c
            r2 = 100
            org.apache.http.HttpResponse r4 = r0.newHttpResponse(r1, r2, r8)     // Catch: org.apache.http.HttpException -> L7c
            org.apache.http.protocol.HttpExpectationVerifier r0 = r6.expectationVerifier     // Catch: org.apache.http.HttpException -> L7c
            if (r0 == 0) goto L3b
            org.apache.http.protocol.HttpExpectationVerifier r0 = r6.expectationVerifier     // Catch: org.apache.http.HttpException -> L2d
            r0.verify(r3, r4, r8)     // Catch: org.apache.http.HttpException -> L2d
            goto L3b
        L2d:
            r5 = move-exception
            org.apache.http.HttpResponseFactory r0 = r6.responseFactory     // Catch: org.apache.http.HttpException -> L7c
            org.apache.http.HttpVersion r1 = org.apache.http.HttpVersion.HTTP_1_0     // Catch: org.apache.http.HttpException -> L7c
            r2 = 500(0x1f4, float:7.0E-43)
            org.apache.http.HttpResponse r4 = r0.newHttpResponse(r1, r2, r8)     // Catch: org.apache.http.HttpException -> L7c
            r6.handleException(r5, r4)     // Catch: org.apache.http.HttpException -> L7c
        L3b:
            org.apache.http.StatusLine r0 = r4.getStatusLine()     // Catch: org.apache.http.HttpException -> L7c
            int r0 = r0.getStatusCode()     // Catch: org.apache.http.HttpException -> L7c
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 >= r1) goto L54
            r7.sendResponseHeader(r4)     // Catch: org.apache.http.HttpException -> L7c
            r7.flush()     // Catch: org.apache.http.HttpException -> L7c
            r4 = 0
        L4e:
            r0 = r3
            org.apache.http.HttpEntityEnclosingRequest r0 = (org.apache.http.HttpEntityEnclosingRequest) r0     // Catch: org.apache.http.HttpException -> L7c
            r7.receiveRequestEntity(r0)     // Catch: org.apache.http.HttpException -> L7c
        L54:
            java.lang.String r0 = "http.request"
            r8.setAttribute(r0, r3)     // Catch: org.apache.http.HttpException -> L7c
            if (r4 != 0) goto L6d
            org.apache.http.HttpResponseFactory r0 = r6.responseFactory     // Catch: org.apache.http.HttpException -> L7c
            org.apache.http.HttpVersion r1 = org.apache.http.HttpVersion.HTTP_1_1     // Catch: org.apache.http.HttpException -> L7c
            r2 = 200(0xc8, float:2.8E-43)
            org.apache.http.HttpResponse r4 = r0.newHttpResponse(r1, r2, r8)     // Catch: org.apache.http.HttpException -> L7c
            org.apache.http.protocol.HttpProcessor r0 = r6.processor     // Catch: org.apache.http.HttpException -> L7c
            r0.process(r3, r8)     // Catch: org.apache.http.HttpException -> L7c
            r6.doService(r3, r4, r8)     // Catch: org.apache.http.HttpException -> L7c
        L6d:
            boolean r0 = r3 instanceof org.apache.http.HttpEntityEnclosingRequest     // Catch: org.apache.http.HttpException -> L7c
            if (r0 == 0) goto L7b
            r0 = r3
            org.apache.http.HttpEntityEnclosingRequest r0 = (org.apache.http.HttpEntityEnclosingRequest) r0     // Catch: org.apache.http.HttpException -> L7c
            org.apache.http.HttpEntity r0 = r0.getEntity()     // Catch: org.apache.http.HttpException -> L7c
            org.apache.http.util.EntityUtils.consume(r0)     // Catch: org.apache.http.HttpException -> L7c
        L7b:
            goto L8a
        L7c:
            r5 = move-exception
            org.apache.http.HttpResponseFactory r0 = r6.responseFactory
            org.apache.http.HttpVersion r1 = org.apache.http.HttpVersion.HTTP_1_0
            r2 = 500(0x1f4, float:7.0E-43)
            org.apache.http.HttpResponse r4 = r0.newHttpResponse(r1, r2, r8)
            r6.handleException(r5, r4)
        L8a:
            java.lang.String r0 = "http.response"
            r8.setAttribute(r0, r4)
            org.apache.http.protocol.HttpProcessor r0 = r6.processor
            r0.process(r4, r8)
            r7.sendResponseHeader(r4)
            boolean r0 = r6.canResponseHaveBody(r3, r4)
            if (r0 == 0) goto La0
            r7.sendResponseEntity(r4)
        La0:
            r7.flush()
            org.apache.http.ConnectionReuseStrategy r0 = r6.connStrategy
            boolean r0 = r0.keepAlive(r4, r8)
            if (r0 != 0) goto Lae
            r7.close()
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.protocol.HttpService.handleRequest(org.apache.http.HttpServerConnection, org.apache.http.protocol.HttpContext):void");
    }

    private boolean canResponseHaveBody(HttpRequest httpRequest, HttpResponse httpResponse) {
        int statusCode;
        return ((httpRequest != null && HttpHead.METHOD_NAME.equalsIgnoreCase(httpRequest.getRequestLine().getMethod())) || (statusCode = httpResponse.getStatusLine().getStatusCode()) < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) ? false : true;
    }

    protected void handleException(HttpException httpException, HttpResponse httpResponse) {
        if (httpException instanceof MethodNotSupportedException) {
            httpResponse.setStatusCode(501);
        } else if (httpException instanceof UnsupportedHttpVersionException) {
            httpResponse.setStatusCode(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED);
        } else if (httpException instanceof ProtocolException) {
            httpResponse.setStatusCode(400);
        } else {
            httpResponse.setStatusCode(500);
        }
        String message = httpException.getMessage();
        if (message == null) {
            message = httpException.toString();
        }
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(EncodingUtils.getAsciiBytes(message));
        byteArrayEntity.setContentType("text/plain; charset=US-ASCII");
        httpResponse.setEntity(byteArrayEntity);
    }

    protected void doService(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) {
        HttpRequestHandler httpRequestHandlerLookup = null;
        if (this.handlerMapper != null) {
            httpRequestHandlerLookup = this.handlerMapper.lookup(httpRequest);
        }
        if (httpRequestHandlerLookup != null) {
            httpRequestHandlerLookup.handle(httpRequest, httpResponse, httpContext);
        } else {
            httpResponse.setStatusCode(501);
        }
    }

    @Deprecated
    static class HttpRequestHandlerResolverAdapter implements HttpRequestHandlerMapper {
        private final HttpRequestHandlerResolver resolver;

        public HttpRequestHandlerResolverAdapter(HttpRequestHandlerResolver httpRequestHandlerResolver) {
            this.resolver = httpRequestHandlerResolver;
        }

        @Override // org.apache.http.protocol.HttpRequestHandlerMapper
        public HttpRequestHandler lookup(HttpRequest httpRequest) {
            return this.resolver.lookup(httpRequest.getRequestLine().getUri());
        }
    }
}
