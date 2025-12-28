package o;

import java.nio.ByteBuffer;

/* renamed from: o.濋, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0780 extends ub {
    C0780() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 1036;
        int i3 = byteBuffer.getInt();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (z) {
            return;
        }
        C0358.f6674.f42.m732(pa.m978(bArr, ow.LOCAL), (-16777216) | i3);
    }
}
