package o;

import java.nio.ByteBuffer;
import o.lo;

/* renamed from: o.懍, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0712 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] f7668;

    /* renamed from: o.懍$鷭, reason: contains not printable characters */
    enum EnumC0713 {
        LOOK_BASE,
        LOOK_HAIR,
        LOOK_WEAPON,
        LOOK_HEAD_BOTTOM,
        LOOK_HEAD_TOP,
        LOOK_HEAD_MID,
        LOOK_HAIR_COLOR,
        LOOK_CLOTHES_COLOR,
        LOOK_SHIELD,
        LOOK_SHOES,
        LOOK_BODY,
        LOOK_FLOOR,
        LOOK_ROBE,
        LOOK_BODY2;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0713[] valuesCustom() {
            EnumC0713[] enumC0713ArrValuesCustom = values();
            int length = enumC0713ArrValuesCustom.length;
            EnumC0713[] enumC0713Arr = new EnumC0713[length];
            System.arraycopy(enumC0713ArrValuesCustom, 0, enumC0713Arr, 0, length);
            return enumC0713Arr;
        }
    }

    C0712() {
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m1434() {
        int[] iArr = f7668;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0713.valuesCustom().length];
        try {
            iArr2[EnumC0713.LOOK_BASE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0713.LOOK_BODY.ordinal()] = 11;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0713.LOOK_BODY2.ordinal()] = 14;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC0713.LOOK_CLOTHES_COLOR.ordinal()] = 8;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC0713.LOOK_FLOOR.ordinal()] = 12;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC0713.LOOK_HAIR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC0713.LOOK_HAIR_COLOR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[EnumC0713.LOOK_HEAD_BOTTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[EnumC0713.LOOK_HEAD_MID.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[EnumC0713.LOOK_HEAD_TOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[EnumC0713.LOOK_ROBE.ordinal()] = 13;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[EnumC0713.LOOK_SHIELD.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[EnumC0713.LOOK_SHOES.ordinal()] = 10;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[EnumC0713.LOOK_WEAPON.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        f7668 = iArr2;
        return iArr2;
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        AbstractC0988 abstractC0988;
        this.f5008 = (short) 471;
        int i3 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        int i4 = C0358.f6667.f4830 ? byteBuffer.getInt() : byteBuffer.getShort();
        int i5 = C0358.f6667.f4830 ? byteBuffer.getInt() : byteBuffer.getShort();
        if (z || C0358.f6664 == null) {
            return;
        }
        lm lmVar = C0358.f6664.f2005.get(i3);
        if (lmVar == null) {
            abstractC0988 = null;
        } else {
            abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        }
        if (abstractC0988 == null) {
            return;
        }
        AbstractC0988 abstractC09882 = abstractC0988;
        bh bhVar = (bh) (bh.class.isAssignableFrom(abstractC09882.getClass()) ? abstractC09882 : null);
        if (bhVar == null || b < 0 || b >= EnumC0713.valuesCustom().length) {
            return;
        }
        EnumC0713 enumC0713 = EnumC0713.valuesCustom()[b];
        if (enumC0713 == null) {
            nz.m907("invalid changelook type " + ((int) b));
        }
        switch (m1434()[enumC0713.ordinal()]) {
            case 1:
                if (abstractC0988.f2001 == i4) {
                    return;
                }
                abstractC0988.f2001 = i4;
                if (abstractC0988 == C0358.f6664.f2004) {
                    ch chVar = C0358.f6674.f42.f1781;
                    lo.C0060 c0060 = C0358.f6685.f1030.f985.f2006.get(Integer.valueOf(C0358.f6664.f2004.f2001));
                    chVar.f892.setText(c0060 != null ? c0060.f2013 : "Poring");
                    break;
                }
                break;
            case 2:
                if (bhVar != null) {
                    if (bhVar.f805 == i4) {
                        return;
                    }
                    bhVar.f805 = i4;
                    break;
                }
                break;
            case 3:
            case 9:
                if (bhVar != null) {
                    if (bhVar.f818 == i4 && bhVar.f814 == i5) {
                        return;
                    }
                    bhVar.f818 = i4;
                    bhVar.f814 = i5;
                    break;
                }
                break;
            case 4:
                if (bhVar != null) {
                    if (bhVar.f807 == i4) {
                        return;
                    }
                    bhVar.f807 = i4;
                    break;
                }
                break;
            case 5:
                if (bhVar != null) {
                    if (bhVar.f813 == i4) {
                        return;
                    }
                    bhVar.f813 = i4;
                    break;
                }
                break;
            case 6:
                if (bhVar != null) {
                    if (bhVar.f806 == i4) {
                        return;
                    }
                    bhVar.f806 = i4;
                    break;
                }
                break;
            case 7:
                if (bhVar != null) {
                    if (bhVar.f804 == i4) {
                        return;
                    }
                    bhVar.f804 = i4;
                    break;
                }
                break;
            case 8:
                if (bhVar != null) {
                    if (bhVar.f817 == i4) {
                        return;
                    }
                    bhVar.f817 = i4;
                    break;
                }
                break;
            case 10:
            case 11:
            case 12:
            case 14:
                return;
            case 13:
                if (bhVar != null) {
                    if (bhVar.f808 == i4) {
                        return;
                    }
                    bhVar.f808 = i4;
                    break;
                }
                break;
        }
        mj mjVar = C0358.f6669.f2048.f1545.get(Integer.valueOf(i3));
        if (mjVar == null) {
            return;
        }
        mjVar.m860();
    }
}
