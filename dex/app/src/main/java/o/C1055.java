package o;

import o.wy;

/* renamed from: o.롑, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1055 extends wz implements vf {

    /* renamed from: ą, reason: contains not printable characters */
    private static /* synthetic */ int[] f8837;

    C1055() {
    }

    /* renamed from: ą, reason: contains not printable characters */
    private static /* synthetic */ int[] m1622() {
        int[] iArr = f8837;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[wy.EnumC0124.valuesCustom().length];
        try {
            iArr2[wy.EnumC0124.ALREADYTRADING.ordinal()] = 5;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[wy.EnumC0124.CASHSYSTEMMAILFUNCTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[wy.EnumC0124.HEAVYWEIGHTINVENTORY.ordinal()] = 10;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[wy.EnumC0124.ITEMINFOWRONG.ordinal()] = 6;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[wy.EnumC0124.NOTENOUGHPOINTS.ordinal()] = 7;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[wy.EnumC0124.NPCNOTFOUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[wy.EnumC0124.OVERWEIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[wy.EnumC0124.PURCHASELIMITEXCEEDED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[wy.EnumC0124.SOMEITEMCANTBEPURCHASED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[wy.EnumC0124.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        f8837 = iArr2;
        return iArr2;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1623(short s, int i, int i2) {
        if (s < 0 || s >= wy.EnumC0124.valuesCustom().length) {
            return;
        }
        String str = null;
        switch (m1622()[wy.EnumC0124.valuesCustom()[s].ordinal()]) {
            case 1:
                break;
            case 2:
                str = "Npc not found";
                break;
            case 3:
                str = "Cash system error.";
                break;
            case 4:
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(53);
                str = strM649 == null ? "MSG53" : strM649;
                break;
            case 5:
                str = "Already trading";
                break;
            case 6:
                str = "Item info wrong";
                break;
            case 7:
                str = "Not enough cash points";
                break;
            case 8:
                cv cvVar2 = C0358.f6685;
                String strM6492 = C0358.f6687.m649(1814);
                str = strM6492 == null ? "MSG1814" : strM6492;
                break;
            case 9:
                cv cvVar3 = C0358.f6685;
                String strM6493 = C0358.f6687.m649(1815);
                str = strM6493 == null ? "MSG1815" : strM6493;
                break;
            case 10:
                str = "Too many items in your inventory.";
                break;
            default:
                throw new nv();
        }
        if (str != null) {
            C0358.f6674.f42.f1792.m1432(str, 16711680);
        } else {
            C0358.f6679.f6831.f8575 = i;
            C0358.f6679.f6831.f8574 = i2;
        }
    }

    @Override // o.vf
    /* renamed from: 鷭 */
    public final void mo1041() {
        m1623(this.f5532, this.f5534, this.f5533);
    }
}
