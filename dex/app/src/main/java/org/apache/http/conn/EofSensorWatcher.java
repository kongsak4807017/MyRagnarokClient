package org.apache.http.conn;

import java.io.InputStream;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface EofSensorWatcher {
    boolean eofDetected(InputStream inputStream);

    boolean streamAbort(InputStream inputStream);

    boolean streamClosed(InputStream inputStream);
}
