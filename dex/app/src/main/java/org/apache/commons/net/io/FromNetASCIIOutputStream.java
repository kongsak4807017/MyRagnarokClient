package org.apache.commons.net.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class FromNetASCIIOutputStream extends FilterOutputStream {
    private boolean __lastWasCR;

    public FromNetASCIIOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.__lastWasCR = false;
    }

    private void __write(int i) throws IOException {
        switch (i) {
            case 10:
                if (this.__lastWasCR) {
                    this.out.write(FromNetASCIIInputStream._lineSeparatorBytes);
                    this.__lastWasCR = false;
                    break;
                } else {
                    this.__lastWasCR = false;
                    this.out.write(10);
                    break;
                }
            case 13:
                this.__lastWasCR = true;
                break;
            default:
                if (this.__lastWasCR) {
                    this.out.write(13);
                    this.__lastWasCR = false;
                }
                this.out.write(i);
                break;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        if (FromNetASCIIInputStream._noConversionRequired) {
            this.out.write(i);
        } else {
            __write(i);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        if (FromNetASCIIInputStream._noConversionRequired) {
            this.out.write(bArr, i, i2);
            return;
        }
        while (true) {
            int i3 = i2;
            i2 = i3 - 1;
            if (i3 <= 0) {
                return;
            }
            int i4 = i;
            i++;
            __write(bArr[i4]);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (FromNetASCIIInputStream._noConversionRequired) {
            super.close();
            return;
        }
        if (this.__lastWasCR) {
            this.out.write(13);
        }
        super.close();
    }
}
