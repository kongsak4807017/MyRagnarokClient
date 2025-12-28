package org.apache.http.conn.scheme;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class PlainSocketFactory implements SchemeSocketFactory, SocketFactory {
    private final HostNameResolver nameResolver;

    public static PlainSocketFactory getSocketFactory() {
        return new PlainSocketFactory();
    }

    @Deprecated
    public PlainSocketFactory(HostNameResolver hostNameResolver) {
        this.nameResolver = hostNameResolver;
    }

    public PlainSocketFactory() {
        this.nameResolver = null;
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public Socket createSocket(HttpParams httpParams) {
        return new Socket();
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() {
        return new Socket();
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpParams httpParams) throws IOException {
        Args.notNull(inetSocketAddress, "Remote address");
        Args.notNull(httpParams, "HTTP parameters");
        if (socket == null) {
            socket = createSocket();
        }
        if (inetSocketAddress2 != null) {
            socket.setReuseAddress(HttpConnectionParams.getSoReuseaddr(httpParams));
            socket.bind(inetSocketAddress2);
        }
        int connectionTimeout = HttpConnectionParams.getConnectionTimeout(httpParams);
        try {
            socket.setSoTimeout(HttpConnectionParams.getSoTimeout(httpParams));
            socket.connect(inetSocketAddress, connectionTimeout);
            return socket;
        } catch (SocketTimeoutException unused) {
            throw new ConnectTimeoutException("Connect to " + inetSocketAddress + " timed out");
        }
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public final boolean isSecure(Socket socket) {
        return false;
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    @Deprecated
    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) throws UnknownHostException {
        InetAddress byName;
        InetSocketAddress inetSocketAddress = null;
        if (inetAddress != null || i2 > 0) {
            inetSocketAddress = new InetSocketAddress(inetAddress, i2 > 0 ? i2 : 0);
        }
        if (this.nameResolver != null) {
            byName = this.nameResolver.resolve(str);
        } else {
            byName = InetAddress.getByName(str);
        }
        return connectSocket(socket, new InetSocketAddress(byName, i), inetSocketAddress, httpParams);
    }
}
