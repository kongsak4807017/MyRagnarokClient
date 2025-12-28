package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: o.ʈ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0267 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] f6574;

    /* renamed from: o.ʈ$鷭, reason: contains not printable characters */
    enum EnumC0268 {
        ACCEPT,
        DENY,
        YOURLISTFULL,
        HISLISTFULL;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0268[] valuesCustom() {
            EnumC0268[] enumC0268ArrValuesCustom = values();
            int length = enumC0268ArrValuesCustom.length;
            EnumC0268[] enumC0268Arr = new EnumC0268[length];
            System.arraycopy(enumC0268ArrValuesCustom, 0, enumC0268Arr, 0, length);
            return enumC0268Arr;
        }
    }

    C0267() {
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m1271() {
        int[] iArr = f6574;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0268.valuesCustom().length];
        try {
            iArr2[EnumC0268.ACCEPT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0268.DENY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0268.HISLISTFULL.ordinal()] = 4;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC0268.YOURLISTFULL.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        f6574 = iArr2;
        return iArr2;
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 521;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        if (z) {
        }
        switch (m1271()[EnumC0268.valuesCustom()[s].ordinal()]) {
            case 1:
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(822);
                C0358.f6674.f42.f1792.m1432(String.format(strM649 == null ? "MSG822" : strM649, strM978), SupportMenu.USER_MASK);
                C0358.f6664.f2004.f8613 = (C0729[]) Arrays.copyOf(C0358.f6664.f2004.f8613, C0358.f6664.f2004.f8613.length + 1);
                C0358.f6679.f6830.put(Integer.valueOf(i4), strM978);
                C0358.f6664.f2004.f8613[C0358.f6664.f2004.f8613.length - 1] = new C0729(i3, i4, true);
                if (C0358.f6674.f42.f1775.f1994.getParent() != null) {
                    C0358.f6674.f42.f1775.m1408(false);
                }
                if (C0358.f6674.f42.f1787.f1994.getParent() != null) {
                    C0358.f6674.f42.f1787.b_();
                    break;
                }
                break;
            case 2:
                cv cvVar2 = C0358.f6685;
                String strM6492 = C0358.f6687.m649(823);
                C0358.f6674.f42.f1792.m1432(String.format(strM6492 == null ? "MSG823" : strM6492, strM978), 16711680);
                break;
            case 3:
                cv cvVar3 = C0358.f6685;
                String strM6493 = C0358.f6687.m649(820);
                C0358.f6674.f42.f1792.m1432(strM6493 == null ? "MSG820" : strM6493, 16711680);
                break;
            case 4:
                cv cvVar4 = C0358.f6685;
                String strM6494 = C0358.f6687.m649(821);
                C0358.f6674.f42.f1792.m1432(String.format(strM6494 == null ? "MSG821" : strM6494, strM978), 16711680);
                break;
        }
    }
}
