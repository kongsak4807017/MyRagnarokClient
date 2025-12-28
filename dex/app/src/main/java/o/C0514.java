package o;

import java.nio.ByteBuffer;

/* renamed from: o.ㇺ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0514 extends ub {
    C0514() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        C1092 c1092;
        this.f5008 = (short) 289;
        byteBuffer.getShort();
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        if (z) {
            return;
        }
        mg mgVar = C0358.f6669.f2048.f1551;
        mgVar.f2110.f8593 = s;
        mgVar.f2110.f8594 = i3;
        mgVar.f2110.f8609 = i4;
        C0778 c0778 = C0358.f6674.f42.f1810;
        if (!(c0778.f1994.getParent() != null) || (c1092 = (C1092) c0778.m1466(ng.CART)) == null) {
            return;
        }
        c1092.m1630();
    }
}
