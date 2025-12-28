package o;

import java.nio.ByteBuffer;

/* renamed from: o.Љ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0391 extends ub {
    C0391() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 456;
        short s = byteBuffer.getShort();
        if (C0358.f6667.f4830) {
            byteBuffer.getInt();
        } else {
            pa.m968(byteBuffer.getShort());
        }
        int i3 = byteBuffer.getInt();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        m1316(this, s, i3, s2, b);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1316(ub ubVar, int i, int i2, short s, byte b) {
        if (b == 0) {
            C0358.f6674.f42.f1792.m1432("Failed to use item.", 16711680);
            return;
        }
        if (i2 == C0358.f6664.f2004.f1998 || i2 == 0) {
            int i3 = i - 2;
            C1008 c1008 = C0358.f6664.f2004.f8622.get(Integer.valueOf(i3));
            if (c1008 != null) {
                c1008.f8500 = s;
                if (c1008.f8500 == 0) {
                    C0358.f6664.f2004.f8622.remove(Integer.valueOf(i3));
                }
                C0358.f6674.f42.m728(c1008.f8502, c1008.f8500);
                C0778 c0778 = C0358.f6674.f42.f1810;
                EnumC0680 enumC0680 = c1008.f8493;
                if (c0778.f1994.getParent() != null) {
                    c0778.m1465(ng.m881(enumC0680));
                    return;
                }
                return;
            }
            C0358.f6674.f42.f1810.m1463();
            return;
        }
        throw new uz(ubVar);
    }
}
