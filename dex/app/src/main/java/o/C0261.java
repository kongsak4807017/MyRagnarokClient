package o;

import java.nio.ByteBuffer;

/* renamed from: o.ɷ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0261 extends ub {
    C0261() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2781;
        int i3 = byteBuffer.getInt();
        int i4 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        byteBuffer.getShort();
        byte b = byteBuffer.get();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        short s3 = byteBuffer.getShort();
        byteBuffer.get();
        byteBuffer.getShort();
        if (z) {
            return;
        }
        C0583.m1375(i3, i4, b, s, s2, b2, b3, s3);
    }
}
