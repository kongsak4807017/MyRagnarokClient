package o;

/* renamed from: o.켷, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1131 extends yf implements vf {
    C1131() {
    }

    @Override // o.vf
    /* renamed from: 鷭 */
    public final void mo1041() {
        m1638(this.f5948, this.f5946 == 0);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1638(short s, boolean z) {
        C1008 c1008;
        int i = s - 2;
        if (!z) {
            C0358.f6674.f42.f1792.m1432("Failed to unequip item", 16711680);
            return;
        }
        if (C0358.f6664.f2004 == null || (c1008 = C0358.f6664.f2004.f8622.get(Integer.valueOf(i))) == null) {
            return;
        }
        aux[] auxVarArrM442 = aux.m442(c1008.f8490);
        c1008.f8490 = 0;
        C0778 c0778 = C0358.f6674.f42.f1810;
        EnumC0680 enumC0680 = c1008.f8493;
        if (c0778.f1994.getParent() != null) {
            c0778.m1465(ng.m881(enumC0680));
        }
        if (auxVarArrM442 == null) {
            return;
        }
        for (aux auxVar : auxVarArrM442) {
            C0358.f6674.f42.f1785.m1442(auxVar, null, 0);
        }
        C0358.f6674.f42.m720(c1008.f8502);
        C0698 c0698 = C0358.f6674.f42.f1792;
        StringBuilder sbAppend = new StringBuilder(String.valueOf(c1008.m1588())).append(" ");
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(172);
        c0698.m1432(sbAppend.append(strM649 == null ? "MSG172" : strM649).toString(), 16711680);
    }
}
