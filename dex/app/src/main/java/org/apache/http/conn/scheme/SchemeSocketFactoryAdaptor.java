package org.apache.http.conn.scheme;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class SchemeSocketFactoryAdaptor implements SchemeSocketFactory {
    private final SocketFactory factory;

    SchemeSocketFactoryAdaptor(SocketFactory socketFactory) {
        this.factory = socketFactory;
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpParams httpParams) {
        String hostName = inetSocketAddress.getHostName();
        int port = inetSocketAddress.getPort();
        InetAddress address = null;
        int port2 = 0;
        if (inetSocketAddress2 != null) {
            address = inetSocketAddress2.getAddress();
            port2 = inetSocketAddress2.getPort();
        }
        return this.factory.connectSocket(socket, hostName, port, address, port2, httpParams);
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public Socket createSocket(HttpParams httpParams) {
        return this.factory.createSocket();
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public boolean isSecure(Socket socket) {
        return this.factory.isSecure(socket);
    }

    public SocketFactory getFactory() {
        return this.factory;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof SchemeSocketFactoryAdaptor) {
            return this.factory.equals(((SchemeSocketFactoryAdaptor) obj).factory);
        }
        return this.factory.equals(obj);
    }

    public int hashCode() {
        return this.factory.hashCode();
    }
}
