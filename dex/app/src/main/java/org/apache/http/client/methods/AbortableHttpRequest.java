package org.apache.http.client.methods;

import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionReleaseTrigger;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface AbortableHttpRequest {
    void abort();

    void setConnectionRequest(ClientConnectionRequest clientConnectionRequest);

    void setReleaseTrigger(ConnectionReleaseTrigger connectionReleaseTrigger);
}
