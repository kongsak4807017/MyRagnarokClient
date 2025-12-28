package org.apache.http.conn;

import javax.net.ssl.SSLSession;
import org.apache.http.HttpInetConnection;
import org.apache.http.conn.routing.HttpRoute;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface HttpRoutedConnection extends HttpInetConnection {
    HttpRoute getRoute();

    SSLSession getSSLSession();

    boolean isSecure();
}
