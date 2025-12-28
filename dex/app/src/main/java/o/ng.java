package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum ng {
    USABLE,
    EQUIP,
    ETC,
    CART;


    /* renamed from: Ą, reason: contains not printable characters */
    private static /* synthetic */ int[] f2454;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static ng[] valuesCustom() {
        ng[] ngVarArrValuesCustom = values();
        int length = ngVarArrValuesCustom.length;
        ng[] ngVarArr = new ng[length];
        System.arraycopy(ngVarArrValuesCustom, 0, ngVarArr, 0, length);
        return ngVarArr;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] m882() {
        int[] iArr = f2454;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0680.valuesCustom().length];
        try {
            iArr2[EnumC0680.ARMOR.ordinal()] = 6;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0680.ARROWS.ordinal()] = 11;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0680.BOW.ordinal()] = 9;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC0680.BULLETS.ordinal()] = 17;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC0680.CANNONBALL.ordinal()] = 20;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC0680.CARD.ordinal()] = 7;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC0680.CASH.ordinal()] = 19;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[EnumC0680.DELAYCONSUME.ordinal()] = 12;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[EnumC0680.ETC.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[EnumC0680.GUN.ordinal()] = 16;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[EnumC0680.HEALING.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[EnumC0680.PETEGG.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[EnumC0680.THROWWEAPON.ordinal()] = 18;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[EnumC0680.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[EnumC0680.UNUSED1.ordinal()] = 13;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[EnumC0680.UNUSED2.ordinal()] = 14;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[EnumC0680.UNUSED3.ordinal()] = 15;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[EnumC0680.USABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[EnumC0680.WEAPON.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[EnumC0680.WEAPON_TWOHAND.ordinal()] = 10;
        } catch (NoSuchFieldError unused20) {
        }
        f2454 = iArr2;
        return iArr2;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static ng m881(EnumC0680 enumC0680) {
        switch (m882()[enumC0680.ordinal()]) {
            case 1:
            case 3:
            case 7:
            case 12:
            case 19:
                return USABLE;
            case 2:
            case 4:
            case 8:
            case 13:
            case 14:
            case 15:
            default:
                return ETC;
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 16:
            case 17:
            case 18:
            case 20:
                return EQUIP;
        }
    }
}
