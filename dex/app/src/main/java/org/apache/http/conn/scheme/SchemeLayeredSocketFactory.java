package org.apache.http.conn.scheme;

import java.net.Socket;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface SchemeLayeredSocketFactory extends SchemeSocketFactory {
    Socket createLayeredSocket(Socket socket, String str, int i, HttpParams httpParams);
}
