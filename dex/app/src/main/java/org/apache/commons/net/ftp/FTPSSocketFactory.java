package org.apache.commons.net.ftp;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocket;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class FTPSSocketFactory extends SocketFactory {
    private final SSLContext context;

    public FTPSSocketFactory(SSLContext sSLContext) {
        this.context = sSLContext;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return this.context.getSocketFactory().createSocket();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        return this.context.getSocketFactory().createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        return this.context.getSocketFactory().createSocket(inetAddress, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return this.context.getSocketFactory().createSocket(str, i, inetAddress, i2);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return this.context.getSocketFactory().createSocket(inetAddress, i, inetAddress2, i2);
    }

    @Deprecated
    public ServerSocket createServerSocket(int i) {
        return init(this.context.getServerSocketFactory().createServerSocket(i));
    }

    @Deprecated
    public ServerSocket createServerSocket(int i, int i2) {
        return init(this.context.getServerSocketFactory().createServerSocket(i, i2));
    }

    @Deprecated
    public ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) {
        return init(this.context.getServerSocketFactory().createServerSocket(i, i2, inetAddress));
    }

    @Deprecated
    public ServerSocket init(ServerSocket serverSocket) {
        ((SSLServerSocket) serverSocket).setUseClientMode(true);
        return serverSocket;
    }
}
