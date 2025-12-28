package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.鬽, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0938 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] f8235;

    /* renamed from: o.鬽$鷭, reason: contains not printable characters */
    enum EnumC0939 {
        SUCCESS,
        TOO_MANY_ANTAGONISTS,
        ALREADY_ANTAGONIST;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0939[] valuesCustom() {
            EnumC0939[] enumC0939ArrValuesCustom = values();
            int length = enumC0939ArrValuesCustom.length;
            EnumC0939[] enumC0939Arr = new EnumC0939[length];
            System.arraycopy(enumC0939ArrValuesCustom, 0, enumC0939Arr, 0, length);
            return enumC0939Arr;
        }
    }

    C0938() {
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m1545() {
        int[] iArr = f8235;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0939.valuesCustom().length];
        try {
            iArr2[EnumC0939.ALREADY_ANTAGONIST.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0939.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0939.TOO_MANY_ANTAGONISTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f8235 = iArr2;
        return iArr2;
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 385;
        byte b = byteBuffer.get();
        if (z) {
        }
        switch (m1545()[EnumC0939.valuesCustom()[b].ordinal()]) {
            case 1:
                C0698 c0698 = C0358.f6674.f42.f1792;
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(496);
                c0698.m1432(strM649 == null ? "MSG496" : strM649, SupportMenu.USER_MASK);
                break;
            case 2:
                C0698 c06982 = C0358.f6674.f42.f1792;
                cv cvVar2 = C0358.f6685;
                String strM6492 = C0358.f6687.m649(497);
                c06982.m1432(strM6492 == null ? "MSG497" : strM6492, 16711680);
                break;
            case 3:
                C0698 c06983 = C0358.f6674.f42.f1792;
                cv cvVar3 = C0358.f6685;
                String strM6493 = C0358.f6687.m649(498);
                c06983.m1432(strM6493 == null ? "MSG498" : strM6493, 16711680);
                break;
        }
    }
}
