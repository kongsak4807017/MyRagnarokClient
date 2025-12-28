package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import org.apache.http.HttpStatus;

/* renamed from: o.傄, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0631 extends ub {
    C0631() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 350;
        int i3 = byteBuffer.getInt();
        if (z) {
            return;
        }
        if (i3 > 0) {
            C0698 c0698 = C0358.f6674.f42.f1792;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(367);
            c0698.m1432(strM649 == null ? "MSG367" : strM649, 16711680);
            return;
        }
        C0358.f6664.f2004.f8635 = null;
        C0358.f6664.f2004.f8348 = 0;
        C0698 c06982 = C0358.f6674.f42.f1792;
        cv cvVar2 = C0358.f6685;
        String strM6492 = C0358.f6687.m649(HttpStatus.SC_UNAUTHORIZED);
        c06982.m1432(strM6492 == null ? "MSG401" : strM6492, SupportMenu.USER_MASK);
        if (C0358.f6674.f42.f1748.f1994.getParent() != null) {
            C0358.f6674.f42.f1748.mo439();
        }
    }
}
