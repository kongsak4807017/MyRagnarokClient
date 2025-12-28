package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.ʔ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0277 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] f6593;

    /* renamed from: o.ʔ$鷭, reason: contains not printable characters */
    enum EnumC0278 {
        ALREADY_ALLIED,
        REJECTED,
        ACCEPTED,
        THEY_HAVE_TOO_MANY_ALLIES,
        YOU_HAVE_TOO_MANY_ALLIES;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0278[] valuesCustom() {
            EnumC0278[] enumC0278ArrValuesCustom = values();
            int length = enumC0278ArrValuesCustom.length;
            EnumC0278[] enumC0278Arr = new EnumC0278[length];
            System.arraycopy(enumC0278ArrValuesCustom, 0, enumC0278Arr, 0, length);
            return enumC0278Arr;
        }
    }

    C0277() {
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m1274() {
        int[] iArr = f6593;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0278.valuesCustom().length];
        try {
            iArr2[EnumC0278.ACCEPTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0278.ALREADY_ALLIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0278.REJECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC0278.THEY_HAVE_TOO_MANY_ALLIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC0278.YOU_HAVE_TOO_MANY_ALLIES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f6593 = iArr2;
        return iArr2;
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 371;
        byte b = byteBuffer.get();
        if (z) {
        }
        switch (m1274()[EnumC0278.valuesCustom()[b].ordinal()]) {
            case 1:
                C0698 c0698 = C0358.f6674.f42.f1792;
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(395);
                c0698.m1432(strM649 == null ? "MSG395" : strM649, 16711680);
                break;
            case 2:
                C0698 c06982 = C0358.f6674.f42.f1792;
                cv cvVar2 = C0358.f6685;
                String strM6492 = C0358.f6687.m649(396);
                c06982.m1432(strM6492 == null ? "MSG396" : strM6492, 16711680);
                break;
            case 3:
                C0698 c06983 = C0358.f6674.f42.f1792;
                cv cvVar3 = C0358.f6685;
                String strM6493 = C0358.f6687.m649(397);
                c06983.m1432(strM6493 == null ? "MSG397" : strM6493, SupportMenu.USER_MASK);
                break;
            case 4:
                C0698 c06984 = C0358.f6674.f42.f1792;
                cv cvVar4 = C0358.f6685;
                String strM6494 = C0358.f6687.m649(398);
                c06984.m1432(strM6494 == null ? "MSG398" : strM6494, 16711680);
                break;
            case 5:
                C0698 c06985 = C0358.f6674.f42.f1792;
                cv cvVar5 = C0358.f6685;
                String strM6495 = C0358.f6687.m649(399);
                c06985.m1432(strM6495 == null ? "MSG399" : strM6495, 16711680);
                break;
        }
    }
}
