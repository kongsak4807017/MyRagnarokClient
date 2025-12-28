package o;

import java.nio.ByteBuffer;

/* renamed from: o.头, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0663 extends ub {
    C0663() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 453;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byte b4 = byteBuffer.get();
        C0132 c0132 = new C0132(byteBuffer);
        if (z) {
            return;
        }
        m1410(s, i3, pa.m968(s2), b, b2, b3, b4, c0132, null);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1410(short s, int i, int i2, byte b, byte b2, byte b3, byte b4, C0132 c0132, C0637 c0637) {
        short s2 = (short) (s - 2);
        C1008 c1008 = new C1008(i2, i, b4, EnumC0680.valuesCustom()[b], b3 != 0, b2 != 0, false, 0, 0, 0, c0132, 0, 0, c0637);
        C1008 c1008Put = C0358.f6664.f2004.f8592.put(Integer.valueOf(s2), c1008);
        if (c1008Put != null) {
            c1008.f8500 += c1008Put.f8500;
        }
        C0358.f6674.f42.f1810.m1465(ng.CART);
    }
}
