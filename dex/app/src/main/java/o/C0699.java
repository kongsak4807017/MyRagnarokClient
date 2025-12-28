package o;

import java.nio.ByteBuffer;

/* renamed from: o.悎, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0699 extends ub {
    C0699() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        C1008 c1008;
        this.f5008 = (short) 2567;
        boolean z2 = byteBuffer.get() != 0;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        if (z) {
            return;
        }
        if (!z2) {
            C0698 c0698 = C0358.f6674.f42.f1792;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(2603);
            c0698.m1432(strM649 == null ? "MSG2603" : strM649, 16776960);
            return;
        }
        short s4 = (short) (s - 2);
        eb ebVar = C0358.f6674.f42.f1793;
        int i3 = 0;
        while (i3 < ebVar.f1165.length && ebVar.f1165[i3] != s4) {
            i3++;
        }
        if (i3 == ebVar.f1165.length) {
            nz.m907("rodex write remove failed to find item with index " + ((int) s4));
            c1008 = null;
        } else {
            C1008 c10082 = ebVar.f1161[i3];
            if (c10082 == null) {
                nz.m907("rodex write item/idex desync");
                c1008 = null;
            } else {
                c10082.f8500 -= s2;
                if (c10082.f8500 <= 0) {
                    ebVar.f1165[i3] = -1;
                    ebVar.f1161[i3] = null;
                    ebVar.f1151[i3].setImageBitmap(null);
                    ebVar.f1152[i3].setText("");
                } else {
                    ebVar.f1152[i3].setText(String.valueOf(c10082.f8500));
                }
                ebVar.m573();
                c1008 = c10082;
            }
        }
        C1008 c10083 = C0358.f6664.f2004.f8622.get(Short.valueOf(s4));
        if (c10083 != null) {
            c10083.f8500 += s2;
        } else {
            c1008.f8500 = s2;
            C0358.f6664.f2004.f8622.put(Integer.valueOf(s4), c1008);
        }
        C0358.f6674.f42.f1810.m1468(c1008.f8493);
        C0358.f6674.f42.f1793.m574(s3);
    }
}
