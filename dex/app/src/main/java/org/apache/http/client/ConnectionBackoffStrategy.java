package org.apache.http.client;

import org.apache.http.HttpResponse;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface ConnectionBackoffStrategy {
    boolean shouldBackoff(Throwable th);

    boolean shouldBackoff(HttpResponse httpResponse);
}
