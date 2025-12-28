package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import o.pj;

/* renamed from: o.微, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0694 extends ub {
    C0694() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2121;
        byteBuffer.getInt();
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        int i4 = C0358.f6667.f4771 != pj.aux.iRO_Renewal ? byteBuffer.getInt() : 0;
        if (z) {
            return;
        }
        if (s == 13) {
            C0698 c0698 = C0358.f6674.f42.f1792;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(58);
            c0698.m1432(strM649 == null ? "MSG58" : strM649, 16711680);
        } else if (s == 8) {
            C0698 c06982 = C0358.f6674.f42.f1792;
            cv cvVar2 = C0358.f6685;
            String strM6492 = C0358.f6687.m649(1578);
            c06982.m1432(strM6492 == null ? "MSG1578" : strM6492, 16711680);
        } else {
            C0698 c06983 = C0358.f6674.f42.f1792;
            cv cvVar3 = C0358.f6685;
            String strM6493 = C0358.f6687.m649(55);
            c06983.m1432(strM6493 == null ? "MSG55" : strM6493, SupportMenu.USER_MASK);
        }
        C0358.f6679.f6831.f8575 = i3;
        C0358.f6679.f6831.f8574 = i4;
        C0358.f6674.f42.f1756.e_();
    }
}
