package o;

import android.support.v4.view.MotionEventCompat;
import org.apache.commons.net.finger.FingerClient;
import org.apache.commons.net.tftp.TFTP;
import org.apache.http.HttpStatus;

/* renamed from: o.띥, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum EnumC1048 {
    NOVICE,
    SWORDMAN,
    MAGE,
    ARCHER,
    ACOLYTE,
    MERCHANT,
    THIEF,
    SUPER_NOVICE,
    TAEKWON,
    WEDDING,
    GUNSLINGER,
    NINJA,
    XMAS,
    SUMMER,
    HANBOK,
    GANGSI,
    OKTOBERFEST,
    SUMMONER,
    KNIGHT(257),
    WIZARD,
    HUNTER,
    PRIEST,
    BLACKSMITH,
    ASSASSIN,
    SUPER_NOVICE_E,
    STAR_GLADIATOR,
    REBELLION(266),
    KAGEROU_OBORO(267),
    DEATH_KNIGHT(270),
    CRUSADER(513),
    SAGE,
    BARDDANCER,
    MONK,
    ALCHEMIST,
    ROGUE,
    SOUL_LINKER(520),
    DARK_COLLECTOR(526),
    NOVICE_HIGH(4096),
    SWORDMAN_HIGH,
    MAGE_HIGH,
    ARCHER_HIGH,
    ACOLYTE_HIGH,
    MERCHANT_HIGH,
    THIEF_HIGH,
    LORD_KNIGHT(4353),
    HIGH_WIZARD,
    SNIPER,
    HIGH_PRIEST,
    WHITESMITH,
    ASSASSIN_CROSS,
    PALADIN(4609),
    PROFESSOR,
    CLOWNGYPSY,
    CHAMPION,
    CREATOR,
    STALKER,
    BABY(8192),
    BABY_SWORDMAN,
    BABY_MAGE,
    BABY_ARCHER,
    BABY_ACOLYTE,
    BABY_MERCHANT,
    BABY_THIEF,
    SUPER_BABY,
    BABY_KNIGHT(8449),
    BABY_WIZARD,
    BABY_HUNTER,
    BABY_PRIEST,
    BABY_BLACKSMITH,
    BABY_ASSASSIN,
    SUPER_BABY_E,
    BABY_CRUSADER(8705),
    BABY_SAGE,
    BABY_BARDDANCER,
    BABY_MONK,
    BABY_ALCHEMIST,
    BABY_ROGUE,
    RUNE_KNIGHT(16641),
    WARLOCK,
    RANGER,
    ARCH_BISHOP,
    MECHANIC,
    GUILLOTINE_CROSS,
    ROYAL_GUARD(16897),
    SORCERER,
    MINSTRELWANDERER,
    SURA,
    GENETIC,
    SHADOW_CHASER,
    RUNE_KNIGHT_T(20737),
    WARLOCK_T,
    RANGER_T,
    ARCH_BISHOP_T,
    MECHANIC_T,
    GUILLOTINE_CROSS_T,
    ROYAL_GUARD_T(20993),
    SORCERER_T,
    MINSTRELWANDERER_T,
    SURA_T,
    GENETIC_T,
    SHADOW_CHASER_T,
    BABY_RUNE(24833),
    BABY_WARLOCK,
    BABY_RANGER,
    BABY_BISHOP,
    BABY_MECHANIC,
    BABY_CROSS,
    BABY_GUARD(25089),
    BABY_SORCERER,
    BABY_MINSTRELWANDERER,
    BABY_SURA,
    BABY_GENETIC,
    BABY_CHASER;


    /* renamed from: Ų, reason: contains not printable characters */
    private static /* synthetic */ int[] f8757;

    /* renamed from: ű, reason: contains not printable characters */
    int f8819;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC1048[] valuesCustom() {
        EnumC1048[] enumC1048ArrValuesCustom = values();
        int length = enumC1048ArrValuesCustom.length;
        EnumC1048[] enumC1048Arr = new EnumC1048[length];
        System.arraycopy(enumC1048ArrValuesCustom, 0, enumC1048Arr, 0, length);
        return enumC1048Arr;
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    private static /* synthetic */ int[] m1616() {
        int[] iArr = f8757;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[valuesCustom().length];
        try {
            iArr2[ACOLYTE.ordinal()] = 5;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[ACOLYTE_HIGH.ordinal()] = 42;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[ALCHEMIST.ordinal()] = 34;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ARCHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ARCHER_HIGH.ordinal()] = 41;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ARCH_BISHOP.ordinal()] = 81;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ARCH_BISHOP_T.ordinal()] = 93;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ASSASSIN.ordinal()] = 24;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ASSASSIN_CROSS.ordinal()] = 50;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[BABY.ordinal()] = 57;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[BABY_ACOLYTE.ordinal()] = 61;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[BABY_ALCHEMIST.ordinal()] = 76;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[BABY_ARCHER.ordinal()] = 60;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[BABY_ASSASSIN.ordinal()] = 70;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[BABY_BARDDANCER.ordinal()] = 74;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[BABY_BISHOP.ordinal()] = 105;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[BABY_BLACKSMITH.ordinal()] = 69;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[BABY_CHASER.ordinal()] = 113;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[BABY_CROSS.ordinal()] = 107;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[BABY_CRUSADER.ordinal()] = 72;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[BABY_GENETIC.ordinal()] = 112;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[BABY_GUARD.ordinal()] = 108;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[BABY_HUNTER.ordinal()] = 67;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[BABY_KNIGHT.ordinal()] = 65;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[BABY_MAGE.ordinal()] = 59;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[BABY_MECHANIC.ordinal()] = 106;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[BABY_MERCHANT.ordinal()] = 62;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[BABY_MINSTRELWANDERER.ordinal()] = 110;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[BABY_MONK.ordinal()] = 75;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[BABY_PRIEST.ordinal()] = 68;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[BABY_RANGER.ordinal()] = 104;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[BABY_ROGUE.ordinal()] = 77;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[BABY_RUNE.ordinal()] = 102;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[BABY_SAGE.ordinal()] = 73;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[BABY_SORCERER.ordinal()] = 109;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[BABY_SURA.ordinal()] = 111;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[BABY_SWORDMAN.ordinal()] = 58;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr2[BABY_THIEF.ordinal()] = 63;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr2[BABY_WARLOCK.ordinal()] = 103;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr2[BABY_WIZARD.ordinal()] = 66;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr2[BARDDANCER.ordinal()] = 32;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr2[BLACKSMITH.ordinal()] = 23;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr2[CHAMPION.ordinal()] = 54;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr2[CLOWNGYPSY.ordinal()] = 53;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr2[CREATOR.ordinal()] = 55;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr2[CRUSADER.ordinal()] = 30;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr2[DARK_COLLECTOR.ordinal()] = 37;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr2[DEATH_KNIGHT.ordinal()] = 29;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr2[GANGSI.ordinal()] = 16;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr2[GENETIC.ordinal()] = 88;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr2[GENETIC_T.ordinal()] = 100;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr2[GUILLOTINE_CROSS.ordinal()] = 83;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr2[GUILLOTINE_CROSS_T.ordinal()] = 95;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr2[GUNSLINGER.ordinal()] = 11;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr2[HANBOK.ordinal()] = 15;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr2[HIGH_PRIEST.ordinal()] = 48;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr2[HIGH_WIZARD.ordinal()] = 46;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr2[HUNTER.ordinal()] = 21;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr2[KAGEROU_OBORO.ordinal()] = 28;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr2[KNIGHT.ordinal()] = 19;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr2[LORD_KNIGHT.ordinal()] = 45;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr2[MAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr2[MAGE_HIGH.ordinal()] = 40;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr2[MECHANIC.ordinal()] = 82;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr2[MECHANIC_T.ordinal()] = 94;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr2[MERCHANT.ordinal()] = 6;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr2[MERCHANT_HIGH.ordinal()] = 43;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr2[MINSTRELWANDERER.ordinal()] = 86;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr2[MINSTRELWANDERER_T.ordinal()] = 98;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr2[MONK.ordinal()] = 33;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr2[NINJA.ordinal()] = 12;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr2[NOVICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr2[NOVICE_HIGH.ordinal()] = 38;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            iArr2[OKTOBERFEST.ordinal()] = 17;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr2[PALADIN.ordinal()] = 51;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            iArr2[PRIEST.ordinal()] = 22;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            iArr2[PROFESSOR.ordinal()] = 52;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            iArr2[RANGER.ordinal()] = 80;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            iArr2[RANGER_T.ordinal()] = 92;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            iArr2[REBELLION.ordinal()] = 27;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            iArr2[ROGUE.ordinal()] = 35;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            iArr2[ROYAL_GUARD.ordinal()] = 84;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            iArr2[ROYAL_GUARD_T.ordinal()] = 96;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            iArr2[RUNE_KNIGHT.ordinal()] = 78;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            iArr2[RUNE_KNIGHT_T.ordinal()] = 90;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            iArr2[SAGE.ordinal()] = 31;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            iArr2[SHADOW_CHASER.ordinal()] = 89;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            iArr2[SHADOW_CHASER_T.ordinal()] = 101;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            iArr2[SNIPER.ordinal()] = 47;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            iArr2[SORCERER.ordinal()] = 85;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            iArr2[SORCERER_T.ordinal()] = 97;
        } catch (NoSuchFieldError unused91) {
        }
        try {
            iArr2[SOUL_LINKER.ordinal()] = 36;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            iArr2[STALKER.ordinal()] = 56;
        } catch (NoSuchFieldError unused93) {
        }
        try {
            iArr2[STAR_GLADIATOR.ordinal()] = 26;
        } catch (NoSuchFieldError unused94) {
        }
        try {
            iArr2[SUMMER.ordinal()] = 14;
        } catch (NoSuchFieldError unused95) {
        }
        try {
            iArr2[SUMMONER.ordinal()] = 18;
        } catch (NoSuchFieldError unused96) {
        }
        try {
            iArr2[SUPER_BABY.ordinal()] = 64;
        } catch (NoSuchFieldError unused97) {
        }
        try {
            iArr2[SUPER_BABY_E.ordinal()] = 71;
        } catch (NoSuchFieldError unused98) {
        }
        try {
            iArr2[SUPER_NOVICE.ordinal()] = 8;
        } catch (NoSuchFieldError unused99) {
        }
        try {
            iArr2[SUPER_NOVICE_E.ordinal()] = 25;
        } catch (NoSuchFieldError unused100) {
        }
        try {
            iArr2[SURA.ordinal()] = 87;
        } catch (NoSuchFieldError unused101) {
        }
        try {
            iArr2[SURA_T.ordinal()] = 99;
        } catch (NoSuchFieldError unused102) {
        }
        try {
            iArr2[SWORDMAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused103) {
        }
        try {
            iArr2[SWORDMAN_HIGH.ordinal()] = 39;
        } catch (NoSuchFieldError unused104) {
        }
        try {
            iArr2[TAEKWON.ordinal()] = 9;
        } catch (NoSuchFieldError unused105) {
        }
        try {
            iArr2[THIEF.ordinal()] = 7;
        } catch (NoSuchFieldError unused106) {
        }
        try {
            iArr2[THIEF_HIGH.ordinal()] = 44;
        } catch (NoSuchFieldError unused107) {
        }
        try {
            iArr2[WARLOCK.ordinal()] = 79;
        } catch (NoSuchFieldError unused108) {
        }
        try {
            iArr2[WARLOCK_T.ordinal()] = 91;
        } catch (NoSuchFieldError unused109) {
        }
        try {
            iArr2[WEDDING.ordinal()] = 10;
        } catch (NoSuchFieldError unused110) {
        }
        try {
            iArr2[WHITESMITH.ordinal()] = 49;
        } catch (NoSuchFieldError unused111) {
        }
        try {
            iArr2[WIZARD.ordinal()] = 20;
        } catch (NoSuchFieldError unused112) {
        }
        try {
            iArr2[XMAS.ordinal()] = 13;
        } catch (NoSuchFieldError unused113) {
        }
        f8757 = iArr2;
        return iArr2;
    }

    static {
        EnumC1048[] enumC1048ArrValuesCustom = valuesCustom();
        int i = -1;
        for (int i2 = 0; i2 < enumC1048ArrValuesCustom.length; i2++) {
            if (enumC1048ArrValuesCustom[i2].f8819 != 0) {
                i = enumC1048ArrValuesCustom[i2].f8819;
            } else {
                enumC1048ArrValuesCustom[i2].f8819 = i + 1;
                i++;
            }
        }
    }

    EnumC1048(int i) {
        this.f8819 = i;
    }

    EnumC1048() {
        this.f8819 = 0;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static EnumC1048 m1617(int i) {
        EnumC1048[] enumC1048ArrValuesCustom = valuesCustom();
        for (int i2 = 0; i2 < enumC1048ArrValuesCustom.length; i2++) {
            if (enumC1048ArrValuesCustom[i2].f8819 == i) {
                return enumC1048ArrValuesCustom[i2];
            }
        }
        return NOVICE;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final EnumC1048 m1621() {
        return m1617(this.f8819 & (-4097));
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final EnumC1048 m1619() {
        return m1617(this.f8819 & 255);
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final EnumC1048 m1618() {
        return m1617(this.f8819 & 4095);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final EnumC0134 m1620(EnumC0765 enumC0765) {
        switch (m1616()[ordinal()]) {
            case 1:
                return EnumC0134.NOVICE;
            case 2:
                return EnumC0134.SWORDMAN;
            case 3:
                return EnumC0134.MAGE;
            case 4:
                return EnumC0134.ARCHER;
            case 5:
                return EnumC0134.ACOLYTE;
            case 6:
                return EnumC0134.MERCHANT;
            case 7:
                return EnumC0134.THIEF;
            case 8:
                return EnumC0134.SUPER_NOVICE;
            case 9:
                return EnumC0134.TAEKWON;
            case 10:
                return EnumC0134.WEDDING;
            case 11:
                return EnumC0134.GUNSLINGER;
            case 12:
                return EnumC0134.NINJA;
            case 13:
                return EnumC0134.XMAS;
            case 14:
                return EnumC0134.SUMMER;
            case 15:
                return EnumC0134.HANBOK;
            case 16:
                return EnumC0134.GANGSI;
            case 17:
                return EnumC0134.OKTOBERFEST;
            case 18:
                return EnumC0134.SUMMONER;
            case 19:
                return EnumC0134.KNIGHT;
            case 20:
                return EnumC0134.WIZARD;
            case 21:
                return EnumC0134.HUNTER;
            case 22:
                return EnumC0134.PRIEST;
            case 23:
                return EnumC0134.BLACKSMITH;
            case 24:
                return EnumC0134.ASSASSIN;
            case 25:
                return EnumC0134.SUPER_NOVICE_E;
            case 26:
                return EnumC0134.STAR_GLADIATOR;
            case 27:
                return EnumC0134.REBELLION;
            case 28:
                return enumC0765 == EnumC0765.MALE ? EnumC0134.KAGEROU : EnumC0134.OBORO;
            case 29:
                return EnumC0134.DEATH_KNIGHT;
            case 30:
                return EnumC0134.CRUSADER;
            case 31:
                return EnumC0134.SAGE;
            case 32:
                return enumC0765 == EnumC0765.MALE ? EnumC0134.BARD : EnumC0134.DANCER;
            case 33:
                return EnumC0134.MONK;
            case 34:
                return EnumC0134.ALCHEMIST;
            case 35:
                return EnumC0134.ROGUE;
            case 36:
                return EnumC0134.SOUL_LINKER;
            case 37:
                return EnumC0134.DARK_COLLECTOR;
            case 38:
                return EnumC0134.NOVICE_HIGH;
            case 39:
                return EnumC0134.SWORDMAN_HIGH;
            case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                return EnumC0134.MAGE_HIGH;
            case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                return EnumC0134.ARCHER_HIGH;
            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                return EnumC0134.ACOLYTE_HIGH;
            case 43:
                return EnumC0134.MERCHANT_HIGH;
            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                return EnumC0134.THIEF_HIGH;
            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                return EnumC0134.LORD_KNIGHT;
            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                return EnumC0134.HIGH_WIZARD;
            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                return EnumC0134.SNIPER;
            case 48:
                return EnumC0134.HIGH_PRIEST;
            case 49:
                return EnumC0134.WHITESMITH;
            case 50:
                return EnumC0134.ASSASSIN_CROSS;
            case 51:
                return EnumC0134.PALADIN;
            case 52:
                return EnumC0134.PROFESSOR;
            case 53:
                return enumC0765 == EnumC0765.MALE ? EnumC0134.CLOWN : EnumC0134.GYPSY;
            case 54:
                return EnumC0134.CHAMPION;
            case 55:
                return EnumC0134.CREATOR;
            case 56:
                return EnumC0134.STALKER;
            case 57:
                return EnumC0134.BABY;
            case 58:
                return EnumC0134.BABY_SWORDMAN;
            case 59:
                return EnumC0134.BABY_MAGE;
            case 60:
                return EnumC0134.BABY_ARCHER;
            case 61:
                return EnumC0134.BABY_ACOLYTE;
            case 62:
                return EnumC0134.BABY_MERCHANT;
            case 63:
                return EnumC0134.BABY_THIEF;
            case 64:
                return EnumC0134.SUPER_BABY;
            case 65:
                return EnumC0134.BABY_KNIGHT;
            case 66:
                return EnumC0134.BABY_WIZARD;
            case 67:
                return EnumC0134.BABY_HUNTER;
            case 68:
                return EnumC0134.BABY_PRIEST;
            case TFTP.DEFAULT_PORT /* 69 */:
                return EnumC0134.BABY_BLACKSMITH;
            case 70:
                return EnumC0134.BABY_ASSASSIN;
            case 71:
                return EnumC0134.SUPER_BABY_E;
            case 72:
                return EnumC0134.BABY_CRUSADER;
            case 73:
                return EnumC0134.BABY_SAGE;
            case 74:
                return enumC0765 == EnumC0765.MALE ? EnumC0134.BABY_BARD : EnumC0134.BABY_DANCER;
            case 75:
                return EnumC0134.BABY_MONK;
            case 76:
                return EnumC0134.BABY_ALCHEMIST;
            case 77:
                return EnumC0134.BABY_ROGUE;
            case 78:
                return EnumC0134.RUNE_KNIGHT;
            case FingerClient.DEFAULT_PORT /* 79 */:
                return EnumC0134.WARLOCK;
            case vh.f5370 /* 80 */:
                return EnumC0134.RANGER;
            case 81:
                return EnumC0134.ARCH_BISHOP;
            case 82:
                return EnumC0134.MECHANIC;
            case 83:
                return EnumC0134.GUILLOTINE_CROSS;
            case 84:
                return EnumC0134.ROYAL_GUARD;
            case 85:
                return EnumC0134.SORCERER;
            case 86:
                return enumC0765 == EnumC0765.MALE ? EnumC0134.MINSTREL : EnumC0134.WANDERER;
            case 87:
                return EnumC0134.SURA;
            case 88:
                return EnumC0134.GENETIC;
            case 89:
                return EnumC0134.SHADOW_CHASER;
            case 90:
                return EnumC0134.RUNE_KNIGHT_T;
            case 91:
                return EnumC0134.WARLOCK_T;
            case 92:
                return EnumC0134.RANGER_T;
            case 93:
                return EnumC0134.ARCH_BISHOP_T;
            case 94:
                return EnumC0134.MECHANIC_T;
            case 95:
                return EnumC0134.GUILLOTINE_CROSS_T;
            case 96:
                return EnumC0134.ROYAL_GUARD_T;
            case 97:
                return EnumC0134.SORCERER_T;
            case 98:
                return enumC0765 == EnumC0765.MALE ? EnumC0134.MINSTREL_T : EnumC0134.WANDERER_T;
            case 99:
                return EnumC0134.SURA_T;
            case 100:
                return EnumC0134.GENETIC_T;
            case HttpStatus.SC_SWITCHING_PROTOCOLS /* 101 */:
                return EnumC0134.SHADOW_CHASER_T;
            case HttpStatus.SC_PROCESSING /* 102 */:
                return EnumC0134.BABY_RUNE;
            case 103:
                return EnumC0134.BABY_WARLOCK;
            case 104:
                return EnumC0134.BABY_RANGER;
            case 105:
                return EnumC0134.BABY_BISHOP;
            case 106:
                return EnumC0134.BABY_MECHANIC;
            case 107:
                return EnumC0134.BABY_CROSS;
            case 108:
                return EnumC0134.BABY_GUARD;
            case 109:
                return EnumC0134.BABY_SORCERER;
            case 110:
                return enumC0765 == EnumC0765.MALE ? EnumC0134.BABY_MINSTREL : EnumC0134.BABY_WANDERER;
            case 111:
                return EnumC0134.BABY_SURA;
            case 112:
                return EnumC0134.BABY_GENETIC;
            case 113:
                return EnumC0134.BABY_CHASER;
            default:
                return EnumC0134.NOVICE;
        }
    }
}
