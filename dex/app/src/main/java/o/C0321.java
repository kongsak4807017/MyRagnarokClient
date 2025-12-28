package o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̌, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0321 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    static final int[] f6624 = {855, -1, -1, 831, 834};

    C0321() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 330;
        int i3 = byteBuffer.getInt();
        if (z || i3 < 0 || i3 >= f6624.length || f6624[i3] < 0) {
            return;
        }
        C0698 c0698 = C0358.f6674.f42.f1792;
        cv cvVar = C0358.f6685;
        int i4 = f6624[i3];
        String strM649 = C0358.f6687.m649(i4);
        c0698.m1432(strM649 == null ? "MSG" + i4 : strM649, 16776960);
    }
}
