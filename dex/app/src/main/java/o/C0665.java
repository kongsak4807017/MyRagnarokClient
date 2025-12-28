package o;

import java.nio.ByteBuffer;

/* renamed from: o.妕, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0665 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] f7569;

    C0665() {
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m1411() {
        int[] iArr = f7569;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0666.valuesCustom().length];
        try {
            iArr2[EnumC0666.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0666.EXCHANGE_OR_STORE_WINDOW_ACTIVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0666.NO_MONEY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC0666.OVERFLOW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC0666.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        f7569 = iArr2;
        return iArr2;
    }

    /* renamed from: o.妕$鷭, reason: contains not printable characters */
    enum EnumC0666 {
        SUCCESS(0),
        ERROR(2455),
        NO_MONEY(2457),
        OVERFLOW(2466),
        EXCHANGE_OR_STORE_WINDOW_ACTIVE(2490);


        /* renamed from: ą, reason: contains not printable characters */
        int f7576;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0666[] valuesCustom() {
            EnumC0666[] enumC0666ArrValuesCustom = values();
            int length = enumC0666ArrValuesCustom.length;
            EnumC0666[] enumC0666Arr = new EnumC0666[length];
            System.arraycopy(enumC0666ArrValuesCustom, 0, enumC0666Arr, 0, length);
            return enumC0666Arr;
        }

        EnumC0666(int i) {
            this.f7576 = i;
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2472;
        EnumC0666 enumC0666 = EnumC0666.valuesCustom()[byteBuffer.getShort()];
        long j = byteBuffer.getLong();
        int i3 = byteBuffer.getInt();
        if (z) {
        }
        switch (m1411()[enumC0666.ordinal()]) {
            case 1:
                C0358.f6674.f42.f1808.f7951.setText(String.valueOf(String.valueOf(j)) + " z");
                C0358.f6674.f42.f1808.f7952.setText(String.valueOf(String.valueOf(i3)) + " z");
                C0358.f6664.f2004.f8636 = i3;
                C0358.f6674.f42.f1781.m474(C0358.f6664.f2004);
                break;
            default:
                C0698 c0698 = C0358.f6674.f42.f1792;
                cv cvVar = C0358.f6685;
                int i4 = enumC0666.f7576;
                String strM649 = C0358.f6687.m649(i4);
                c0698.m1432(strM649 == null ? "MSG" + i4 : strM649, 16711680);
                break;
        }
    }
}
