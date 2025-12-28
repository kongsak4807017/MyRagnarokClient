package org.apache.http;

import java.net.Socket;
import org.apache.http.HttpConnection;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface HttpConnectionFactory<T extends HttpConnection> {
    T createConnection(Socket socket);
}
