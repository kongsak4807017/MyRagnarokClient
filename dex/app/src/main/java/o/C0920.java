package o;

import java.nio.ByteBuffer;

/* renamed from: o.骕, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0920 extends ub {
    C0920() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2615;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        int i3 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        C0132 c0132 = new C0132(byteBuffer);
        int i4 = byteBuffer.getInt();
        byte b4 = byteBuffer.get();
        byte b5 = byteBuffer.get();
        int i5 = byteBuffer.getInt();
        short s3 = byteBuffer.getShort();
        C0637 c0637 = new C0637(byteBuffer);
        byte b6 = byteBuffer.get();
        short s4 = byteBuffer.getShort();
        if (z) {
            return;
        }
        C1028.m1607(s, s2, i3, b, b2, b3, c0132, i4, b4, b5, i5, s3, c0637, b6, s4);
    }
}
