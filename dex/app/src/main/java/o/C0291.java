package o;

import java.nio.ByteBuffer;

/* renamed from: o.ʨ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0291 extends ub {
    C0291() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 346;
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        ow owVar2 = ow.LOCAL;
        byte[] bArr2 = new byte[40];
        byteBuffer.get(bArr2);
        String strM9782 = pa.m978(bArr2, owVar2);
        if (z) {
            return;
        }
        C0698 c0698 = C0358.f6674.f42.f1792;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(365);
        c0698.m1432(String.format(strM649 == null ? "MSG365" : strM649, strM978), 16776960);
        if (strM9782.length() > 0) {
            C0698 c06982 = C0358.f6674.f42.f1792;
            cv cvVar2 = C0358.f6685;
            String strM6492 = C0358.f6687.m649(366);
            c06982.m1432(String.format(strM6492 == null ? "MSG366" : strM6492, strM9782), 16776960);
        }
        if (C0358.f6664.f2004.f8635 == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= C0358.f6664.f2004.f8635.f8300.size()) {
                break;
            }
            if (C0358.f6664.f2004.f8635.f8300.get(i3).f8320 != strM978) {
                i3++;
            } else {
                C0358.f6664.f2004.f8635.f8300.remove(i3);
                break;
            }
        }
        if (C0358.f6674.f42.f1748.f1994.getParent() != null) {
            C0358.f6674.f42.f1748.f7697.mo1382();
        }
        if (strM978.equals(C0358.f6664.f2004.f8368)) {
            C0358.f6664.f2004.f8348 = 0;
            C0358.f6674.f42.f1787.a_();
        }
    }
}
