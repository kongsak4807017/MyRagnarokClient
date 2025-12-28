package org.apache.http.impl.client;

import org.apache.http.HttpResponse;
import org.apache.http.client.ConnectionBackoffStrategy;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class NullBackoffStrategy implements ConnectionBackoffStrategy {
    @Override // org.apache.http.client.ConnectionBackoffStrategy
    public boolean shouldBackoff(Throwable th) {
        return false;
    }

    @Override // org.apache.http.client.ConnectionBackoffStrategy
    public boolean shouldBackoff(HttpResponse httpResponse) {
        return false;
    }
}
