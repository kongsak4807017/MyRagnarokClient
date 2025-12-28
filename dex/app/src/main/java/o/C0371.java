package o;

import java.nio.ByteBuffer;
import java.util.HashMap;
import o.ck;
import o.ck.C0027;
import o.ua;

/* renamed from: o.ˮ͞, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0371 extends ub {
    C0371() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 693;
        byteBuffer.getShort();
        C0771[] c0771Arr = new C0771[i];
        for (int i3 = 0; i3 < c0771Arr.length; i3++) {
            C0771 c0771 = new C0771();
            c0771.f7802 = byteBuffer.getInt();
            c0771.f7801 = byteBuffer.getInt();
            c0771.f7799 = byteBuffer.getShort();
            c0771.f7798 = byteBuffer.getShort();
            c0771Arr[i3] = c0771;
        }
        if (z) {
            return;
        }
        m1314(c0771Arr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1314(C0771[] c0771Arr) {
        for (C0771 c0771 : c0771Arr) {
            ck ckVar = C0358.f6679.f6832.get(Integer.valueOf(c0771.f7802));
            ua.C0084 c0084Mo1102 = C0358.f6685.f1030.f983.mo1102(c0771.f7802);
            if (ckVar == null) {
                HashMap<Integer, ck> map = C0358.f6679.f6832;
                Integer numValueOf = Integer.valueOf(c0771.f7802);
                ckVar = new ck();
                map.put(numValueOf, ckVar);
            }
            if (ckVar.f920 == null || ckVar.f920.length <= 0) {
                ckVar.f920 = new ck.C0027[1];
                ckVar.f920[0] = ckVar.new C0027(0, 1002, 0, 1, "");
            }
            ck.C0027 c0027 = ckVar.f920[0];
            for (ck.C0027 c00272 : ckVar.f920) {
                if ((c0771.f7801 > 0 && c00272.f932 == c0771.f7801) || (c0771.f7800 > 0 && c00272.f933 == c0771.f7800)) {
                    c0027 = c00272;
                    break;
                }
            }
            if (c0771.f7801 > 0) {
                c0027.f932 = c0771.f7801;
            }
            if (c0771.f7800 > 0) {
                c0027.f933 = c0771.f7800;
            }
            c0027.f931 = c0771.f7798;
            c0027.f930 = c0771.f7799;
            if (c0084Mo1102 != null) {
                C0698 c0698 = C0358.f6674.f42.f1792;
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(1611);
                c0698.m1432(String.format(strM649 == null ? "MSG1611" : strM649, c0084Mo1102.f5004, c0027.f928, Short.valueOf(c0027.f931), Short.valueOf(c0027.f930)), 16776960);
            }
        }
        C0358.f6674.f42.f1757.m484();
    }
}
