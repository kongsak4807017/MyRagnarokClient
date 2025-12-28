package org.apache.http.impl.conn;

import java.io.IOException;
import org.apache.commons.net.SocketClient;
import org.apache.http.Consts;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.io.EofSensor;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class LoggingSessionInputBuffer implements EofSensor, SessionInputBuffer {
    private final String charset;
    private final EofSensor eofSensor;
    private final SessionInputBuffer in;
    private final Wire wire;

    public LoggingSessionInputBuffer(SessionInputBuffer sessionInputBuffer, Wire wire, String str) {
        this.in = sessionInputBuffer;
        this.eofSensor = sessionInputBuffer instanceof EofSensor ? (EofSensor) sessionInputBuffer : null;
        this.wire = wire;
        this.charset = str != null ? str : Consts.ASCII.name();
    }

    public LoggingSessionInputBuffer(SessionInputBuffer sessionInputBuffer, Wire wire) {
        this(sessionInputBuffer, wire, null);
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public boolean isDataAvailable(int i) {
        return this.in.isDataAvailable(i);
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.in.read(bArr, i, i2);
        if (this.wire.enabled() && i3 > 0) {
            this.wire.input(bArr, i, i3);
        }
        return i3;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int read() throws IOException {
        int i = this.in.read();
        if (this.wire.enabled() && i != -1) {
            this.wire.input(i);
        }
        return i;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int read(byte[] bArr) throws IOException {
        int i = this.in.read(bArr);
        if (this.wire.enabled() && i > 0) {
            this.wire.input(bArr, 0, i);
        }
        return i;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public String readLine() throws IOException {
        String line = this.in.readLine();
        if (this.wire.enabled() && line != null) {
            this.wire.input((line + SocketClient.NETASCII_EOL).getBytes(this.charset));
        }
        return line;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int readLine(CharArrayBuffer charArrayBuffer) throws IOException {
        int line = this.in.readLine(charArrayBuffer);
        if (this.wire.enabled() && line >= 0) {
            this.wire.input((new String(charArrayBuffer.buffer(), charArrayBuffer.length() - line, line) + SocketClient.NETASCII_EOL).getBytes(this.charset));
        }
        return line;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.in.getMetrics();
    }

    @Override // org.apache.http.io.EofSensor
    public boolean isEof() {
        if (this.eofSensor != null) {
            return this.eofSensor.isEof();
        }
        return false;
    }
}
