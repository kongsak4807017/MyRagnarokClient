package o;

import java.nio.ByteBuffer;

/* renamed from: o.ȶ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0241 extends ub {
    C0241() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 179;
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        if (b == 0) {
            C0698 c0698 = C0358.f6674.f42.f1792;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(503);
            c0698.m1432(strM649 == null ? "MSG503" : strM649, 16711680);
            return;
        }
        C0358.f6671.m456(true);
        ty tyVar = C0358.f6671.f768;
        tyVar.f4992.f5014 = 0;
        tyVar.f4992.f5013 = 0;
        if (C0358.f6671.f757 != null) {
            C0358.f6671.f757.f772 = null;
        }
        C0358.f6675.mo139(new RunnableC0242(this));
    }
}
