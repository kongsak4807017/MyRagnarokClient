package o;

import android.graphics.Point;
import android.support.v4.view.ViewCompat;
import com.roworkshop.andro.c_point;
import o.hu;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class mg extends md {

    /* renamed from: ģ, reason: contains not printable characters */
    C1035 f2110;

    /* renamed from: Ĥ, reason: contains not printable characters */
    C0063 f2111;

    /* renamed from: o.mg$鷭, reason: contains not printable characters */
    class C0063 extends ci {

        /* renamed from: ˮ͍, reason: contains not printable characters */
        long f2113;

        /* renamed from: 岱, reason: contains not printable characters */
        long f2114;

        C0063(int i) {
            super(mg.this, 0, 100, md.f2088, md.f2093, ViewCompat.MEASURED_STATE_MASK, -16711936, ViewCompat.MEASURED_STATE_MASK);
            this.f2113 = System.currentTimeMillis();
            this.f2114 = System.currentTimeMillis() + (i * 1000);
        }
    }

    @Deprecated
    mg() {
    }

    @Override // o.md, o.mj
    /* renamed from: 鷭 */
    final void mo843(lm lmVar) {
        super.mo843(lmVar);
        this.f2110 = (C1035) lmVar;
        m848(false);
        this.f2095 = new ci(this, this.f2110.f8364, this.f2110.f8356, md.f2090, new c_point(md.f2089.x, (md.f2089.y - md.f2090.y) + ((int) ci.f911)), f2081, f2082, f2091);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m850(c_point c_pointVar) {
        byte bM1559 = AbstractC0988.m1559(new Point(c_pointVar.x - this.f2110.f2002, c_pointVar.y - this.f2110.f1999));
        if (bM1559 == -1) {
            return;
        }
        if (this.f2110.f8350 < 0) {
            C1035 c1035 = this.f2110;
            c1035.f8350 = (byte) (c1035.f8350 + 8);
        }
        hu.EnumC0051 enumC0051 = hu.EnumC0051.valuesCustom()[bM1559];
        hu.EnumC0051 enumC00512 = hu.EnumC0051.valuesCustom()[this.f2110.f8350];
        hu.EnumC0051 enumC00513 = enumC0051;
        hu.EnumC0051 enumC00514 = enumC00512;
        short s = this.f2110.f816;
        int i = 0;
        while (enumC00514 != enumC0051 && enumC00512 != enumC0051) {
            enumC00514 = enumC00514 == hu.EnumC0051.NUM9 ? hu.EnumC0051.NUM8 : hu.EnumC0051.valuesCustom()[enumC00514.ordinal() + 1];
            enumC00512 = enumC00512 == hu.EnumC0051.NUM8 ? hu.EnumC0051.NUM9 : hu.EnumC0051.valuesCustom()[enumC00512.ordinal() - 1];
            i++;
        }
        if (enumC00514 == enumC0051 && enumC00512 == enumC0051) {
            s = 0;
        } else if (enumC00514 == enumC0051) {
            if (s == 2 && i == 1) {
                s = 0;
            } else {
                s = 2;
                enumC00513 = enumC0051 == hu.EnumC0051.NUM8 ? hu.EnumC0051.NUM9 : hu.EnumC0051.valuesCustom()[enumC0051.ordinal() - 1];
            }
        } else if (enumC00512 == enumC0051) {
            if (s == 1) {
                s = 0;
            } else {
                s = 1;
                enumC00513 = enumC0051 == hu.EnumC0051.NUM9 ? hu.EnumC0051.NUM8 : hu.EnumC0051.valuesCustom()[enumC0051.ordinal() + 1];
            }
        }
        if (this.f2110.f8350 != enumC00513.ordinal() || this.f2110.f816 != s) {
            this.f2110.f8350 = (byte) enumC00513.ordinal();
            this.f2110.f816 = s;
            C0358.f6671.mo454(new C0151(s, bM1559));
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final boolean m852(int i, int i2, int i3, int i4, int i5, int i6) {
        if (oa.m911(this.f2110.f2002 - i2, this.f2110.f1999 - i3, (this.f2101.f8353 != null ? 1 : 0) + i4)) {
            return false;
        }
        C0358.f6671.mo454(new C0427((short) i2, (short) i3));
        this.f2110.m1561(i, i2, i3, i4, i5, i6);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* renamed from: 鷭, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void m851(o.mj r14, o.AbstractC0988.C0992 r15) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mg.m851(o.mj, o.귊$ˮ͈):void");
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static final boolean m849(gt gtVar, mj mjVar) {
        md mdVar = null;
        if (mjVar != null) {
            mdVar = (md) (md.class.isAssignableFrom(mjVar.getClass()) ? mjVar : null);
        }
        if (mdVar == null) {
            return false;
        }
        if (mdVar.f2101.m1567()) {
            if ((gtVar.f1408 & 1) != 0) {
                return true;
            }
            if (((gtVar.f1408 & 16) != 0) && oc.f3243) {
                return true;
            }
            return false;
        }
        if ((gtVar.f1408 & 16) != 0) {
            return true;
        }
        if (((gtVar.f1408 & 1) != 0) && oc.f3246) {
            return true;
        }
        return false;
    }

    @Override // o.md, o.mj
    /* renamed from: ȃ */
    final void mo835(long j) {
        if (this.f2111 != null) {
            if (j > this.f2111.f2114) {
                this.f2111 = null;
                C0358.f6671.mo454(new C0739());
            } else {
                this.f2111.m482((int) (j - this.f2111.f2113), (int) (this.f2111.f2114 - this.f2111.f2113));
            }
        }
        super.mo835(j);
    }

    @Override // o.md, o.mj, o.mc
    /* renamed from: Ą */
    final void mo823() {
        super.mo823();
        if (this.f2111 != null) {
            this.f2111.mo481();
        }
    }
}
