package org.apache.http.protocol;

import java.net.InetAddress;
import org.apache.http.HttpConnection;
import org.apache.http.HttpHost;
import org.apache.http.HttpInetConnection;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class RequestTargetHost implements HttpRequestInterceptor {
    @Override // org.apache.http.HttpRequestInterceptor
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws ProtocolException {
        Args.notNull(httpRequest, "HTTP request");
        HttpCoreContext httpCoreContextAdapt = HttpCoreContext.adapt(httpContext);
        ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
        if ((!httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT") || !protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) && !httpRequest.containsHeader("Host")) {
            HttpHost targetHost = httpCoreContextAdapt.getTargetHost();
            if (targetHost == null) {
                HttpConnection connection = httpCoreContextAdapt.getConnection();
                if (connection instanceof HttpInetConnection) {
                    InetAddress remoteAddress = ((HttpInetConnection) connection).getRemoteAddress();
                    int remotePort = ((HttpInetConnection) connection).getRemotePort();
                    if (remoteAddress != null) {
                        targetHost = new HttpHost(remoteAddress.getHostName(), remotePort);
                    }
                }
                if (targetHost == null) {
                    if (protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                        return;
                    } else {
                        throw new ProtocolException("Target host missing");
                    }
                }
            }
            httpRequest.addHeader("Host", targetHost.toHostString());
        }
    }
}
