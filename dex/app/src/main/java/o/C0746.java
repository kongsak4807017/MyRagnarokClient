package o;

import java.nio.ByteBuffer;
import java.util.LinkedList;

/* renamed from: o.柷, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0746 extends ub {
    C0746() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 234;
        short s = byteBuffer.getShort();
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        int i3 = s - 2;
        if (b > 0) {
            C0358.f6674.f42.f1792.m1432("Failed to add item to trade", 16711680);
            return;
        }
        if (i3 == -2) {
            C0358.f6664.f2004.f8636 -= C0358.f6668.f6713;
            C0358.f6674.f42.f1781.m474(C0358.f6664.f2004);
            return;
        }
        iz izVar = C0358.f6674.f42.f1749;
        int i4 = C0358.f6668.f6713;
        LinkedList<lg> linkedListM698 = izVar.m698(false);
        if (linkedListM698 == null) {
            linkedListM698 = new LinkedList<>();
        }
        C1008 c1008M1589 = C0358.f6664.f2004.f8622.get(Integer.valueOf(i3)).m1589();
        c1008M1589.f8500 = i4;
        linkedListM698.add(new lg(c1008M1589, i3));
        izVar.m702(false, linkedListM698);
        C1008 c1008 = C0358.f6664.f2004.f8622.get(Integer.valueOf(i3));
        c1008.f8500 -= C0358.f6668.f6713;
        if (c1008.f8500 <= 0) {
            C0358.f6664.f2004.f8622.remove(Integer.valueOf(i3));
        }
        C0358.f6674.f42.m728(c1008.f8502, c1008.f8500);
        C0358.f6674.f42.f1810.m1465(ng.m881(c1008.f8493));
    }
}
