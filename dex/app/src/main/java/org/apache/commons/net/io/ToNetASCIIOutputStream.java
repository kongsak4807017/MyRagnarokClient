package org.apache.commons.net.io;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ToNetASCIIOutputStream extends FilterOutputStream {
    private boolean __lastWasCR;

    public ToNetASCIIOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.__lastWasCR = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        switch (i) {
            case 10:
                if (!this.__lastWasCR) {
                    this.out.write(13);
                    break;
                }
                break;
            case 13:
                this.__lastWasCR = true;
                this.out.write(13);
                return;
        }
        this.__lastWasCR = false;
        this.out.write(i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
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
