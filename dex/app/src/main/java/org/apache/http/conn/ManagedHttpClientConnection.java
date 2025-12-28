package org.apache.http.conn;

import java.net.Socket;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpInetConnection;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface ManagedHttpClientConnection extends HttpClientConnection, HttpInetConnection {
    void bind(Socket socket);

    String getId();

    SSLSession getSSLSession();

    Socket getSocket();
}
