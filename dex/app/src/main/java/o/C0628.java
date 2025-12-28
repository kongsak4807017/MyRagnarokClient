package o;

import java.nio.ByteBuffer;

/* renamed from: o.似, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0628 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] f7490;

    /* renamed from: o.似$鷭, reason: contains not printable characters */
    enum EnumC0629 {
        CHAR_TOO_FAR,
        CHAR_NOT_EXISTS,
        DEAL_HAS_FAILED,
        ACCEPTED,
        REJECTED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0629[] valuesCustom() {
            EnumC0629[] enumC0629ArrValuesCustom = values();
            int length = enumC0629ArrValuesCustom.length;
            EnumC0629[] enumC0629Arr = new EnumC0629[length];
            System.arraycopy(enumC0629ArrValuesCustom, 0, enumC0629Arr, 0, length);
            return enumC0629Arr;
        }
    }

    C0628() {
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m1399() {
        int[] iArr = f7490;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0629.valuesCustom().length];
        try {
            iArr2[EnumC0629.ACCEPTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0629.CHAR_NOT_EXISTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0629.CHAR_TOO_FAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC0629.DEAL_HAS_FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC0629.REJECTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f7490 = iArr2;
        return iArr2;
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 501;
        byte b = byteBuffer.get();
        byteBuffer.getInt();
        short s = byteBuffer.getShort();
        if (z) {
            return;
        }
        m1400(b, s);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1400(byte b, short s) {
        switch (m1399()[EnumC0629.valuesCustom()[b].ordinal()]) {
            case 1:
                C0698 c0698 = C0358.f6674.f42.f1792;
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(71);
                c0698.m1432(strM649 == null ? "MSG71" : strM649, 16711680);
                break;
            case 2:
                C0698 c06982 = C0358.f6674.f42.f1792;
                cv cvVar2 = C0358.f6685;
                String strM6492 = C0358.f6687.m649(72);
                c06982.m1432(strM6492 == null ? "MSG72" : strM6492, 16711680);
                break;
            case 3:
                C0698 c06983 = C0358.f6674.f42.f1792;
                cv cvVar3 = C0358.f6685;
                String strM6493 = C0358.f6687.m649(73);
                c06983.m1432(strM6493 == null ? "MSG73" : strM6493, 16711680);
                break;
            case 4:
                C0358.f6674.f42.f1749.m697();
                C0358.f6674.f42.f1749.m700(C0358.f6668.f6714, s);
                C0358.f6674.f42.f1749.h_();
                break;
            case 5:
                C0698 c06984 = C0358.f6674.f42.f1792;
                cv cvVar4 = C0358.f6685;
                String strM6494 = C0358.f6687.m649(70);
                c06984.m1432(strM6494 == null ? "MSG70" : strM6494, 16711680);
                break;
        }
    }
}
