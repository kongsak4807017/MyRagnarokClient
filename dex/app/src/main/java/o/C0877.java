package o;

import java.nio.ByteBuffer;

/* renamed from: o.鄛, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0877 extends ub {
    C0877() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 522;
        byteBuffer.getInt();
        int i3 = byteBuffer.getInt();
        if (z) {
            return;
        }
        int i4 = 0;
        while (i4 < C0358.f6664.f2004.f8613.length && C0358.f6664.f2004.f8613[i4].f7707 != i3) {
            i4++;
        }
        if (i4 == C0358.f6664.f2004.f8613.length) {
            return;
        }
        C0358.f6664.f2004.f8613[i4] = null;
        C0729[] c0729Arr = new C0729[C0358.f6664.f2004.f8613.length - 1];
        int i5 = 0;
        for (C0729 c0729 : C0358.f6664.f2004.f8613) {
            if (c0729 != null) {
                int i6 = i5;
                i5++;
                c0729Arr[i6] = c0729;
            }
        }
        C0358.f6664.f2004.f8613 = c0729Arr;
        if (C0358.f6674.f42.f1775.f1994.getParent() != null) {
            C0358.f6674.f42.f1775.m1408(false);
        }
        if (C0358.f6674.f42.f1787.f1994.getParent() != null) {
            C0358.f6674.f42.f1787.b_();
        }
    }
}
