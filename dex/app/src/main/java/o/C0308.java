package o;

import java.nio.ByteBuffer;

/* renamed from: o.ˏ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0308 extends ub {
    C0308() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        short s;
        this.f5008 = (short) 164;
        C1154[] c1154Arr = new C1154[i];
        for (int i3 = 0; i3 < c1154Arr.length; i3++) {
            short s2 = byteBuffer.getShort();
            short s3 = byteBuffer.getShort();
            byte b = byteBuffer.get();
            byte b2 = byteBuffer.get();
            short s4 = byteBuffer.getShort();
            short s5 = byteBuffer.getShort();
            byte b3 = byteBuffer.get();
            byte b4 = byteBuffer.get();
            C0132 c0132 = new C0132(byteBuffer);
            int iM968 = pa.m968(s3);
            if (C0358.f6685 != null) {
                C0432 c0432M1648 = C0358.f6685.f1030.f967.m1648(s3);
                s = (short) (c0432M1648 == null ? -1 : c0432M1648.f6850);
            } else {
                s = 0;
            }
            c1154Arr[i3] = new C1154(s2, iM968, b, s4, s5, b4, c0132, 0, (short) 0, s, (byte) 0, null, (byte) ((b2 != 0 ? 1 : 0) | (b3 != 0 ? 2 : 0)));
        }
        if (z) {
            return;
        }
        AbstractC0309.m1280(c1154Arr);
    }
}
