package org.apache.http.conn;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.util.Args;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class EofSensorInputStream extends InputStream implements ConnectionReleaseTrigger {
    private final EofSensorWatcher eofWatcher;
    private boolean selfClosed;
    protected InputStream wrappedStream;

    public EofSensorInputStream(InputStream inputStream, EofSensorWatcher eofSensorWatcher) {
        Args.notNull(inputStream, "Wrapped stream");
        this.wrappedStream = inputStream;
        this.selfClosed = false;
        this.eofWatcher = eofSensorWatcher;
    }

    boolean isSelfClosed() {
        return this.selfClosed;
    }

    InputStream getWrappedStream() {
        return this.wrappedStream;
    }

    protected boolean isReadAllowed() throws IOException {
        if (this.selfClosed) {
            throw new IOException("Attempted read on closed stream.");
        }
        return this.wrappedStream != null;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!isReadAllowed()) {
            return -1;
        }
        try {
            int i = this.wrappedStream.read();
            checkEOF(i);
            return i;
        } catch (IOException e) {
            checkAbort();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!isReadAllowed()) {
            return -1;
        }
        try {
            int i3 = this.wrappedStream.read(bArr, i, i2);
            checkEOF(i3);
            return i3;
        } catch (IOException e) {
            checkAbort();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (!isReadAllowed()) {
            return 0;
        }
        try {
            return this.wrappedStream.available();
        } catch (IOException e) {
            checkAbort();
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.selfClosed = true;
        checkClose();
    }

    protected void checkEOF(int i) {
        InputStream inputStream = this.wrappedStream;
        if (inputStream != null && i < 0) {
            try {
                boolean zEofDetected = true;
                if (this.eofWatcher != null) {
                    zEofDetected = this.eofWatcher.eofDetected(inputStream);
                }
                if (zEofDetected) {
                    inputStream.close();
                }
            } finally {
                this.wrappedStream = null;
            }
        }
    }

    protected void checkClose() {
        InputStream inputStream = this.wrappedStream;
        if (inputStream != null) {
            try {
                boolean zStreamClosed = true;
                if (this.eofWatcher != null) {
                    zStreamClosed = this.eofWatcher.streamClosed(inputStream);
                }
                if (zStreamClosed) {
                    inputStream.close();
                }
            } finally {
                this.wrappedStream = null;
            }
        }
    }

    protected void checkAbort() {
        InputStream inputStream = this.wrappedStream;
        if (inputStream != null) {
            try {
                boolean zStreamAbort = true;
                if (this.eofWatcher != null) {
                    zStreamAbort = this.eofWatcher.streamAbort(inputStream);
                }
                if (zStreamAbort) {
                    inputStream.close();
                }
            } finally {
                this.wrappedStream = null;
            }
        }
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void releaseConnection() {
        close();
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void abortConnection() {
        this.selfClosed = true;
        checkAbort();
    }
}
