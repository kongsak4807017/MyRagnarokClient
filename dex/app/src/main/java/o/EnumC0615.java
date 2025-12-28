package o;

/* renamed from: o.䯲, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum EnumC0615 {
    NONE,
    SHORTSWORD,
    SWORD,
    TWOHANDSWORD,
    SPEAR,
    TWOHANDSPEAR,
    AXE,
    TWOHANDAXE,
    MACE,
    TWOHANDMACE,
    ROD,
    BOW,
    KNUKLE,
    INSTRUMENT,
    WHIP,
    BOOK,
    CATARRH,
    WPCLASS_GUN_HANDGUN,
    WPCLASS_GUN_RIFLE,
    WPCLASS_GUN_GATLING,
    WPCLASS_GUN_SHOTGUN,
    WPCLASS_GUN_GRANADE,
    WPCLASS_SYURIKEN,
    WPCLASS_TWOHANDROD,
    WPCLASS_LAST,
    SHORTSWORD_SHORTSWORD,
    SWORD_SWORD,
    AXE_AXE,
    SHORTSWORD_SWORD,
    SHORTSWORD_AXE,
    SWORD_AXE;


    /* renamed from: 㱽, reason: contains not printable characters */
    private static /* synthetic */ int[] f7459;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0615[] valuesCustom() {
        EnumC0615[] enumC0615ArrValuesCustom = values();
        int length = enumC0615ArrValuesCustom.length;
        EnumC0615[] enumC0615Arr = new EnumC0615[length];
        System.arraycopy(enumC0615ArrValuesCustom, 0, enumC0615Arr, 0, length);
        return enumC0615Arr;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    static /* synthetic */ int[] m1393() {
        int[] iArr = f7459;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[valuesCustom().length];
        try {
            iArr2[AXE.ordinal()] = 7;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[AXE_AXE.ordinal()] = 28;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[BOOK.ordinal()] = 16;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[BOW.ordinal()] = 12;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CATARRH.ordinal()] = 17;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[INSTRUMENT.ordinal()] = 14;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[KNUKLE.ordinal()] = 13;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[MACE.ordinal()] = 9;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ROD.ordinal()] = 11;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[SHORTSWORD.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[SHORTSWORD_AXE.ordinal()] = 30;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[SHORTSWORD_SHORTSWORD.ordinal()] = 26;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[SHORTSWORD_SWORD.ordinal()] = 29;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[SPEAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[SWORD.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[SWORD_AXE.ordinal()] = 31;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[SWORD_SWORD.ordinal()] = 27;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[TWOHANDAXE.ordinal()] = 8;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[TWOHANDMACE.ordinal()] = 10;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[TWOHANDSPEAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[TWOHANDSWORD.ordinal()] = 4;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[WHIP.ordinal()] = 15;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[WPCLASS_GUN_GATLING.ordinal()] = 20;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[WPCLASS_GUN_GRANADE.ordinal()] = 22;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[WPCLASS_GUN_HANDGUN.ordinal()] = 18;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[WPCLASS_GUN_RIFLE.ordinal()] = 19;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[WPCLASS_GUN_SHOTGUN.ordinal()] = 21;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[WPCLASS_LAST.ordinal()] = 25;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[WPCLASS_SYURIKEN.ordinal()] = 23;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[WPCLASS_TWOHANDROD.ordinal()] = 24;
        } catch (NoSuchFieldError unused31) {
        }
        f7459 = iArr2;
        return iArr2;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final EnumC0615 m1395() {
        switch (m1393()[ordinal()]) {
            case 26:
            case 29:
            case 30:
                return SHORTSWORD;
            case 27:
            case 31:
                return SWORD;
            case 28:
                return AXE;
            default:
                return this;
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final EnumC0615 m1394() {
        switch (m1393()[ordinal()]) {
            case 26:
                return SHORTSWORD;
            case 27:
            case 29:
                return SWORD;
            case 28:
            case 30:
            case 31:
                return AXE;
            default:
                return null;
        }
    }
}
