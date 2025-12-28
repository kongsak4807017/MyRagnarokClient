package o;

import java.nio.ByteBuffer;

/* renamed from: o.㐊, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0516 extends ub {

    /* renamed from: 櫯, reason: contains not printable characters */
    C1031[] f7208;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f7209;

    C0516() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 307;
        this.f7209 = byteBuffer.getInt();
        this.f7208 = new C1031[i];
        for (int i3 = 0; i3 < this.f7208.length; i3++) {
            this.f7208[i3] = new C1031(byteBuffer);
        }
        if (z) {
            return;
        }
        C0358.f6674.f42.f1742.m601(this.f7209, 0, this.f7208);
        C0358.f6674.f42.f1742.h_();
    }
}
