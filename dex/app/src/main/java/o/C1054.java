package o;

import java.nio.ByteBuffer;

/* renamed from: o.렿, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1054 extends ub {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    byte f8834;

    /* renamed from: 櫯, reason: contains not printable characters */
    byte f8835;

    /* renamed from: 鷭, reason: contains not printable characters */
    short f8836;

    C1054() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 188;
        this.f8836 = byteBuffer.getShort();
        this.f8835 = byteBuffer.get();
        this.f8834 = byteBuffer.get();
        if (z) {
            return;
        }
        if (this.f8835 == 0) {
            C0358.f6674.f42.f1792.m1432("Failed to raise stats.", 16711680);
        } else {
            C0817.m1483(this, this.f8836, pa.m967(this.f8834));
        }
    }
}
