package org.apache.commons.net.ftp;

import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocket;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class FTPSServerSocketFactory extends ServerSocketFactory {
    private final SSLContext context;

    public FTPSServerSocketFactory(SSLContext sSLContext) {
        this.context = sSLContext;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket() {
        return init(this.context.getServerSocketFactory().createServerSocket());
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i) {
        return init(this.context.getServerSocketFactory().createServerSocket(i));
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i, int i2) {
        return init(this.context.getServerSocketFactory().createServerSocket(i, i2));
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) {
        return init(this.context.getServerSocketFactory().createServerSocket(i, i2, inetAddress));
    }

    public ServerSocket init(ServerSocket serverSocket) {
        ((SSLServerSocket) serverSocket).setUseClientMode(true);
        return serverSocket;
    }
}
