package o;

import java.nio.ByteBuffer;

/* renamed from: o.背, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0843 extends ub {
    C0843() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2256;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byteBuffer.getShort();
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        C0932.m1539(s, s2, b == 0);
    }
}
