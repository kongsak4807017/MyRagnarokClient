package o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̼, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0349 extends ub {
    C0349() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2057;
        byteBuffer.getInt();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        pa.m978(bArr, owVar);
        byteBuffer.getInt();
        byteBuffer.getShort();
        byteBuffer.getShort();
        short[] sArr = new short[6];
        for (int i3 = 0; i3 < sArr.length; i3++) {
            sArr[i3] = byteBuffer.getShort();
        }
        if (!z) {
            throw new uz(this);
        }
    }
}
