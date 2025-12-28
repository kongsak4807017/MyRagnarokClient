package org.apache.http.conn.socket;

import java.net.Socket;
import org.apache.http.protocol.HttpContext;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface LayeredConnectionSocketFactory extends ConnectionSocketFactory {
    Socket createLayeredSocket(Socket socket, String str, int i, HttpContext httpContext);
}
