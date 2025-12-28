package org.apache.http.impl.conn;

import java.io.IOException;
import org.apache.commons.net.SocketClient;
import org.apache.http.Consts;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class LoggingSessionOutputBuffer implements SessionOutputBuffer {
    private final String charset;
    private final SessionOutputBuffer out;
    private final Wire wire;

    public LoggingSessionOutputBuffer(SessionOutputBuffer sessionOutputBuffer, Wire wire, String str) {
        this.out = sessionOutputBuffer;
        this.wire = wire;
        this.charset = str != null ? str : Consts.ASCII.name();
    }

    public LoggingSessionOutputBuffer(SessionOutputBuffer sessionOutputBuffer, Wire wire) {
        this(sessionOutputBuffer, wire, null);
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        if (this.wire.enabled()) {
            this.wire.output(bArr, i, i2);
        }
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void write(int i) throws IOException {
        this.out.write(i);
        if (this.wire.enabled()) {
            this.wire.output(i);
        }
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void write(byte[] bArr) throws IOException {
        this.out.write(bArr);
        if (this.wire.enabled()) {
            this.wire.output(bArr);
        }
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void flush() {
        this.out.flush();
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void writeLine(CharArrayBuffer charArrayBuffer) throws IOException {
        this.out.writeLine(charArrayBuffer);
        if (this.wire.enabled()) {
            this.wire.output((new String(charArrayBuffer.buffer(), 0, charArrayBuffer.length()) + SocketClient.NETASCII_EOL).getBytes(this.charset));
        }
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void writeLine(String str) throws IOException {
        this.out.writeLine(str);
        if (this.wire.enabled()) {
            this.wire.output((str + SocketClient.NETASCII_EOL).getBytes(this.charset));
        }
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.out.getMetrics();
    }
}
