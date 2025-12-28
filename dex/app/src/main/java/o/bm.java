package o;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class bm {

    /* renamed from: 鷭, reason: contains not printable characters */
    byte[] f846;

    bm(int i, int i2, int i3) {
        this.f846 = new byte[3];
        this.f846[0] = (byte) ((i >> 2) & 255);
        this.f846[1] = (byte) ((i << 6) | ((i2 >> 4) & 63));
        this.f846[2] = (byte) ((i2 << 4) | 0);
    }

    bm(byte[] bArr) {
        this.f846 = new byte[3];
        this.f846[0] = bArr[0];
        this.f846[1] = bArr[1];
        this.f846[2] = bArr[2];
    }

    bm(ByteBuffer byteBuffer) {
        this.f846 = new byte[3];
        byteBuffer.get(this.f846);
    }

    bm() {
        this.f846 = new byte[3];
    }
}
