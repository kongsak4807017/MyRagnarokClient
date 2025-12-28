package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.䋓, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0563 extends ub {
    C0563() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 547;
        int i3 = byteBuffer.getInt();
        int i4 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        if (z) {
        }
        String str = C0358.f6685.f1030.f967.m1648(i4).f6855;
        switch (i3) {
            case 0:
                C0698 c0698 = C0358.f6674.f42.f1792;
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(912);
                c0698.m1432(String.format(strM649 == null ? "MSG912" : strM649, str), SupportMenu.USER_MASK);
                break;
            case 1:
                C0698 c06982 = C0358.f6674.f42.f1792;
                cv cvVar2 = C0358.f6685;
                String strM6492 = C0358.f6687.m649(913);
                c06982.m1432(String.format(strM6492 == null ? "MSG913" : strM6492, str), 52685);
                break;
            case 2:
                C0698 c06983 = C0358.f6674.f42.f1792;
                cv cvVar3 = C0358.f6685;
                String strM6493 = C0358.f6687.m649(914);
                c06983.m1432(String.format(strM6493 == null ? "MSG914" : strM6493, str), 16763080);
                break;
            case 3:
                C0698 c06984 = C0358.f6674.f42.f1792;
                cv cvVar4 = C0358.f6685;
                String strM6494 = C0358.f6687.m649(915);
                c06984.m1432(String.format(strM6494 == null ? "MSG915" : strM6494, str), 16763080);
                break;
        }
    }
}
