package o;

import java.nio.ByteBuffer;

/* renamed from: o.Ȓ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0228 extends ub {
    C0228() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2575;
        C1154[] c1154Arr = new C1154[i];
        for (int i3 = 0; i3 < c1154Arr.length; i3++) {
            c1154Arr[i3] = C1154.m1654(byteBuffer);
        }
        if (z) {
            return;
        }
        C1081.m1628(c1154Arr);
    }
}
