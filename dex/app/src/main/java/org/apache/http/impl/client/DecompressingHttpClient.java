package org.apache.http.impl.client;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.RequestAcceptEncoding;
import org.apache.http.client.protocol.ResponseContentEncoding;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class DecompressingHttpClient implements HttpClient {
    private final HttpRequestInterceptor acceptEncodingInterceptor;
    private final HttpClient backend;
    private final HttpResponseInterceptor contentEncodingInterceptor;

    public DecompressingHttpClient() {
        this(new DefaultHttpClient());
    }

    public DecompressingHttpClient(HttpClient httpClient) {
        this(httpClient, new RequestAcceptEncoding(), new ResponseContentEncoding());
    }

    DecompressingHttpClient(HttpClient httpClient, HttpRequestInterceptor httpRequestInterceptor, HttpResponseInterceptor httpResponseInterceptor) {
        this.backend = httpClient;
        this.acceptEncodingInterceptor = httpRequestInterceptor;
        this.contentEncodingInterceptor = httpResponseInterceptor;
    }

    @Override // org.apache.http.client.HttpClient
    public HttpParams getParams() {
        return this.backend.getParams();
    }

    @Override // org.apache.http.client.HttpClient
    public ClientConnectionManager getConnectionManager() {
        return this.backend.getConnectionManager();
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpUriRequest httpUriRequest) {
        return execute(getHttpHost(httpUriRequest), httpUriRequest, (HttpContext) null);
    }

    public HttpClient getHttpClient() {
        return this.backend;
    }

    HttpHost getHttpHost(HttpUriRequest httpUriRequest) {
        return URIUtils.extractHost(httpUriRequest.getURI());
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return execute(getHttpHost(httpUriRequest), httpUriRequest, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return execute(httpHost, httpRequest, (HttpContext) null);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        HttpContext basicHttpContext;
        RequestWrapper requestWrapper;
        if (httpContext != null) {
            basicHttpContext = httpContext;
        } else {
            try {
                basicHttpContext = new BasicHttpContext();
            } catch (HttpException e) {
                throw new ClientProtocolException(e);
            }
        }
        HttpContext httpContext2 = basicHttpContext;
        if (httpRequest instanceof HttpEntityEnclosingRequest) {
            requestWrapper = new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpRequest);
        } else {
            requestWrapper = new RequestWrapper(httpRequest);
        }
        this.acceptEncodingInterceptor.process(requestWrapper, httpContext2);
        HttpResponse httpResponseExecute = this.backend.execute(httpHost, requestWrapper, httpContext2);
        try {
            this.contentEncodingInterceptor.process(httpResponseExecute, httpContext2);
            if (Boolean.TRUE.equals(httpContext2.getAttribute(ResponseContentEncoding.UNCOMPRESSED))) {
                httpResponseExecute.removeHeaders("Content-Length");
                httpResponseExecute.removeHeaders("Content-Encoding");
                httpResponseExecute.removeHeaders(HttpHeaders.CONTENT_MD5);
            }
            return httpResponseExecute;
        } catch (IOException e2) {
            EntityUtils.consume(httpResponseExecute.getEntity());
            throw e2;
        } catch (RuntimeException e3) {
            EntityUtils.consume(httpResponseExecute.getEntity());
            throw e3;
        } catch (HttpException e4) {
            EntityUtils.consume(httpResponseExecute.getEntity());
            throw e4;
        }
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) execute(getHttpHost(httpUriRequest), httpUriRequest, responseHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) execute(getHttpHost(httpUriRequest), httpUriRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) execute(httpHost, httpRequest, responseHandler, null);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws HttpException, IOException {
        HttpResponse httpResponseExecute = execute(httpHost, httpRequest, httpContext);
        try {
            return responseHandler.handleResponse(httpResponseExecute);
        } finally {
            HttpEntity entity = httpResponseExecute.getEntity();
            if (entity != null) {
                EntityUtils.consume(entity);
            }
        }
    }
}
