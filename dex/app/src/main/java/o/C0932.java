package o;

import android.support.v4.internal.view.SupportMenu;

/* renamed from: o.鬍, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0932 extends xb implements vf {
    C0932() {
    }

    @Override // o.vf
    /* renamed from: 鷭 */
    public final void mo1041() {
        m1539(this.f5539, this.f5538, this.f5537 == 0);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1539(short s, int i, boolean z) {
        if (!z) {
            C0358.f6674.f42.f1792.m1432("Failed to equip item", 16711680);
            return;
        }
        int i2 = s - 2;
        C1008 c1008 = C0358.f6664.f2004.f8622.get(Integer.valueOf(i2));
        c1008.f8490 = i;
        C0778 c0778 = C0358.f6674.f42.f1810;
        EnumC0680 enumC0680 = c1008.f8493;
        if (c0778.f1994.getParent() != null) {
            c0778.m1465(ng.m881(enumC0680));
        }
        C0358.f6669.f2048.f1551.m860();
        aux[] auxVarArrM442 = aux.m442(c1008.f8490);
        if (auxVarArrM442 == null) {
            return;
        }
        for (aux auxVar : auxVarArrM442) {
            C0358.f6674.f42.f1785.m1442(auxVar, c1008, i2);
        }
        C0358.f6674.f42.m720(c1008.f8502);
        C0698 c0698 = C0358.f6674.f42.f1792;
        StringBuilder sbAppend = new StringBuilder(String.valueOf(c1008.m1588())).append(" ");
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(171);
        c0698.m1432(sbAppend.append(strM649 == null ? "MSG171" : strM649).toString(), SupportMenu.USER_MASK);
    }
}
