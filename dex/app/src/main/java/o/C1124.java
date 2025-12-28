package o;

import java.nio.ByteBuffer;

/* renamed from: o.췷, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1124 extends ub {
    C1124() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2063;
        short s = byteBuffer.getShort();
        byte b = byteBuffer.get();
        int i3 = byteBuffer.getInt();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byte b4 = byteBuffer.get();
        C0132 c0132 = new C0132(byteBuffer);
        if (z) {
            return;
        }
        m1637(pa.m968(s), b, i3, b2, b3, b4, c0132, null);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1637(int i, byte b, int i2, byte b2, byte b3, byte b4, C0132 c0132, C0637 c0637) {
        EnumC0680 enumC0680;
        if (i == 0) {
            C0358.f6674.f42.f1749.m699(i2);
            return;
        }
        if (b == -1) {
            C0432 c0432M1648 = C0358.f6685.f1030.f967.m1648(i);
            enumC0680 = c0432M1648 == null ? null : c0432M1648.f6853;
        } else {
            enumC0680 = EnumC0680.valuesCustom()[b];
        }
        C0358.f6674.f42.f1749.m701(new C1008(i, i2, b4, enumC0680, b3 != 0, b2 != 0, false, 0, 0, 0, c0132, 0, 0, c0637));
    }
}
