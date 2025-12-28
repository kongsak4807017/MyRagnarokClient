package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import org.apache.commons.net.nntp.NNTPReply;

/* renamed from: o.ʤ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0287 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] f6606;

    /* renamed from: o.ʤ$鷭, reason: contains not printable characters */
    enum EnumC0288 {
        ALREADY_IN_GUILD,
        REJECTED,
        ACCEPTED,
        GUILD_FULL;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0288[] valuesCustom() {
            EnumC0288[] enumC0288ArrValuesCustom = values();
            int length = enumC0288ArrValuesCustom.length;
            EnumC0288[] enumC0288Arr = new EnumC0288[length];
            System.arraycopy(enumC0288ArrValuesCustom, 0, enumC0288Arr, 0, length);
            return enumC0288Arr;
        }
    }

    C0287() {
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m1277() {
        int[] iArr = f6606;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0288.valuesCustom().length];
        try {
            iArr2[EnumC0288.ACCEPTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0288.ALREADY_IN_GUILD.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0288.GUILD_FULL.ordinal()] = 4;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC0288.REJECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f6606 = iArr2;
        return iArr2;
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 361;
        byte b = byteBuffer.get();
        if (z) {
        }
        switch (m1277()[EnumC0288.valuesCustom()[b].ordinal()]) {
            case 1:
                C0698 c0698 = C0358.f6674.f42.f1792;
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(379);
                c0698.m1432(strM649 == null ? "MSG379" : strM649, 16711680);
                break;
            case 2:
                C0698 c06982 = C0358.f6674.f42.f1792;
                cv cvVar2 = C0358.f6685;
                String strM6492 = C0358.f6687.m649(380);
                c06982.m1432(strM6492 == null ? "MSG380" : strM6492, 16711680);
                break;
            case 3:
                C0698 c06983 = C0358.f6674.f42.f1792;
                cv cvVar3 = C0358.f6685;
                String strM6493 = C0358.f6687.m649(NNTPReply.MORE_AUTH_INFO_REQUIRED);
                c06983.m1432(strM6493 == null ? "MSG381" : strM6493, SupportMenu.USER_MASK);
                break;
            case 4:
                C0698 c06984 = C0358.f6674.f42.f1792;
                cv cvVar4 = C0358.f6685;
                String strM6494 = C0358.f6687.m649(382);
                c06984.m1432(strM6494 == null ? "MSG382" : strM6494, 16711680);
                break;
        }
    }
}
