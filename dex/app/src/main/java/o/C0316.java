package o;

import android.support.v4.internal.view.SupportMenu;
import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;

/* renamed from: o.ˮ̄, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0316 extends ub {
    C0316() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2076;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        if (z) {
            return;
        }
        c_activity c_activityVar = C0358.f6674;
        C1008 c1008 = C0358.f6664.f2004.f8622.get(Integer.valueOf(s - 2));
        if (c1008 != null) {
            C0698 c0698 = C0358.f6674.f42.f1792;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(1747);
            c0698.m1432(String.format(strM649 == null ? "MSG1747" : strM649, c1008.m1592(C0358.f6685.f1030.f967), Integer.valueOf(s2), Integer.valueOf(i3 * s2)), SupportMenu.USER_MASK);
            c1008.f8500 -= s2;
            if (c1008.f8500 <= 0) {
                C0358.f6664.f2004.f8622.remove(Integer.valueOf(s - 2));
            }
            C0358.f6674.f42.f1810.m1463();
        }
    }
}
