package o;

import java.nio.ByteBuffer;

/* renamed from: o.쁅, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class C1081 extends ub {
    C1081() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2307;
        C1154[] c1154Arr = new C1154[i];
        for (int i3 = 0; i3 < c1154Arr.length; i3++) {
            c1154Arr[i3] = C1154.m1655(byteBuffer, C0358.f6667.f4800, false);
        }
        if (z) {
            return;
        }
        m1628(c1154Arr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1628(C1154[] c1154Arr) {
        for (C1154 c1154 : c1154Arr) {
            C0358.f6664.f2004.f8592.put(Integer.valueOf(r6.f9020 - 2), new C1008(c1154));
        }
        C0358.f6674.f42.f1810.m1465(ng.CART);
    }
}
