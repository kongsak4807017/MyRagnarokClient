package o;

import java.nio.ByteBuffer;

/* renamed from: o.ㆲ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0512 extends ub {
    C0512() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2569;
        int i3 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        byte b = byteBuffer.get();
        int i4 = byteBuffer.getInt();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byte b4 = byteBuffer.get();
        C0132 c0132 = new C0132(byteBuffer);
        C0637 c0637 = new C0637(byteBuffer);
        if (z) {
            return;
        }
        C1124.m1637(i3, b, i4, b2, b3, b4, c0132, c0637);
    }
}
