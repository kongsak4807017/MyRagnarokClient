package o;

import java.nio.ByteBuffer;

/* renamed from: o.㐒, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0517 extends ub {
    C0517() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2750;
        short s = byteBuffer.getShort();
        String[] strArr = new String[i];
        for (int i3 = 0; i3 < i; i3++) {
            ow owVar = ow.LOCAL;
            byte[] bArr = new byte[16];
            byteBuffer.get(bArr);
            strArr[i3] = pa.m978(bArr, owVar);
        }
        if (z) {
            return;
        }
        C1138.m1641(s, strArr);
    }
}
