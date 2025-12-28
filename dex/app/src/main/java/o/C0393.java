package o;

import java.nio.ByteBuffer;

/* renamed from: o.Й, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0393 extends ub {
    C0393() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2526;
        byteBuffer.getInt();
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        byte b = byteBuffer.get();
        byte[] bArr2 = new byte[i];
        byteBuffer.get(bArr2);
        if (z) {
            return;
        }
        C0719.m1436(bArr, bArr2, b);
    }
}
