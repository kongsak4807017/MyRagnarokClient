package org.apache.commons.net.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import org.apache.commons.net.SocketClient;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class FromNetASCIIInputStream extends PushbackInputStream {
    static final String _lineSeparator;
    static final byte[] _lineSeparatorBytes;
    static final boolean _noConversionRequired;
    private int __length;

    static {
        String property = System.getProperty("line.separator");
        _lineSeparator = property;
        _noConversionRequired = property.equals(SocketClient.NETASCII_EOL);
        _lineSeparatorBytes = _lineSeparator.getBytes();
    }

    public static final boolean isConversionRequired() {
        return !_noConversionRequired;
    }

    public FromNetASCIIInputStream(InputStream inputStream) {
        super(inputStream, _lineSeparatorBytes.length + 1);
        this.__length = 0;
    }

    private int __read() throws IOException {
        int i = super.read();
        if (i == 13) {
            int i2 = super.read();
            if (i2 == 10) {
                unread(_lineSeparatorBytes);
                this.__length--;
                return super.read();
            }
            if (i2 != -1) {
                unread(i2);
                return 13;
            }
            return 13;
        }
        return i;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (_noConversionRequired) {
            return super.read();
        }
        return __read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (_noConversionRequired) {
            return super.read(bArr, i, i2);
        }
        if (i2 <= 0) {
            return 0;
        }
        int iAvailable = available();
        this.__length = i2 > iAvailable ? iAvailable : i2;
        if (this.__length <= 0) {
            this.__length = 1;
        }
        int i__read = __read();
        if (i__read == -1) {
            return -1;
        }
        do {
            int i3 = i;
            i++;
            bArr[i3] = (byte) i__read;
            int i4 = this.__length - 1;
            this.__length = i4;
            if (i4 <= 0) {
                break;
            }
            i__read = __read();
        } while (i__read != -1);
        return i - i;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        if (this.in == null) {
            throw new IOException("Stream closed");
        }
        return (this.buf.length - this.pos) + this.in.available();
    }
}
