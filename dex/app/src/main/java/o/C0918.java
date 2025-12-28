package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import o.C0685.C0686;

/* renamed from: o.驓, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0918 extends ub {
    C0918() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 220;
        byteBuffer.getShort();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        if (z) {
            return;
        }
        if (C0358.f6664.f2004.f8616 == null) {
            C0358.f6664.f2004.f8616 = new C0685();
        }
        C0685 c0685 = C0358.f6664.f2004.f8616;
        c0685.f7620.add(c0685.new C0686(strM978, true));
        C0358.f6674.f42.f1755.h_();
        C1025 c1025 = C0358.f6674.f42.f1755;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(180);
        c1025.m1603(String.format(strM649 == null ? "MSG180" : strM649, strM978), SupportMenu.USER_MASK);
    }
}
