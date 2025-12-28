package o;

import java.nio.ByteBuffer;

/* renamed from: o.Β, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0375 extends ub {
    C0375() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 157;
        int i3 = byteBuffer.getInt();
        int i4 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        byte b = byteBuffer.get();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        if (z) {
            return;
        }
        C0489 c0489 = new C0489(i3, i4, b, s, s2, ((b2 - 3) - 6) * 5, ((b3 - 3) - 6) * 5, s3);
        C0358 c0358 = C0358.f6688;
        C0358.m1308(c0489);
    }
}
