package org.apache.http.conn;

import java.util.concurrent.TimeUnit;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface ClientConnectionRequest {
    void abortRequest();

    ManagedClientConnection getConnection(long j, TimeUnit timeUnit);
}
