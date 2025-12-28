package o;

import android.support.v4.media.TransportMediator;
import android.support.v4.view.MotionEventCompat;
import org.apache.commons.net.finger.FingerClient;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.imap.IMAP;
import org.apache.commons.net.nntp.NNTP;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.apache.commons.net.tftp.TFTP;
import org.apache.http.HttpStatus;

/* renamed from: o.đ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum EnumC0134 {
    NOVICE(0),
    SWORDMAN,
    MAGE,
    ARCHER,
    ACOLYTE,
    MERCHANT,
    THIEF,
    KNIGHT,
    PRIEST,
    WIZARD,
    BLACKSMITH,
    HUNTER,
    ASSASSIN,
    KNIGHT2,
    CRUSADER,
    MONK,
    SAGE,
    ROGUE,
    ALCHEMIST,
    BARD,
    DANCER,
    CRUSADER2,
    WEDDING,
    SUPER_NOVICE,
    GUNSLINGER,
    NINJA,
    XMAS,
    SUMMER,
    HANBOK,
    OKTOBERFEST,
    MAX_BASIC,
    NOVICE_HIGH(4001),
    SWORDMAN_HIGH,
    MAGE_HIGH,
    ARCHER_HIGH,
    ACOLYTE_HIGH,
    MERCHANT_HIGH,
    THIEF_HIGH,
    LORD_KNIGHT,
    HIGH_PRIEST,
    HIGH_WIZARD,
    WHITESMITH,
    SNIPER,
    ASSASSIN_CROSS,
    LORD_KNIGHT2,
    PALADIN,
    CHAMPION,
    PROFESSOR,
    STALKER,
    CREATOR,
    CLOWN,
    GYPSY,
    PALADIN2,
    BABY,
    BABY_SWORDMAN,
    BABY_MAGE,
    BABY_ARCHER,
    BABY_ACOLYTE,
    BABY_MERCHANT,
    BABY_THIEF,
    BABY_KNIGHT,
    BABY_PRIEST,
    BABY_WIZARD,
    BABY_BLACKSMITH,
    BABY_HUNTER,
    BABY_ASSASSIN,
    BABY_KNIGHT2,
    BABY_CRUSADER,
    BABY_MONK,
    BABY_SAGE,
    BABY_ROGUE,
    BABY_ALCHEMIST,
    BABY_BARD,
    BABY_DANCER,
    BABY_CRUSADER2,
    SUPER_BABY,
    TAEKWON,
    STAR_GLADIATOR,
    STAR_GLADIATOR2,
    SOUL_LINKER,
    GANGSI,
    DEATH_KNIGHT,
    DARK_COLLECTOR,
    RUNE_KNIGHT(4054),
    WARLOCK,
    RANGER,
    ARCH_BISHOP,
    MECHANIC,
    GUILLOTINE_CROSS,
    RUNE_KNIGHT_T,
    WARLOCK_T,
    RANGER_T,
    ARCH_BISHOP_T,
    MECHANIC_T,
    GUILLOTINE_CROSS_T,
    ROYAL_GUARD,
    SORCERER,
    MINSTREL,
    WANDERER,
    SURA,
    GENETIC,
    SHADOW_CHASER,
    ROYAL_GUARD_T,
    SORCERER_T,
    MINSTREL_T,
    WANDERER_T,
    SURA_T,
    GENETIC_T,
    SHADOW_CHASER_T,
    RUNE_KNIGHT2,
    RUNE_KNIGHT_T2,
    ROYAL_GUARD2,
    ROYAL_GUARD_T2,
    RANGER2,
    RANGER_T2,
    MECHANIC2,
    MECHANIC_T2,
    BABY_RUNE(4096),
    BABY_WARLOCK,
    BABY_RANGER,
    BABY_BISHOP,
    BABY_MECHANIC,
    BABY_CROSS,
    BABY_GUARD,
    BABY_SORCERER,
    BABY_MINSTREL,
    BABY_WANDERER,
    BABY_SURA,
    BABY_GENETIC,
    BABY_CHASER,
    BABY_RUNE2,
    BABY_GUARD2,
    BABY_RANGER2,
    BABY_MECHANIC2,
    FROG_NINJA(4114),
    PECO_GUNNER(4115),
    PECO_SWORD(4116),
    FROG_LINKER(4117),
    PIG_WHITESMITH(4118),
    PIG_MERCHANT(4119),
    PIG_GENETIC(4120),
    PIG_CREATOR(4121),
    OSTRICH_ARCHER(4122),
    PORING_STAR(4123),
    PORING_NOVICE(4124),
    SHEEP_MONK(4125),
    SHEEP_ACO(4126),
    SHEEP_SURA(4127),
    PORING_SNOVICE(4128),
    SHEEP_ARCB(4129),
    FOX_MAGICIAN(4130),
    FOX_SAGE(4131),
    FOX_SORCERER(4132),
    FOX_WARLOCK(4133),
    FOX_WIZ(4134),
    FOX_PROF(4135),
    FOX_HWIZ(4136),
    PIG_ALCHE(4137),
    PIG_BLACKSMITH(4138),
    SHEEP_CHAMP(4139),
    DOG_G_CROSS(4140),
    DOG_THIEF(4141),
    DOG_ROGUE(4142),
    DOG_CHASER(4143),
    DOG_STALKER(4144),
    DOG_ASSASSIN(4145),
    DOG_ASSA_X(4146),
    OSTRICH_DANCER(4147),
    OSTRICH_MINSTREL(4148),
    OSTRICH_BARD(4149),
    OSTRICH_SNIPER(4150),
    OSTRICH_WANDER(4151),
    OSTRICH_GIPSI(4152),
    OSTRICH_CROWN(4153),
    OSTRICH_HUNTER(4154),
    PORING_TAEKWON(4155),
    SHEEP_PRIEST(4156),
    SHEEP_HPRIEST(4157),
    PORING_NOVICE_B(4158),
    PECO_SWORD_B(4159),
    FOX_MAGICIAN_B(4160),
    OSTRICH_ARCHER_B(4161),
    SHEEP_ACO_B(4162),
    PIG_MERCHANT_B(4163),
    OSTRICH_HUNTER_B(4164),
    DOG_ASSASSIN_B(4165),
    SHEEP_MONK_B(4166),
    FOX_SAGE_B(4167),
    DOG_ROGUE_B(4168),
    PIG_ALCHE_B(4169),
    OSTRICH_BARD_B(4170),
    OSTRICH_DANCER_B(4171),
    PORING_SNOVICE_B(4172),
    FOX_WARLOCK_B(4173),
    SHEEP_ARCB_B(4174),
    DOG_G_CROSS_B(4175),
    FOX_SORCERER_B(4176),
    OSTRICH_MINSTREL_B(4177),
    OSTRICH_WANDER_B(4178),
    SHEEP_SURA_B(4179),
    PIG_GENETIC_B(4180),
    DOG_THIEF_B(4181),
    DOG_CHASER_B(4182),
    PORING_NOVICE_H(4183),
    PECO_SWORD_H(4184),
    FOX_MAGICIAN_H(4185),
    OSTRICH_ARCHER_H(4186),
    SHEEP_ACO_H(4187),
    PIG_MERCHANT_H(4188),
    DOG_THIEF_H(4189),
    SUPER_NOVICE_E(4190),
    SUPER_BABY_E,
    PORING_SNOVICE2(4192),
    PORING_SNOVICE2_B(4193),
    SHEEP_PRIEST_B(4194),
    FOX_WIZ_B(4195),
    PIG_MECHANIC(4197),
    OSTRICH_RANGER,
    LION_KNIGHT,
    LION_KNIGHT_H,
    LION_ROYAL_GUARD,
    LION_RUNE_KNIGHT,
    LION_CRUSADER,
    LION_CRUSADER_H,
    PIG_MECHANIC_B(4205),
    OSTRICH_RANGER_B(4206),
    LION_KNIGHT_B,
    LION_ROYAL_GUARD_B,
    LION_RUNE_KNIGHT_B,
    LION_CRUSADER_B,
    KAGEROU(4211),
    OBORO,
    FROG_KAGEROU(4213),
    FROG_OBORO(4214),
    REBELLION(4215),
    PECO_REBELLION(41201),
    SUMMONER(4218),
    MAX,
    GAMEMASTER(99999);


    /* renamed from: Ǳ, reason: contains not printable characters */
    static EnumC0134[] f6369;

    /* renamed from: ǲ, reason: contains not printable characters */
    private static /* synthetic */ int[] f6370;

    /* renamed from: 䑎, reason: contains not printable characters */
    static EnumC0134[] f6419;

    /* renamed from: ǯ, reason: contains not printable characters */
    int f6499;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0134[] valuesCustom() {
        EnumC0134[] enumC0134ArrValuesCustom = values();
        int length = enumC0134ArrValuesCustom.length;
        EnumC0134[] enumC0134Arr = new EnumC0134[length];
        System.arraycopy(enumC0134ArrValuesCustom, 0, enumC0134Arr, 0, length);
        return enumC0134Arr;
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    private static /* synthetic */ int[] m1249() {
        int[] iArr = f6370;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[valuesCustom().length];
        try {
            iArr2[ACOLYTE.ordinal()] = 5;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[ACOLYTE_HIGH.ordinal()] = 36;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[ALCHEMIST.ordinal()] = 19;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ARCHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ARCHER_HIGH.ordinal()] = 35;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ARCH_BISHOP.ordinal()] = 87;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ARCH_BISHOP_T.ordinal()] = 93;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ASSASSIN.ordinal()] = 13;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ASSASSIN_CROSS.ordinal()] = 44;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[BABY.ordinal()] = 54;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[BABY_ACOLYTE.ordinal()] = 58;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[BABY_ALCHEMIST.ordinal()] = 72;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[BABY_ARCHER.ordinal()] = 57;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[BABY_ASSASSIN.ordinal()] = 66;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[BABY_BARD.ordinal()] = 73;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[BABY_BISHOP.ordinal()] = 121;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[BABY_BLACKSMITH.ordinal()] = 64;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[BABY_CHASER.ordinal()] = 130;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[BABY_CROSS.ordinal()] = 123;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[BABY_CRUSADER.ordinal()] = 68;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[BABY_CRUSADER2.ordinal()] = 75;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[BABY_DANCER.ordinal()] = 74;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[BABY_GENETIC.ordinal()] = 129;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[BABY_GUARD.ordinal()] = 124;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[BABY_GUARD2.ordinal()] = 132;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[BABY_HUNTER.ordinal()] = 65;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[BABY_KNIGHT.ordinal()] = 61;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[BABY_KNIGHT2.ordinal()] = 67;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[BABY_MAGE.ordinal()] = 56;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[BABY_MECHANIC.ordinal()] = 122;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[BABY_MECHANIC2.ordinal()] = 134;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[BABY_MERCHANT.ordinal()] = 59;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[BABY_MINSTREL.ordinal()] = 126;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[BABY_MONK.ordinal()] = 69;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[BABY_PRIEST.ordinal()] = 62;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[BABY_RANGER.ordinal()] = 120;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[BABY_RANGER2.ordinal()] = 133;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr2[BABY_ROGUE.ordinal()] = 71;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr2[BABY_RUNE.ordinal()] = 118;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr2[BABY_RUNE2.ordinal()] = 131;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr2[BABY_SAGE.ordinal()] = 70;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr2[BABY_SORCERER.ordinal()] = 125;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr2[BABY_SURA.ordinal()] = 128;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr2[BABY_SWORDMAN.ordinal()] = 55;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr2[BABY_THIEF.ordinal()] = 60;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr2[BABY_WANDERER.ordinal()] = 127;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr2[BABY_WARLOCK.ordinal()] = 119;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr2[BABY_WIZARD.ordinal()] = 63;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr2[BARD.ordinal()] = 20;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr2[BLACKSMITH.ordinal()] = 11;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr2[CHAMPION.ordinal()] = 47;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr2[CLOWN.ordinal()] = 51;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr2[CREATOR.ordinal()] = 50;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr2[CRUSADER.ordinal()] = 15;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr2[CRUSADER2.ordinal()] = 22;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr2[DANCER.ordinal()] = 21;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr2[DARK_COLLECTOR.ordinal()] = 83;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr2[DEATH_KNIGHT.ordinal()] = 82;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr2[DOG_ASSASSIN.ordinal()] = 166;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr2[DOG_ASSASSIN_B.ordinal()] = 186;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr2[DOG_ASSA_X.ordinal()] = 167;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr2[DOG_CHASER.ordinal()] = 164;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr2[DOG_CHASER_B.ordinal()] = 203;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr2[DOG_G_CROSS.ordinal()] = 161;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr2[DOG_G_CROSS_B.ordinal()] = 196;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr2[DOG_ROGUE.ordinal()] = 163;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr2[DOG_ROGUE_B.ordinal()] = 189;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr2[DOG_STALKER.ordinal()] = 165;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr2[DOG_THIEF.ordinal()] = 162;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr2[DOG_THIEF_B.ordinal()] = 202;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr2[DOG_THIEF_H.ordinal()] = 210;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr2[FOX_HWIZ.ordinal()] = 157;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr2[FOX_MAGICIAN.ordinal()] = 151;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            iArr2[FOX_MAGICIAN_B.ordinal()] = 181;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr2[FOX_MAGICIAN_H.ordinal()] = 206;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            iArr2[FOX_PROF.ordinal()] = 156;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            iArr2[FOX_SAGE.ordinal()] = 152;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            iArr2[FOX_SAGE_B.ordinal()] = 188;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            iArr2[FOX_SORCERER.ordinal()] = 153;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            iArr2[FOX_SORCERER_B.ordinal()] = 197;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            iArr2[FOX_WARLOCK.ordinal()] = 154;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            iArr2[FOX_WARLOCK_B.ordinal()] = 194;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            iArr2[FOX_WIZ.ordinal()] = 155;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            iArr2[FOX_WIZ_B.ordinal()] = 216;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            iArr2[FROG_KAGEROU.ordinal()] = 233;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            iArr2[FROG_LINKER.ordinal()] = 138;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            iArr2[FROG_NINJA.ordinal()] = 135;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            iArr2[FROG_OBORO.ordinal()] = 234;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            iArr2[GAMEMASTER.ordinal()] = 239;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            iArr2[GANGSI.ordinal()] = 81;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            iArr2[GENETIC.ordinal()] = 101;
        } catch (NoSuchFieldError unused91) {
        }
        try {
            iArr2[GENETIC_T.ordinal()] = 108;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            iArr2[GUILLOTINE_CROSS.ordinal()] = 89;
        } catch (NoSuchFieldError unused93) {
        }
        try {
            iArr2[GUILLOTINE_CROSS_T.ordinal()] = 95;
        } catch (NoSuchFieldError unused94) {
        }
        try {
            iArr2[GUNSLINGER.ordinal()] = 25;
        } catch (NoSuchFieldError unused95) {
        }
        try {
            iArr2[GYPSY.ordinal()] = 52;
        } catch (NoSuchFieldError unused96) {
        }
        try {
            iArr2[HANBOK.ordinal()] = 29;
        } catch (NoSuchFieldError unused97) {
        }
        try {
            iArr2[HIGH_PRIEST.ordinal()] = 40;
        } catch (NoSuchFieldError unused98) {
        }
        try {
            iArr2[HIGH_WIZARD.ordinal()] = 41;
        } catch (NoSuchFieldError unused99) {
        }
        try {
            iArr2[HUNTER.ordinal()] = 12;
        } catch (NoSuchFieldError unused100) {
        }
        try {
            iArr2[KAGEROU.ordinal()] = 231;
        } catch (NoSuchFieldError unused101) {
        }
        try {
            iArr2[KNIGHT.ordinal()] = 8;
        } catch (NoSuchFieldError unused102) {
        }
        try {
            iArr2[KNIGHT2.ordinal()] = 14;
        } catch (NoSuchFieldError unused103) {
        }
        try {
            iArr2[LION_CRUSADER.ordinal()] = 223;
        } catch (NoSuchFieldError unused104) {
        }
        try {
            iArr2[LION_CRUSADER_B.ordinal()] = 230;
        } catch (NoSuchFieldError unused105) {
        }
        try {
            iArr2[LION_CRUSADER_H.ordinal()] = 224;
        } catch (NoSuchFieldError unused106) {
        }
        try {
            iArr2[LION_KNIGHT.ordinal()] = 219;
        } catch (NoSuchFieldError unused107) {
        }
        try {
            iArr2[LION_KNIGHT_B.ordinal()] = 227;
        } catch (NoSuchFieldError unused108) {
        }
        try {
            iArr2[LION_KNIGHT_H.ordinal()] = 220;
        } catch (NoSuchFieldError unused109) {
        }
        try {
            iArr2[LION_ROYAL_GUARD.ordinal()] = 221;
        } catch (NoSuchFieldError unused110) {
        }
        try {
            iArr2[LION_ROYAL_GUARD_B.ordinal()] = 228;
        } catch (NoSuchFieldError unused111) {
        }
        try {
            iArr2[LION_RUNE_KNIGHT.ordinal()] = 222;
        } catch (NoSuchFieldError unused112) {
        }
        try {
            iArr2[LION_RUNE_KNIGHT_B.ordinal()] = 229;
        } catch (NoSuchFieldError unused113) {
        }
        try {
            iArr2[LORD_KNIGHT.ordinal()] = 39;
        } catch (NoSuchFieldError unused114) {
        }
        try {
            iArr2[LORD_KNIGHT2.ordinal()] = 45;
        } catch (NoSuchFieldError unused115) {
        }
        try {
            iArr2[MAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused116) {
        }
        try {
            iArr2[MAGE_HIGH.ordinal()] = 34;
        } catch (NoSuchFieldError unused117) {
        }
        try {
            iArr2[MAX.ordinal()] = 238;
        } catch (NoSuchFieldError unused118) {
        }
        try {
            iArr2[MAX_BASIC.ordinal()] = 31;
        } catch (NoSuchFieldError unused119) {
        }
        try {
            iArr2[MECHANIC.ordinal()] = 88;
        } catch (NoSuchFieldError unused120) {
        }
        try {
            iArr2[MECHANIC2.ordinal()] = 116;
        } catch (NoSuchFieldError unused121) {
        }
        try {
            iArr2[MECHANIC_T.ordinal()] = 94;
        } catch (NoSuchFieldError unused122) {
        }
        try {
            iArr2[MECHANIC_T2.ordinal()] = 117;
        } catch (NoSuchFieldError unused123) {
        }
        try {
            iArr2[MERCHANT.ordinal()] = 6;
        } catch (NoSuchFieldError unused124) {
        }
        try {
            iArr2[MERCHANT_HIGH.ordinal()] = 37;
        } catch (NoSuchFieldError unused125) {
        }
        try {
            iArr2[MINSTREL.ordinal()] = 98;
        } catch (NoSuchFieldError unused126) {
        }
        try {
            iArr2[MINSTREL_T.ordinal()] = 105;
        } catch (NoSuchFieldError unused127) {
        }
        try {
            iArr2[MONK.ordinal()] = 16;
        } catch (NoSuchFieldError unused128) {
        }
        try {
            iArr2[NINJA.ordinal()] = 26;
        } catch (NoSuchFieldError unused129) {
        }
        try {
            iArr2[NOVICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused130) {
        }
        try {
            iArr2[NOVICE_HIGH.ordinal()] = 32;
        } catch (NoSuchFieldError unused131) {
        }
        try {
            iArr2[OBORO.ordinal()] = 232;
        } catch (NoSuchFieldError unused132) {
        }
        try {
            iArr2[OKTOBERFEST.ordinal()] = 30;
        } catch (NoSuchFieldError unused133) {
        }
        try {
            iArr2[OSTRICH_ARCHER.ordinal()] = 143;
        } catch (NoSuchFieldError unused134) {
        }
        try {
            iArr2[OSTRICH_ARCHER_B.ordinal()] = 182;
        } catch (NoSuchFieldError unused135) {
        }
        try {
            iArr2[OSTRICH_ARCHER_H.ordinal()] = 207;
        } catch (NoSuchFieldError unused136) {
        }
        try {
            iArr2[OSTRICH_BARD.ordinal()] = 170;
        } catch (NoSuchFieldError unused137) {
        }
        try {
            iArr2[OSTRICH_BARD_B.ordinal()] = 191;
        } catch (NoSuchFieldError unused138) {
        }
        try {
            iArr2[OSTRICH_CROWN.ordinal()] = 174;
        } catch (NoSuchFieldError unused139) {
        }
        try {
            iArr2[OSTRICH_DANCER.ordinal()] = 168;
        } catch (NoSuchFieldError unused140) {
        }
        try {
            iArr2[OSTRICH_DANCER_B.ordinal()] = 192;
        } catch (NoSuchFieldError unused141) {
        }
        try {
            iArr2[OSTRICH_GIPSI.ordinal()] = 173;
        } catch (NoSuchFieldError unused142) {
        }
        try {
            iArr2[OSTRICH_HUNTER.ordinal()] = 175;
        } catch (NoSuchFieldError unused143) {
        }
        try {
            iArr2[OSTRICH_HUNTER_B.ordinal()] = 185;
        } catch (NoSuchFieldError unused144) {
        }
        try {
            iArr2[OSTRICH_MINSTREL.ordinal()] = 169;
        } catch (NoSuchFieldError unused145) {
        }
        try {
            iArr2[OSTRICH_MINSTREL_B.ordinal()] = 198;
        } catch (NoSuchFieldError unused146) {
        }
        try {
            iArr2[OSTRICH_RANGER.ordinal()] = 218;
        } catch (NoSuchFieldError unused147) {
        }
        try {
            iArr2[OSTRICH_RANGER_B.ordinal()] = 226;
        } catch (NoSuchFieldError unused148) {
        }
        try {
            iArr2[OSTRICH_SNIPER.ordinal()] = 171;
        } catch (NoSuchFieldError unused149) {
        }
        try {
            iArr2[OSTRICH_WANDER.ordinal()] = 172;
        } catch (NoSuchFieldError unused150) {
        }
        try {
            iArr2[OSTRICH_WANDER_B.ordinal()] = 199;
        } catch (NoSuchFieldError unused151) {
        }
        try {
            iArr2[PALADIN.ordinal()] = 46;
        } catch (NoSuchFieldError unused152) {
        }
        try {
            iArr2[PALADIN2.ordinal()] = 53;
        } catch (NoSuchFieldError unused153) {
        }
        try {
            iArr2[PECO_GUNNER.ordinal()] = 136;
        } catch (NoSuchFieldError unused154) {
        }
        try {
            iArr2[PECO_REBELLION.ordinal()] = 236;
        } catch (NoSuchFieldError unused155) {
        }
        try {
            iArr2[PECO_SWORD.ordinal()] = 137;
        } catch (NoSuchFieldError unused156) {
        }
        try {
            iArr2[PECO_SWORD_B.ordinal()] = 180;
        } catch (NoSuchFieldError unused157) {
        }
        try {
            iArr2[PECO_SWORD_H.ordinal()] = 205;
        } catch (NoSuchFieldError unused158) {
        }
        try {
            iArr2[PIG_ALCHE.ordinal()] = 158;
        } catch (NoSuchFieldError unused159) {
        }
        try {
            iArr2[PIG_ALCHE_B.ordinal()] = 190;
        } catch (NoSuchFieldError unused160) {
        }
        try {
            iArr2[PIG_BLACKSMITH.ordinal()] = 159;
        } catch (NoSuchFieldError unused161) {
        }
        try {
            iArr2[PIG_CREATOR.ordinal()] = 142;
        } catch (NoSuchFieldError unused162) {
        }
        try {
            iArr2[PIG_GENETIC.ordinal()] = 141;
        } catch (NoSuchFieldError unused163) {
        }
        try {
            iArr2[PIG_GENETIC_B.ordinal()] = 201;
        } catch (NoSuchFieldError unused164) {
        }
        try {
            iArr2[PIG_MECHANIC.ordinal()] = 217;
        } catch (NoSuchFieldError unused165) {
        }
        try {
            iArr2[PIG_MECHANIC_B.ordinal()] = 225;
        } catch (NoSuchFieldError unused166) {
        }
        try {
            iArr2[PIG_MERCHANT.ordinal()] = 140;
        } catch (NoSuchFieldError unused167) {
        }
        try {
            iArr2[PIG_MERCHANT_B.ordinal()] = 184;
        } catch (NoSuchFieldError unused168) {
        }
        try {
            iArr2[PIG_MERCHANT_H.ordinal()] = 209;
        } catch (NoSuchFieldError unused169) {
        }
        try {
            iArr2[PIG_WHITESMITH.ordinal()] = 139;
        } catch (NoSuchFieldError unused170) {
        }
        try {
            iArr2[PORING_NOVICE.ordinal()] = 145;
        } catch (NoSuchFieldError unused171) {
        }
        try {
            iArr2[PORING_NOVICE_B.ordinal()] = 179;
        } catch (NoSuchFieldError unused172) {
        }
        try {
            iArr2[PORING_NOVICE_H.ordinal()] = 204;
        } catch (NoSuchFieldError unused173) {
        }
        try {
            iArr2[PORING_SNOVICE.ordinal()] = 149;
        } catch (NoSuchFieldError unused174) {
        }
        try {
            iArr2[PORING_SNOVICE2.ordinal()] = 213;
        } catch (NoSuchFieldError unused175) {
        }
        try {
            iArr2[PORING_SNOVICE2_B.ordinal()] = 214;
        } catch (NoSuchFieldError unused176) {
        }
        try {
            iArr2[PORING_SNOVICE_B.ordinal()] = 193;
        } catch (NoSuchFieldError unused177) {
        }
        try {
            iArr2[PORING_STAR.ordinal()] = 144;
        } catch (NoSuchFieldError unused178) {
        }
        try {
            iArr2[PORING_TAEKWON.ordinal()] = 176;
        } catch (NoSuchFieldError unused179) {
        }
        try {
            iArr2[PRIEST.ordinal()] = 9;
        } catch (NoSuchFieldError unused180) {
        }
        try {
            iArr2[PROFESSOR.ordinal()] = 48;
        } catch (NoSuchFieldError unused181) {
        }
        try {
            iArr2[RANGER.ordinal()] = 86;
        } catch (NoSuchFieldError unused182) {
        }
        try {
            iArr2[RANGER2.ordinal()] = 114;
        } catch (NoSuchFieldError unused183) {
        }
        try {
            iArr2[RANGER_T.ordinal()] = 92;
        } catch (NoSuchFieldError unused184) {
        }
        try {
            iArr2[RANGER_T2.ordinal()] = 115;
        } catch (NoSuchFieldError unused185) {
        }
        try {
            iArr2[REBELLION.ordinal()] = 235;
        } catch (NoSuchFieldError unused186) {
        }
        try {
            iArr2[ROGUE.ordinal()] = 18;
        } catch (NoSuchFieldError unused187) {
        }
        try {
            iArr2[ROYAL_GUARD.ordinal()] = 96;
        } catch (NoSuchFieldError unused188) {
        }
        try {
            iArr2[ROYAL_GUARD2.ordinal()] = 112;
        } catch (NoSuchFieldError unused189) {
        }
        try {
            iArr2[ROYAL_GUARD_T.ordinal()] = 103;
        } catch (NoSuchFieldError unused190) {
        }
        try {
            iArr2[ROYAL_GUARD_T2.ordinal()] = 113;
        } catch (NoSuchFieldError unused191) {
        }
        try {
            iArr2[RUNE_KNIGHT.ordinal()] = 84;
        } catch (NoSuchFieldError unused192) {
        }
        try {
            iArr2[RUNE_KNIGHT2.ordinal()] = 110;
        } catch (NoSuchFieldError unused193) {
        }
        try {
            iArr2[RUNE_KNIGHT_T.ordinal()] = 90;
        } catch (NoSuchFieldError unused194) {
        }
        try {
            iArr2[RUNE_KNIGHT_T2.ordinal()] = 111;
        } catch (NoSuchFieldError unused195) {
        }
        try {
            iArr2[SAGE.ordinal()] = 17;
        } catch (NoSuchFieldError unused196) {
        }
        try {
            iArr2[SHADOW_CHASER.ordinal()] = 102;
        } catch (NoSuchFieldError unused197) {
        }
        try {
            iArr2[SHADOW_CHASER_T.ordinal()] = 109;
        } catch (NoSuchFieldError unused198) {
        }
        try {
            iArr2[SHEEP_ACO.ordinal()] = 147;
        } catch (NoSuchFieldError unused199) {
        }
        try {
            iArr2[SHEEP_ACO_B.ordinal()] = 183;
        } catch (NoSuchFieldError unused200) {
        }
        try {
            iArr2[SHEEP_ACO_H.ordinal()] = 208;
        } catch (NoSuchFieldError unused201) {
        }
        try {
            iArr2[SHEEP_ARCB.ordinal()] = 150;
        } catch (NoSuchFieldError unused202) {
        }
        try {
            iArr2[SHEEP_ARCB_B.ordinal()] = 195;
        } catch (NoSuchFieldError unused203) {
        }
        try {
            iArr2[SHEEP_CHAMP.ordinal()] = 160;
        } catch (NoSuchFieldError unused204) {
        }
        try {
            iArr2[SHEEP_HPRIEST.ordinal()] = 178;
        } catch (NoSuchFieldError unused205) {
        }
        try {
            iArr2[SHEEP_MONK.ordinal()] = 146;
        } catch (NoSuchFieldError unused206) {
        }
        try {
            iArr2[SHEEP_MONK_B.ordinal()] = 187;
        } catch (NoSuchFieldError unused207) {
        }
        try {
            iArr2[SHEEP_PRIEST.ordinal()] = 177;
        } catch (NoSuchFieldError unused208) {
        }
        try {
            iArr2[SHEEP_PRIEST_B.ordinal()] = 215;
        } catch (NoSuchFieldError unused209) {
        }
        try {
            iArr2[SHEEP_SURA.ordinal()] = 148;
        } catch (NoSuchFieldError unused210) {
        }
        try {
            iArr2[SHEEP_SURA_B.ordinal()] = 200;
        } catch (NoSuchFieldError unused211) {
        }
        try {
            iArr2[SNIPER.ordinal()] = 43;
        } catch (NoSuchFieldError unused212) {
        }
        try {
            iArr2[SORCERER.ordinal()] = 97;
        } catch (NoSuchFieldError unused213) {
        }
        try {
            iArr2[SORCERER_T.ordinal()] = 104;
        } catch (NoSuchFieldError unused214) {
        }
        try {
            iArr2[SOUL_LINKER.ordinal()] = 80;
        } catch (NoSuchFieldError unused215) {
        }
        try {
            iArr2[STALKER.ordinal()] = 49;
        } catch (NoSuchFieldError unused216) {
        }
        try {
            iArr2[STAR_GLADIATOR.ordinal()] = 78;
        } catch (NoSuchFieldError unused217) {
        }
        try {
            iArr2[STAR_GLADIATOR2.ordinal()] = 79;
        } catch (NoSuchFieldError unused218) {
        }
        try {
            iArr2[SUMMER.ordinal()] = 28;
        } catch (NoSuchFieldError unused219) {
        }
        try {
            iArr2[SUMMONER.ordinal()] = 237;
        } catch (NoSuchFieldError unused220) {
        }
        try {
            iArr2[SUPER_BABY.ordinal()] = 76;
        } catch (NoSuchFieldError unused221) {
        }
        try {
            iArr2[SUPER_BABY_E.ordinal()] = 212;
        } catch (NoSuchFieldError unused222) {
        }
        try {
            iArr2[SUPER_NOVICE.ordinal()] = 24;
        } catch (NoSuchFieldError unused223) {
        }
        try {
            iArr2[SUPER_NOVICE_E.ordinal()] = 211;
        } catch (NoSuchFieldError unused224) {
        }
        try {
            iArr2[SURA.ordinal()] = 100;
        } catch (NoSuchFieldError unused225) {
        }
        try {
            iArr2[SURA_T.ordinal()] = 107;
        } catch (NoSuchFieldError unused226) {
        }
        try {
            iArr2[SWORDMAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused227) {
        }
        try {
            iArr2[SWORDMAN_HIGH.ordinal()] = 33;
        } catch (NoSuchFieldError unused228) {
        }
        try {
            iArr2[TAEKWON.ordinal()] = 77;
        } catch (NoSuchFieldError unused229) {
        }
        try {
            iArr2[THIEF.ordinal()] = 7;
        } catch (NoSuchFieldError unused230) {
        }
        try {
            iArr2[THIEF_HIGH.ordinal()] = 38;
        } catch (NoSuchFieldError unused231) {
        }
        try {
            iArr2[WANDERER.ordinal()] = 99;
        } catch (NoSuchFieldError unused232) {
        }
        try {
            iArr2[WANDERER_T.ordinal()] = 106;
        } catch (NoSuchFieldError unused233) {
        }
        try {
            iArr2[WARLOCK.ordinal()] = 85;
        } catch (NoSuchFieldError unused234) {
        }
        try {
            iArr2[WARLOCK_T.ordinal()] = 91;
        } catch (NoSuchFieldError unused235) {
        }
        try {
            iArr2[WEDDING.ordinal()] = 23;
        } catch (NoSuchFieldError unused236) {
        }
        try {
            iArr2[WHITESMITH.ordinal()] = 42;
        } catch (NoSuchFieldError unused237) {
        }
        try {
            iArr2[WIZARD.ordinal()] = 10;
        } catch (NoSuchFieldError unused238) {
        }
        try {
            iArr2[XMAS.ordinal()] = 27;
        } catch (NoSuchFieldError unused239) {
        }
        f6370 = iArr2;
        return iArr2;
    }

    static {
        EnumC0134[] enumC0134ArrValuesCustom = valuesCustom();
        int i = -1;
        for (int i2 = 0; i2 < enumC0134ArrValuesCustom.length; i2++) {
            if (enumC0134ArrValuesCustom[i2].f6499 != 0) {
                i = enumC0134ArrValuesCustom[i2].f6499;
            } else {
                enumC0134ArrValuesCustom[i2].f6499 = i + 1;
                i++;
            }
        }
        f6419 = new EnumC0134[]{KNIGHT2, KNIGHT, CRUSADER2, CRUSADER, BABY_KNIGHT2, BABY_KNIGHT, BABY_CRUSADER2, BABY_CRUSADER, LORD_KNIGHT2, LORD_KNIGHT, PALADIN2, PALADIN, RUNE_KNIGHT2, RUNE_KNIGHT, RUNE_KNIGHT_T2, RUNE_KNIGHT_T, BABY_RUNE2, BABY_RUNE, ROYAL_GUARD2, ROYAL_GUARD, ROYAL_GUARD_T2, ROYAL_GUARD_T, BABY_GUARD2, BABY_GUARD, MECHANIC2, MECHANIC, MECHANIC_T2, MECHANIC_T, BABY_MECHANIC2, BABY_MECHANIC, RANGER2, RANGER, RANGER_T2, RANGER_T, BABY_RANGER2, BABY_RANGER};
        f6369 = new EnumC0134[]{FROG_NINJA, NINJA, PECO_GUNNER, GUNSLINGER, PECO_SWORD, SWORDMAN, PECO_SWORD_B, BABY_SWORDMAN, PECO_SWORD_H, SWORDMAN_HIGH, FROG_LINKER, SOUL_LINKER, PIG_WHITESMITH, WHITESMITH, PIG_MERCHANT, MERCHANT, PIG_MERCHANT_B, BABY_MERCHANT, PIG_MERCHANT_H, MERCHANT_HIGH, PIG_GENETIC, GENETIC, PIG_GENETIC, GENETIC_T, PIG_GENETIC_B, BABY_GENETIC, PIG_CREATOR, CREATOR, OSTRICH_ARCHER, ARCHER, OSTRICH_ARCHER_B, BABY_ARCHER, OSTRICH_ARCHER_H, ARCHER_HIGH, PORING_STAR, STAR_GLADIATOR, PORING_STAR, STAR_GLADIATOR2, PORING_NOVICE, NOVICE, PORING_NOVICE_B, BABY, PORING_NOVICE_H, NOVICE_HIGH, SHEEP_MONK, MONK, SHEEP_MONK_B, BABY_MONK, SHEEP_ACO, ACOLYTE, SHEEP_ACO_B, BABY_ACOLYTE, SHEEP_ACO_H, ACOLYTE_HIGH, SHEEP_SURA, SURA, SHEEP_SURA, SURA_T, SHEEP_SURA_B, BABY_SURA, PORING_SNOVICE, SUPER_NOVICE, PORING_SNOVICE2, SUPER_NOVICE_E, PORING_SNOVICE_B, SUPER_BABY, PORING_SNOVICE2_B, SUPER_BABY_E, SHEEP_ARCB, ARCH_BISHOP, SHEEP_ARCB_B, BABY_BISHOP, SHEEP_ARCB, ARCH_BISHOP_T, SHEEP_ARCB_B, BABY_BISHOP, FOX_MAGICIAN, MAGE, FOX_MAGICIAN_H, MAGE_HIGH, FOX_MAGICIAN_H, BABY_MAGE, FOX_SAGE, SAGE, FOX_SAGE_B, BABY_SAGE, FOX_SORCERER, SORCERER, FOX_SORCERER_B, BABY_SORCERER, FOX_SORCERER, SORCERER_T, FOX_WARLOCK, WARLOCK, FOX_WARLOCK, WARLOCK_T, FOX_WARLOCK, BABY_WARLOCK, FOX_WIZ, WIZARD, FOX_WIZ_B, BABY_WIZARD, FOX_PROF, PROFESSOR, FOX_HWIZ, HIGH_WIZARD, PIG_ALCHE, ALCHEMIST, PIG_ALCHE_B, BABY_ALCHEMIST, PIG_BLACKSMITH, BLACKSMITH, SHEEP_CHAMP, CHAMPION, DOG_G_CROSS, GUILLOTINE_CROSS, DOG_G_CROSS, GUILLOTINE_CROSS_T, DOG_G_CROSS_B, BABY_CROSS, DOG_THIEF, THIEF, DOG_THIEF_H, THIEF_HIGH, DOG_THIEF_B, BABY_THIEF, DOG_ROGUE, ROGUE, DOG_ROGUE_B, BABY_ROGUE, DOG_CHASER, SHADOW_CHASER, DOG_CHASER, SHADOW_CHASER_T, DOG_CHASER_B, BABY_CHASER, DOG_STALKER, STALKER, DOG_ASSASSIN, ASSASSIN, DOG_ASSASSIN_B, BABY_ASSASSIN, DOG_ASSA_X, ASSASSIN_CROSS, OSTRICH_DANCER, DANCER, OSTRICH_DANCER_B, BABY_DANCER, OSTRICH_MINSTREL, MINSTREL, OSTRICH_MINSTREL, MINSTREL_T, OSTRICH_MINSTREL_B, BABY_MINSTREL, OSTRICH_BARD, BARD, OSTRICH_BARD_B, BABY_BARD, OSTRICH_SNIPER, SNIPER, OSTRICH_WANDER, WANDERER, OSTRICH_WANDER, WANDERER_T, OSTRICH_WANDER_B, BABY_WANDERER, OSTRICH_GIPSI, GYPSY, OSTRICH_CROWN, CLOWN, OSTRICH_HUNTER, HUNTER, OSTRICH_HUNTER_B, BABY_HUNTER, PORING_TAEKWON, TAEKWON, SHEEP_PRIEST, PRIEST, SHEEP_PRIEST_B, BABY_PRIEST, SHEEP_HPRIEST, HIGH_PRIEST, PIG_MECHANIC, MECHANIC, PIG_MECHANIC, MECHANIC_T, PIG_MECHANIC_B, BABY_MECHANIC, OSTRICH_RANGER, RANGER, OSTRICH_RANGER, RANGER_T, OSTRICH_RANGER_B, BABY_RANGER, LION_KNIGHT, KNIGHT, LION_KNIGHT_B, BABY_KNIGHT, LION_KNIGHT_H, LORD_KNIGHT, LION_KNIGHT_H, LORD_KNIGHT, LION_ROYAL_GUARD, ROYAL_GUARD, LION_ROYAL_GUARD, ROYAL_GUARD_T, LION_ROYAL_GUARD_B, BABY_GUARD, LION_RUNE_KNIGHT, RUNE_KNIGHT, LION_RUNE_KNIGHT_B, BABY_RUNE, LION_RUNE_KNIGHT, RUNE_KNIGHT_T, LION_CRUSADER, CRUSADER, LION_CRUSADER_B, BABY_CRUSADER, LION_CRUSADER_H, PALADIN, FROG_KAGEROU, KAGEROU, FROG_OBORO, OBORO, PECO_REBELLION, REBELLION};
    }

    EnumC0134(int i) {
        this.f6499 = i;
    }

    EnumC0134() {
        this.f6499 = 0;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static boolean m1252(int i) {
        for (EnumC0134 enumC0134 : valuesCustom()) {
            if (enumC0134.f6499 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    static EnumC0134 m1251(int i) {
        EnumC0134[] enumC0134ArrValuesCustom = valuesCustom();
        for (int i2 = 0; i2 < enumC0134ArrValuesCustom.length; i2++) {
            if (enumC0134ArrValuesCustom[i2].f6499 == i) {
                return enumC0134ArrValuesCustom[i2];
            }
        }
        return null;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    static EnumC0134 m1250(int i) {
        EnumC0134[] enumC0134ArrValuesCustom = valuesCustom();
        for (int i2 = 0; i2 < enumC0134ArrValuesCustom.length; i2++) {
            if (enumC0134ArrValuesCustom[i2].f6499 == i) {
                return enumC0134ArrValuesCustom[i2];
            }
        }
        return NOVICE;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final EnumC1048 m1256() {
        switch (m1249()[ordinal()]) {
            case 1:
                return EnumC1048.NOVICE;
            case 2:
                return EnumC1048.SWORDMAN;
            case 3:
                return EnumC1048.MAGE;
            case 4:
                return EnumC1048.ARCHER;
            case 5:
                return EnumC1048.ACOLYTE;
            case 6:
                return EnumC1048.MERCHANT;
            case 7:
                return EnumC1048.THIEF;
            case 8:
            case 14:
                return EnumC1048.KNIGHT;
            case 9:
                return EnumC1048.PRIEST;
            case 10:
                return EnumC1048.WIZARD;
            case 11:
                return EnumC1048.BLACKSMITH;
            case 12:
                return EnumC1048.HUNTER;
            case 13:
                return EnumC1048.ASSASSIN;
            case 15:
            case 22:
                return EnumC1048.CRUSADER;
            case 16:
                return EnumC1048.MONK;
            case 17:
                return EnumC1048.SAGE;
            case 18:
                return EnumC1048.ROGUE;
            case 19:
                return EnumC1048.ALCHEMIST;
            case 20:
            case 21:
                return EnumC1048.BARDDANCER;
            case 23:
                return EnumC1048.WEDDING;
            case 24:
                return EnumC1048.SUPER_NOVICE;
            case 25:
                return EnumC1048.GUNSLINGER;
            case 26:
                return EnumC1048.NINJA;
            case 27:
                return EnumC1048.XMAS;
            case 28:
                return EnumC1048.SUMMER;
            case 29:
            case 30:
            case 31:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case IMAP.DEFAULT_PORT /* 143 */:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case FTPReply.FILE_STATUS_OK /* 150 */:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            case 198:
            case NNTPReply.DEBUG_OUTPUT /* 199 */:
            case 200:
            case 201:
            case 202:
            case HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION /* 203 */:
            case HttpStatus.SC_NO_CONTENT /* 204 */:
            case 205:
            case HttpStatus.SC_PARTIAL_CONTENT /* 206 */:
            case HttpStatus.SC_MULTI_STATUS /* 207 */:
            case 208:
            case 209:
            case 210:
            case FTPReply.FILE_STATUS /* 213 */:
            case 214:
            case FTPReply.NAME_SYSTEM_TYPE /* 215 */:
            case 216:
            case 217:
            case 218:
            case 219:
            case 220:
            case 221:
            case NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS /* 222 */:
            case NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY /* 223 */:
            case 224:
            case FTPReply.DATA_CONNECTION_OPEN /* 225 */:
            case FTPReply.CLOSING_DATA_CONNECTION /* 226 */:
            case FTPReply.ENTERING_PASSIVE_MODE /* 227 */:
            case 228:
            case FTPReply.ENTERING_EPSV_MODE /* 229 */:
            case 230:
            case 233:
            case FTPReply.SECURITY_DATA_EXCHANGE_COMPLETE /* 234 */:
            case TelnetCommand.EOF /* 236 */:
            default:
                return EnumC1048.NOVICE;
            case 32:
                return EnumC1048.NOVICE_HIGH;
            case 33:
                return EnumC1048.SWORDMAN_HIGH;
            case 34:
                return EnumC1048.MAGE_HIGH;
            case 35:
                return EnumC1048.ARCHER_HIGH;
            case 36:
                return EnumC1048.ACOLYTE_HIGH;
            case 37:
                return EnumC1048.MERCHANT_HIGH;
            case 38:
                return EnumC1048.THIEF_HIGH;
            case 39:
            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                return EnumC1048.LORD_KNIGHT;
            case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                return EnumC1048.HIGH_PRIEST;
            case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                return EnumC1048.HIGH_WIZARD;
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                return EnumC1048.WHITESMITH;
            case 43:
                return EnumC1048.SNIPER;
            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                return EnumC1048.ASSASSIN_CROSS;
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
            case 53:
                return EnumC1048.PALADIN;
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                return EnumC1048.CHAMPION;
            case 48:
                return EnumC1048.PROFESSOR;
            case 49:
                return EnumC1048.STALKER;
            case 50:
                return EnumC1048.CREATOR;
            case 51:
            case 52:
                return EnumC1048.CLOWNGYPSY;
            case 54:
                return EnumC1048.BABY;
            case 55:
                return EnumC1048.BABY_SWORDMAN;
            case 56:
                return EnumC1048.BABY_MAGE;
            case 57:
                return EnumC1048.BABY_ARCHER;
            case 58:
                return EnumC1048.BABY_ACOLYTE;
            case 59:
                return EnumC1048.BABY_MERCHANT;
            case 60:
                return EnumC1048.BABY_THIEF;
            case 61:
            case 67:
                return EnumC1048.BABY_KNIGHT;
            case 62:
                return EnumC1048.BABY_PRIEST;
            case 63:
                return EnumC1048.BABY_WIZARD;
            case 64:
                return EnumC1048.BABY_BLACKSMITH;
            case 65:
                return EnumC1048.BABY_HUNTER;
            case 66:
                return EnumC1048.BABY_ASSASSIN;
            case 68:
            case 75:
                return EnumC1048.BABY_CRUSADER;
            case TFTP.DEFAULT_PORT /* 69 */:
                return EnumC1048.BABY_MONK;
            case 70:
                return EnumC1048.BABY_SAGE;
            case 71:
                return EnumC1048.BABY_ROGUE;
            case 72:
                return EnumC1048.BABY_ALCHEMIST;
            case 73:
            case 74:
                return EnumC1048.BABY_BARDDANCER;
            case 76:
                return EnumC1048.SUPER_BABY;
            case 77:
                return EnumC1048.TAEKWON;
            case 78:
            case FingerClient.DEFAULT_PORT /* 79 */:
                return EnumC1048.STAR_GLADIATOR;
            case vh.f5370 /* 80 */:
                return EnumC1048.SOUL_LINKER;
            case 81:
                return EnumC1048.GANGSI;
            case 82:
                return EnumC1048.DEATH_KNIGHT;
            case 83:
                return EnumC1048.DARK_COLLECTOR;
            case 84:
            case 110:
                return EnumC1048.RUNE_KNIGHT;
            case 85:
                return EnumC1048.WARLOCK;
            case 86:
            case 114:
                return EnumC1048.RANGER;
            case 87:
                return EnumC1048.ARCH_BISHOP;
            case 88:
            case 116:
                return EnumC1048.MECHANIC;
            case 89:
                return EnumC1048.GUILLOTINE_CROSS;
            case 90:
            case 111:
                return EnumC1048.RUNE_KNIGHT_T;
            case 91:
                return EnumC1048.WARLOCK_T;
            case 92:
            case 115:
                return EnumC1048.RANGER_T;
            case 93:
                return EnumC1048.ARCH_BISHOP_T;
            case 94:
            case 117:
                return EnumC1048.MECHANIC_T;
            case 95:
                return EnumC1048.GUILLOTINE_CROSS_T;
            case 96:
            case 112:
                return EnumC1048.ROYAL_GUARD;
            case 97:
                return EnumC1048.SORCERER;
            case 98:
            case 99:
                return EnumC1048.MINSTRELWANDERER;
            case 100:
                return EnumC1048.SURA;
            case HttpStatus.SC_SWITCHING_PROTOCOLS /* 101 */:
                return EnumC1048.GENETIC;
            case HttpStatus.SC_PROCESSING /* 102 */:
                return EnumC1048.SHADOW_CHASER;
            case 103:
            case 113:
                return EnumC1048.ROYAL_GUARD_T;
            case 104:
                return EnumC1048.SORCERER_T;
            case 105:
            case 106:
                return EnumC1048.MINSTRELWANDERER_T;
            case 107:
                return EnumC1048.SURA_T;
            case 108:
                return EnumC1048.GENETIC_T;
            case 109:
                return EnumC1048.SHADOW_CHASER_T;
            case 118:
            case 131:
                return EnumC1048.BABY_RUNE;
            case NNTP.DEFAULT_PORT /* 119 */:
                return EnumC1048.BABY_WARLOCK;
            case FTPReply.SERVICE_NOT_READY /* 120 */:
            case 133:
                return EnumC1048.BABY_RANGER;
            case 121:
                return EnumC1048.BABY_BISHOP;
            case 122:
            case 134:
                return EnumC1048.BABY_MECHANIC;
            case 123:
                return EnumC1048.BABY_CROSS;
            case 124:
            case 132:
                return EnumC1048.BABY_GUARD;
            case FTPReply.DATA_CONNECTION_ALREADY_OPEN /* 125 */:
                return EnumC1048.BABY_SORCERER;
            case TransportMediator.KEYCODE_MEDIA_PLAY /* 126 */:
            case TransportMediator.KEYCODE_MEDIA_PAUSE /* 127 */:
                return EnumC1048.BABY_MINSTRELWANDERER;
            case 128:
                return EnumC1048.BABY_SURA;
            case 129:
                return EnumC1048.BABY_GENETIC;
            case TransportMediator.KEYCODE_MEDIA_RECORD /* 130 */:
                return EnumC1048.BABY_CHASER;
            case 211:
                return EnumC1048.SUPER_NOVICE_E;
            case FTPReply.DIRECTORY_STATUS /* 212 */:
                return EnumC1048.SUPER_BABY_E;
            case NNTPReply.NEW_NEWSGROUP_LIST_FOLLOWS /* 231 */:
            case 232:
                return EnumC1048.KAGEROU_OBORO;
            case 235:
                return EnumC1048.REBELLION;
            case TelnetCommand.SUSP /* 237 */:
                return EnumC1048.SUMMONER;
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final EnumC0134 m1254() {
        for (int i = 0; i < f6419.length; i += 2) {
            if (this == f6419[i] || this == f6419[i + 1]) {
                return f6419[i];
            }
        }
        return null;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final EnumC0134 m1255(boolean z) {
        for (int i = 0; i < f6369.length; i += 2) {
            if (this == f6369[i] || this == f6369[i + 1]) {
                return z ? f6369[i] : f6369[i + 1];
            }
        }
        return null;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final EnumC0765 m1253() {
        EnumC0134 enumC0134M1255 = this;
        if (m1255(true) == this) {
            enumC0134M1255 = m1255(false);
        }
        switch (m1249()[enumC0134M1255.ordinal()]) {
            case 20:
            case 51:
            case 73:
            case 98:
            case 105:
            case TransportMediator.KEYCODE_MEDIA_PLAY /* 126 */:
            case NNTPReply.NEW_NEWSGROUP_LIST_FOLLOWS /* 231 */:
                return EnumC0765.MALE;
            case 21:
            case 52:
            case 74:
            case 99:
            case 106:
            case TransportMediator.KEYCODE_MEDIA_PAUSE /* 127 */:
            case 232:
                return EnumC0765.FEMALE;
            default:
                return null;
        }
    }
}
