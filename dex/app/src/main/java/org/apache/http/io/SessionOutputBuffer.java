package org.apache.http.io;

import org.apache.http.util.CharArrayBuffer;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface SessionOutputBuffer {
    void flush();

    HttpTransportMetrics getMetrics();

    void write(int i);

    void write(byte[] bArr);

    void write(byte[] bArr, int i, int i2);

    void writeLine(String str);

    void writeLine(CharArrayBuffer charArrayBuffer);
}
