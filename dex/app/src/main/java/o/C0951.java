package o;

import java.nio.ByteBuffer;
import o.pj;

/* renamed from: o.鮻, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0951 extends ub {
    C0951() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2117;
        int i3 = byteBuffer.getInt();
        int i4 = C0358.f6667.f4771 != pj.aux.iRO_Renewal ? byteBuffer.getInt() : 0;
        if (z) {
            return;
        }
        C0358.f6679.f6831.f8575 = i3;
        C0358.f6679.f6831.f8574 = i4;
        C0358.f6674.f42.f1756.h_();
        C0358.f6674.f42.f1756.e_();
        int i5 = C0358.f6667.f4800 >= 20131223 ? 9 : 8;
        for (int i6 = 0; i6 < i5; i6++) {
            C0358.f6671.mo454(new C0527(i6));
        }
    }
}
