package o;

import java.nio.ByteBuffer;

/* renamed from: o.ㆢ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class C0510 extends ub {
    C0510() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2422;
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        pa.m978(bArr, owVar);
        C1154[] c1154Arr = new C1154[i];
        for (int i3 = 0; i3 < c1154Arr.length; i3++) {
            c1154Arr[i3] = C1154.m1655(byteBuffer, C0358.f6667.f4800, true);
        }
        if (z) {
            return;
        }
        m1358(c1154Arr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1358(C1154[] c1154Arr) {
        for (C1154 c1154 : c1154Arr) {
            C0358.f6664.f2004.f8595.put(Integer.valueOf(c1154.f9020 - 1), new C1008(c1154));
            C0358.f6685.f1030.f967.m1648(c1154.f9018);
        }
        C0358.f6674.f42.f1786.m677(null);
    }
}
