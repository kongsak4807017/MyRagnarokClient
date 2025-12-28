package o;

import java.nio.ByteBuffer;

/* renamed from: o.ˌ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class C0306 extends ub {
    C0306() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2305;
        C1154[] c1154Arr = new C1154[i];
        for (int i3 = 0; i3 < c1154Arr.length; i3++) {
            c1154Arr[i3] = C1154.m1655(byteBuffer, C0358.f6667.f4800, true);
        }
        if (z) {
            return;
        }
        AbstractC0309.m1280(c1154Arr);
    }
}
