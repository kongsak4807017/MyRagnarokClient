package o;

import java.util.Iterator;
import o.C0972;

/* renamed from: o.쫗, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1111 extends xx implements vf {
    C1111() {
    }

    @Override // o.vf
    /* renamed from: 鷭 */
    public final void mo1041() {
        m1636((short) 3, this.f5821, pa.m978(this.f5820, ow.LOCAL));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1636(short s, int i, String str) {
        if (s == 2 || str.length() <= 0) {
            str = "???";
        }
        C0358.f6679.f6830.put(Integer.valueOf(i), str);
        if (C0358.f6664.f2004.f8635 != null) {
            if (C0358.f6664.f2004.f8635.f8301 == i) {
                C0358.f6664.f2004.f8635.f8306 = str;
            }
            Iterator<C0972.C0974> it = C0358.f6664.f2004.f8635.f8300.iterator();
            while (it.hasNext()) {
                C0972.C0974 next = it.next();
                if (next.f8325 == i) {
                    next.f8320 = str;
                }
            }
        }
        C0358.f6674.f42.f1810.m1463();
        C0358.f6674.f42.f1786.m677(null);
        C0358.f6674.f42.f1785.m1441();
        C0358.f6674.f42.f1742.m598();
        C0358.f6674.f42.f1748.m1438();
        C0358.f6674.f42.f1775.m1408(false);
    }
}
