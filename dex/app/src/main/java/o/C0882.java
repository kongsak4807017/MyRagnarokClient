package o;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import o.aq;
import o.aq.C0023;

/* renamed from: o.酴, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0882 extends ub {
    C0882() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 489;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        ow owVar2 = ow.LOCAL;
        byte[] bArr2 = new byte[24];
        byteBuffer.get(bArr2);
        String strM9782 = pa.m978(bArr2, owVar2);
        ow owVar3 = ow.KOREAN;
        byte[] bArr3 = new byte[16];
        byteBuffer.get(bArr3);
        String strM9783 = pa.m978(bArr3, owVar3);
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        if (z) {
            return;
        }
        m1517(i3, i4, s, s2, b, strM978, strM9782, strM9783, b2, b3);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1517(int i, int i2, short s, short s2, byte b, String str, String str2, String str3, byte b2, byte b3) {
        if (C0358.f6664.f2004.f8596 == null) {
            C0358.f6664.f2004.f8596 = new aq();
        }
        C0358.f6664.f2004.f8596.f688 = str;
        if (b3 != -1) {
            C0358.f6664.f2004.f8596.f686 = nn.valuesCustom()[b3];
        }
        if (b2 != -1) {
            C0358.f6664.f2004.f8596.f685 = no.valuesCustom()[b2];
        }
        aq.C0023 c0023 = null;
        aq.C0023[] c0023Arr = C0358.f6664.f2004.f8596.f684;
        int length = c0023Arr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            aq.C0023 c00232 = c0023Arr[i3];
            if (c00232.f696 != i) {
                i3++;
            } else {
                c0023 = c00232;
                break;
            }
        }
        if (c0023 == null) {
            c0023 = C0358.f6664.f2004.f8596.new C0023();
            C0358.f6664.f2004.f8596.f684 = (aq.C0023[]) Arrays.copyOf(C0358.f6664.f2004.f8596.f684, C0358.f6664.f2004.f8596.f684.length + 1);
            C0358.f6664.f2004.f8596.f684[C0358.f6664.f2004.f8596.f684.length - 1] = c0023;
        }
        c0023.m437(i, str2, str3, (byte) i2, b);
        C0358.f6674.f42.f1746.m444();
        if (C0358.f6669.f2063 != null && C0358.f6669.f2063.f6881 != null) {
            if (c0023.f694.equals(C0358.f6669.f2063.f6887)) {
                C0358.f6669.f2063.f6881.m1369(i, s, s2, C0358.f6664.f2004.f8596.m436(i));
                return;
            }
            C0539 c0539 = C0358.f6669.f2063.f6881;
            c0539.f7255 = (HashMap) c0539.f7255.clone();
            c0539.f7255.remove(Integer.valueOf(i));
        }
    }
}
