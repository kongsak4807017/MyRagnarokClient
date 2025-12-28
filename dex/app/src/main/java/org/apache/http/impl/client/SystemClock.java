package org.apache.http.impl.client;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class SystemClock implements Clock {
    SystemClock() {
    }

    @Override // org.apache.http.impl.client.Clock
    public long getCurrentTime() {
        return System.currentTimeMillis();
    }
}
