package o;

import o.C1035;
import o.C1035.C1038;
import o.C1035.Cif;
import o.kv;

/* renamed from: o.ᥓ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0480 extends xi implements vf {
    C0480() {
    }

    @Override // o.vf
    /* renamed from: 鷭 */
    public final void mo1041() {
        AbstractC0988 abstractC0988;
        AbstractC0988 abstractC09882;
        if (C0358.f6664.f2004.f8632 == null) {
            C0358.f6664.f2004.f8632 = C0358.f6664.f2004.new Cif();
        }
        if (C0358.f6664.f2004.f8632.f8661 == null) {
            C0358.f6664.f2004.f8632.f8661 = C0358.f6664.f2004.new C1038();
        }
        C1035.Cif cif = C0358.f6664.f2004.f8632;
        C1035.C1038 c1038 = C0358.f6664.f2004.f8632.f8661;
        lm lmVar = C0358.f6664.f2005.get(this.f5609);
        if (lmVar == null) {
            abstractC0988 = null;
        } else {
            abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        }
        if (abstractC0988 == null) {
            return;
        }
        cif.f8667 = this.f5599;
        cif.f8658 = this.f5591;
        cif.f8656 = this.f5592;
        cif.f8644 = this.f5593;
        cif.f8645 = this.f5594;
        cif.f8646 = this.f5601;
        cif.f8647 = this.f5605;
        cif.f8659 = (short) (200 - (this.f5600 / 10));
        cif.f8662 = this.f5596;
        cif.f8669 = this.f5598;
        cif.f8660 = this.f5610;
        cif.f8664 = this.f5603;
        c1038.f8690 = pa.m978(this.f5595, ow.LOCAL);
        c1038.f8684 = nu.MER;
        c1038.f8683 = this.f5597;
        c1038.f8693 = this.f5604;
        c1038.f8691 = this.f5608;
        c1038.f8688 = this.f5602;
        c1038.f8686 = this.f5606;
        c1038.f8689 = this.f5609;
        c1038.f8687 = this.f5607;
        lm lmVar2 = C0358.f6664.f2005.get(c1038.f8689);
        if (lmVar2 == null) {
            abstractC09882 = null;
        } else {
            abstractC09882 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar2.getClass()) ? lmVar2 : null);
        }
        C0358.f6674.f42.f1820.m1318();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= C0358.f6674.f42.f1794.size()) {
                break;
            }
            if (C0358.f6674.f42.f1794.get(i).f1934 != kv.EnumC0058.MERC) {
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (!z && !C0358.f6664.f2004.f8632.f8661.f8685) {
            je jeVar = C0358.f6674.f42;
            kv.EnumC0058 enumC0058 = kv.EnumC0058.MERC;
            AbstractC0988 abstractC09883 = abstractC09882;
            int i2 = ((C0673) (C0673.class.isAssignableFrom(abstractC09883.getClass()) ? abstractC09883 : null)).f2001;
            AbstractC0988 abstractC09884 = abstractC09882;
            short s = ((C0673) (C0673.class.isAssignableFrom(abstractC09884.getClass()) ? abstractC09884 : null)).f7595;
            AbstractC0988 abstractC09885 = abstractC09882;
            jeVar.m735(enumC0058, i2, -1, s, ((C0673) (C0673.class.isAssignableFrom(abstractC09885.getClass()) ? abstractC09885 : null)).f7590);
        }
        if (C0358.f6664.f2004.f8632.f8661.f8693 <= 0) {
            C0358.f6674.f42.m738(kv.EnumC0058.MERC, -1);
        }
    }
}
