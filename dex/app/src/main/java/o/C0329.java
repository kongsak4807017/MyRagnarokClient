package o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̚, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0329 extends ub {
    C0329() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 313;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        short s4 = byteBuffer.getShort();
        short s5 = byteBuffer.getShort();
        if (z || C0358.f6664.f2004 == null) {
            return;
        }
        if (C0358.f6664.f2004.f2002 != s3 || C0358.f6664.f2004.f1999 != s4) {
            C1035 c1035 = C0358.f6664.f2004;
            c1035.f2002 = s3;
            c1035.f1999 = s4;
            c1035.f2000.x = 0;
            c1035.f2000.y = 0;
            return;
        }
        C0358.f6671.mo454(new C0427(s, s2));
        C0358.f6664.f2004.m1561(i3, s, s2, s5, 0, 0);
    }
}
