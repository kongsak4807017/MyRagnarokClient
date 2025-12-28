package org.apache.http.impl.io;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.ConnectionClosedException;
import org.apache.http.io.BufferInfo;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.Args;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class ContentLengthInputStream extends InputStream {
    private static final int BUFFER_SIZE = 2048;
    private final long contentLength;
    private SessionInputBuffer in;
    private long pos = 0;
    private boolean closed = false;

    public ContentLengthInputStream(SessionInputBuffer sessionInputBuffer, long j) {
        this.in = null;
        this.in = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Session input buffer");
        this.contentLength = Args.notNegative(j, "Content length");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.closed) {
            try {
                if (this.pos < this.contentLength) {
                    do {
                    } while (read(new byte[2048]) >= 0);
                }
            } finally {
                this.closed = true;
            }
        }
    }

    @Override // java.io.InputStream
    public int available() {
        if (this.in instanceof BufferInfo) {
            return Math.min(((BufferInfo) this.in).length(), (int) (this.contentLength - this.pos));
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.closed) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.pos >= this.contentLength) {
            return -1;
        }
        int i = this.in.read();
        if (i != -1) {
            this.pos++;
        } else if (this.pos < this.contentLength) {
            throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: " + this.contentLength + "; received: " + this.pos);
        }
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.closed) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.pos >= this.contentLength) {
            return -1;
        }
        int i3 = i2;
        if (this.pos + i2 > this.contentLength) {
            i3 = (int) (this.contentLength - this.pos);
        }
        int i4 = this.in.read(bArr, i, i3);
        if (i4 == -1 && this.pos < this.contentLength) {
            throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: " + this.contentLength + "; received: " + this.pos);
        }
        if (i4 > 0) {
            this.pos += i4;
        }
        return i4;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        int i;
        if (j <= 0) {
            return 0L;
        }
        byte[] bArr = new byte[2048];
        long jMin = Math.min(j, this.contentLength - this.pos);
        long j2 = 0;
        while (jMin > 0 && (i = read(bArr, 0, (int) Math.min(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH, jMin))) != -1) {
            j2 += i;
            jMin -= i;
        }
        return j2;
    }
}
