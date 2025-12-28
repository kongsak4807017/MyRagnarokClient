package o;

import android.widget.ListAdapter;
import java.nio.ByteBuffer;
import o.C0972;

/* renamed from: o.ʰ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0293 extends ub {
    C0293() {
    }

    /* renamed from: o.ʰ$鷭, reason: contains not printable characters */
    class C0294 {

        /* renamed from: ȃ, reason: contains not printable characters */
        int f6613;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f6614;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f6615;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f6616;

        C0294(ByteBuffer byteBuffer) {
            this.f6616 = byteBuffer.getInt();
            this.f6615 = byteBuffer.getInt();
            this.f6614 = byteBuffer.getInt();
            this.f6613 = byteBuffer.getInt();
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 352;
        C0294[] c0294Arr = new C0294[i];
        for (int i3 = 0; i3 < c0294Arr.length; i3++) {
            c0294Arr[i3] = new C0294(byteBuffer);
        }
        if (z) {
            return;
        }
        if (C0358.f6664.f2004.f8635 == null) {
            C0358.f6664.f2004.f8635 = new C0972();
        }
        for (C0294 c0294 : c0294Arr) {
            C0972.C0973 c0973M1554 = C0358.f6664.f2004.f8635.m1554(c0294.f6616);
            c0973M1554.f8312 = (c0294.f6615 & 1) > 0;
            c0973M1554.f8311 = (c0294.f6615 & 16) > 0;
            c0973M1554.f8310 = c0294.f6613;
        }
        if (C0358.f6674.f42.f1748.f1994.getParent() != null) {
            C0358.f6674.f42.f1748.f7697.mo1382();
            C0358.f6674.f42.f1748.f7698.f8917.setAdapter((ListAdapter) new C0669());
        }
    }
}
