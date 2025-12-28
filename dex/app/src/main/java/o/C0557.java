package o;

import java.nio.ByteBuffer;

/* renamed from: o.䃝, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0557 extends ub {
    C0557() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2571;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        int i4 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byte b4 = byteBuffer.get();
        short[] sArr = new short[4];
        for (int i5 = 0; i5 < sArr.length; i5++) {
            sArr[i5] = byteBuffer.getShort();
        }
        C0637 c0637 = new C0637(byteBuffer);
        if (z) {
            return;
        }
        C0663.m1410(s, i3, i4, b, b2, b3, b4, new C0132(sArr), c0637);
    }
}
