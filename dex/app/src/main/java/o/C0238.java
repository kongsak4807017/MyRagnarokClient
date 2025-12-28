package o;

import java.nio.ByteBuffer;

/* renamed from: o.ȭ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0238 extends ub {
    C0238() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 281;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        C0239.m1265(i3, s, s2, s3, b);
    }
}
