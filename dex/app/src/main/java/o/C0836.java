package o;

import java.nio.ByteBuffer;

/* renamed from: o.繪, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0836 extends ub {
    C0836() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 127;
        int i3 = byteBuffer.getInt();
        if (z) {
            return;
        }
        C0358.f6671.f760 = C0834.f7947;
        C0358.f6671.f752 = System.currentTimeMillis() - C0358.f6671.f760;
        C0358.f6671.f763 = pa.m972(i3) - (C0358.f6671.f752 / 2);
    }
}
