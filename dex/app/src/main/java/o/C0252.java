package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import o.C0685.C0686;

/* renamed from: o.ɤ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0252 extends ub {
    C0252() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 214;
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        if (b == 1) {
            C0698 c0698 = C0358.f6674.f42.f1792;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(66);
            c0698.m1432(strM649 == null ? "MSG66" : strM649, 16711680);
            return;
        }
        if (b == 2) {
            C0698 c06982 = C0358.f6674.f42.f1792;
            cv cvVar2 = C0358.f6685;
            String strM6492 = C0358.f6687.m649(67);
            c06982.m1432(strM6492 == null ? "MSG67" : strM6492, 16711680);
            return;
        }
        if (C0358.f6664.f2004.f8616 == null) {
            C0358.f6664.f2004.f8616 = new C0685();
        }
        C0358.f6664.f2004.f8616.f7620.clear();
        C0358.f6664.f2004.f8616.f7620.add(C0358.f6664.f2004.f8616.new C0686(C0358.f6664.f2004.f8368, false));
        C0358.f6674.f42.f1755.f8548.setText((CharSequence) null);
        C0358.f6674.f42.f1755.h_();
        C0698 c06983 = C0358.f6674.f42.f1792;
        cv cvVar3 = C0358.f6685;
        String strM6493 = C0358.f6687.m649(65);
        c06983.m1432(strM6493 == null ? "MSG65" : strM6493, SupportMenu.USER_MASK);
    }
}
