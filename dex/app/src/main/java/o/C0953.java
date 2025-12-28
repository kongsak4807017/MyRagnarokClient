package o;

import java.nio.ByteBuffer;

/* renamed from: o.鱾, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class C0953 extends ub {
    C0953() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2421;
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        pa.m978(bArr, owVar);
        C0726[] c0726Arr = new C0726[i];
        for (int i3 = 0; i3 < c0726Arr.length; i3++) {
            c0726Arr[i3] = C0726.m1437(byteBuffer, C0358.f6667.f4800, true);
        }
        if (z) {
            return;
        }
        m1547(c0726Arr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1547(C0726[] c0726Arr) {
        for (C0726 c0726 : c0726Arr) {
            C0358.f6664.f2004.f8595.put(Integer.valueOf(c0726.f7696 - 1), new C1008(c0726));
            C0358.f6685.f1030.f967.m1648(c0726.f7695);
        }
        C0358.f6674.f42.f1786.m677(null);
    }
}
