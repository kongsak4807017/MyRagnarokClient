package o;

import java.nio.ByteBuffer;

/* renamed from: o.胿, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0844 extends ub {
    C0844() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 168;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        int i3 = s - 2;
        if (C0358.f6664.f2004.f8622.get(Integer.valueOf(i3)) == null) {
            return;
        }
        C0391.m1316(this, i3, C0358.f6664.f2004.f1998, s2, b);
    }
}
