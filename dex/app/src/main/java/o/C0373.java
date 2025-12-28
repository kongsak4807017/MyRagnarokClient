package o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮͪ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0373 extends ub {
    C0373() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2578;
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        boolean z2 = byteBuffer.get() != 0;
        if (z) {
            return;
        }
        if (!z2) {
            C0698 c0698 = C0358.f6674.f42.f1792;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(2605);
            c0698.m1432(strM649 == null ? "MSG2605" : strM649, 16711680);
            return;
        }
        C0358.f6674.f42.f1793.f1167.setText(strM978);
        C0358.f6674.f42.f1793.h_();
    }
}
