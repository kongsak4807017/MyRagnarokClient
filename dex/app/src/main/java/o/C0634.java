package o;

import java.nio.ByteBuffer;

/* renamed from: o.儔, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0634 extends ub {
    C0634() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 381;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        if (b != 0) {
            C0358.f6674.f42.f1792.m1432("Failed to insert card", 16711680);
            return;
        }
        int i3 = s2 - 2;
        C1008 c1008 = C0358.f6664.f2004.f8622.get(Integer.valueOf(i3));
        C1008 c10082 = C0358.f6664.f2004.f8622.get(Integer.valueOf(s - 2));
        if (c1008 == null || c10082 == null) {
            nz.m907("Failed to find item/card for insert");
            return;
        }
        c1008.f8500--;
        if (c1008.f8500 <= 0) {
            C0358.f6664.f2004.f8622.remove(Integer.valueOf(i3));
        }
        int i4 = 0;
        while (true) {
            if (i4 >= c10082.f8499.length) {
                break;
            }
            if (c10082.f8499[i4] == 0) {
                c10082.f8499[i4] = c1008.f8502;
                break;
            } else if (i4 != c10082.f8499.length - 1) {
                i4++;
            } else {
                nz.m907("Couldn't find card slot for insert");
                return;
            }
        }
        C0358.f6674.f42.f1810.m1465(ng.USABLE);
        C0358.f6674.f42.f1810.m1465(ng.EQUIP);
    }
}
