package o;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: o.턗, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1138 extends ub {
    C1138() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 284;
        short s = byteBuffer.getShort();
        String[] strArr = new String[4];
        for (int i3 = 0; i3 < strArr.length; i3++) {
            ow owVar = ow.LOCAL;
            byte[] bArr = new byte[16];
            byteBuffer.get(bArr);
            strArr[i3] = pa.m978(bArr, owVar);
        }
        if (z) {
            return;
        }
        m1641(s, strArr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1641(short s, String[] strArr) {
        int i = 0;
        for (int i2 = 0; i2 < strArr.length && strArr[i2].length() > 0; i2++) {
            i++;
        }
        C0358.f6674.f42.m736(s, (String[]) Arrays.copyOf(strArr, i));
    }
}
