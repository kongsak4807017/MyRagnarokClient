package o;

/* renamed from: o.䣖, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
abstract class AbstractC0608 {
    AbstractC0608() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1381(C0726[] c0726Arr) {
        if (C0358.f6664.f2004 == null) {
            return;
        }
        for (C0726 c0726 : c0726Arr) {
            C1008 c1008 = new C1008(c0726);
            C0358.f6664.f2004.f8622.put(Integer.valueOf(r7.f7696 - 2), c1008);
            C0358.f6674.f42.m720(c1008.f8502);
        }
        if (C0358.f6664.f2004.f8640 != -1) {
            C1008 c10082 = C0358.f6664.f2004.f8622.get(Integer.valueOf(C0358.f6664.f2004.f8640));
            if (c10082 != null) {
                c10082.f8490 = 32768;
                C0778 c0778 = C0358.f6674.f42.f1810;
                EnumC0680 enumC0680 = c10082.f8493;
                if (c0778.f1994.getParent() != null) {
                    c0778.m1465(ng.m881(enumC0680));
                }
            }
            C0358.f6664.f2004.f8640 = -1;
            C0358.f6674.f42.f1785.m1441();
        }
        C0358.f6674.f42.f1810.m1463();
    }
}
