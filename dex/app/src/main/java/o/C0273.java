package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.ʏ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0273 extends ub {
    C0273() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 518;
        byteBuffer.getInt();
        int i3 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        m1273(i3, b != 0);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1273(int i, boolean z) {
        int i2 = 0;
        while (true) {
            if (i2 >= C0358.f6664.f2004.f8613.length) {
                break;
            }
            if (C0358.f6664.f2004.f8613[i2].f7707 != i) {
                i2++;
            } else {
                C0358.f6664.f2004.f8613[i2].f7706 = !z;
                if (C0358.f6674.f42.f1775.f1994.getParent() != null) {
                    C0358.f6674.f42.f1775.m1408(true);
                }
            }
        }
        C0698 c0698 = C0358.f6674.f42.f1792;
        cv cvVar = C0358.f6685;
        int i3 = z ? 1043 : 1042;
        String strM649 = C0358.f6687.m649(i3);
        c0698.m1432(String.format(strM649 == null ? "MSG" + i3 : strM649, C0358.f6679.f6830.get(Integer.valueOf(i))), SupportMenu.USER_MASK);
    }
}
