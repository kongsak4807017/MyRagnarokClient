package o;

import android.util.Log;
import o.dv;

/* renamed from: o.낢, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C1008 implements Cloneable {

    /* renamed from: đ, reason: contains not printable characters */
    private static /* synthetic */ int[] f8484;

    /* renamed from: Ē, reason: contains not printable characters */
    private static /* synthetic */ int[] f8485;

    /* renamed from: ܕ, reason: contains not printable characters */
    private static boolean f8486;

    /* renamed from: 庸, reason: contains not printable characters */
    private static /* synthetic */ int[] f8487;

    /* renamed from: 躆, reason: contains not printable characters */
    private static int[] f8488 = new int[128];

    /* renamed from: Ą, reason: contains not printable characters */
    int f8489;

    /* renamed from: ą, reason: contains not printable characters */
    int f8490;

    /* renamed from: Ć, reason: contains not printable characters */
    boolean f8491;

    /* renamed from: ć, reason: contains not printable characters */
    boolean f8492;

    /* renamed from: ċ, reason: contains not printable characters */
    EnumC0680 f8493;

    /* renamed from: ȃ, reason: contains not printable characters */
    int f8494;

    /* renamed from: Ȋ, reason: contains not printable characters */
    long f8495;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    int f8496;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    boolean f8497;

    /* renamed from: 䒧, reason: contains not printable characters */
    C0637 f8498;

    /* renamed from: 岱, reason: contains not printable characters */
    int[] f8499;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f8500;

    /* renamed from: 纫, reason: contains not printable characters */
    int f8501;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f8502;

    /* renamed from: Ć, reason: contains not printable characters */
    private static /* synthetic */ int[] m1581() {
        int[] iArr = f8487;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC1009.valuesCustom().length];
        try {
            iArr2[EnumC1009.CARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC1009.LOOK.ordinal()] = 4;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC1009.NAMEID.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC1009.OPTIDX.ordinal()] = 6;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC1009.OPTUNK.ordinal()] = 7;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC1009.OPTVAL.ordinal()] = 8;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC1009.REFINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[EnumC1009.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        f8487 = iArr2;
        return iArr2;
    }

    /* renamed from: ć, reason: contains not printable characters */
    private static /* synthetic */ int[] m1582() {
        int[] iArr = f8484;
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
        f8484 = iArr2;
        return iArr2;
    }

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private static /* synthetic */ int[] m1583() {
        int[] iArr = f8485;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0131.valuesCustom().length];
        try {
            iArr2[EnumC0131.DARK.ordinal()] = 8;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0131.EARTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0131.FIRE.ordinal()] = 4;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC0131.GHOST.ordinal()] = 9;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC0131.HOLY.ordinal()] = 7;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC0131.NEUTRAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC0131.POISON.ordinal()] = 6;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[EnumC0131.UNDEAD.ordinal()] = 10;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[EnumC0131.WATER.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[EnumC0131.WIND.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        f8485 = iArr2;
        return iArr2;
    }

    public C1008(int i) {
        this(i, 1, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1008(int i, int i2, boolean z) {
        C0432 c0432M1648 = C0358.f6685.f1030.f967.m1648(pa.m968((short) i));
        this(i, i2, true, c0432M1648 == null ? null : c0432M1648.f6853);
    }

    public C1008(int i, int i2, boolean z, EnumC0680 enumC0680) {
        this(i, i2, 0, enumC0680, false, true, false, 0, 0, 0, null, 0, 0, null);
    }

    /* renamed from: o.낢$鷭, reason: contains not printable characters */
    enum EnumC1009 {
        UNKNOWN,
        NAMEID,
        REFINE('%', '%'),
        LOOK(0, '&'),
        CARD('\'', '('),
        OPTIDX(')', '*'),
        OPTUNK('*', '+'),
        OPTVAL('+', ',');


        /* renamed from: ˮ͍, reason: contains not printable characters */
        char f8512;

        /* renamed from: 岱, reason: contains not printable characters */
        char f8513;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC1009[] valuesCustom() {
            EnumC1009[] enumC1009ArrValuesCustom = values();
            int length = enumC1009ArrValuesCustom.length;
            EnumC1009[] enumC1009Arr = new EnumC1009[length];
            System.arraycopy(enumC1009ArrValuesCustom, 0, enumC1009Arr, 0, length);
            return enumC1009Arr;
        }

        EnumC1009(char c, char c2) {
            this.f8512 = c;
            this.f8513 = c2;
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        static EnumC1009 m1595(char c, boolean z) {
            EnumC1009[] enumC1009ArrValuesCustom = valuesCustom();
            for (int i = 0; i < enumC1009ArrValuesCustom.length; i++) {
                if (c == (z ? enumC1009ArrValuesCustom[i].f8513 : enumC1009ArrValuesCustom[i].f8512)) {
                    return enumC1009ArrValuesCustom[i];
                }
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014f A[SYNTHETIC] */
    /* renamed from: 鷭, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static o.C1008 m1584(java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1008.m1584(java.lang.String):o.낢");
    }

    public C1008(int i, int i2, int i3, EnumC0680 enumC0680, boolean z, boolean z2, boolean z3, int i4, int i5, int i6, C0132 c0132, int i7, int i8, C0637 c0637) {
        this.f8499 = new int[4];
        this.f8502 = C0358.f6667.f4830 ? i : pa.m968((short) i);
        this.f8500 = i2;
        this.f8496 = i3;
        this.f8493 = enumC0680;
        this.f8492 = z;
        this.f8491 = z2;
        this.f8497 = z3;
        this.f8489 = i4;
        this.f8490 = i5;
        this.f8494 = i6;
        if (c0132 != null) {
            for (int i9 = 0; i9 < this.f8499.length; i9++) {
                this.f8499[i9] = c0132.f6254[i9];
            }
        }
        this.f8495 = i7;
        this.f8501 = i8;
        this.f8498 = c0637;
    }

    C1008(C0726 c0726) {
        this(c0726.f7695, c0726.f7693, 0, EnumC0680.valuesCustom()[c0726.f7694], (c0726.f7692 & 2) != 0, (c0726.f7692 & 1) != 0, (c0726.f7692 & 4) != 0, c0726.f7689, 0, 0, c0726.f7690, c0726.f7691, 0, null);
    }

    C1008(C1154 c1154) {
        this(c1154.f9018, 1, c1154.f9009, EnumC0680.valuesCustom()[c1154.f9015], (c1154.f9019 & 2) != 0, (c1154.f9019 & 1) != 0, (c1154.f9019 & 4) != 0, c1154.f9013, c1154.f9008, c1154.f9017, c1154.f9010, c1154.f9011, c1154.f9016, c1154.f9012);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final int m1590() {
        if (this.f8489 != 0) {
            return this.f8489;
        }
        switch (m1582()[this.f8493.ordinal()]) {
            case 11:
            case 17:
            case 18:
            case 20:
                return 32768;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 19:
            default:
                return 0;
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final C1008 m1589() {
        try {
            return (C1008) clone();
        } catch (CloneNotSupportedException e) {
            Log.e("AndRO", e.toString());
            RuntimeException runtimeException = new RuntimeException(e.toString());
            runtimeException.setStackTrace(e.getStackTrace());
            throw runtimeException;
        }
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public final String m1588() {
        return m1592(C0358.f6685.f1030.f967);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0283  */
    /* renamed from: 鷭, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.String m1592(o.C1139 r12) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1008.m1592(o.텺):java.lang.String");
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    final int m1587() {
        if (this.f8493 == null) {
            return -4473925;
        }
        switch (m1582()[this.f8493.ordinal()]) {
            case 1:
            case 3:
            case 12:
            case 19:
                break;
            case 5:
            case 6:
            case 10:
                if (this.f8491) {
                    if (this.f8492) {
                    }
                }
                break;
        }
        return -4473925;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final boolean m1593(C1008 c1008) {
        boolean z;
        if (this.f8502 == c1008.f8502 && this.f8496 == c1008.f8496 && this.f8494 == c1008.f8494 && this.f8491 == c1008.f8491 && this.f8492 == c1008.f8492 && this.f8497 == c1008.f8497) {
            if (this.f8499 == null || c1008.f8499 == null) {
                z = this.f8499 == c1008.f8499;
            } else {
                int i = 0;
                while (true) {
                    if (i >= this.f8499.length) {
                        z = true;
                        break;
                    }
                    if (this.f8499[i] != c1008.f8499[i]) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            if (z && this.f8495 == c1008.f8495 && this.f8493 == c1008.f8493) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: Ą, reason: contains not printable characters */
    final boolean m1585() {
        switch (m1582()[this.f8493.ordinal()]) {
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 16:
                return false;
            case 7:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                return true;
        }
    }

    /* renamed from: ą, reason: contains not printable characters */
    final boolean m1586() {
        return this.f8499[0] == 255 || this.f8499[0] == 254 || this.f8499[0] == 65280;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final String m1591(int i) {
        short s = this.f8498.f7510[i].f7514;
        short s2 = this.f8498.f7510[i].f7513;
        if (s <= 0 || s >= C0358.f6685.f1030.f977.f1120) {
            return null;
        }
        if (s2 > 0) {
            dv.C0031 c0031 = C0358.f6685.f1030.f977.f1121.get(Integer.valueOf(s));
            return String.format(c0031 == null ? "No Description" : c0031.f1123, Short.valueOf(s2));
        }
        dv.C0031 c00312 = C0358.f6685.f1030.f977.f1121.get(Integer.valueOf(s));
        return c00312 == null ? "No Description" : c00312.f1123;
    }
}
