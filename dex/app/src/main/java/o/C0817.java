package o;

import android.support.v4.view.MotionEventCompat;
import android.widget.Toast;
import java.nio.ByteBuffer;
import o.hj;
import o.lo;
import o.pj;

/* renamed from: o.碧, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0817 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] f7927;

    C0817() {
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m1482() {
        int[] iArr = f7927;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0505.valuesCustom().length];
        try {
            iArr2[EnumC0505.ADDEFF.ordinal()] = 82;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0505.ADDEFF2.ordinal()] = 137;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0505.ADDEFF_ONSKILL.ordinal()] = 159;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC0505.ADDEFF_WHENHIT.ordinal()] = 179;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC0505.ADDELE.ordinal()] = 77;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC0505.ADDRACE.ordinal()] = 78;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC0505.ADDRACE2.ordinal()] = 187;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[EnumC0505.ADDSIZE.ordinal()] = 79;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[EnumC0505.ADD_CLASS_DROP_ITEM.ordinal()] = 208;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[EnumC0505.ADD_DAMAGE_CLASS.ordinal()] = 113;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[EnumC0505.ADD_DEF_CLASS.ordinal()] = 115;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[EnumC0505.ADD_GET_ZENY_NUM.ordinal()] = 112;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[EnumC0505.ADD_HEAL2_RATE.ordinal()] = 161;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[EnumC0505.ADD_HEAL_RATE.ordinal()] = 160;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[EnumC0505.ADD_ITEM_HEAL_RATE.ordinal()] = 191;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[EnumC0505.ADD_MAGIC_DAMAGE_CLASS.ordinal()] = 114;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[EnumC0505.ADD_MDEF_CLASS.ordinal()] = 116;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[EnumC0505.ADD_MONSTER_DROP_ITEM.ordinal()] = 117;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[EnumC0505.ADD_MONSTER_DROP_ITEMGROUP.ordinal()] = 202;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[EnumC0505.ADD_SKILL_BLOW.ordinal()] = 204;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[EnumC0505.ADD_STEAL_RATE.ordinal()] = 140;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[EnumC0505.AGI.ordinal()] = 15;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[EnumC0505.AGI_DEX_STR.ordinal()] = 145;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[EnumC0505.AGI_VIT.ordinal()] = 144;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[EnumC0505.ALL_STATS.ordinal()] = 143;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[EnumC0505.ASPD.ordinal()] = 54;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[EnumC0505.ASPD_RATE.ordinal()] = 85;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[EnumC0505.ATK1.ordinal()] = 42;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[EnumC0505.ATK2.ordinal()] = 43;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[EnumC0505.ATKELE.ordinal()] = 71;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[EnumC0505.ATK_RATE.ordinal()] = 98;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[EnumC0505.ATTACKRANGE.ordinal()] = 70;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[EnumC0505.AUTOSPELL.ordinal()] = 130;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[EnumC0505.AUTOSPELL_ONSKILL.ordinal()] = 183;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[EnumC0505.AUTOSPELL_WHENHIT.ordinal()] = 180;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[EnumC0505.BASECLASS.ordinal()] = 64;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[EnumC0505.BASEEXP.ordinal()] = 2;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr2[EnumC0505.BASEJOB.ordinal()] = 63;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr2[EnumC0505.BASELEVEL.ordinal()] = 12;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr2[EnumC0505.BASE_ATK.ordinal()] = 84;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr2[EnumC0505.BASE_MATK.ordinal()] = 209;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr2[EnumC0505.BREAK_ARMOR_RATE.ordinal()] = 139;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr2[EnumC0505.BREAK_WEAPON_RATE.ordinal()] = 138;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr2[EnumC0505.CART.ordinal()] = 59;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr2[EnumC0505.CARTINFO.ordinal()] = 62;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr2[EnumC0505.CASTRATE.ordinal()] = 73;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr2[EnumC0505.CASTTIME.ordinal()] = 211;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr2[EnumC0505.CLASS.ordinal()] = 20;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr2[EnumC0505.CLASSCHANGE.ordinal()] = 148;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr2[EnumC0505.CRITICAL.ordinal()] = 53;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr2[EnumC0505.CRITICAL_ADDRACE.ordinal()] = 177;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr2[EnumC0505.CRITICAL_DEF.ordinal()] = 89;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr2[EnumC0505.CRITICAL_RATE.ordinal()] = 110;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr2[EnumC0505.CRIT_ATK_RATE.ordinal()] = 176;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr2[EnumC0505.DEF1.ordinal()] = 46;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr2[EnumC0505.DEF2.ordinal()] = 47;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr2[EnumC0505.DEF2_RATE.ordinal()] = 125;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr2[EnumC0505.DEFELE.ordinal()] = 72;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr2[EnumC0505.DEF_RATE.ordinal()] = 124;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr2[EnumC0505.DEF_RATIO_ATK_ELE.ordinal()] = 118;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr2[EnumC0505.DEF_RATIO_ATK_RACE.ordinal()] = 119;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr2[EnumC0505.DELAYRATE.ordinal()] = 153;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr2[EnumC0505.DELAYTIME.ordinal()] = 212;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr2[EnumC0505.DEX.ordinal()] = 18;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr2[EnumC0505.DOUBLE_ADD_RATE.ordinal()] = 93;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr2[EnumC0505.DOUBLE_RATE.ordinal()] = 92;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr2[EnumC0505.DRAIN_RATE.ordinal()] = 132;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr2[EnumC0505.DRAIN_RATE_RACE.ordinal()] = 155;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr2[EnumC0505.DRAIN_VALUE.ordinal()] = 150;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr2[EnumC0505.DRAIN_VALUE_RACE.ordinal()] = 192;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr2[EnumC0505.ELE_DAMAGE_RATE.ordinal()] = 210;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr2[EnumC0505.EXP_ADDRACE.ordinal()] = 193;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr2[EnumC0505.FAME.ordinal()] = 60;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            iArr2[EnumC0505.FIXCASTRATE.ordinal()] = 162;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr2[EnumC0505.FLEE1.ordinal()] = 51;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            iArr2[EnumC0505.FLEE2.ordinal()] = 52;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            iArr2[EnumC0505.FLEE2_RATE.ordinal()] = 123;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            iArr2[EnumC0505.FLEE_RATE.ordinal()] = 122;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            iArr2[EnumC0505.GAIN_RACE.ordinal()] = 194;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            iArr2[EnumC0505.GAIN_VALUE.ordinal()] = 184;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            iArr2[EnumC0505.GET_ZENY_NUM.ordinal()] = 111;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            iArr2[EnumC0505.HIT.ordinal()] = 50;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            iArr2[EnumC0505.HIT_RATE.ordinal()] = 121;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            iArr2[EnumC0505.HP.ordinal()] = 6;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            iArr2[EnumC0505.HP_DRAIN_RATE.ordinal()] = 131;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            iArr2[EnumC0505.HP_DRAIN_RATE_RACE.ordinal()] = 154;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            iArr2[EnumC0505.HP_DRAIN_VALUE.ordinal()] = 149;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            iArr2[EnumC0505.HP_DRAIN_VALUE_RACE.ordinal()] = 190;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            iArr2[EnumC0505.HP_GAIN_VALUE.ordinal()] = 188;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            iArr2[EnumC0505.HP_LOSS_RATE.ordinal()] = 186;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            iArr2[EnumC0505.HP_RECOV_RATE.ordinal()] = 86;
        } catch (NoSuchFieldError unused91) {
        }
        try {
            iArr2[EnumC0505.HP_REGEN_RATE.ordinal()] = 185;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            iArr2[EnumC0505.IGNORE_DEF_ELE.ordinal()] = 96;
        } catch (NoSuchFieldError unused93) {
        }
        try {
            iArr2[EnumC0505.IGNORE_DEF_RACE.ordinal()] = 97;
        } catch (NoSuchFieldError unused94) {
        }
        try {
            iArr2[EnumC0505.IGNORE_DEF_RATE.ordinal()] = 157;
        } catch (NoSuchFieldError unused95) {
        }
        try {
            iArr2[EnumC0505.IGNORE_MDEF_ELE.ordinal()] = 103;
        } catch (NoSuchFieldError unused96) {
        }
        try {
            iArr2[EnumC0505.IGNORE_MDEF_RACE.ordinal()] = 104;
        } catch (NoSuchFieldError unused97) {
        }
        try {
            iArr2[EnumC0505.IGNORE_MDEF_RATE.ordinal()] = 156;
        } catch (NoSuchFieldError unused98) {
        }
        try {
            iArr2[EnumC0505.INT.ordinal()] = 17;
        } catch (NoSuchFieldError unused99) {
        }
        try {
            iArr2[EnumC0505.INTRAVISION.ordinal()] = 201;
        } catch (NoSuchFieldError unused100) {
        }
        try {
            iArr2[EnumC0505.JOBEXP.ordinal()] = 3;
        } catch (NoSuchFieldError unused101) {
        }
        try {
            iArr2[EnumC0505.JOBLEVEL.ordinal()] = 56;
        } catch (NoSuchFieldError unused102) {
        }
        try {
            iArr2[EnumC0505.KARMA.ordinal()] = 4;
        } catch (NoSuchFieldError unused103) {
        }
        try {
            iArr2[EnumC0505.KILLEDRID.ordinal()] = 66;
        } catch (NoSuchFieldError unused104) {
        }
        try {
            iArr2[EnumC0505.KILLERRID.ordinal()] = 65;
        } catch (NoSuchFieldError unused105) {
        }
        try {
            iArr2[EnumC0505.LONG_ATK_DEF.ordinal()] = 91;
        } catch (NoSuchFieldError unused106) {
        }
        try {
            iArr2[EnumC0505.LONG_ATK_RATE.ordinal()] = 175;
        } catch (NoSuchFieldError unused107) {
        }
        try {
            iArr2[EnumC0505.LONG_WEAPON_DAMAGE_RETURN.ordinal()] = 134;
        } catch (NoSuchFieldError unused108) {
        }
        try {
            iArr2[EnumC0505.LOSS_RATE.ordinal()] = 203;
        } catch (NoSuchFieldError unused109) {
        }
        try {
            iArr2[EnumC0505.LUK.ordinal()] = 19;
        } catch (NoSuchFieldError unused110) {
        }
        try {
            iArr2[EnumC0505.MAGIC_ADDELE.ordinal()] = 105;
        } catch (NoSuchFieldError unused111) {
        }
        try {
            iArr2[EnumC0505.MAGIC_ADDRACE.ordinal()] = 106;
        } catch (NoSuchFieldError unused112) {
        }
        try {
            iArr2[EnumC0505.MAGIC_ADDSIZE.ordinal()] = 107;
        } catch (NoSuchFieldError unused113) {
        }
        try {
            iArr2[EnumC0505.MAGIC_ATK_DEF.ordinal()] = 101;
        } catch (NoSuchFieldError unused114) {
        }
        try {
            iArr2[EnumC0505.MAGIC_DAMAGE_RETURN.ordinal()] = 141;
        } catch (NoSuchFieldError unused115) {
        }
        try {
            iArr2[EnumC0505.MAGIC_GAIN_VALUE.ordinal()] = 206;
        } catch (NoSuchFieldError unused116) {
        }
        try {
            iArr2[EnumC0505.MAGIC_HP_GAIN_VALUE.ordinal()] = 207;
        } catch (NoSuchFieldError unused117) {
        }
        try {
            iArr2[EnumC0505.MANNER.ordinal()] = 5;
        } catch (NoSuchFieldError unused118) {
        }
        try {
            iArr2[EnumC0505.MATK1.ordinal()] = 44;
        } catch (NoSuchFieldError unused119) {
        }
        try {
            iArr2[EnumC0505.MATK2.ordinal()] = 45;
        } catch (NoSuchFieldError unused120) {
        }
        try {
            iArr2[EnumC0505.MATK_RATE.ordinal()] = 95;
        } catch (NoSuchFieldError unused121) {
        }
        try {
            iArr2[EnumC0505.MAXHP.ordinal()] = 7;
        } catch (NoSuchFieldError unused122) {
        }
        try {
            iArr2[EnumC0505.MAXHPRATE.ordinal()] = 74;
        } catch (NoSuchFieldError unused123) {
        }
        try {
            iArr2[EnumC0505.MAXSP.ordinal()] = 9;
        } catch (NoSuchFieldError unused124) {
        }
        try {
            iArr2[EnumC0505.MAXSPRATE.ordinal()] = 75;
        } catch (NoSuchFieldError unused125) {
        }
        try {
            iArr2[EnumC0505.MAXWEIGHT.ordinal()] = 26;
        } catch (NoSuchFieldError unused126) {
        }
        try {
            iArr2[EnumC0505.MDEF1.ordinal()] = 48;
        } catch (NoSuchFieldError unused127) {
        }
        try {
            iArr2[EnumC0505.MDEF2.ordinal()] = 49;
        } catch (NoSuchFieldError unused128) {
        }
        try {
            iArr2[EnumC0505.MDEF2_RATE.ordinal()] = 127;
        } catch (NoSuchFieldError unused129) {
        }
        try {
            iArr2[EnumC0505.MDEF_RATE.ordinal()] = 126;
        } catch (NoSuchFieldError unused130) {
        }
        try {
            iArr2[EnumC0505.MERCFAITH.ordinal()] = 69;
        } catch (NoSuchFieldError unused131) {
        }
        try {
            iArr2[EnumC0505.MERCFLEE.ordinal()] = 67;
        } catch (NoSuchFieldError unused132) {
        }
        try {
            iArr2[EnumC0505.MERCKILLS.ordinal()] = 68;
        } catch (NoSuchFieldError unused133) {
        }
        try {
            iArr2[EnumC0505.MISC_ATK_DEF.ordinal()] = 102;
        } catch (NoSuchFieldError unused134) {
        }
        try {
            iArr2[EnumC0505.NEAR_ATK_DEF.ordinal()] = 90;
        } catch (NoSuchFieldError unused135) {
        }
        try {
            iArr2[EnumC0505.NEXTBASEEXP.ordinal()] = 23;
        } catch (NoSuchFieldError unused136) {
        }
        try {
            iArr2[EnumC0505.NEXTJOBEXP.ordinal()] = 24;
        } catch (NoSuchFieldError unused137) {
        }
        try {
            iArr2[EnumC0505.NO_CASTCANCEL.ordinal()] = 164;
        } catch (NoSuchFieldError unused138) {
        }
        try {
            iArr2[EnumC0505.NO_CASTCANCEL2.ordinal()] = 169;
        } catch (NoSuchFieldError unused139) {
        }
        try {
            iArr2[EnumC0505.NO_GEMSTONE.ordinal()] = 168;
        } catch (NoSuchFieldError unused140) {
        }
        try {
            iArr2[EnumC0505.NO_KNOCKBACK.ordinal()] = 147;
        } catch (NoSuchFieldError unused141) {
        }
        try {
            iArr2[EnumC0505.NO_MAGIC_DAMAGE.ordinal()] = 166;
        } catch (NoSuchFieldError unused142) {
        }
        try {
            iArr2[EnumC0505.NO_MISC_DAMAGE.ordinal()] = 170;
        } catch (NoSuchFieldError unused143) {
        }
        try {
            iArr2[EnumC0505.NO_REGEN.ordinal()] = 178;
        } catch (NoSuchFieldError unused144) {
        }
        try {
            iArr2[EnumC0505.NO_SIZEFIX.ordinal()] = 165;
        } catch (NoSuchFieldError unused145) {
        }
        try {
            iArr2[EnumC0505.NO_WEAPON_DAMAGE.ordinal()] = 167;
        } catch (NoSuchFieldError unused146) {
        }
        try {
            iArr2[EnumC0505.PARTNER.ordinal()] = 58;
        } catch (NoSuchFieldError unused147) {
        }
        try {
            iArr2[EnumC0505.PERFECT_HIDE.ordinal()] = 146;
        } catch (NoSuchFieldError unused148) {
        }
        try {
            iArr2[EnumC0505.PERFECT_HIT_ADD_RATE.ordinal()] = 109;
        } catch (NoSuchFieldError unused149) {
        }
        try {
            iArr2[EnumC0505.PERFECT_HIT_RATE.ordinal()] = 108;
        } catch (NoSuchFieldError unused150) {
        }
        try {
            iArr2[EnumC0505.RANDOM_ATTACK_INCREASE.ordinal()] = 142;
        } catch (NoSuchFieldError unused151) {
        }
        try {
            iArr2[EnumC0505.RECOV_RATE.ordinal()] = 87;
        } catch (NoSuchFieldError unused152) {
        }
        try {
            iArr2[EnumC0505.REGEN_RATE.ordinal()] = 100;
        } catch (NoSuchFieldError unused153) {
        }
        try {
            iArr2[EnumC0505.RESEFF.ordinal()] = 83;
        } catch (NoSuchFieldError unused154) {
        }
        try {
            iArr2[EnumC0505.RESTART_FULL_RECOVER.ordinal()] = 163;
        } catch (NoSuchFieldError unused155) {
        }
        try {
            iArr2[EnumC0505.SEX.ordinal()] = 22;
        } catch (NoSuchFieldError unused156) {
        }
        try {
            iArr2[EnumC0505.SHORT_WEAPON_DAMAGE_RETURN.ordinal()] = 133;
        } catch (NoSuchFieldError unused157) {
        }
        try {
            iArr2[EnumC0505.SKILLBLOCKTIME.ordinal()] = 213;
        } catch (NoSuchFieldError unused158) {
        }
        try {
            iArr2[EnumC0505.SKILLPOINT.ordinal()] = 13;
        } catch (NoSuchFieldError unused159) {
        }
        try {
            iArr2[EnumC0505.SKILL_ATK.ordinal()] = 181;
        } catch (NoSuchFieldError unused160) {
        }
        try {
            iArr2[EnumC0505.SKILL_HEAL.ordinal()] = 94;
        } catch (NoSuchFieldError unused161) {
        }
        try {
            iArr2[EnumC0505.SKILL_HEAL2.ordinal()] = 158;
        } catch (NoSuchFieldError unused162) {
        }
        try {
            iArr2[EnumC0505.SP.ordinal()] = 8;
        } catch (NoSuchFieldError unused163) {
        }
        try {
            iArr2[EnumC0505.SPCOST.ordinal()] = 214;
        } catch (NoSuchFieldError unused164) {
        }
        try {
            iArr2[EnumC0505.SPEED.ordinal()] = 1;
        } catch (NoSuchFieldError unused165) {
        }
        try {
            iArr2[EnumC0505.SPEED_ADDRATE.ordinal()] = 99;
        } catch (NoSuchFieldError unused166) {
        }
        try {
            iArr2[EnumC0505.SPEED_RATE.ordinal()] = 88;
        } catch (NoSuchFieldError unused167) {
        }
        try {
            iArr2[EnumC0505.SPLASH_ADD_RANGE.ordinal()] = 129;
        } catch (NoSuchFieldError unused168) {
        }
        try {
            iArr2[EnumC0505.SPLASH_RANGE.ordinal()] = 128;
        } catch (NoSuchFieldError unused169) {
        }
        try {
            iArr2[EnumC0505.SPRATE.ordinal()] = 76;
        } catch (NoSuchFieldError unused170) {
        }
        try {
            iArr2[EnumC0505.STATUSPOINT.ordinal()] = 10;
        } catch (NoSuchFieldError unused171) {
        }
        try {
            iArr2[EnumC0505.STR.ordinal()] = 14;
        } catch (NoSuchFieldError unused172) {
        }
        try {
            iArr2[EnumC0505.SUBDEFELE.ordinal()] = 215;
        } catch (NoSuchFieldError unused173) {
        }
        try {
            iArr2[EnumC0505.SUBELE.ordinal()] = 80;
        } catch (NoSuchFieldError unused174) {
        }
        try {
            iArr2[EnumC0505.SUBRACE.ordinal()] = 81;
        } catch (NoSuchFieldError unused175) {
        }
        try {
            iArr2[EnumC0505.SUBRACE2.ordinal()] = 195;
        } catch (NoSuchFieldError unused176) {
        }
        try {
            iArr2[EnumC0505.SUBSIZE.ordinal()] = 189;
        } catch (NoSuchFieldError unused177) {
        }
        try {
            iArr2[EnumC0505.UAGI.ordinal()] = 34;
        } catch (NoSuchFieldError unused178) {
        }
        try {
            iArr2[EnumC0505.UDEX.ordinal()] = 37;
        } catch (NoSuchFieldError unused179) {
        }
        try {
            iArr2[EnumC0505.UINT.ordinal()] = 36;
        } catch (NoSuchFieldError unused180) {
        }
        try {
            iArr2[EnumC0505.ULUK.ordinal()] = 38;
        } catch (NoSuchFieldError unused181) {
        }
        try {
            iArr2[EnumC0505.UNBREAKABLE.ordinal()] = 61;
        } catch (NoSuchFieldError unused182) {
        }
        try {
            iArr2[EnumC0505.UNBREAKABLE_ARMOR.ordinal()] = 172;
        } catch (NoSuchFieldError unused183) {
        }
        try {
            iArr2[EnumC0505.UNBREAKABLE_GARMENT.ordinal()] = 120;
        } catch (NoSuchFieldError unused184) {
        }
        try {
            iArr2[EnumC0505.UNBREAKABLE_HELM.ordinal()] = 173;
        } catch (NoSuchFieldError unused185) {
        }
        try {
            iArr2[EnumC0505.UNBREAKABLE_SHIELD.ordinal()] = 174;
        } catch (NoSuchFieldError unused186) {
        }
        try {
            iArr2[EnumC0505.UNBREAKABLE_SHOES.ordinal()] = 196;
        } catch (NoSuchFieldError unused187) {
        }
        try {
            iArr2[EnumC0505.UNBREAKABLE_WEAPON.ordinal()] = 171;
        } catch (NoSuchFieldError unused188) {
        }
        try {
            iArr2[EnumC0505.UNSTRIPABLE.ordinal()] = 182;
        } catch (NoSuchFieldError unused189) {
        }
        try {
            iArr2[EnumC0505.UNSTRIPABLE_ARMOR.ordinal()] = 198;
        } catch (NoSuchFieldError unused190) {
        }
        try {
            iArr2[EnumC0505.UNSTRIPABLE_HELM.ordinal()] = 199;
        } catch (NoSuchFieldError unused191) {
        }
        try {
            iArr2[EnumC0505.UNSTRIPABLE_SHIELD.ordinal()] = 200;
        } catch (NoSuchFieldError unused192) {
        }
        try {
            iArr2[EnumC0505.UNSTRIPABLE_WEAPON.ordinal()] = 197;
        } catch (NoSuchFieldError unused193) {
        }
        try {
            iArr2[EnumC0505.UPPER.ordinal()] = 57;
        } catch (NoSuchFieldError unused194) {
        }
        try {
            iArr2[EnumC0505.USTR.ordinal()] = 33;
        } catch (NoSuchFieldError unused195) {
        }
        try {
            iArr2[EnumC0505.UVIT.ordinal()] = 35;
        } catch (NoSuchFieldError unused196) {
        }
        try {
            iArr2[EnumC0505.VANISH_RATE.ordinal()] = 205;
        } catch (NoSuchFieldError unused197) {
        }
        try {
            iArr2[EnumC0505.VIT.ordinal()] = 16;
        } catch (NoSuchFieldError unused198) {
        }
        try {
            iArr2[EnumC0505.WEAPON_ATK.ordinal()] = 151;
        } catch (NoSuchFieldError unused199) {
        }
        try {
            iArr2[EnumC0505.WEAPON_ATK_RATE.ordinal()] = 152;
        } catch (NoSuchFieldError unused200) {
        }
        try {
            iArr2[EnumC0505.WEAPON_COMA_ELE.ordinal()] = 135;
        } catch (NoSuchFieldError unused201) {
        }
        try {
            iArr2[EnumC0505.WEAPON_COMA_RACE.ordinal()] = 136;
        } catch (NoSuchFieldError unused202) {
        }
        try {
            iArr2[EnumC0505.WEIGHT.ordinal()] = 25;
        } catch (NoSuchFieldError unused203) {
        }
        try {
            iArr2[EnumC0505.ZENY.ordinal()] = 21;
        } catch (NoSuchFieldError unused204) {
        }
        try {
            iArr2[EnumC0505._0a.ordinal()] = 11;
        } catch (NoSuchFieldError unused205) {
        }
        try {
            iArr2[EnumC0505._1a.ordinal()] = 27;
        } catch (NoSuchFieldError unused206) {
        }
        try {
            iArr2[EnumC0505._1b.ordinal()] = 28;
        } catch (NoSuchFieldError unused207) {
        }
        try {
            iArr2[EnumC0505._1c.ordinal()] = 29;
        } catch (NoSuchFieldError unused208) {
        }
        try {
            iArr2[EnumC0505._1d.ordinal()] = 30;
        } catch (NoSuchFieldError unused209) {
        }
        try {
            iArr2[EnumC0505._1e.ordinal()] = 31;
        } catch (NoSuchFieldError unused210) {
        }
        try {
            iArr2[EnumC0505._1f.ordinal()] = 32;
        } catch (NoSuchFieldError unused211) {
        }
        try {
            iArr2[EnumC0505._26.ordinal()] = 39;
        } catch (NoSuchFieldError unused212) {
        }
        try {
            iArr2[EnumC0505._27.ordinal()] = 40;
        } catch (NoSuchFieldError unused213) {
        }
        try {
            iArr2[EnumC0505._28.ordinal()] = 41;
        } catch (NoSuchFieldError unused214) {
        }
        try {
            iArr2[EnumC0505._36.ordinal()] = 55;
        } catch (NoSuchFieldError unused215) {
        }
        f7927 = iArr2;
        return iArr2;
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 176;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        my myVar = oc.f3250;
        if ((myVar == my.MOTR || myVar == my.all) && C0358.f6667.f4771 == pj.aux.MOTR) {
            i3 ^= -1943404982;
        }
        if (z) {
            return;
        }
        m1483(this, s, i3);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1483(ub ubVar, short s, int i) {
        mg mgVar = C0358.f6669.f2048.f1551;
        C1035 c1035 = C0358.f6664.f2004;
        EnumC0505 enumC0505M1356 = EnumC0505.m1356(s);
        if (enumC0505M1356 == null) {
            nz.m907("unexpected status type " + ((int) s));
            return;
        }
        if (c1035 == null) {
            return;
        }
        switch (m1482()[enumC0505M1356.ordinal()]) {
            case 1:
                c1035.f8347 = i;
                break;
            case 2:
                c1035.f8591 = i;
                C0358.f6674.f42.f1781.m477(c1035);
                break;
            case 3:
                c1035.f8630 = i;
                C0358.f6674.f42.f1781.m476(c1035);
                break;
            case 4:
                c1035.f8344 = i;
                break;
            case 5:
                c1035.f8345 = i;
                C0698 c0698 = C0358.f6674.f42.f1792;
                cv cvVar = C0358.f6685;
                int i2 = c1035.f8345 < 0 ? 665 : 666;
                String strM649 = C0358.f6687.m649(i2);
                c0698.m1432(String.format(strM649 == null ? "MSG" + i2 : strM649, Integer.valueOf(-c1035.f8345)), 16776960);
                if (mgVar != null) {
                    mgVar.m832();
                    break;
                }
                break;
            case 6:
                c1035.f8346 = i;
                if (C0358.f6669.f2048.f1551 != null) {
                    C0358.f6669.f2048.f1551.f2100.m482(c1035.f8346, c1035.f8358);
                }
                C0358.f6674.f42.f1781.m472(c1035);
                break;
            case 7:
                c1035.f8358 = i;
                if (C0358.f6669.f2048.f1551 != null) {
                    C0358.f6669.f2048.f1551.f2100.m482(c1035.f8346, c1035.f8358);
                }
                C0358.f6674.f42.f1781.m472(c1035);
                break;
            case 8:
                c1035.f8364 = i;
                if (C0358.f6669.f2048.f1551 != null) {
                    C0358.f6669.f2048.f1551.f2095.m482(c1035.f8364, c1035.f8356);
                }
                C0358.f6674.f42.f1781.m473(c1035);
                break;
            case 9:
                c1035.f8356 = i;
                if (C0358.f6669.f2048.f1551 != null) {
                    C0358.f6669.f2048.f1551.f2095.m482(c1035.f8364, c1035.f8356);
                }
                C0358.f6674.f42.f1781.m473(c1035);
                break;
            case 10:
                c1035.f8624 = i;
                break;
            case 11:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 39:
            case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
            case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
            case 55:
            default:
                throw new uz(ubVar);
            case 12:
                C0358.f6663.m1535("levelup", 1.0f);
                if (c1035.f8367 != 0 && i > c1035.f8367) {
                    Toast.makeText(C0358.f6674, "Congratulations!! You have gained Level " + i + "!!\nUse status window to become stronger.", 1).show();
                }
                c1035.f8367 = i;
                C0358.f6674.f42.f1781.m479(c1035);
                break;
            case 13:
                int i3 = c1035.f8621;
                c1035.f8621 = i;
                if ((i3 == 0 && i != 0) || (i3 != 0 && i == 0)) {
                    C0358.f6674.f42.f1800.f1478 = hj.EnumC0047.SKILL_ME;
                    break;
                }
            case 14:
                c1035.f8626 = i;
                break;
            case 15:
                c1035.f8615 = i;
                break;
            case 16:
                c1035.f8614 = i;
                break;
            case 17:
                c1035.f8608 = i;
                break;
            case 18:
                c1035.f8580 = i;
                break;
            case 19:
                c1035.f8612 = i;
                break;
            case 20:
                c1035.f2001 = i;
                ch chVar = C0358.f6674.f42.f1781;
                lo.C0060 c0060 = C0358.f6685.f1030.f985.f2006.get(Integer.valueOf(c1035.f2001));
                chVar.f892.setText(c0060 != null ? c0060.f2013 : "Poring");
                break;
            case 21:
                c1035.f8636 = i;
                C0358.f6674.f42.f1781.m474(c1035);
                break;
            case 22:
                c1035.f803 = (byte) i;
                break;
            case 23:
                c1035.f8619 = i;
                break;
            case 24:
                c1035.f8633 = i;
                break;
            case 25:
                c1035.f8639 = i;
                C0358.f6674.f42.f1781.m475(c1035);
                break;
            case 26:
                c1035.f8643 = i;
                C0358.f6674.f42.f1781.m475(c1035);
                break;
            case 33:
                c1035.f8581 = i;
                break;
            case 34:
                c1035.f8582 = i;
                break;
            case 35:
                c1035.f8583 = i;
                break;
            case 36:
                c1035.f8584 = i;
                break;
            case 37:
                c1035.f8585 = i;
                break;
            case 38:
                c1035.f8586 = i;
                break;
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                c1035.f8620 = i;
                break;
            case 43:
                c1035.f8634 = i;
                break;
            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                c1035.f8629 = i;
                break;
            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                c1035.f8597 = i;
                break;
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                c1035.f8598 = i;
                break;
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                c1035.f8599 = i;
                break;
            case 48:
                c1035.f8623 = i;
                break;
            case 49:
                c1035.f8600 = i;
                break;
            case 50:
                c1035.f8601 = i;
                break;
            case 51:
                c1035.f8602 = i;
                break;
            case 52:
                c1035.f8603 = i;
                break;
            case 53:
                c1035.f8617 = i;
                break;
            case 54:
                c1035.f8604 = i;
                break;
            case 56:
                if (c1035.f8631 != 0 && i > c1035.f8631) {
                    if (c1035.f2001 == EnumC0134.NOVICE.f6499 && c1035.f8631 == 10) {
                        Toast.makeText(C0358.f6674, "Congratulations!! You have gained Job Level " + i + "!!\nYou can now become a First Class Character!.", 1).show();
                    } else if (EnumC0134.m1250(c1035.f2001).m1256().m1619() != null && c1035.f8631 == 40) {
                        Toast.makeText(C0358.f6674, "Congratulations!! You have gained Job Level " + i + "!!\nYou can now become a Second Class Character!.", 1).show();
                    } else {
                        Toast.makeText(C0358.f6674, "Congratulations!! You have gained Job Level " + i + "!!\nUse skills window to learn new skills.", 1).show();
                    }
                }
                c1035.f8631 = i;
                C0358.f6674.f42.f1781.m478(c1035);
                break;
            case 57:
                c1035.f8605 = i;
                break;
            case 58:
                c1035.f8610 = i;
                break;
            case 59:
                if (c1035.f8352 != i && mgVar != null) {
                    mgVar.m837(i, false);
                    break;
                }
                break;
            case 60:
                c1035.f8606 = i;
                break;
            case 61:
                c1035.f8611 = i;
                break;
        }
        C0358.f6674.f42.f1740.m675();
        new StringBuilder("Updatestatus: ").append(enumC0505M1356).append(" -> ").append(i);
    }
}
