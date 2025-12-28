package o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ͢, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0372 extends ub {
    C0372() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 665;
        byteBuffer.getShort();
        int i3 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        if (z) {
            return;
        }
        C0698 c0698 = C0358.f6674.f42.f1792;
        C0432 c0432M1648 = C0358.f6685.f1030.f967.m1648(i3);
        c0698.m1432(String.valueOf(c0432M1648 == null ? null : c0432M1648.m1328(true)) + " rental time has expired.", 16711680);
    }
}
