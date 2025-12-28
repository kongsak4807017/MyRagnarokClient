package o;

import android.widget.ListAdapter;
import java.nio.ByteBuffer;

/* renamed from: o.䓶, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0589 extends ub {
    C0589() {
    }

    /* renamed from: o.䓶$鷭, reason: contains not printable characters */
    class C0590 {

        /* renamed from: 櫯, reason: contains not printable characters */
        String f7382;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f7383;

        C0590(ByteBuffer byteBuffer) {
            this.f7383 = byteBuffer.getInt();
            ow owVar = ow.LOCAL;
            byte[] bArr = new byte[24];
            byteBuffer.get(bArr);
            this.f7382 = pa.m978(bArr, owVar);
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 358;
        C0590[] c0590Arr = new C0590[i];
        for (int i3 = 0; i3 < c0590Arr.length; i3++) {
            c0590Arr[i3] = new C0590(byteBuffer);
        }
        if (z) {
            return;
        }
        if (C0358.f6664.f2004.f8635 == null) {
            C0358.f6664.f2004.f8635 = new C0972();
        }
        for (C0590 c0590 : c0590Arr) {
            C0358.f6664.f2004.f8635.m1554(c0590.f7383).f8313 = c0590.f7382;
        }
        if (C0358.f6674.f42.f1748.f1994.getParent() != null) {
            C0358.f6674.f42.f1748.f7697.mo1382();
            C0358.f6674.f42.f1748.f7698.f8917.setAdapter((ListAdapter) new C0669());
        }
    }
}
