package o;

import o.hs;
import o.ud;

/* renamed from: o.弿, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
abstract class AbstractC0689 {

    /* renamed from: Ȋ, reason: contains not printable characters */
    private static /* synthetic */ int[] f7628;

    /* renamed from: Ą, reason: contains not printable characters */
    long f7629;

    /* renamed from: ą, reason: contains not printable characters */
    long f7630;

    /* renamed from: Ć, reason: contains not printable characters */
    int f7631;

    /* renamed from: ȃ, reason: contains not printable characters */
    int f7633;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    int f7634;

    /* renamed from: 岱, reason: contains not printable characters */
    float f7636;

    /* renamed from: 櫯, reason: contains not printable characters */
    C0753 f7637;

    /* renamed from: 鷭, reason: contains not printable characters */
    hs f7638;

    /* renamed from: ć, reason: contains not printable characters */
    ou f7632 = new ou(1.0f, 1.0f, 1.0f, 1.0f);

    /* renamed from: ˮ͍, reason: contains not printable characters */
    EnumC0690 f7635 = EnumC0690.LOOP_ONCE;

    /* renamed from: o.弿$鷭, reason: contains not printable characters */
    enum EnumC0690 {
        SINGLE_FRAME,
        LOOP_ONCE,
        LOOP_INFINITE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0690[] valuesCustom() {
            EnumC0690[] enumC0690ArrValuesCustom = values();
            int length = enumC0690ArrValuesCustom.length;
            EnumC0690[] enumC0690Arr = new EnumC0690[length];
            System.arraycopy(enumC0690ArrValuesCustom, 0, enumC0690Arr, 0, length);
            return enumC0690Arr;
        }
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    private static /* synthetic */ int[] m1417() {
        int[] iArr = f7628;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0690.valuesCustom().length];
        try {
            iArr2[EnumC0690.LOOP_INFINITE.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0690.LOOP_ONCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0690.SINGLE_FRAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f7628 = iArr2;
        return iArr2;
    }

    AbstractC0689(hs hsVar, float f) {
        this.f7638 = hsVar;
        this.f7636 = f;
        if (this.f7638 != null) {
            m1423(0, System.currentTimeMillis());
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1423(int i, long j) {
        this.f7634 = i >= this.f7638.f1524.length ? 0 : i;
        this.f7629 = j;
        this.f7630 = 0L;
        int iMo462 = mo462(j);
        this.f7633 = iMo462;
        this.f7631 = iMo462;
    }

    /* renamed from: 鷭 */
    int mo462(long j) {
        long j2 = j - this.f7629;
        int length = 0;
        if (j2 < 0) {
            j2 = 0;
        }
        switch (m1417()[this.f7635.ordinal()]) {
            case 1:
                length = this.f7633;
                break;
            case 2:
                length = (int) (j2 / m1418());
                hs hsVar = this.f7638;
                int i = this.f7634;
                if (i >= hsVar.f1524.length) {
                    i = 0;
                }
                if (hsVar.f1524[i] == null) {
                    hsVar.mo633(i);
                }
                if (length >= hsVar.f1524[i].f1527.length) {
                    hs hsVar2 = this.f7638;
                    int i2 = this.f7634;
                    if (i2 >= hsVar2.f1524.length) {
                        i2 = 0;
                    }
                    if (hsVar2.f1524[i2] == null) {
                        hsVar2.mo633(i2);
                    }
                    length = hsVar2.f1524[i2].f1527.length - 1;
                    break;
                }
                break;
            case 3:
                int iM1418 = (int) (j2 / m1418());
                hs hsVar3 = this.f7638;
                int i3 = this.f7634;
                if (i3 >= hsVar3.f1524.length) {
                    i3 = 0;
                }
                if (hsVar3.f1524[i3] == null) {
                    hsVar3.mo633(i3);
                }
                length = iM1418 % hsVar3.f1524[i3].f1527.length;
                break;
        }
        if (length < 0) {
            return 0;
        }
        return length;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    protected final int m1422() {
        hs hsVar = this.f7638;
        int i = this.f7634;
        if (i >= hsVar.f1524.length) {
            i = 0;
        }
        if (hsVar.f1524[i] == null) {
            hsVar.mo633(i);
        }
        return hsVar.f1524[i].f1527.length;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final ud.C0086 m1420() {
        if (this.f7638.f1522 != null && this.f7638.f1522.f1504 != null) {
            return this.f7638.f1522.f1504.f5018[this.f7634];
        }
        return null;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final void m1421(long j) {
        this.f7630 = m1422() * j;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private int m1418() {
        int iM1422;
        if (this.f7630 != 0 && (iM1422 = m1422()) != 0 && this.f7630 >= iM1422 && iM1422 != 0) {
            return ((int) this.f7630) / iM1422;
        }
        return 100;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final boolean m1419(long j) {
        int iM1418 = m1418();
        int iM1422 = m1422();
        return iM1422 != 0 && this.f7635 == EnumC0690.LOOP_ONCE && this.f7629 + ((long) (iM1418 * iM1422)) < j;
    }

    /* renamed from: 鷭 */
    hs.C0049.C0050 mo840(int i) {
        this.f7633 = i;
        hs hsVar = this.f7638;
        int i2 = this.f7634;
        if (i2 >= hsVar.f1524.length) {
            i2 = 0;
        }
        if (hsVar.f1524[i2] == null) {
            hsVar.mo633(i2);
        }
        hs.C0049 c0049 = hsVar.f1524[i2];
        return c0049.f1527[i % c0049.f1527.length];
    }
}
