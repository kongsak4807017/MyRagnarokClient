package o;

import java.nio.ByteBuffer;

/* renamed from: o.牥, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0790 extends ub {
    C0790() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2565;
        ms msVar = ms.valuesCustom()[byteBuffer.get()];
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        int i3 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        EnumC0680 enumC0680 = EnumC0680.valuesCustom()[byteBuffer.get()];
        boolean z2 = byteBuffer.get() != 0;
        boolean z3 = byteBuffer.get() != 0;
        byte b = byteBuffer.get();
        C0132 c0132 = new C0132(byteBuffer);
        C0637 c0637 = new C0637(byteBuffer);
        short s3 = byteBuffer.getShort();
        if (z) {
            return;
        }
        short s4 = (short) (s - 2);
        C0698 c0698 = C0358.f6674.f42.f1792;
        cv cvVar = C0358.f6685;
        int i4 = msVar.f2164;
        String strM649 = C0358.f6687.m649(i4);
        c0698.m1432(strM649 == null ? "MSG" + i4 : strM649, 16776960);
        C1008 c1008 = C0358.f6664.f2004.f8622.get(Integer.valueOf(s4));
        if (c1008 != null) {
            c1008.f8500 -= s2;
            if (c1008.f8500 <= 0) {
                C0358.f6664.f2004.f8622.remove(c1008);
            }
            C0358.f6674.f42.f1810.m1468(c1008.f8493);
        }
        C1008 c10082 = new C1008(i3, s2, b, enumC0680, z3, z2, false, 0, 0, 0, c0132, 0, 0, c0637);
        eb ebVar = C0358.f6674.f42.f1793;
        int i5 = 0;
        while (i5 < ebVar.f1161.length && ebVar.f1161[i5] != null) {
            i5++;
        }
        if (i5 == ebVar.f1161.length) {
            nz.m907("can't add item to rodex: no slot");
        } else {
            ebVar.f1165[i5] = s4;
            ebVar.f1161[i5] = c10082;
            je jeVar = C0358.f6674.f42;
            jeVar.m730(ebVar.f1151[i5], C0358.f6685.f1030.m510(c10082.f8502, c10082.f8491, false), jeVar.f1815, null);
            ebVar.f1152[i5].setText(String.valueOf(c10082.f8500));
            ebVar.f1152[i5].setVisibility(0);
            ebVar.m573();
        }
        C0358.f6674.f42.f1793.m574(s3);
    }
}
