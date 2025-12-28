package o;

import java.nio.ByteBuffer;

/* renamed from: o.諒, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1151 extends ub {
    C1151() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2572;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        C0132 c0132 = new C0132(byteBuffer);
        int i3 = byteBuffer.getInt();
        byte b4 = byteBuffer.get();
        byte b5 = byteBuffer.get();
        int i4 = byteBuffer.getInt();
        short s4 = byteBuffer.getShort();
        C0637 c0637 = new C0637(byteBuffer);
        if (z) {
            return;
        }
        C1028.m1607(s, s2, pa.m968(s3), b, b2, b3, c0132, i3, b4, b5, i4, s4, c0637, (byte) 0, (short) 0);
    }
}
