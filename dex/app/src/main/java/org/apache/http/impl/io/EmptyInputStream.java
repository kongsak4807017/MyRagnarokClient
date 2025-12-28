package org.apache.http.impl.io;

import java.io.InputStream;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class EmptyInputStream extends InputStream {
    public static final EmptyInputStream INSTANCE = new EmptyInputStream();

    private EmptyInputStream() {
    }

    @Override // java.io.InputStream
    public final int available() {
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return -1;
    }

    @Override // java.io.InputStream
    public final void reset() {
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return 0L;
    }
}
