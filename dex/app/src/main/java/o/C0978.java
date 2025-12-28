package o;

import java.nio.ByteBuffer;

/* renamed from: o.ꉴ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0978 extends ub {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    C1031[] f8331;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f8332;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f8333;

    C0978() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2048;
        this.f8333 = byteBuffer.getInt();
        this.f8332 = byteBuffer.getInt();
        this.f8331 = new C1031[i];
        for (int i3 = 0; i3 < this.f8331.length; i3++) {
            this.f8331[i3] = new C1031(byteBuffer);
        }
        if (z) {
            return;
        }
        C0358.f6674.f42.f1742.m601(this.f8333, this.f8332, this.f8331);
        C0358.f6674.f42.f1742.h_();
    }
}
