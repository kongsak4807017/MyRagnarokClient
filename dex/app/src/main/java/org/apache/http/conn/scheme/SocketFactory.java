package org.apache.http.conn.scheme;

import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface SocketFactory {
    Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams);

    Socket createSocket();

    boolean isSecure(Socket socket);
}
