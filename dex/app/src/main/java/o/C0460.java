package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.ᅡ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0460 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] f6907;

    /* renamed from: o.ᅡ$鷭, reason: contains not printable characters */
    enum EnumC0461 {
        ALREADY_IN_A_PARTY,
        REJECTED,
        ACCEPTED,
        PARTY_IS_FULL,
        SAME_ACCOUNT_IN_YOUR_PARTY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0461[] valuesCustom() {
            EnumC0461[] enumC0461ArrValuesCustom = values();
            int length = enumC0461ArrValuesCustom.length;
            EnumC0461[] enumC0461Arr = new EnumC0461[length];
            System.arraycopy(enumC0461ArrValuesCustom, 0, enumC0461Arr, 0, length);
            return enumC0461Arr;
        }
    }

    C0460() {
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m1348() {
        int[] iArr = f6907;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0461.valuesCustom().length];
        try {
            iArr2[EnumC0461.ACCEPTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0461.ALREADY_IN_A_PARTY.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0461.PARTY_IS_FULL.ordinal()] = 4;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC0461.REJECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC0461.SAME_ACCOUNT_IN_YOUR_PARTY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f6907 = iArr2;
        return iArr2;
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 709;
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        pa.m978(bArr, owVar);
        int i3 = byteBuffer.getInt();
        if (z) {
            return;
        }
        m1349(i3);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1349(int i) {
        switch (m1348()[EnumC0461.valuesCustom()[i].ordinal()]) {
            case 1:
                C0698 c0698 = C0358.f6674.f42.f1792;
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(80);
                c0698.m1432(strM649 == null ? "MSG80" : strM649, 16711680);
                break;
            case 2:
                C0698 c06982 = C0358.f6674.f42.f1792;
                cv cvVar2 = C0358.f6685;
                String strM6492 = C0358.f6687.m649(82);
                c06982.m1432(strM6492 == null ? "MSG82" : strM6492, 16711680);
                break;
            case 3:
                C0698 c06983 = C0358.f6674.f42.f1792;
                cv cvVar3 = C0358.f6685;
                String strM6493 = C0358.f6687.m649(83);
                c06983.m1432(strM6493 == null ? "MSG83" : strM6493, SupportMenu.USER_MASK);
                break;
            case 4:
                C0698 c06984 = C0358.f6674.f42.f1792;
                cv cvVar4 = C0358.f6685;
                String strM6494 = C0358.f6687.m649(84);
                c06984.m1432(strM6494 == null ? "MSG84" : strM6494, 16711680);
                break;
            case 5:
                C0698 c06985 = C0358.f6674.f42.f1792;
                cv cvVar5 = C0358.f6685;
                String strM6495 = C0358.f6687.m649(609);
                c06985.m1432(strM6495 == null ? "MSG609" : strM6495, 16711680);
                break;
        }
    }
}
