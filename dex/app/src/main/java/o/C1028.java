package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import org.apache.http.message.TokenParser;

/* renamed from: o.뒫, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1028 extends ub {
    C1028() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 724;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        C0132 c0132 = new C0132(byteBuffer);
        short s4 = byteBuffer.getShort();
        byte b4 = byteBuffer.get();
        byte b5 = byteBuffer.get();
        int i3 = byteBuffer.getInt();
        short s5 = byteBuffer.getShort();
        if (z) {
            return;
        }
        m1607(s, s2, pa.m968(s3), b, b2, b3, c0132, s4, b4, b5, i3, s5, null, (byte) 0, (short) 0);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1607(int i, short s, int i2, byte b, byte b2, byte b3, C0132 c0132, int i3, byte b4, byte b5, int i4, short s2, C0637 c0637, byte b6, short s3) {
        if (b5 > 0) {
            C0358.f6674.f42.f1792.m1432("Failed to get item", SupportMenu.CATEGORY_MASK);
            return;
        }
        C1139 c1139 = C0358.f6685.f1030.f967;
        boolean z = b > 0;
        C0432 c0432M1648 = c1139.m1648(i2);
        String strM1328 = c0432M1648 == null ? null : c0432M1648.m1328(z);
        if (strM1328 != null) {
            strM1328 = strM1328.replace('_', TokenParser.SP);
        }
        C0358.f6674.f42.f1792.m1432("You got " + strM1328 + " (" + ((int) s) + ")", SupportMenu.USER_MASK);
        int i5 = i - 2;
        C1008 c1008 = new C1008(i2, s, b3, EnumC0680.valuesCustom()[b4], b2 != 0, b != 0, b6 != 0, i3, 0, s3, c0132, i4, s2, c0637);
        C1008 c10082 = C0358.f6664.f2004.f8622.get(Integer.valueOf(i5));
        if (c10082 != null) {
            c1008.f8500 += c10082.f8500;
        }
        C0358.f6664.f2004.f8622.put(Integer.valueOf(i5), c1008);
        C0358.f6674.f42.f1810.m1468(c1008.f8493);
        C0358.f6674.f42.m728(c1008.f8502, c1008.f8500);
    }
}
