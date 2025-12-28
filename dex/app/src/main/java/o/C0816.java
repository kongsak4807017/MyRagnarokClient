package o;

import java.nio.ByteBuffer;

/* renamed from: o.碚, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0816 extends ub {
    C0816() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 233;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        short[] sArr = new short[4];
        for (int i4 = 0; i4 < sArr.length; i4++) {
            sArr[i4] = byteBuffer.getShort();
        }
        if (z) {
            return;
        }
        C1124.m1637(pa.m968(s), (byte) -1, i3, b, b2, b3, new C0132(sArr), null);
    }
}
