package o;

import java.nio.ByteBuffer;

/* renamed from: o.喓, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0651 extends ub {
    C0651() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 160;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        short[] sArr = new short[4];
        for (int i3 = 0; i3 < sArr.length; i3++) {
            sArr[i3] = byteBuffer.getShort();
        }
        short s4 = byteBuffer.getShort();
        byte b4 = byteBuffer.get();
        byte b5 = byteBuffer.get();
        if (z) {
            return;
        }
        C1028.m1607(s, s2, pa.m968(s3), b, b2, b3, new C0132(sArr), s4, b4, b5, 0, (short) 0, null, (byte) 0, (short) 0);
    }
}
