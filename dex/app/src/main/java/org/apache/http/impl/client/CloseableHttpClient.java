package org.apache.http.impl.client;

import java.io.Closeable;
import java.net.URI;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class CloseableHttpClient implements Closeable, HttpClient {
    private final Log log = LogFactory.getLog(getClass());

    protected abstract CloseableHttpResponse doExecute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext);

    @Override // org.apache.http.client.HttpClient
    public CloseableHttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return doExecute(httpHost, httpRequest, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public CloseableHttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        Args.notNull(httpUriRequest, "HTTP request");
        return doExecute(determineTarget(httpUriRequest), httpUriRequest, httpContext);
    }

    private static HttpHost determineTarget(HttpUriRequest httpUriRequest) throws ClientProtocolException {
        HttpHost httpHostExtractHost = null;
        URI uri = httpUriRequest.getURI();
        if (uri.isAbsolute() && (httpHostExtractHost = URIUtils.extractHost(uri)) == null) {
            throw new ClientProtocolException("URI does not specify a valid host name: " + uri);
        }
        return httpHostExtractHost;
    }

    @Override // org.apache.http.client.HttpClient
    public CloseableHttpResponse execute(HttpUriRequest httpUriRequest) {
        return execute(httpUriRequest, (HttpContext) null);
    }

    @Override // org.apache.http.client.HttpClient
    public CloseableHttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return doExecute(httpHost, httpRequest, null);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) execute(httpUriRequest, responseHandler, (HttpContext) null);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) execute(determineTarget(httpUriRequest), httpUriRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) execute(httpHost, httpRequest, responseHandler, null);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        Args.notNull(responseHandler, "Response handler");
        CloseableHttpResponse closeableHttpResponseExecute = execute(httpHost, httpRequest, httpContext);
        try {
            try {
                T tHandleResponse = responseHandler.handleResponse(closeableHttpResponseExecute);
                EntityUtils.consume(closeableHttpResponseExecute.getEntity());
                return tHandleResponse;
            } catch (ClientProtocolException e) {
                try {
                    EntityUtils.consume(closeableHttpResponseExecute.getEntity());
                } catch (Exception e2) {
                    this.log.warn("Error consuming content after an exception.", e2);
                }
                throw e;
            }
        } finally {
            closeableHttpResponseExecute.close();
        }
    }
}
