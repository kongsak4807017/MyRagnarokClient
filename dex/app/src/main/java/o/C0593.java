package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.䔚, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0593 extends ub {
    C0593() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 377;
        short s = byteBuffer.getShort();
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        if (b > 0) {
            C0358.f6674.f42.f1792.m1432("Failed to identify item", 16711680);
            return;
        }
        C1008 c1008 = C0358.f6664.f2004.f8622.get(Integer.valueOf(s - 2));
        if (c1008 == null) {
            return;
        }
        c1008.f8491 = true;
        C0778 c0778 = C0358.f6674.f42.f1810;
        EnumC0680 enumC0680 = c1008.f8493;
        if (c0778.f1994.getParent() != null) {
            c0778.m1465(ng.m881(enumC0680));
        }
        C0358.f6674.f42.f1792.m1432("Item has been identified", SupportMenu.USER_MASK);
    }
}
