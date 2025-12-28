package o;

import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;

/* renamed from: o.ˮ̯, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0341 extends ub {
    C0341() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 713;
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        if (C0358.f6664.f2004 == null) {
            nz.m907("too early PKT_MC_PARTYINVITESTATE");
            return;
        }
        C0358.f6664.f2004.f8625 = b;
        C0358.f6664.f2004.f8637 = true;
        C0698 c0698 = C0358.f6674.f42.f1792;
        c_activity c_activityVar = C0358.f6674;
        c0698.m1431(C0698.f7650);
    }
}
