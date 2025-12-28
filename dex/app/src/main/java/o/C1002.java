package o;

import java.nio.ByteBuffer;

/* renamed from: o.꽑, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1002 extends ub {
    C1002() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 664;
        int i3 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        int i4 = byteBuffer.getInt();
        if (z) {
            return;
        }
        C0698 c0698 = C0358.f6674.f42.f1792;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(1271);
        String str = strM649 == null ? "MSG1271" : strM649;
        Object[] objArr = new Object[2];
        C0432 c0432M1648 = C0358.f6685.f1030.f967.m1648(i3);
        objArr[0] = c0432M1648 == null ? null : c0432M1648.m1328(true);
        objArr[1] = Integer.valueOf(i4);
        c0698.m1432(String.format(str, objArr), 16776960);
    }
}
