package o;

import java.nio.ByteBuffer;

/* renamed from: o.扝, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0720 extends ub {
    C0720() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 744;
        C0726[] c0726Arr = new C0726[i];
        for (int i3 = 0; i3 < c0726Arr.length; i3++) {
            c0726Arr[i3] = C0726.m1437(byteBuffer, C0358.f6667.f4800, false);
        }
        if (z) {
            return;
        }
        AbstractC0608.m1381(c0726Arr);
    }
}
