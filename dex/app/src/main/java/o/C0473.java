package o;

import java.nio.ByteBuffer;

/* renamed from: o.ᙆ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0473 extends ub {
    C0473() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2247;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byteBuffer.get(new byte[i]);
        if (z) {
            return;
        }
        AbstractC1101.m1632(i3, i4, s, s2, b, b2, b3 == 1, 1);
    }
}
