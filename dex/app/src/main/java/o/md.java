package o;

import android.widget.RelativeLayout;
import com.roworkshop.andro.c_activity;
import com.roworkshop.andro.c_point;
import o.AbstractC0689;
import o.AbstractC0988;
import o.C1035;
import o.el;
import o.hs;
import o.ud;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class md extends mj {

    /* renamed from: į, reason: contains not printable characters */
    private static /* synthetic */ int[] f2086;

    /* renamed from: 瞣, reason: contains not printable characters */
    private static /* synthetic */ int[] f2094;

    /* renamed from: ċ, reason: contains not printable characters */
    ci f2095;

    /* renamed from: ē, reason: contains not printable characters */
    ci f2096;

    /* renamed from: Ė, reason: contains not printable characters */
    ae f2097;

    /* renamed from: ė, reason: contains not printable characters */
    mn f2098;

    /* renamed from: ģ, reason: contains not printable characters */
    private aj f2099;

    /* renamed from: Ȋ, reason: contains not printable characters */
    ci f2100;

    /* renamed from: ܨ, reason: contains not printable characters */
    AbstractC0988 f2101;

    /* renamed from: 㥳, reason: contains not printable characters */
    C0768 f2102;

    /* renamed from: 纫, reason: contains not printable characters */
    ci f2103;

    /* renamed from: 띥, reason: contains not printable characters */
    C0449 f2104;

    /* renamed from: Ę, reason: contains not printable characters */
    protected static final int f2081 = oz.m952(16, 24, 156, 255);

    /* renamed from: Ĥ, reason: contains not printable characters */
    private static final int f2084 = oz.m952(16, TelnetCommand.EOR, 33, 255);

    /* renamed from: ę, reason: contains not printable characters */
    protected static final int f2082 = oz.m952(24, 99, NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS, 255);

    /* renamed from: 廂, reason: contains not printable characters */
    protected static final int f2092 = oz.m952(255, 255, 255, 255);

    /* renamed from: 囃, reason: contains not printable characters */
    protected static final int f2091 = oz.m952(66, 66, 66, 255);

    /* renamed from: ঽ্, reason: contains not printable characters */
    static final c_point f2088 = new c_point((int) ((C0358.f6674.getResources().getDisplayMetrics().densityDpi / 160.0f) * 40.0f), (int) ((C0358.f6674.getResources().getDisplayMetrics().densityDpi / 160.0f) * 5.0f));

    /* renamed from: 廅, reason: contains not printable characters */
    static final c_point f2093 = new c_point(0, (int) ((C0358.f6674.getResources().getDisplayMetrics().densityDpi / 160.0f) * 45.0f));

    /* renamed from: 㵼, reason: contains not printable characters */
    static final c_point f2090 = new c_point((int) ((C0358.f6674.getResources().getDisplayMetrics().densityDpi / 160.0f) * 40.0f), (int) ((C0358.f6674.getResources().getDisplayMetrics().densityDpi / 160.0f) * 4.0f));

    /* renamed from: 㱽, reason: contains not printable characters */
    static final c_point f2089 = new c_point(0, -20);

    /* renamed from: Ƞ, reason: contains not printable characters */
    static final c_point f2087 = new c_point(f2089.x, (f2089.y - f2090.y) + ((int) ci.f911));

    /* renamed from: ġ, reason: contains not printable characters */
    static final c_point f2083 = new c_point(f2087.x, (f2087.y - f2090.y) + ((int) ci.f911));

    /* renamed from: Į, reason: contains not printable characters */
    private static C0532[] f2085 = {new C0532(null, EnumC1048.WIZARD, EnumC0765.MALE, new EnumC0615[]{EnumC0615.ROD, EnumC0615.NONE}, null), new C0532(null, EnumC1048.WIZARD, EnumC0765.FEMALE, null, new EnumC0615[]{EnumC0615.ROD}), new C0532(null, EnumC1048.SAGE, new EnumC0615[]{EnumC0615.NONE, EnumC0615.SHORTSWORD}, null), new C0532(null, EnumC1048.HUNTER, null, new EnumC0615[]{EnumC0615.BOW}), new C0532(null, EnumC1048.BARDDANCER, null, new EnumC0615[]{EnumC0615.BOW}), new C0532(null, EnumC1048.PRIEST, null, new EnumC0615[]{EnumC0615.BOOK}), new C0532(null, EnumC1048.MONK, null, new EnumC0615[]{EnumC0615.KNUKLE, EnumC0615.NONE}), new C0532(null, EnumC1048.BLACKSMITH, null, new EnumC0615[]{EnumC0615.MACE, EnumC0615.SWORD, EnumC0615.AXE}), new C0532(null, EnumC1048.ALCHEMIST, null, new EnumC0615[]{EnumC0615.MACE, EnumC0615.SWORD, EnumC0615.AXE}), new C0532(null, EnumC1048.ASSASSIN, null, new EnumC0615[]{EnumC0615.CATARRH, EnumC0615.SHORTSWORD_SHORTSWORD, EnumC0615.SHORTSWORD_AXE, EnumC0615.SHORTSWORD_SWORD, EnumC0615.SWORD_AXE, EnumC0615.SWORD_SWORD, EnumC0615.AXE_AXE}), new C0532(null, EnumC1048.SOUL_LINKER, EnumC0765.MALE, null, new EnumC0615[]{EnumC0615.SHORTSWORD}), new C0532(null, EnumC1048.SOUL_LINKER, EnumC0765.FEMALE, null, new EnumC0615[]{EnumC0615.ROD}), new C0532(EnumC1048.NOVICE, null, EnumC0765.MALE, new EnumC0615[]{EnumC0615.NONE, EnumC0615.SHORTSWORD}, null), new C0532(EnumC1048.NOVICE, null, EnumC0765.FEMALE, null, new EnumC0615[]{EnumC0615.SHORTSWORD}), new C0532(EnumC1048.SWORDMAN, null, null, new EnumC0615[]{EnumC0615.SPEAR, EnumC0615.TWOHANDSPEAR}), new C0532(EnumC1048.THIEF, null, new EnumC0615[]{EnumC0615.BOW}), new C0532(EnumC1048.MAGE, new EnumC0615[]{EnumC0615.ROD, EnumC0615.BOOK, EnumC0615.NONE}, null), new C0532(EnumC1048.ARCHER, null, new EnumC0615[]{EnumC0615.SHORTSWORD, EnumC0615.NONE}), new C0532(EnumC1048.MERCHANT, null, new EnumC0615[]{EnumC0615.SHORTSWORD}), new C0532(EnumC1048.NINJA, null, new EnumC0615[]{EnumC0615.WPCLASS_SYURIKEN}), new C0532(EnumC1048.GUNSLINGER, new EnumC0615[]{EnumC0615.NONE, EnumC0615.WPCLASS_GUN_HANDGUN}, null)};

    @Override // o.mj
    /* renamed from: 鷭, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void mo846(pe peVar) {
        super.mo846(peVar);
    }

    /* renamed from: 䒧, reason: contains not printable characters */
    private static /* synthetic */ int[] m829() {
        int[] iArr = f2086;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[mv.valuesCustom().length];
        try {
            iArr2[mv.ATK1.ordinal()] = 11;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[mv.ATK2.ordinal()] = 12;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[mv.BATTLESTANCE.ordinal()] = 5;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[mv.CAST.ordinal()] = 13;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[mv.COOLSTANCE.ordinal()] = 10;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[mv.DEAD.ordinal()] = 9;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[mv.PERFORMANCE1.ordinal()] = 14;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[mv.PERFORMANCE2.ordinal()] = 15;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[mv.PERFORMANCE3.ordinal()] = 16;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[mv.PERFORMANCE4.ordinal()] = 17;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[mv.PICK.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[mv.SHOOT.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[mv.SIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[mv.STAND.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[mv.STATICDAMAGE.ordinal()] = 8;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[mv.TAKEDAMAGE.ordinal()] = 7;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[mv.WALK.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        f2086 = iArr2;
        return iArr2;
    }

    /* renamed from: 躆, reason: contains not printable characters */
    private static /* synthetic */ int[] m831() {
        int[] iArr = f2094;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[AbstractC0988.EnumC0993.valuesCustom().length];
        try {
            iArr2[AbstractC0988.EnumC0993.FINISHED_WALKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[AbstractC0988.EnumC0993.POSITION_CHANGED.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[AbstractC0988.EnumC0993.POSITION_UNCHANGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f2094 = iArr2;
        return iArr2;
    }

    @Deprecated
    md() {
    }

    @Override // o.mj
    /* renamed from: 鷭, reason: contains not printable characters */
    void mo843(lm lmVar) {
        super.mo843(lmVar);
        m834();
        this.f2101 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        if (this.f2101.f8358 > 0) {
            if (C0358.f6664.f2004 != null && C0358.f6664.f2004.f8596 != null && C0358.f6664.f2004.f8596.m436(this.f2101.f1998) >= 0) {
                m848(false);
            } else {
                m848(true);
            }
        }
        AbstractC0988 abstractC0988 = this.f2101;
        if (abstractC0988.f8351.containsKey(nt.ON_PUSH_CART) || (abstractC0988.f8357 & 1928) > 0) {
            m837(this.f2101.f8352, true);
        }
        m832();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final mv m841(cq cqVar) {
        cv cvVar = C0358.f6685;
        if (lo.m781(this.f2123.f2001) != nu.PC) {
            return mv.ATK1;
        }
        lm lmVar = this.f2123;
        bh bhVar = (bh) (bh.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        EnumC1048 enumC1048M1617 = EnumC1048.m1617(EnumC0134.m1250(this.f2123.f2001).m1256().f8819 & 4095);
        EnumC1048 enumC1048M16172 = EnumC1048.m1617(EnumC0134.m1250(this.f2123.f2001).m1256().f8819 & 255);
        EnumC0615 enumC0615M514 = cqVar.m514(bhVar.f818, bhVar.f814);
        if (enumC0615M514 == null) {
            return mv.ATK1;
        }
        if (bhVar.f2001 == EnumC0134.TAEKWON.f6499 || bhVar.f2001 == EnumC0134.STAR_GLADIATOR.f6499) {
            return Math.random() > 0.5d ? mv.ATK1 : mv.ATK2;
        }
        for (C0532 c0532 : f2085) {
            if ((c0532.f7245 == null || enumC1048M1617 == c0532.f7245) && ((c0532.f7246 == null || enumC1048M16172 == c0532.f7246) && (c0532.f7244 == null || c0532.f7244.ordinal() == bhVar.f803))) {
                boolean z = c0532.f7243 != null;
                for (EnumC0615 enumC0615 : z ? c0532.f7243 : c0532.f7242) {
                    if (enumC0615 == enumC0615M514) {
                        return z ? mv.ATK1 : mv.ATK2;
                    }
                }
                return z ? mv.ATK2 : mv.ATK1;
            }
        }
        return mv.ATK1;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final int m839(int i, boolean z) {
        ud.C0086 c0086 = m1420();
        float f = (c0086 == null || c0086.f5027 == 0.0f) ? 96.0f : c0086.f5027 * 24.0f;
        cv cvVar = C0358.f6685;
        nu nuVarM781 = lo.m781(this.f2123.f2001);
        char c = 0;
        float f2 = 6.0f;
        if (nuVarM781 == nu.PC) {
            lm lmVar = this.f2123;
            bh bhVar = (bh) (bh.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
            EnumC0615 enumC0615M514 = C0358.f6685.f1030.m514(bhVar.f818, bhVar.f814);
            if (enumC0615M514 == EnumC0615.BOW) {
                c = 2;
            } else if (enumC0615M514 == EnumC0615.INSTRUMENT || enumC0615M514 == EnumC0615.WHIP) {
                c = 1;
            }
        } else if (nuVarM781 == nu.MOB) {
            f2 = c0086.f5029 > 0 ? c0086.f5029 : 6;
        }
        if (i <= 0) {
            i = 1;
        }
        if (c < 2 && i > 432) {
            i = 432;
        }
        float f3 = f2 * i * 0.0023148148f * f;
        this.f7630 = (int) f3;
        if (!z && c > 0) {
            f3 += 192.0f;
        }
        return (int) f3;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m848(boolean z) {
        lm lmVar = this.f2123;
        AbstractC0988 abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        if (abstractC0988 == null) {
            return;
        }
        if (abstractC0988.f8358 <= 0) {
            this.f2100 = null;
            return;
        }
        if (z && !oc.f3232) {
            return;
        }
        if (this.f2100 != null && ((!z || this.f2100.f913 == -65400) && (z || this.f2100.f913 != -65400))) {
            this.f2100.m482(abstractC0988.f8346, abstractC0988.f8358);
        } else {
            this.f2100 = new ci(this, abstractC0988.f8346, abstractC0988.f8358, f2090, f2089, f2081, z ? -65400 : f2084, f2091);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m847(C1035.C1038 c1038) {
        if (c1038.f8684 == null) {
            this.f2096 = null;
            this.f2100 = null;
            this.f2095 = null;
        } else if (this.f2096 == null) {
            this.f2096 = new ci(this, c1038.f8681, c1038.f8682, f2090, f2083, f2081, f2092, f2091);
        } else {
            this.f2096.m482(c1038.f8681, c1038.f8682);
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final void m838(C1035.C1038 c1038) {
        if (c1038.f8684 == nu.HOM || c1038.f8684 == nu.MER) {
            if (this.f2100 == null) {
                this.f2100 = new ci(this, c1038.f8693, c1038.f8691, f2090, f2089, f2081, f2084, f2091);
            } else {
                this.f2100.m482(c1038.f8693, c1038.f8691);
            }
        }
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final void m836(C1035.C1038 c1038) {
        if (c1038.f8684 == nu.HOM || c1038.f8684 == nu.MER) {
            if (this.f2095 == null) {
                this.f2095 = new ci(this, c1038.f8688, c1038.f8686, f2090, f2087, f2081, f2082, f2091);
            } else {
                this.f2095.m482(c1038.f8688, c1038.f8686);
            }
        }
    }

    @Override // o.mj, o.mc
    /* renamed from: Ą */
    void mo823() {
        super.mo823();
        if (this.f2100 != null) {
            this.f2100.mo481();
        }
        if (this.f2095 != null) {
            this.f2095.mo481();
        }
        if (this.f2103 != null) {
            this.f2103.mo481();
        }
        if (this.f2096 != null) {
            this.f2096.mo481();
        }
        if (this.f2099 != null) {
            this.f2099.m430();
        }
        if (this.f2097 != null) {
            this.f2097.m386();
        }
        if (this.f2104 != null) {
            this.f2104.mo823();
        }
        if (this.f2102 != null) {
            this.f2102.mo823();
        }
        if (this.f2098 != null) {
            this.f2098.mo823();
        }
        if (this.f2131 != null) {
            this.f2131.mo823();
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m842(String str, int i) {
        if (this.f2099 == null) {
            this.f2099 = new aj(this, str, i, 5000L);
        } else {
            this.f2099.m431(str, i);
        }
    }

    /* renamed from: 纫, reason: contains not printable characters */
    private void m830() {
        if (this.f2099 != null) {
            aj ajVar = this.f2099;
            if (ajVar.f665 != null) {
                c_activity c_activityVar = C0358.f6674;
                RelativeLayout relativeLayout = ajVar.f665;
                if (relativeLayout != null && C0358.f6674.f42 != null && C0358.f6674.f42.f1777 != null) {
                    C0358.f6674.f42.f1777.removeView(relativeLayout);
                }
                ajVar.f665 = null;
            }
            this.f2099 = null;
        }
    }

    /* renamed from: ą, reason: contains not printable characters */
    final void m832() {
        if (this.f2101.f8345 < 0) {
            if (this.f2102 != null) {
                return;
            }
            this.f2102 = new C0768(this);
            return;
        }
        this.f2102 = null;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final void m837(int i, boolean z) {
        if (this.f2098 == null || this.f2098.f2141 != i || z) {
            this.f2098 = new mn(this, i);
        }
        this.f2101.f8352 = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05ea  */
    @Override // o.mj
    /* renamed from: ȃ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void mo835(long r27) {
        /*
            Method dump skipped, instructions count: 1530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.md.mo835(long):void");
    }

    @Override // o.mj
    /* renamed from: Ć, reason: contains not printable characters */
    final void mo833() {
        super.mo833();
        m830();
        if (this.f2097 != null) {
            C0358.f6674.f42.f1777.removeView(this.f2097.f550);
            this.f2097 = null;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m845(nt ntVar, long j, int[] iArr, int i) {
        el.C0035 c0035M581 = C0358.f6665.m581(this, ntVar, j, iArr);
        this.f2101.f8351.put(ntVar, c0035M581);
        if (this.f2101 == C0358.f6664.f2004) {
            C0358.f6674.f42.m726(c0035M581.f1197.f3206);
        }
        c0035M581.mo583(i);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m844(nt ntVar, int i) {
        el.C0035 c0035Remove = this.f2101.f8351.remove(ntVar);
        if (this.f2101 == C0358.f6664.f2004) {
            C0358.f6674.f42.m722(ntVar.f3206);
        }
        if (c0035Remove != null) {
            c0035Remove.mo582(i);
        }
    }

    @Override // o.AbstractC0689
    /* renamed from: 鷭 */
    final int mo462(long j) {
        if (this.f7635 != AbstractC0689.EnumC0690.LOOP_INFINITE || this.f2101.f1997 != nu.PC || (this.f2126 != mv.STAND && this.f2126 != mv.SIT)) {
            return super.mo462(j);
        }
        long j2 = j - this.f7629;
        long j3 = j2;
        if (j2 < 0) {
            j3 = 0;
        }
        bh bhVar = (bh) this.f2101;
        int iMax = Math.max(1, m1422() / 3);
        int i = (((int) (j3 / 100)) % iMax) + (bhVar.f816 * iMax);
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: ć, reason: contains not printable characters */
    final void m834() {
        cv cvVar = C0358.f6685;
        nu nuVarM781 = lo.m781(this.f2123.f2001);
        switch (m829()[this.f2126.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 10:
                this.f7635 = AbstractC0689.EnumC0690.LOOP_INFINITE;
                break;
            case 4:
            case 6:
            case 7:
            case 8:
            case 11:
            case 12:
            case 13:
                this.f7635 = AbstractC0689.EnumC0690.LOOP_ONCE;
                break;
            case 9:
                if (nuVarM781 == nu.PC) {
                    this.f7635 = AbstractC0689.EnumC0690.SINGLE_FRAME;
                    break;
                } else {
                    this.f7635 = AbstractC0689.EnumC0690.LOOP_ONCE;
                    break;
                }
            default:
                this.f7635 = AbstractC0689.EnumC0690.LOOP_INFINITE;
                break;
        }
    }

    @Override // o.mj, o.AbstractC0689
    /* renamed from: 鷭, reason: contains not printable characters */
    final hs.C0049.C0050 mo840(int i) {
        return this.f7638.m632(((C0564) this.f7638).m1372(this.f2126, this.f2130), i);
    }
}
