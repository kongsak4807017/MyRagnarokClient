package org.apache.http.client.methods;

import java.net.URI;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.params.HttpProtocolParams;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class HttpRequestBase extends AbstractExecutionAwareRequest implements Configurable, HttpUriRequest {
    private RequestConfig config;
    private URI uri;
    private ProtocolVersion version;

    public abstract String getMethod();

    public void setProtocolVersion(ProtocolVersion protocolVersion) {
        this.version = protocolVersion;
    }

    @Override // org.apache.http.HttpMessage
    public ProtocolVersion getProtocolVersion() {
        return this.version != null ? this.version : HttpProtocolParams.getVersion(getParams());
    }

    @Override // org.apache.http.client.methods.HttpUriRequest
    public URI getURI() {
        return this.uri;
    }

    @Override // org.apache.http.HttpRequest
    public RequestLine getRequestLine() {
        String method = getMethod();
        ProtocolVersion protocolVersion = getProtocolVersion();
        URI uri = getURI();
        String aSCIIString = null;
        if (uri != null) {
            aSCIIString = uri.toASCIIString();
        }
        if (aSCIIString == null || aSCIIString.isEmpty()) {
            aSCIIString = "/";
        }
        return new BasicRequestLine(method, aSCIIString, protocolVersion);
    }

    @Override // org.apache.http.client.methods.Configurable
    public RequestConfig getConfig() {
        return this.config;
    }

    public void setConfig(RequestConfig requestConfig) {
        this.config = requestConfig;
    }

    public void setURI(URI uri) {
        this.uri = uri;
    }

    public void started() {
    }

    public void releaseConnection() {
        reset();
    }

    public String toString() {
        return getMethod() + " " + getURI() + " " + getProtocolVersion();
    }
}
