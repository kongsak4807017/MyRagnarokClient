package o;

import o.AbstractC0988;
import o.pj;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class bh extends AbstractC0988 {

    /* renamed from: ŭ, reason: contains not printable characters */
    static oi[] f802 = {new oi(32, EnumC0134.CRUSADER, EnumC0134.CRUSADER2), new oi(32, EnumC0134.BABY_CRUSADER, EnumC0134.BABY_CRUSADER2), new oi(32, EnumC0134.PALADIN, EnumC0134.PALADIN2), new oi(126353440, EnumC0134.KNIGHT, EnumC0134.KNIGHT2), new oi(126353440, EnumC0134.BABY_KNIGHT, EnumC0134.BABY_KNIGHT2), new oi(126353440, EnumC0134.LORD_KNIGHT, EnumC0134.LORD_KNIGHT2), new oi(32, EnumC0134.ROYAL_GUARD, EnumC0134.ROYAL_GUARD2), new oi(32, EnumC0134.ROYAL_GUARD_T, EnumC0134.ROYAL_GUARD_T2), new oi(32, EnumC0134.BABY_GUARD, EnumC0134.BABY_GUARD2), new oi(126353440, EnumC0134.RUNE_KNIGHT, EnumC0134.RUNE_KNIGHT2), new oi(126353440, EnumC0134.RUNE_KNIGHT_T, EnumC0134.RUNE_KNIGHT_T2), new oi(126353440, EnumC0134.BABY_RUNE, EnumC0134.BABY_RUNE2), new oi(4194304, EnumC0134.MECHANIC, EnumC0134.MECHANIC2), new oi(4194304, EnumC0134.MECHANIC_T, EnumC0134.MECHANIC_T2), new oi(4194304, EnumC0134.BABY_MECHANIC, EnumC0134.BABY_MECHANIC2), new oi(2097152, EnumC0134.RANGER, EnumC0134.RANGER2), new oi(2097152, EnumC0134.RANGER_T, EnumC0134.RANGER_T2), new oi(2097152, EnumC0134.BABY_RANGER, EnumC0134.BABY_RANGER2)};

    /* renamed from: ŝ, reason: contains not printable characters */
    byte f803;

    /* renamed from: Ş, reason: contains not printable characters */
    int f804;

    /* renamed from: ş, reason: contains not printable characters */
    int f805;

    /* renamed from: Ţ, reason: contains not printable characters */
    int f806;

    /* renamed from: ţ, reason: contains not printable characters */
    int f807;

    /* renamed from: Ŧ, reason: contains not printable characters */
    int f808;

    /* renamed from: ŧ, reason: contains not printable characters */
    int f809;

    /* renamed from: ũ, reason: contains not printable characters */
    boolean f810;

    /* renamed from: Ū, reason: contains not printable characters */
    boolean f811;

    /* renamed from: ū, reason: contains not printable characters */
    boolean f812;

    /* renamed from: 弉, reason: contains not printable characters */
    int f813;

    /* renamed from: 弍, reason: contains not printable characters */
    int f814;

    /* renamed from: 挐, reason: contains not printable characters */
    boolean f815;

    /* renamed from: 挔, reason: contains not printable characters */
    short f816;

    /* renamed from: 뛖, reason: contains not printable characters */
    int f817;

    /* renamed from: 뛚, reason: contains not printable characters */
    int f818;

    bh(og ogVar, int i, int i2, int i3) {
        super(ogVar, i, i2, i3);
        this.f2001 = ogVar.f3287;
        this.f803 = ogVar.f3272;
        this.f817 = ogVar.f3285;
        this.f804 = ogVar.f3288;
        this.f805 = ogVar.f3258;
        this.f813 = ogVar.f3263;
        this.f806 = ogVar.f3264;
        this.f807 = ogVar.f3261;
        this.f818 = ogVar.f3260;
        this.f814 = ogVar.f3262;
        this.f808 = ogVar.f3270;
    }

    bh(oj ojVar) {
        mo460(ojVar);
    }

    @Override // o.AbstractC0988, o.lm
    /* renamed from: 鷭, reason: contains not printable characters */
    final void mo460(oj ojVar) {
        super.mo460(ojVar);
        this.f803 = ojVar.f3310;
        this.f804 = ojVar.f3334;
        this.f805 = ojVar.f3319;
        this.f817 = ojVar.f3320;
        this.f813 = ojVar.f3333;
        this.f806 = ojVar.f3326;
        this.f807 = ojVar.f3305;
        this.f818 = ojVar.f3328;
        this.f814 = ojVar.f3316;
        this.f808 = ojVar.f3306;
        this.f809 = ojVar.f3314;
        if ((AbstractC0988.EnumC0994.SIT.ordinal() & ojVar.f3322) != 0) {
            this.f815 = true;
        } else {
            this.f815 = false;
        }
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final int m459(boolean z) {
        boolean z2;
        EnumC0134 enumC0134M1250;
        EnumC0134 enumC0134M1255;
        int i = this.f2001;
        if (z) {
            i = EnumC1048.m1617(EnumC0134.m1250(this.f2001).m1256().f8819 & 4095).m1620(EnumC0765.valuesCustom()[this.f803]).f6499;
        }
        pj.C0079 c0079 = C0358.f6667;
        int i2 = this.f1998;
        if (c0079.f4828 == null) {
            z2 = false;
        } else {
            int[] iArr = c0079.f4828;
            int length = iArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z2 = false;
                    break;
                }
                if (i2 == iArr[i3]) {
                    z2 = true;
                    break;
                }
                i3++;
            }
        }
        if (z2) {
            return EnumC0134.GAMEMASTER.f6499;
        }
        if ((this.f8357 & 4096) != 0) {
            i = EnumC0134.WEDDING.f6499;
        } else if ((this.f8357 & 65536) != 0) {
            i = EnumC0134.XMAS.f6499;
        } else if ((this.f8357 & 262144) != 0) {
            i = EnumC0134.SUMMER.f6499;
        }
        oi[] oiVarArr = f802;
        int length2 = oiVarArr.length;
        int i4 = 0;
        while (true) {
            if (i4 < length2) {
                oi oiVar = oiVarArr[i4];
                if (i == oiVar.f3299.f6499 && (this.f8357 & oiVar.f3300) > 0) {
                    i = oiVar.f3298.f6499;
                    break;
                }
                if (i != oiVar.f3298.f6499 || (this.f8357 & oiVar.f3300) != 0) {
                    i4++;
                } else {
                    i = oiVar.f3299.f6499;
                    break;
                }
            } else {
                break;
            }
        }
        if (this.f8351.get(nt.ALL_RIDING) != null && (enumC0134M1250 = EnumC0134.m1250(i)) != null && (enumC0134M1255 = enumC0134M1250.m1255(true)) != null) {
            return enumC0134M1255.f6499;
        }
        return i;
    }
}
