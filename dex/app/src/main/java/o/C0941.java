package o;

import o.C1035;
import o.C1035.Cif;

/* renamed from: o.魉, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0941 extends xc implements vf {
    C0941() {
    }

    @Override // o.vf
    /* renamed from: 鷭 */
    public final void mo1041() {
        AbstractC0988 abstractC0988;
        if (C0358.f6664.f2004.f8618 == null) {
            C0358.f6664.f2004.f8618 = C0358.f6664.f2004.new Cif();
        }
        C1035.C1038 c1038 = C0358.f6664.f2004.f8618.f8661;
        c1038.f8689 = this.f5540;
        lm lmVar = C0358.f6664.f2005.get(c1038.f8689);
        if (lmVar == null) {
            abstractC0988 = null;
        } else {
            abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        }
        AbstractC0988 abstractC09882 = abstractC0988;
        if (abstractC0988 != null) {
            C0358.f6664.f2004.f8618.f8653 = na.m874(abstractC09882.f2001);
            if (C0358.f6664.f2004.f8618.f8653 == null) {
                C0358.f6664.f2004.f8618.f8653 = na.LIF;
            }
        }
        switch (this.f5542) {
            case 1:
                c1038.f8683 = (short) this.f5541;
                break;
            case 2:
                c1038.f8681 = (short) this.f5541;
                break;
        }
        C0358.f6674.f42.f1741.m1409();
    }
}
