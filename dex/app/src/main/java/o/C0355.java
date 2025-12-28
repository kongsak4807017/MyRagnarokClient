package o;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: o.ˮ̈́, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0355 extends ub {
    C0355() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 419;
        byte b = byteBuffer.get();
        int i3 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        if (z) {
            return;
        }
        if (b == 0) {
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(592);
            String str = strM649 == null ? "MSG592" : strM649;
            Object[] objArr = new Object[1];
            C0432 c0432M1648 = C0358.f6685.f1030.f967.m1648(i3);
            objArr[0] = c0432M1648 == null ? null : c0432M1648.m1328(true);
            C0358.f6674.f42.f1792.m1432(String.format(str, objArr), 16711680);
            return;
        }
        int i4 = 0;
        Iterator<C1008> it = C0358.f6664.f2004.f8622.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1008 next = it.next();
            if (next.f8502 == i3) {
                i4 = next.f8500;
                break;
            }
        }
        C0358.f6674.f42.f1792.m1430(i3, i4);
    }
}
