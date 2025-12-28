package o;

import java.nio.ByteBuffer;

/* renamed from: o.뤯, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1059 extends ub {
    C1059() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 246;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        if (z) {
            return;
        }
        short s2 = (short) (s - 1);
        C1008 c1008 = C0358.f6664.f2004.f8595.get(Integer.valueOf(s2));
        if (c1008 == null) {
            return;
        }
        c1008.f8500 -= i3;
        if (c1008.f8500 <= 0) {
            C0358.f6664.f2004.f8595.remove(Integer.valueOf(s2));
        }
        if (!(C0358.f6674.f42.f1786.f1994.getParent() != null)) {
            return;
        }
        C0358.f6674.f42.f1786.m677(ng.m881(c1008.f8493));
    }
}
