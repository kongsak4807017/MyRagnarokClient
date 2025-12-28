package o;

import java.nio.ByteBuffer;

/* renamed from: o.뢷, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1058 extends ub {
    C1058() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 721;
        C1154[] c1154Arr = new C1154[i];
        for (int i3 = 0; i3 < c1154Arr.length; i3++) {
            c1154Arr[i3] = C1154.m1655(byteBuffer, C0358.f6667.f4800, false);
        }
        if (z) {
            return;
        }
        C0510.m1358(c1154Arr);
    }
}
