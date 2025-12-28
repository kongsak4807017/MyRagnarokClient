package o;

import android.util.Log;
import com.roworkshop.andro.c_activity;
import java.io.IOException;
import java.util.HashMap;
import o.C1126;
import o.C1139;
import o.lo;
import o.lx;
import o.pi;
import o.pj;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class cq {

    /* renamed from: ė, reason: contains not printable characters */
    private static /* synthetic */ int[] f963;

    /* renamed from: Ą, reason: contains not printable characters */
    public fz f965;

    /* renamed from: ą, reason: contains not printable characters */
    public C0860 f966;

    /* renamed from: Ć, reason: contains not printable characters */
    public C1139 f967;

    /* renamed from: ć, reason: contains not printable characters */
    public gu f968;

    /* renamed from: ċ, reason: contains not printable characters */
    public dk f969;

    /* renamed from: đ, reason: contains not printable characters */
    public gs f970;

    /* renamed from: ȃ, reason: contains not printable characters */
    public lx f973;

    /* renamed from: Ȋ, reason: contains not printable characters */
    public em f974;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public C0776 f975;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public C1076 f976;

    /* renamed from: ܕ, reason: contains not printable characters */
    public dv f977;

    /* renamed from: 䒧, reason: contains not printable characters */
    public C1095 f979;

    /* renamed from: 岱, reason: contains not printable characters */
    public C0402 f980;

    /* renamed from: 庸, reason: contains not printable characters */
    public dw f981;

    /* renamed from: 櫯, reason: contains not printable characters */
    public C1126 f982;

    /* renamed from: 纫, reason: contains not printable characters */
    public C1034 f983;

    /* renamed from: 躆, reason: contains not printable characters */
    public C1137 f984;

    /* renamed from: 鷭, reason: contains not printable characters */
    public lo f985;

    /* renamed from: ē, reason: contains not printable characters */
    static int f962 = 8;

    /* renamed from: 띥, reason: contains not printable characters */
    static int f964 = 27;

    /* renamed from: Ē, reason: contains not printable characters */
    HashMap<Integer, pi> f971 = new HashMap<>();

    /* renamed from: 㥳, reason: contains not printable characters */
    private int[] f978 = new int[28];

    /* renamed from: Ė, reason: contains not printable characters */
    private int[] f972 = new int[28];

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] m504() {
        int[] iArr = f963;
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
        f963 = iArr2;
        return iArr2;
    }

    cq(c_activity c_activityVar, cr crVar, pj.Cif cif) throws IOException {
        byte[] bArrM141;
        byte[] bArrM1412;
        LuaState.loadlibrary(C0358.f6667.f4829);
        try {
            this.f978[0] = 1;
            this.f978[1] = 2;
            this.f978[2] = 1;
            this.f978[3] = 7;
            this.f978[4] = 5;
            this.f978[5] = 4;
            this.f978[6] = 3;
            this.f978[7] = 6;
            this.f978[11] = 12;
            this.f978[12] = 11;
            this.f972[0] = 1;
            this.f972[1] = 2;
            this.f972[2] = 4;
            this.f972[3] = 7;
            this.f972[4] = 1;
            this.f972[6] = 3;
            this.f972[7] = 6;
            this.f972[8] = 12;
            this.f972[9] = 10;
            this.f972[10] = 9;
            this.f972[12] = 8;
            if (C0358.f6667.f4794 > 0) {
                f964 = C0358.f6667.f4794;
            }
            if (C0358.f6667.f4795 > 0) {
                f962 = C0358.f6667.f4795;
            }
            this.f968 = new gu(crVar);
            this.f967 = new C1139(c_activityVar, crVar);
            this.f982 = new C1126(pa.m978(c_activityVar.m140(2130968577), ow.UTF8));
            if (C0358.f6667.f4843) {
                bArrM141 = c_activityVar.m141("npcidentity.lub");
                bArrM1412 = c_activityVar.m141("jobname.lub");
            } else {
                bArrM141 = (byte[]) crVar.m519("data\\lua files\\datainfo\\npcidentity.lub", false);
                bArrM1412 = (byte[]) crVar.m519("data\\lua files\\datainfo\\jobname.lub", false);
            }
            this.f976 = new C1076(crVar);
            this.f985 = new lo(cif, pa.m978(c_activityVar.m140(2130968579), ow.UTF8), bArrM141, bArrM1412, pa.m978(c_activityVar.m140(2130968581), ow.UTF8), this.f976);
            this.f975 = new C0776(crVar);
            this.f973 = new lx(crVar);
            this.f966 = new C0860(crVar);
            this.f965 = new fz(pa.m978(c_activityVar.m140(2130968588), ow.UTF8));
            this.f979 = new C1095();
            this.f980 = new C0402(crVar);
            this.f974 = new em(crVar);
            this.f969 = new dk(crVar);
            this.f984 = new C1137(crVar);
            this.f983 = new C1034(crVar, false);
            if (C0358.f6667.f4785) {
                this.f977 = new dv(crVar);
            }
            if (C0358.f6667.f4777) {
                this.f981 = new dw(crVar);
            }
            m503(crVar);
            try {
                this.f970 = new gs((byte[]) crVar.m519("data\\lua files\\signboardlist.lub", false));
            } catch (uw unused) {
                this.f970 = new gs();
            }
            je jeVar = C0358.f6674.f42;
            if (jeVar.f1735 != null) {
                C0358.f6674.mo139(new jt(jeVar));
            }
            C0358.f6674.mo139(new jr(jeVar, "Finished db initialization"));
        } catch (nx e) {
            throw new ut(e, "File format error. Try to delete your client folder " + oc.f3240 + "\nLocation:" + e.f3222 + ": " + (e.f3221 != null ? e.f3221 : "unknown error") + "\n.", true);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static pe[] m505(LuaState luaState, String str) {
        luaState.pushString(str);
        luaState.getTable(-2);
        int[] iArrM901 = luaState.isNil(-1) ? null : ny.m901(luaState);
        luaState.pop(1);
        int[] iArr = iArrM901;
        if (iArrM901 == null) {
            return null;
        }
        pe[] peVarArr = new pe[iArr.length];
        for (int i = 0; i < peVarArr.length; i++) {
            peVarArr[i] = pe.m999(iArr[i]);
        }
        return peVarArr;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m503(cr crVar) {
        je jeVar = C0358.f6674.f42;
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Reading skill effect info list"));
        HashMap<Integer, pi> map = this.f971;
        LuaState luaStateNewLuaState = LuaStateFactory.newLuaState();
        for (String str : new String[]{"data\\lua files\\skillinfoz\\skillid.lub", "data\\lua files\\skilleffectinfo\\actorstate.lub", "data\\lua files\\skilleffectinfo\\effectid.lub", "data\\lua files\\skilleffectinfo\\skilleffectinfolist.lub"}) {
            try {
                ny.m906(luaStateNewLuaState, (byte[]) crVar.m519(str, false));
            } catch (nw e) {
                nz.m907(e.toString());
                return;
            } catch (uw e2) {
                nz.m907(e2.toString());
                return;
            }
        }
        luaStateNewLuaState.getGlobal("SKILL_EFFECT_INFO_LIST");
        if (luaStateNewLuaState.isTable(-1)) {
            luaStateNewLuaState.pushNil();
            while (luaStateNewLuaState.next(-2) != 0) {
                int integer = luaStateNewLuaState.toInteger(-2);
                pi piVar = new pi();
                piVar.f4559 = ny.m903(luaStateNewLuaState, "waveFileName", ow.KOREAN);
                piVar.f4558 = ny.m903(luaStateNewLuaState, "targetWaveFileName", ow.KOREAN);
                piVar.f4556 = m505(luaStateNewLuaState, "effectID");
                piVar.f4555 = m505(luaStateNewLuaState, "targetEffectID");
                piVar.f4551 = m505(luaStateNewLuaState, "groundEffectID");
                piVar.f4552 = pe.m999(ny.m902(luaStateNewLuaState, "beginEffectID"));
                piVar.f4553 = ny.m902(luaStateNewLuaState, "onTarget") != 0;
                piVar.f4554 = ny.m902(luaStateNewLuaState, "LaunchZC_USE_SKILL") != 0;
                int iM902 = ny.m902(luaStateNewLuaState, "beginMotionType");
                if (iM902 < 0 || iM902 >= pi.EnumC0073.valuesCustom().length) {
                    nz.m907("iBeginMotionType < 0 || iBeginMotionType >= SKILL_EFFECT_INFO.ST.values().length");
                    luaStateNewLuaState.pop(1);
                } else {
                    piVar.f4557 = pi.EnumC0073.valuesCustom()[iM902];
                    map.put(Integer.valueOf(integer), piVar);
                    luaStateNewLuaState.pop(1);
                }
            }
        }
        luaStateNewLuaState.pop(1);
        luaStateNewLuaState.close();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final EnumC0615 m514(int i, int i2) {
        EnumC0615[] enumC0615ArrValuesCustom = EnumC0615.valuesCustom();
        if (i >= 0 && i < enumC0615ArrValuesCustom.length) {
            return enumC0615ArrValuesCustom[i];
        }
        C0432 c0432M1648 = this.f967.m1648(i);
        lx.C0061 c0061 = C0358.f6685.f1030.f973.f2043.get(Integer.valueOf(c0432M1648 == null ? -1 : c0432M1648.f6850));
        EnumC0615 enumC0615 = c0061 == null ? EnumC0615.NONE : c0061.f2045;
        if (enumC0615 == null || enumC0615 == EnumC0615.NONE) {
            return EnumC0615.NONE;
        }
        if (i2 == 0) {
            return enumC0615;
        }
        C0432 c0432M16482 = this.f967.m1648(i2);
        EnumC0680 enumC0680 = c0432M16482 == null ? null : c0432M16482.f6853;
        if (enumC0680 != EnumC0680.WEAPON && enumC0680 != EnumC0680.WEAPON_TWOHAND) {
            return enumC0615;
        }
        C0432 c0432M16483 = this.f967.m1648(i2);
        lx.C0061 c00612 = C0358.f6685.f1030.f973.f2043.get(Integer.valueOf(c0432M16483 == null ? -1 : c0432M16483.f6850));
        EnumC0615 enumC06152 = c00612 == null ? EnumC0615.NONE : c00612.f2045;
        if (enumC06152 == null || enumC06152 == EnumC0615.NONE) {
            return enumC0615;
        }
        if (enumC0615 == EnumC0615.SHORTSWORD && enumC06152 == EnumC0615.SHORTSWORD) {
            return EnumC0615.SHORTSWORD_SHORTSWORD;
        }
        if (enumC0615 == EnumC0615.SWORD && enumC06152 == EnumC0615.SWORD) {
            return EnumC0615.SHORTSWORD_SHORTSWORD;
        }
        if (enumC0615 == EnumC0615.AXE && enumC06152 == EnumC0615.AXE) {
            return EnumC0615.AXE_AXE;
        }
        if ((enumC0615 == EnumC0615.SHORTSWORD && enumC06152 == EnumC0615.SWORD) || (enumC0615 == EnumC0615.SWORD && enumC06152 == EnumC0615.SHORTSWORD)) {
            return EnumC0615.SHORTSWORD_SWORD;
        }
        if ((enumC0615 == EnumC0615.SHORTSWORD && enumC06152 == EnumC0615.AXE) || (enumC0615 == EnumC0615.AXE && enumC06152 == EnumC0615.SHORTSWORD)) {
            return EnumC0615.SHORTSWORD_AXE;
        }
        if ((enumC0615 == EnumC0615.AXE && enumC06152 == EnumC0615.SWORD) || (enumC0615 == EnumC0615.SWORD && enumC06152 == EnumC0615.AXE)) {
            return EnumC0615.SWORD_AXE;
        }
        return enumC0615;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final String m507(int i, byte b) {
        C1126 c1126 = this.f982;
        lo loVar = this.f985;
        nu nuVarM781 = lo.m781(i);
        if (nuVarM781 == null) {
            String str = "Unknown class requested: " + i;
            Log.e("AndRO", str);
            throw new nv(str);
        }
        switch (m504()[nuVarM781.ordinal()]) {
            case 2:
                EnumC0134 enumC0134M1250 = EnumC0134.m1250(i);
                C1126.Cif.C1127if c1127if = c1126.f8937.f8941;
                return String.valueOf(enumC0134M1250 == EnumC0134.SUMMONER ? c1127if.f8952 : c1127if.f8953) + "\\" + c1126.f8937.f8941.f8951 + "\\" + (b == EnumC0765.MALE.ordinal() ? c1126.f8935 : c1126.f8934) + "\\" + loVar.m784(i, b) + "_" + (b == EnumC0765.MALE.ordinal() ? c1126.f8935 : c1126.f8934);
            case 3:
            case 4:
            case 11:
                return String.valueOf(c1126.f8937.f8947) + "\\" + loVar.m784(i, b);
            case 5:
                return "homun\\" + loVar.m784(i, b);
            case 6:
                C1126.Cif.C1127if c1127if2 = c1126.f8937.f8941;
                return String.valueOf(EnumC0134.m1250(i) == EnumC0134.SUMMONER ? c1127if2.f8952 : c1127if2.f8953) + "\\" + c1126.f8937.f8941.f8951 + "\\" + loVar.m784(i, b);
            case 7:
            case 8:
            case 10:
            default:
                String str2 = "Requested non implemented unit class sprite: " + nuVarM781;
                Log.e("AndRO", str2);
                throw new nv(str2);
            case 9:
                return "npc\\" + loVar.m784(i, b);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final String m513(EnumC0134 enumC0134, int i, int i2, byte b) {
        C1126 c1126 = this.f982;
        if (i2 > f962) {
            i2 = 0;
        }
        if (enumC0134 != EnumC0134.SUMMONER) {
            return String.valueOf(c1126.f8936.f8965) + "\\" + c1126.f8936.f8965 + m501(enumC0134, i, b) + "_" + (b == EnumC0765.MALE.ordinal() ? c1126.f8935 : c1126.f8934) + "_" + i2;
        }
        C1126.Cif.C1127if c1127if = c1126.f8937.f8941;
        return String.valueOf(enumC0134 == EnumC0134.SUMMONER ? c1127if.f8952 : c1127if.f8953) + "\\" + c1126.f8936.f8965 + "\\" + c1126.f8936.f8965 + m501(enumC0134, i, b) + "_" + (b == EnumC0765.MALE.ordinal() ? c1126.f8935 : c1126.f8934) + "_" + i2;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final String m508(int i, int i2, byte b) {
        String str;
        C1126 c1126 = this.f982;
        lo loVar = this.f985;
        if (C0358.f6667.f4807) {
            return String.valueOf(c1126.f8936.f8964) + "\\body_" + i2;
        }
        if (C0358.f6667.f4793) {
            return String.valueOf(c1126.f8936.f8964) + "\\allinone_" + i2;
        }
        EnumC1048 enumC1048M1256 = EnumC0134.m1250(i).m1256();
        if (C0358.f6667.f4788 && i != EnumC0134.GAMEMASTER.f6499) {
            if ((enumC1048M1256.f8819 & 4096) > 0) {
                if (!((enumC1048M1256.f8819 & 16384) > 0)) {
                    i = enumC1048M1256.m1621().m1620(EnumC0765.valuesCustom()[b]).f6499;
                }
            }
        }
        if (C0358.f6667.f4840 && i != EnumC0134.GAMEMASTER.f6499) {
            i = EnumC0134.m1250(i).m1256().m1618().m1620(EnumC0765.valuesCustom()[b]).f6499;
        }
        StringBuilder sbAppend = new StringBuilder(String.valueOf(c1126.f8936.f8964)).append("\\");
        int iM780 = lo.m780(i);
        lo.C0060 c0060 = loVar.f2006.get(Integer.valueOf(iM780));
        if (c0060 == null) {
            String str2 = "Failed to convert job " + iM780 + " to spritename for palette";
            Log.e("AndRO", str2);
            throw new nv(str2);
        }
        if (loVar.f2007 == pj.Cif.Korea && c0060.f2009 != null && !c0060.f2009.isEmpty()) {
            str = c0060.f2009;
        } else if (c0060.f2011 != null) {
            str = c0060.f2011;
        } else {
            if (c0060.f2012 == null) {
                String str3 = "Job " + iM780 + ": null spritename";
                Log.e("AndRO", str3);
                throw new nv(str3);
            }
            str = c0060.f2012;
        }
        return sbAppend.append(str).append("_").append(b == EnumC0765.MALE.ordinal() ? c1126.f8935 : c1126.f8934).append("_").append(i2).toString();
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final String m506(int i, int i2, byte b) {
        String str;
        C1126 c1126 = this.f982;
        String str2 = b == EnumC0765.MALE.ordinal() ? c1126.f8935 : c1126.f8934;
        C1139 c1139 = this.f967;
        C1139.C1140 c1140 = c1139.f8973.get(i);
        if (c1140 != null) {
            str = c1140.f8975;
        } else if (c1139.f8972 != null) {
            nz.m907("Couldn't get headgear " + i + " spritename, defaulting to " + c1139.f8972);
            str = c1139.f8972;
        } else {
            nz.m907("Couldn't get headgear " + i + " spritename, defaulting to GOGGLES");
            str = c1139.f8973.get(1).f8975;
        }
        if (i == 185) {
            str = String.valueOf(str) + i2;
        }
        return String.valueOf(this.f982.f8937.f8943) + "\\" + str2 + "\\" + str2 + str;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final String m509(int i, bh bhVar) {
        EnumC0134 enumC0134M1250 = EnumC0134.m1250(bhVar.f2001);
        int iM459 = bhVar.m459(true);
        if (iM459 == EnumC0134.TAEKWON.f6499 || iM459 == EnumC0134.STAR_GLADIATOR.f6499 || iM459 == EnumC0134.STAR_GLADIATOR2.f6499 || iM459 == EnumC0134.GAMEMASTER.f6499 || iM459 == EnumC0134.WEDDING.f6499 || iM459 == EnumC0134.XMAS.f6499 || iM459 == EnumC0134.SUMMER.f6499 || (bhVar.f8357 & 4096) > 0 || (bhVar.f8357 & 65536) > 0 || (bhVar.f8357 & 262144) > 0 || (bhVar.f8357 & 134217728) > 0 || (bhVar.f8357 & 268435456) > 0) {
            return null;
        }
        if (i == EnumC0615.KNUKLE.ordinal() && iM459 != EnumC0134.MONK.f6499) {
            return null;
        }
        if (iM459 == EnumC0134.SOUL_LINKER.f6499) {
            iM459 = EnumC0134.MAGE.f6499;
        }
        C1126 c1126 = this.f982;
        String str = bhVar.f803 == EnumC0765.MALE.ordinal() ? c1126.f8935 : c1126.f8934;
        C1126.Cif.C1127if c1127if = this.f982.f8937.f8941;
        String str2 = enumC0134M1250 == EnumC0134.SUMMONER ? c1127if.f8952 : c1127if.f8953;
        String strM784 = this.f985.m784(iM459, bhVar.f803);
        lx.C0061 c0061 = this.f973.f2043.get(Integer.valueOf(i));
        String str3 = c0061 == null ? null : c0061.f2047;
        if (strM784 == null) {
            nz.m907("jclass == null for class=" + iM459);
            return null;
        }
        if (str3 == null) {
            nz.m907("jspritename == null for view=" + i);
            return null;
        }
        return String.valueOf(str2) + "\\" + strM784 + "\\" + strM784 + "_" + str + str3;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final String m510(int i, boolean z, boolean z2) {
        String strM1647 = this.f967.m1647(i, z);
        if (strM1647 == null) {
            strM1647 = this.f967.m1647(512, true);
        }
        if (z2) {
            return "data\\texture\\" + this.f982.f8938.f8962 + "\\collection\\" + strM1647 + ".bmp";
        }
        return "data\\texture\\" + this.f982.f8938.f8962 + "\\item\\" + strM1647 + ".bmp";
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final String m511(String str) {
        return "data\\texture\\" + this.f982.f8938.f8962 + "\\item\\" + str.toLowerCase() + ".bmp";
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private static int m500(int i, byte b) {
        if (b == EnumC0765.FEMALE.ordinal()) {
            switch (i) {
            }
            return i;
        }
        switch (i) {
        }
        return i;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private int m501(EnumC0134 enumC0134, int i, byte b) {
        if (enumC0134 == EnumC0134.SUMMONER) {
            return i;
        }
        if (C0358.f6667.f4771 == pj.aux.MyRO) {
            return m500(i, b);
        }
        int[] iArr = b == EnumC0765.MALE.ordinal() ? this.f978 : this.f972;
        if (i < iArr.length && iArr[i] != 0) {
            return iArr[i];
        }
        return i;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static int m502(EnumC0134 enumC0134, int i) {
        int i2;
        if (enumC0134 == EnumC0134.SUMMONER) {
            i2 = 6;
        } else if (C0358.f6667.f4771 == pj.aux.Eden3 || C0358.f6667.f4771 == pj.aux.LeonardRO || C0358.f6667.f4771 == pj.aux.FreePlayRoCom) {
            i2 = 23;
        } else {
            i2 = 27;
        }
        int i3 = i2;
        while (i <= 0) {
            i += i3;
        }
        while (i > i2) {
            i -= i3;
        }
        return i;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final String m512(EnumC0134 enumC0134, int i, byte b) {
        C1126 c1126 = this.f982;
        String str = b == EnumC0765.MALE.ordinal() ? c1126.f8935 : c1126.f8934;
        if (!C0358.f6667.f4790) {
            i = m501(enumC0134, i, b);
        }
        C1126.Cif.C1127if c1127if = c1126.f8937.f8941;
        return String.valueOf(enumC0134 == EnumC0134.SUMMONER ? c1127if.f8952 : c1127if.f8953) + "\\" + c1126.f8937.f8941.f8950 + "\\" + str + "\\" + i + "_" + str;
    }
}
