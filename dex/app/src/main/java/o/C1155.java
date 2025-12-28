package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import o.aq;

/* renamed from: o.ﭰ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1155 extends ub {
    C1155() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 712;
        int i3 = byteBuffer.getInt();
        int i4 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        C0132 c0132 = new C0132(byteBuffer);
        short s = byteBuffer.getShort();
        byte b4 = byteBuffer.get();
        if (z) {
            return;
        }
        C1008 c1008 = new C1008(i4, 1, b3, EnumC0680.valuesCustom()[b4], b2 != 0, b != 0, false, s, 0, 0, c0132, 0, 0, null);
        String str = null;
        if (C0358.f6664.f2004.f8596 != null) {
            aq.C0023[] c0023Arr = C0358.f6664.f2004.f8596.f684;
            int length = c0023Arr.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                aq.C0023 c0023 = c0023Arr[i5];
                if (c0023.f696 != i3) {
                    i5++;
                } else {
                    str = c0023.f695;
                    break;
                }
            }
        }
        C0358.f6674.f42.f1792.m1432(String.valueOf(str) + " has picked up " + c1008.m1592(C0358.f6685.f1030.f967), SupportMenu.USER_MASK);
    }
}
