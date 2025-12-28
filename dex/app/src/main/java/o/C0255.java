package o;

import java.nio.ByteBuffer;

/* renamed from: o.ɫ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0255 extends ub {
    C0255() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 138;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        short s3 = byteBuffer.getShort();
        if (z) {
            return;
        }
        C0930.m1538(i3, i4, i5, i6, s, s2, b, s3);
    }
}
