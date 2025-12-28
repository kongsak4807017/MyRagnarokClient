package o;

import java.nio.ByteBuffer;

/* renamed from: o.鮑, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0949 extends ub {
    C0949() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 253;
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        pa.m978(bArr, owVar);
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        C0460.m1349(b);
    }
}
