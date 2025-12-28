package o;

import java.nio.ByteBuffer;

/* renamed from: o.쳘, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1119 extends ub {
    C1119() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 170;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        if (C0358.f6667.f4800 >= 20100629) {
            byteBuffer.getShort();
        }
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        C0932.m1539(s, s2, b == 1);
    }
}
