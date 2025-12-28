package o;

import com.roworkshop.andro.c_point;
import o.AbstractC0689;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class bj extends mc {

    /* renamed from: ē, reason: contains not printable characters */
    private static /* synthetic */ int[] f821;

    /* renamed from: ċ, reason: contains not printable characters */
    int f822;

    /* renamed from: Ȋ, reason: contains not printable characters */
    EnumC0025 f823;

    /* renamed from: 纫, reason: contains not printable characters */
    long f824;

    /* renamed from: o.bj$鷭, reason: contains not printable characters */
    enum EnumC0025 {
        UNKNOWN,
        SUCCESS_ROLLING,
        FAIL_ROLLING,
        SUCCESS,
        FAIL;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0025[] valuesCustom() {
            EnumC0025[] enumC0025ArrValuesCustom = values();
            int length = enumC0025ArrValuesCustom.length;
            EnumC0025[] enumC0025Arr = new EnumC0025[length];
            System.arraycopy(enumC0025ArrValuesCustom, 0, enumC0025Arr, 0, length);
            return enumC0025Arr;
        }
    }

    /* renamed from: ą, reason: contains not printable characters */
    private static /* synthetic */ int[] m461() {
        int[] iArr = f821;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0025.valuesCustom().length];
        try {
            iArr2[EnumC0025.FAIL.ordinal()] = 5;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0025.FAIL_ROLLING.ordinal()] = 3;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0025.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC0025.SUCCESS_ROLLING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC0025.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        f821 = iArr2;
        return iArr2;
    }

    bj(int i) {
        super(new hs(new hr("slotmachine", false, false, false)), new c_point(0, 0));
        this.f823 = EnumC0025.UNKNOWN;
        m1423(0, System.currentTimeMillis());
        this.f7635 = AbstractC0689.EnumC0690.LOOP_INFINITE;
        this.f822 = i;
        this.f7630 = 800L;
    }

    @Override // o.AbstractC0689
    /* renamed from: 鷭, reason: contains not printable characters */
    final int mo462(long j) {
        if (this.f823 == null) {
            return super.mo462(j);
        }
        switch (m461()[this.f823.ordinal()]) {
            case 1:
                return super.mo462(j);
            case 2:
            case 3:
                int i = super.mo462(j);
                int i2 = this.f7633;
                while (true) {
                    if (i2 != i) {
                        if (i2 == m1422()) {
                            i2 = -1;
                        }
                        if (this.f823 == EnumC0025.SUCCESS_ROLLING && i2 == 7) {
                            this.f823 = EnumC0025.SUCCESS;
                            this.f824 = j;
                        } else if (this.f823 != EnumC0025.FAIL_ROLLING || i2 != 3) {
                            i2++;
                        } else {
                            this.f823 = EnumC0025.FAIL;
                            this.f824 = j;
                        }
                    }
                }
                return i2;
            case 4:
                return 7;
            case 5:
                return 3;
            default:
                throw new RuntimeException();
        }
    }
}
