package org.apache.http.conn;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import org.apache.http.HttpHost;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class HttpInetSocketAddress extends InetSocketAddress {
    private static final long serialVersionUID = -6650701828361907957L;
    private final HttpHost httphost;

    public HttpInetSocketAddress(HttpHost httpHost, InetAddress inetAddress, int i) {
        super(inetAddress, i);
        Args.notNull(httpHost, "HTTP host");
        this.httphost = httpHost;
    }

    public HttpHost getHttpHost() {
        return this.httphost;
    }

    @Override // java.net.InetSocketAddress
    public String toString() {
        return this.httphost.getHostName() + ":" + getPort();
    }
}
