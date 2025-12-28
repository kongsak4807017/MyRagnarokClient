package org.apache.http.impl.io;

import java.io.InputStream;
import org.apache.http.io.BufferInfo;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.Args;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class IdentityInputStream extends InputStream {
    private boolean closed = false;
    private final SessionInputBuffer in;

    public IdentityInputStream(SessionInputBuffer sessionInputBuffer) {
        this.in = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Session input buffer");
    }

    @Override // java.io.InputStream
    public int available() {
        if (this.in instanceof BufferInfo) {
            return ((BufferInfo) this.in).length();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.closed) {
            return -1;
        }
        return this.in.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.closed) {
            return -1;
        }
        return this.in.read(bArr, i, i2);
    }
}
