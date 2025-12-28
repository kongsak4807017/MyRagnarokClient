package o;

import java.nio.ByteBuffer;

/* renamed from: o.Ǜ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class C0218 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    private final int f6512;

    C0218(short s, int i) {
        this.f5008 = s;
        this.f6512 = i;
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        byte[] bArr = new byte[this.f6512 > 0 ? this.f6512 - 2 : i];
        byteBuffer.get(bArr);
        if (z) {
            return;
        }
        pa.m977(bArr, " ");
    }
}
