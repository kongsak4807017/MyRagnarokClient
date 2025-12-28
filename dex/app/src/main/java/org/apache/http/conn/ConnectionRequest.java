package org.apache.http.conn;

import java.util.concurrent.TimeUnit;
import org.apache.http.HttpClientConnection;
import org.apache.http.concurrent.Cancellable;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface ConnectionRequest extends Cancellable {
    HttpClientConnection get(long j, TimeUnit timeUnit);
}
