package o;

import java.nio.ByteBuffer;

/* renamed from: o.ꀴ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class C0966 extends ub {
    C0966() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2306;
        C0726[] c0726Arr = new C0726[i];
        for (int i3 = 0; i3 < c0726Arr.length; i3++) {
            c0726Arr[i3] = C0726.m1437(byteBuffer, C0358.f6667.f4800, false);
        }
        if (z) {
            return;
        }
        m1552(c0726Arr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1552(C0726[] c0726Arr) {
        for (C0726 c0726 : c0726Arr) {
            C0358.f6664.f2004.f8592.put(Integer.valueOf(r6.f7696 - 2), new C1008(c0726));
        }
        if (C0358.f6669.f2048.f1551.f2098 == null) {
            C0358.f6669.f2048.f1551.m837(0, false);
        }
        C0358.f6674.f42.f1810.m1465(ng.CART);
    }
}
