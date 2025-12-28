package org.apache.http.impl.client;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class RequestWrapper extends AbstractHttpMessage implements HttpUriRequest {
    private int execCount;
    private String method;
    private final HttpRequest original;
    private URI uri;
    private ProtocolVersion version;

    public RequestWrapper(HttpRequest httpRequest) throws ProtocolException {
        Args.notNull(httpRequest, "HTTP request");
        this.original = httpRequest;
        setParams(httpRequest.getParams());
        setHeaders(httpRequest.getAllHeaders());
        if (httpRequest instanceof HttpUriRequest) {
            this.uri = ((HttpUriRequest) httpRequest).getURI();
            this.method = ((HttpUriRequest) httpRequest).getMethod();
            this.version = null;
        } else {
            RequestLine requestLine = httpRequest.getRequestLine();
            try {
                this.uri = new URI(requestLine.getUri());
                this.method = requestLine.getMethod();
                this.version = httpRequest.getProtocolVersion();
            } catch (URISyntaxException e) {
                throw new ProtocolException("Invalid request URI: " + requestLine.getUri(), e);
            }
        }
        this.execCount = 0;
    }

    public void resetHeaders() {
        this.headergroup.clear();
        setHeaders(this.original.getAllHeaders());
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return this.method;
    }

    public void setMethod(String str) {
        Args.notNull(str, "Method name");
        this.method = str;
    }

    @Override // org.apache.http.HttpMessage
    public ProtocolVersion getProtocolVersion() {
        if (this.version == null) {
            this.version = HttpProtocolParams.getVersion(getParams());
        }
        return this.version;
    }

    public void setProtocolVersion(ProtocolVersion protocolVersion) {
        this.version = protocolVersion;
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public URI getURI() {
        return this.uri;
    }

    public void setURI(URI uri) {
        this.uri = uri;
    }

    @Override // org.apache.http.HttpRequest
    public RequestLine getRequestLine() {
        ProtocolVersion protocolVersion = getProtocolVersion();
        String aSCIIString = null;
        if (this.uri != null) {
            aSCIIString = this.uri.toASCIIString();
        }
        if (aSCIIString == null || aSCIIString.isEmpty()) {
            aSCIIString = "/";
        }
        return new BasicRequestLine(getMethod(), aSCIIString, protocolVersion);
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public void abort() {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public boolean isAborted() {
        return false;
    }

    public HttpRequest getOriginal() {
        return this.original;
    }

    public boolean isRepeatable() {
        return true;
    }

    public int getExecCount() {
        return this.execCount;
    }

    public void incrementExecCount() {
        this.execCount++;
    }
}
