package o;

import android.graphics.Point;
import java.util.ArrayList;
import java.util.Iterator;
import o.hs;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class mj extends mc {

    /* renamed from: Ȋ, reason: contains not printable characters */
    private static /* synthetic */ int[] f2122;

    /* renamed from: ĥ, reason: contains not printable characters */
    lm f2123;

    /* renamed from: ī, reason: contains not printable characters */
    boolean f2128;

    /* renamed from: Ĭ, reason: contains not printable characters */
    a f2129;

    /* renamed from: 廕, reason: contains not printable characters */
    iq f2131;

    /* renamed from: Ħ, reason: contains not printable characters */
    Point f2124 = new Point();

    /* renamed from: ħ, reason: contains not printable characters */
    Point f2125 = new Point();

    /* renamed from: Ĩ, reason: contains not printable characters */
    mv f2126 = mv.STAND;

    /* renamed from: 廑, reason: contains not printable characters */
    mw f2130 = mw.NUM8;

    /* renamed from: Ī, reason: contains not printable characters */
    ArrayList<C0933> f2127 = new ArrayList<>();

    /* renamed from: ą, reason: contains not printable characters */
    private static /* synthetic */ int[] m855() {
        int[] iArr = f2122;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[nu.valuesCustom().length];
        try {
            iArr2[nu.ALL.ordinal()] = 12;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[nu.CHAT.ordinal()] = 10;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[nu.ELEM.ordinal()] = 11;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[nu.HOM.ordinal()] = 5;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[nu.ITEM.ordinal()] = 7;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[nu.MER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[nu.MOB.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[nu.NPC.ordinal()] = 9;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[nu.NUL.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[nu.PC.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[nu.PET.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[nu.SKILL.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        f2122 = iArr2;
        return iArr2;
    }

    /* renamed from: ˮ͍, reason: contains not printable characters */
    final void m859() {
        synchronized (this.f2127) {
            Iterator<C0933> it = this.f2127.iterator();
            while (it.hasNext()) {
                if (it.next().f8223) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: 鷭 */
    public void mo846(pe peVar) {
        synchronized (this.f2127) {
            Iterator<C0933> it = this.f2127.iterator();
            while (it.hasNext()) {
                C0933 next = it.next();
                if (next.f8226 == peVar) {
                    next.f8223 = true;
                }
            }
        }
        m859();
    }

    @Deprecated
    mj() {
    }

    /* renamed from: 鷭 */
    void mo843(lm lmVar) {
        this.f2123 = lmVar;
        if ((lmVar.f1997 == nu.MOB || lmVar.f1997 == nu.NPC) && lmVar.f2001 != EnumC0431.FLAG_CLASS.f6846) {
            this.f7638 = C0358.f6669.f2048.f1538.get(Integer.valueOf(((AbstractC0988) lmVar).f2001));
        } else if (lmVar.f1997 == nu.ITEM) {
            this.f7638 = C0358.f6669.f2048.f1539.get(Integer.valueOf(lmVar.f2001));
        } else if (lmVar.f1997 != nu.SKILL) {
            this.f7638 = null;
        }
        if (this.f7638 == null) {
            switch (m855()[lmVar.f1997.ordinal()]) {
                case 2:
                case 6:
                    this.f7638 = C0358.f6669.f2048.f1548;
                    break;
                case 3:
                case 4:
                case 5:
                case 8:
                default:
                    this.f7638 = C0358.f6669.f2048.f1552;
                    break;
                case 7:
                    this.f7638 = C0358.f6669.f2048.f1553;
                    break;
                case 9:
                    this.f7638 = C0358.f6669.f2048.f1547;
                    break;
            }
            this.f2128 = true;
            m860();
        }
        m1423(0, System.currentTimeMillis());
        mo823();
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    static mj m856(lm lmVar) {
        mj mjVar;
        if (((C1035) (C1035.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null)) != null) {
            mjVar = new mg();
        } else {
            if ((AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null) != null) {
                mjVar = new md();
            } else {
                if (((hq) (hq.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null)) != null) {
                    mjVar = new mh((hq) lmVar);
                } else {
                    mjVar = new mj();
                }
            }
        }
        mjVar.mo843(lmVar);
        return mjVar;
    }

    /* renamed from: 岱, reason: contains not printable characters */
    final void m860() {
        C0564 c0564;
        if ((this.f2123.f1997 == nu.MOB || this.f2123.f1997 == nu.NPC) && this.f2123.f2001 != EnumC0431.FLAG_CLASS.f6846) {
            C0564 c05642 = C0358.f6669.f2048.f1538.get(Integer.valueOf(this.f2123.f2001));
            if (c05642 != null) {
                this.f7638 = c05642;
                m1423(this.f7634, this.f7629);
                this.f2128 = false;
            }
        } else if (this.f2123.f1997 == nu.ITEM && (c0564 = C0358.f6669.f2048.f1539.get(Integer.valueOf(this.f2123.f2001))) != null) {
            this.f7638 = c0564;
            m1423(this.f7634, this.f7629);
            this.f2128 = false;
        }
        C0358.f6685.mo139(new mk(this));
    }

    @Override // o.mc
    /* renamed from: ˮ͈ */
    final void mo825() {
        this.f2077.set(this.f2123.f2002, this.f2123.f1999);
        this.f2074.set(this.f2123.f2000.x, this.f2123.f2000.y);
    }

    @Override // o.mc
    /* renamed from: Ą */
    void mo823() {
        super.mo823();
        if (this.f2129 != null) {
            this.f2129.m174();
        }
        if (this.f2131 != null) {
            this.f2131.mo823();
        }
        synchronized (this.f2127) {
            Iterator<C0933> it = this.f2127.iterator();
            while (it.hasNext()) {
                C0933 next = it.next();
                if (next.f8222) {
                    ly lyVar = C0358.f6669;
                    lq lqVarM810 = ly.m810(this.f2076);
                    lq lqVar = next.f945;
                    lqVar.f2017 = lqVarM810.f2017;
                    lqVar.f2016 = lqVarM810.f2016;
                    next.mo481();
                }
                if (next.f8227 != null) {
                    next.mo481();
                }
            }
        }
    }

    @Override // o.AbstractC0689
    /* renamed from: 鷭 */
    hs.C0049.C0050 mo840(int i) {
        return this.f7638.m632(0, i);
    }

    /* renamed from: Ȋ, reason: contains not printable characters */
    final void m858() {
        if (this.f2129 != null) {
            if (C0358.f6674.f42.f1777 != null) {
                C0358.f6674.f42.f1777.removeView(this.f2129.f108);
            }
            this.f2129 = null;
        }
    }

    /* renamed from: ȃ */
    void mo835(long j) {
        if (!this.f2128) {
            int i = mo462(j);
            int i2 = this.f7631;
            hs hsVar = this.f7638;
            int i3 = this.f7634;
            if (i3 >= hsVar.f1524.length) {
                i3 = 0;
            }
            if (hsVar.f1524[i3] == null) {
                hsVar.mo633(i3);
            }
            hs.C0049 c0049 = hsVar.f1524[i3];
            int length = i % c0049.f1527.length;
            for (int length2 = i2 % c0049.f1527.length; length2 != length; length2 = (length2 + 1) % c0049.f1527.length) {
                for (String str : c0049.f1527[length2].f1529) {
                    C0358.f6663.m1535(str, 1.0f);
                }
            }
            this.f7631 = length;
        }
    }

    /* renamed from: Ć */
    void mo833() {
        m858();
    }

    /* renamed from: ċ, reason: contains not printable characters */
    final boolean m857() {
        switch (m855()[this.f2123.f1997.ordinal()]) {
            case 7:
                return true;
            case 8:
            case 10:
                return false;
            case 9:
            default:
                if (this.f2123.f2001 == EnumC0431.WARP_CLASS.f6846 || this.f2123.f2001 == EnumC0431.HIDDEN_WARP_CLASS.f6846 || this.f2123.f2001 == EnumC0431.WARP_DEBUG_CLASS.f6846 || this.f2123.f2001 == EnumC0431.INVISIBLE_CLASS.f6846) {
                    return false;
                }
                lm lmVar = this.f2123;
                AbstractC0988 abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
                if (abstractC0988 != null && (abstractC0988.f8357 & 16454) > 0) {
                    return false;
                }
                return true;
        }
    }
}
