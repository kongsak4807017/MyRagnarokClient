package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.ˮ̤, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0334 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    byte f6642;

    C0334() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 203;
        this.f6642 = byteBuffer.get();
        if (z) {
            return;
        }
        if (this.f6642 > 0) {
            C0698 c0698 = C0358.f6674.f42.f1792;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(58);
            c0698.m1432(strM649 == null ? "MSG58" : strM649, 16711680);
            return;
        }
        C0698 c06982 = C0358.f6674.f42.f1792;
        cv cvVar2 = C0358.f6685;
        String strM6492 = C0358.f6687.m649(55);
        c06982.m1432(strM6492 == null ? "MSG55" : strM6492, SupportMenu.USER_MASK);
    }
}
