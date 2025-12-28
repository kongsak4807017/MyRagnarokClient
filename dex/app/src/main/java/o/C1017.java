package o;

import android.widget.Toast;
import java.nio.ByteBuffer;
import o.pq;
import o.pr;

/* renamed from: o.댻, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1017 extends ub {

    /* renamed from: 櫯, reason: contains not printable characters */
    private static /* synthetic */ int[] f8519;

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] f8520;

    C1017() {
    }

    /* renamed from: Ą, reason: contains not printable characters */
    private static /* synthetic */ int[] m1596() {
        int[] iArr = f8519;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[pr.EnumC0083.valuesCustom().length];
        try {
            iArr2[pr.EnumC0083.BANNED.ordinal()] = 4;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[pr.EnumC0083.INVALID_INIT_ACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[pr.EnumC0083.MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[pr.EnumC0083.MESSAGE_EXIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[pr.EnumC0083.OLD_LICENSE_VERSION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f8519 = iArr2;
        return iArr2;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m1597() {
        int[] iArr = f8520;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[pq.EnumC0082.valuesCustom().length];
        try {
            iArr2[pq.EnumC0082.BANNED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[pq.EnumC0082.CORUPTED_UID.ordinal()] = 4;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[pq.EnumC0082.DUAL_LOGIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[pq.EnumC0082.OLD_VERSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[pq.EnumC0082.WRONG_GRF_HASH.ordinal()] = 6;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[pq.EnumC0082.WRONG_LICENSE_ID.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        f8520 = iArr2;
        return iArr2;
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) -17186;
        short s = byteBuffer.getShort();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        if (z) {
            return;
        }
        m1598(s, strM978);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1598(int i, String str) {
        String str2;
        if (C0358.f6671.f751 == null) {
            if (i < 0 || i >= pq.EnumC0082.valuesCustom().length) {
                throw new ut("Gepard initialization failure (" + i + ": " + str + "). Please contact GameMaster", true);
            }
            switch (m1597()[pq.EnumC0082.valuesCustom()[i].ordinal()]) {
                case 1:
                    str2 = "Banned";
                    break;
                case 2:
                    str2 = "Outdated Gepard version";
                    break;
                case 3:
                    str2 = "Dual login detected";
                    break;
                case 4:
                    str2 = "Corrupted UID";
                    break;
                case 5:
                    str2 = "Wrong License ID";
                    break;
                case 6:
                    str2 = "Wrong GRF hash";
                    break;
                default:
                    str2 = "unknown reason";
                    break;
            }
        } else {
            if (i < 0 || i >= pr.EnumC0083.valuesCustom().length) {
                throw new ut("Gepard 3.0 initialization failure (" + i + ": " + str + "). Please contact GameMaster", true);
            }
            switch (m1596()[pr.EnumC0083.valuesCustom()[i].ordinal()]) {
                case 1:
                    Toast.makeText(C0358.f6674, str, 1).show();
                    return;
                case 2:
                    str2 = str;
                    break;
                case 3:
                    str2 = "Invalid init ack";
                    break;
                case 4:
                    str2 = "You are banned";
                    break;
                case 5:
                    str2 = "Old license version";
                    break;
                default:
                    str2 = "unknown reason";
                    break;
            }
        }
        if (str != null && str.length() > 0) {
            str2 = String.valueOf(str2) + ": " + str;
        }
        C0358.f6683 = "Gepard initialization failure: " + str2;
        b bVar = C0358.f6671;
        if (bVar.f757 != null) {
            bVar.f757.f774 = true;
        }
    }
}
