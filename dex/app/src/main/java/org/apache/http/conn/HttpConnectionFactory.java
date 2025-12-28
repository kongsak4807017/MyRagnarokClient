package org.apache.http.conn;

import org.apache.http.HttpConnection;
import org.apache.http.config.ConnectionConfig;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface HttpConnectionFactory<T, C extends HttpConnection> {
    C create(T t, ConnectionConfig connectionConfig);
}
