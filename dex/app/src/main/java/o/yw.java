package o;

import java.io.InputStream;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class yw extends InputStream {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final long f5998;

    /* renamed from: 櫯, reason: contains not printable characters */
    private long f5999;

    /* renamed from: 鷭, reason: contains not printable characters */
    private yt f6000;

    public yw(yt ytVar, long j, long j2) {
        this.f6000 = ytVar;
        this.f5999 = j;
        this.f5998 = j2;
        ytVar.mo1179(this.f5999);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f5999 == this.f5998) {
            return -1;
        }
        int i = this.f6000.read();
        this.f5999++;
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f5999 == this.f5998) {
            return -1;
        }
        int i3 = this.f6000.read(bArr, i, (int) Math.min(i2, this.f5998 - this.f5999));
        this.f5999 += i3;
        return i3;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
