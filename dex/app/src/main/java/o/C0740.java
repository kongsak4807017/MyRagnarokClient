package o;

import java.nio.ByteBuffer;
import o.C0358;
import o.C0358.C0359;
import o.C0358.Cif;
import o.pj;

/* renamed from: o.曔, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0740 extends ub {
    C0740() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 105;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.get(new byte[24]);
        byteBuffer.getShort();
        byte b = byteBuffer.get();
        C1112[] c1112Arr = new C1112[i];
        for (int i6 = 0; i6 < i; i6++) {
            C1112 c1112 = new C1112();
            c1112.f8911 = byteBuffer.getInt();
            c1112.f8910 = byteBuffer.getShort();
            ow owVar = ow.LOCAL;
            byte[] bArr = new byte[20];
            byteBuffer.get(bArr);
            c1112.f8909 = pa.m978(bArr, owVar);
            c1112.f8908 = byteBuffer.getShort();
            c1112.f8905 = byteBuffer.getShort();
            c1112.f8906 = byteBuffer.getShort();
            c1112Arr[i6] = c1112;
        }
        if (z) {
            return;
        }
        m1439(i3, i4, i5, b, c1112Arr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1439(int i, int i2, int i3, byte b, C1112[] c1112Arr) {
        String str;
        C0358.f6671.f758 = true;
        C0358.f6688.f6689 = i2;
        C0358.f6688.f6690 = b;
        C0358.f6688.f6691 = C0358.f6688.new C0359();
        C0358.f6688.f6691.f6704 = i;
        C0358.f6688.f6691.f6703 = i3;
        C0358.f6688.f6691.f6702 = new C0358.Cif[c1112Arr.length];
        String[] strArr = new String[c1112Arr.length];
        int i4 = 0;
        for (int i5 = 0; i5 < c1112Arr.length; i5++) {
            C0358.Cif cif = C0358.f6688.new Cif(c1112Arr[i5].f8909, pa.m958(c1112Arr[i5].f8911), pa.m968(c1112Arr[i5].f8910));
            if ((C0358.f6667.f4771 != pj.aux.iRO_Renewal || !cif.f6700.contains("Classic")) && ((!C0358.f6667.f4851.equals("RagnarokDeep") || !cif.f6700.contains("Asia")) && (!C0358.f6667.f4851.equals("RagnarokDeep-Asia") || cif.f6700.contains("Asia")))) {
                C0358.f6688.f6691.f6702[i4] = cif;
                if (C0358.f6667.f4831) {
                    if (c1112Arr[i5].f8908 < 0 || c1112Arr[i5].f8908 >= 4) {
                        str = "";
                    } else {
                        cv cvVar = C0358.f6685;
                        int i6 = c1112Arr[i5].f8908 + 3262;
                        String strM649 = C0358.f6687.m649(i6);
                        str = strM649 == null ? "MSG" + i6 : strM649;
                    }
                    strArr[i4] = String.valueOf(i5 + 1) + ". " + cif.f6700 + "(" + str + ")";
                } else {
                    strArr[i4] = String.valueOf(i5 + 1) + ". " + cif.f6700 + "(" + ((int) c1112Arr[i5].f8908) + ")";
                }
                i4++;
            }
        }
        if (C0358.f6674.f42.f1801 != null) {
            C0358.f6674.f42.f1801.m1458();
            C0358.f6674.f42.f1801 = null;
        }
        if (i4 == 1) {
            C0358.m1311(C0358.f6688.f6691.f6702[0]);
        } else {
            C0358.f6674.f42.m737(strArr);
        }
    }
}
