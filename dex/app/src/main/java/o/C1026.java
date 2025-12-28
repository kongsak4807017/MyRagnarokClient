package o;

import java.nio.ByteBuffer;
import org.apache.commons.net.ftp.FTPReply;

/* renamed from: o.둇, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1026 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] f8550;

    /* renamed from: o.둇$鷭, reason: contains not printable characters */
    enum EnumC1027 {
        SUCCESS,
        TARGET_OFFLINE,
        IGNORED,
        IGNORED_ALL;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC1027[] valuesCustom() {
            EnumC1027[] enumC1027ArrValuesCustom = values();
            int length = enumC1027ArrValuesCustom.length;
            EnumC1027[] enumC1027Arr = new EnumC1027[length];
            System.arraycopy(enumC1027ArrValuesCustom, 0, enumC1027Arr, 0, length);
            return enumC1027Arr;
        }
    }

    C1026() {
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m1604() {
        int[] iArr = f8550;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC1027.valuesCustom().length];
        try {
            iArr2[EnumC1027.IGNORED.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC1027.IGNORED_ALL.ordinal()] = 4;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC1027.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC1027.TARGET_OFFLINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f8550 = iArr2;
        return iArr2;
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 152;
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        m1605(b);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1605(byte b) {
        C0698 c0698;
        StringBuilder sb;
        String str;
        switch (m1604()[EnumC1027.valuesCustom()[b].ordinal()]) {
            case 1:
                C0358.f6674.f42.f1792.m1431(C0478.f6930);
                c0698 = C0358.f6674.f42.f1792;
                sb = new StringBuilder("(To ").append(C0478.f6930).append(") : ");
                str = C0478.f6929;
                break;
            case 2:
                C0698 c06982 = C0358.f6674.f42.f1792;
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(149);
                c06982.m1432(strM649 == null ? "MSG149" : strM649, 16776960);
                return;
            case 3:
                C0698 c06983 = C0358.f6674.f42.f1792;
                StringBuilder sb2 = new StringBuilder(String.valueOf(C0478.f6930));
                cv cvVar2 = C0358.f6685;
                String strM6492 = C0358.f6687.m649(FTPReply.FILE_STATUS_OK);
                c06983.m1432(sb2.append(strM6492 == null ? "MSG150" : strM6492).toString(), 16776960);
                return;
            case 4:
                c0698 = C0358.f6674.f42.f1792;
                sb = new StringBuilder(String.valueOf(C0478.f6930));
                cv cvVar3 = C0358.f6685;
                String strM6493 = C0358.f6687.m649(151);
                if (strM6493 != null) {
                    str = strM6493;
                    break;
                } else {
                    str = "MSG151";
                    break;
                }
            default:
                return;
        }
        c0698.m1432(sb.append(str).toString(), 16776960);
    }
}
