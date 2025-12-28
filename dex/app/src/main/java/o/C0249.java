package o;

import java.nio.ByteBuffer;
import org.apache.commons.net.nntp.NNTPReply;

/* renamed from: o.ɞ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0249 extends ub {
    C0249() {
    }

    /* renamed from: o.ɞ$鷭, reason: contains not printable characters */
    enum EnumC0250 {
        UNREGISTERED_ID(7),
        INCORRECT_PASSWORD(8),
        EXPIRED_ID(9),
        REJECTED_FROM_SERVER(10),
        BLOCKED_BY_GM(267),
        EXE_NOT_LATEST(311),
        BANNED(704),
        OVERPOPULATION(NNTPReply.POSTING_NOT_ALLOWED),
        ACCOUNT_LIMIT_FROM_COMPANY(682),
        BAN_BY_DBA(706),
        EMAIL_NOT_CONFIRMED(1373),
        BAN_BY_GM(2439),
        WORKING_IN_DB(576),
        SELF_LOCK(708),
        NOT_PERM_GROUP(709),
        NOT_PERM_GROUP2(709),
        LOGIN_INFO_REMAINS_AT(810),
        HACKING_INVESTIGATION(811),
        BUG_INVESTIGATION(812),
        DELETING_CHAR(860),
        HACKING_INVESTIGATION2(811),
        DELETING_SPOUSE_CHAR(861),
        UNKNOWN_ERROR(2572);


        /* renamed from: ė, reason: contains not printable characters */
        int f6559;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0250[] valuesCustom() {
            EnumC0250[] enumC0250ArrValuesCustom = values();
            int length = enumC0250ArrValuesCustom.length;
            EnumC0250[] enumC0250Arr = new EnumC0250[length];
            System.arraycopy(enumC0250ArrValuesCustom, 0, enumC0250Arr, 0, length);
            return enumC0250Arr;
        }

        EnumC0250(int i) {
            this.f6559 = i;
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 106;
        byte b = byteBuffer.get();
        String strM978 = pa.m978(byteBuffer.get(new byte[20]).array(), ow.LOCAL);
        if (z) {
            return;
        }
        m1266(b, strM978);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static final void m1266(int i, String str) {
        int i2;
        if (i >= 0 && i < EnumC0250.valuesCustom().length) {
            EnumC0250 enumC0250 = EnumC0250.valuesCustom()[i];
            new StringBuilder("Disconnected from server: ").append(enumC0250);
            i2 = enumC0250.f6559;
        } else {
            i2 = 3;
        }
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(i2);
        String str2 = String.valueOf(strM649 == null ? "MSG" + i2 : strM649) + " (" + i + ")";
        if (str != null && str.length() > 0) {
            str2 = String.valueOf(str2) + "\n" + str;
        }
        C0358.f6683 = str2;
        b bVar = C0358.f6671;
        if (bVar.f757 != null) {
            bVar.f757.f774 = true;
        }
    }
}
