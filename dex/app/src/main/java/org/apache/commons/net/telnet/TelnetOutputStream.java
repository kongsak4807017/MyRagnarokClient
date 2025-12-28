package org.apache.commons.net.telnet;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class TelnetOutputStream extends OutputStream {
    private final TelnetClient __client;
    private boolean __convertCRtoCRLF = true;
    private boolean __lastWasCR = false;

    TelnetOutputStream(TelnetClient telnetClient) {
        this.__client = telnetClient;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        synchronized (this.__client) {
            int i2 = i & 255;
            if (this.__client._requestedWont(0)) {
                if (this.__lastWasCR) {
                    if (this.__convertCRtoCRLF) {
                        this.__client._sendByte(10);
                        if (i2 == 10) {
                            this.__lastWasCR = false;
                            return;
                        }
                    } else if (i2 != 10) {
                        this.__client._sendByte(0);
                    }
                }
                this.__lastWasCR = false;
                switch (i2) {
                    case 13:
                        this.__client._sendByte(13);
                        this.__lastWasCR = true;
                        break;
                    case 255:
                        this.__client._sendByte(255);
                        this.__client._sendByte(255);
                        break;
                    default:
                        this.__client._sendByte(i2);
                        break;
                }
            } else if (i2 == 255) {
                this.__client._sendByte(i2);
                this.__client._sendByte(255);
            } else {
                this.__client._sendByte(i2);
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        synchronized (this.__client) {
            while (true) {
                int i3 = i2;
                i2 = i3 - 1;
                if (i3 > 0) {
                    int i4 = i;
                    i++;
                    write(bArr[i4]);
                }
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.__client._flushOutputStream();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.__client._closeOutputStream();
    }
}
