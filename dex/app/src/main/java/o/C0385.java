package o;

import java.nio.ByteBuffer;

/* renamed from: o.Ϝ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0385 extends ub {
    C0385() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 452;
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
        m1315(s, i3, pa.m968(s2), b, b2, b3, b4, c0132, null);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1315(short s, int i, int i2, byte b, byte b2, byte b3, byte b4, C0132 c0132, C0637 c0637) {
        if (!(C0358.f6674.f42.f1786.f1994.getParent() != null)) {
            return;
        }
        short s2 = (short) (s - 1);
        C1008 c1008 = new C1008(i2, i, b4, EnumC0680.valuesCustom()[b], b3 != 0, b2 != 0, false, 0, 0, 0, c0132, 0, 0, c0637);
        C1008 c10082 = C0358.f6664.f2004.f8595.get(Integer.valueOf(s2));
        if (c10082 != null) {
            c1008.f8500 += c10082.f8500;
        }
        C0358.f6664.f2004.f8595.put(Integer.valueOf(s2), c1008);
        C0358.f6674.f42.f1786.m677(ng.m881(EnumC0680.valuesCustom()[b]));
    }
}
