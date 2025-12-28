package o;

import java.nio.ByteBuffer;

/* renamed from: o.怖, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0696 extends ub {
    C0696() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 293;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        if (z) {
            return;
        }
        short s2 = (short) (s - 2);
        C1008 c1008 = C0358.f6664.f2004.f8592.get(Integer.valueOf(s2));
        if (c1008 == null) {
            return;
        }
        c1008.f8500 -= i3;
        if (c1008.f8500 <= 0) {
            C0358.f6664.f2004.f8592.remove(Integer.valueOf(s2));
        }
        C0358.f6674.f42.f1810.m1465(ng.CART);
    }
}
