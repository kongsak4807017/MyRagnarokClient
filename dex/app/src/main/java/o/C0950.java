package o;

import java.nio.ByteBuffer;
import o.pj;

/* renamed from: o.鮝, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0950 extends ub {
    C0950() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        boolean z2 = C0358.f6667.f4771 != pj.aux.iRO_Renewal && C0358.f6667.f4800 >= 20090603;
        this.f5008 = (short) 257;
        short s = byteBuffer.getShort();
        byteBuffer.getShort();
        byte b = z2 ? byteBuffer.get() : (byte) 0;
        byte b2 = z2 ? byteBuffer.get() : (byte) 0;
        if (z) {
            return;
        }
        C0348.m1287(s, b, b2);
    }
}
