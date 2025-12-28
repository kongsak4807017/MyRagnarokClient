package o;

import java.nio.ByteBuffer;
import o.C0249;

/* renamed from: o.ঽ্, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0434 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    static final String[] f6856 = {"Failed to lock account to lock-file", "Account has been locked to key-file", "Server closed", "Server is on maintenance mode", "Invalid PIN code", "Your IP is banned", "Account is bound to a different key-file", "Failed to lock your account: you are not a premium user."};

    C0434() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        short s;
        this.f5008 = (short) -28669;
        short s2 = byteBuffer.getShort();
        if (z) {
            return;
        }
        String str = null;
        if (s2 < 0) {
            short s3 = (short) (-s2);
            if (s3 < C1134.f8968.length) {
                cv cvVar = C0358.f6685;
                int i3 = C1134.f8968[s3];
                String strM649 = C0358.f6687.m649(i3);
                str = strM649 == null ? "MSG" + i3 : strM649;
            }
        } else if (s2 < C0249.EnumC0250.valuesCustom().length) {
            cv cvVar2 = C0358.f6685;
            int i4 = C0249.EnumC0250.valuesCustom()[s2].f6559;
            String strM6492 = C0358.f6687.m649(i4);
            str = strM6492 == null ? "MSG" + i4 : strM6492;
        } else if (s2 > 1000 && (s = (short) (s2 - 1000)) < f6856.length) {
            str = f6856[s];
        }
        C0358.f6683 = str;
        b bVar = C0358.f6671;
        if (bVar.f757 != null) {
            bVar.f757.f774 = true;
        }
    }
}
