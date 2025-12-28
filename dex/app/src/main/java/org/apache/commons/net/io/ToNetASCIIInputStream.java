package org.apache.commons.net.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ToNetASCIIInputStream extends FilterInputStream {
    private static final int __LAST_WAS_CR = 1;
    private static final int __LAST_WAS_NL = 2;
    private static final int __NOTHING_SPECIAL = 0;
    private int __status;

    public ToNetASCIIInputStream(InputStream inputStream) {
        super(inputStream);
        this.__status = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.__status == 2) {
            this.__status = 0;
            return 10;
        }
        int i = this.in.read();
        switch (i) {
            case 10:
                if (this.__status != 1) {
                    this.__status = 2;
                    return 13;
                }
                break;
            case 13:
                this.__status = 1;
                return 13;
        }
        this.__status = 0;
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 <= 0) {
            return 0;
        }
        int iAvailable = available();
        if (i2 > iAvailable) {
            i2 = iAvailable;
        }
        if (i2 <= 0) {
            i2 = 1;
        }
        int i3 = read();
        if (i3 == -1) {
            return -1;
        }
        do {
            int i4 = i;
            i++;
            bArr[i4] = (byte) i3;
            i2--;
            if (i2 <= 0) {
                break;
            }
            i3 = read();
        } while (i3 != -1);
        return i - i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int iAvailable = this.in.available();
        if (this.__status == 2) {
            return iAvailable + 1;
        }
        return iAvailable;
    }
}
