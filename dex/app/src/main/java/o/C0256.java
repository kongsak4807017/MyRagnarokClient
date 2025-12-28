package o;

import java.nio.ByteBuffer;

/* renamed from: o.ɬ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0256 extends ub {
    C0256() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2248;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getInt();
        int i7 = byteBuffer.getInt();
        byteBuffer.get();
        short s = byteBuffer.getShort();
        byte b = byteBuffer.get();
        int i8 = byteBuffer.getInt();
        if (z) {
            return;
        }
        C0930.m1538(i3, i4, i5, i6, i7, s, b, i8);
    }
}
