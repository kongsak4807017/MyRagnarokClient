package o;

import java.nio.ByteBuffer;
import o.C0972.Cif;

/* renamed from: o.ʧ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0290 extends ub {
    C0290() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2105;
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
        m1279(this, strM978, strM9782);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1279(ub ubVar, String str, String str2) {
        if (C0358.f6664.f2004.f8635 == null) {
            C0358.f6664.f2004.f8635 = new C0972();
        }
        C0358.f6664.f2004.f8635.f8299.add(C0358.f6664.f2004.f8635.new Cif(str, str2));
        C0698 c0698 = C0358.f6674.f42.f1792;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(371);
        c0698.m1432(String.format(strM649 == null ? "MSG371" : strM649, str), 16776960);
        if (str2.length() > 0) {
            C0698 c06982 = C0358.f6674.f42.f1792;
            cv cvVar2 = C0358.f6685;
            String strM6492 = C0358.f6687.m649(372);
            c06982.m1432(String.format(strM6492 == null ? "MSG372" : strM6492, str2), 16776960);
        }
        throw new uz(ubVar);
    }
}
