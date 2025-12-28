package o;

import java.nio.ByteBuffer;

/* renamed from: o.䒺, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0583 extends ub {
    C0583() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 158;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        byte b = byteBuffer.get();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        short s4 = byteBuffer.getShort();
        if (z) {
            return;
        }
        int iM968 = pa.m968(s);
        C0358.f6685.f1030.f967.m1648(s);
        m1375(i3, iM968, b, s2, s3, b2, b3, s4);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1375(int i, int i2, byte b, short s, short s2, byte b2, byte b3, short s3) {
        C0489 c0489 = new C0489(i, i2, b, s, s2, ((b2 - 3) - 6) * 5, ((b3 - 3) - 6) * 5, s3);
        C0358 c0358 = C0358.f6688;
        C0358.m1308(c0489);
    }
}
