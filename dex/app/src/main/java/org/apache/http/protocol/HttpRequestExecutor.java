package org.apache.http.protocol;

import java.io.IOException;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class HttpRequestExecutor {
    public static final int DEFAULT_WAIT_FOR_CONTINUE = 3000;
    private final int waitForContinue;

    public HttpRequestExecutor(int i) {
        this.waitForContinue = Args.positive(i, "Wait for continue time");
    }

    public HttpRequestExecutor() {
        this(DEFAULT_WAIT_FOR_CONTINUE);
    }

    protected boolean canResponseHaveBody(HttpRequest httpRequest, HttpResponse httpResponse) {
        int statusCode;
        return (HttpHead.METHOD_NAME.equalsIgnoreCase(httpRequest.getRequestLine().getMethod()) || (statusCode = httpResponse.getStatusLine().getStatusCode()) < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) ? false : true;
    }

    public HttpResponse execute(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) throws HttpException, IOException {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpClientConnection, "Client connection");
        Args.notNull(httpContext, "HTTP context");
        try {
            HttpResponse httpResponseDoSendRequest = doSendRequest(httpRequest, httpClientConnection, httpContext);
            if (httpResponseDoSendRequest == null) {
                return doReceiveResponse(httpRequest, httpClientConnection, httpContext);
            }
            return httpResponseDoSendRequest;
        } catch (IOException e) {
            closeConnection(httpClientConnection);
            throw e;
        } catch (RuntimeException e2) {
            closeConnection(httpClientConnection);
            throw e2;
        } catch (HttpException e3) {
            closeConnection(httpClientConnection);
            throw e3;
        }
    }

    private static void closeConnection(HttpClientConnection httpClientConnection) {
        try {
            httpClientConnection.close();
        } catch (IOException unused) {
        }
    }

    public void preProcess(HttpRequest httpRequest, HttpProcessor httpProcessor, HttpContext httpContext) {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpProcessor, "HTTP processor");
        Args.notNull(httpContext, "HTTP context");
        httpContext.setAttribute("http.request", httpRequest);
        httpProcessor.process(httpRequest, httpContext);
    }

    protected HttpResponse doSendRequest(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) throws ProtocolException {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpClientConnection, "Client connection");
        Args.notNull(httpContext, "HTTP context");
        HttpResponse httpResponseReceiveResponseHeader = null;
        httpContext.setAttribute("http.connection", httpClientConnection);
        httpContext.setAttribute("http.request_sent", Boolean.FALSE);
        httpClientConnection.sendRequestHeader(httpRequest);
        if (httpRequest instanceof HttpEntityEnclosingRequest) {
            boolean z = true;
            ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
            if (((HttpEntityEnclosingRequest) httpRequest).expectContinue() && !protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                httpClientConnection.flush();
                if (httpClientConnection.isResponseAvailable(this.waitForContinue)) {
                    httpResponseReceiveResponseHeader = httpClientConnection.receiveResponseHeader();
                    if (canResponseHaveBody(httpRequest, httpResponseReceiveResponseHeader)) {
                        httpClientConnection.receiveResponseEntity(httpResponseReceiveResponseHeader);
                    }
                    int statusCode = httpResponseReceiveResponseHeader.getStatusLine().getStatusCode();
                    if (statusCode < 200) {
                        if (statusCode != 100) {
                            throw new ProtocolException("Unexpected response: " + httpResponseReceiveResponseHeader.getStatusLine());
                        }
                        httpResponseReceiveResponseHeader = null;
                    } else {
                        z = false;
                    }
                }
            }
            if (z) {
                httpClientConnection.sendRequestEntity((HttpEntityEnclosingRequest) httpRequest);
            }
        }
        httpClientConnection.flush();
        httpContext.setAttribute("http.request_sent", Boolean.TRUE);
        return httpResponseReceiveResponseHeader;
    }

    protected HttpResponse doReceiveResponse(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) throws ProtocolException {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpClientConnection, "Client connection");
        Args.notNull(httpContext, "HTTP context");
        HttpResponse httpResponseReceiveResponseHeader = null;
        int statusCode = 0;
        while (true) {
            if (httpResponseReceiveResponseHeader == null || statusCode < 200) {
                httpResponseReceiveResponseHeader = httpClientConnection.receiveResponseHeader();
                statusCode = httpResponseReceiveResponseHeader.getStatusLine().getStatusCode();
                if (statusCode < 100) {
                    throw new ProtocolException("Invalid response: " + httpResponseReceiveResponseHeader.getStatusLine());
                }
                if (canResponseHaveBody(httpRequest, httpResponseReceiveResponseHeader)) {
                    httpClientConnection.receiveResponseEntity(httpResponseReceiveResponseHeader);
                }
            } else {
                return httpResponseReceiveResponseHeader;
            }
        }
    }

    public void postProcess(HttpResponse httpResponse, HttpProcessor httpProcessor, HttpContext httpContext) {
        Args.notNull(httpResponse, "HTTP response");
        Args.notNull(httpProcessor, "HTTP processor");
        Args.notNull(httpContext, "HTTP context");
        httpContext.setAttribute("http.response", httpResponse);
        httpProcessor.process(httpResponse, httpContext);
    }
}
