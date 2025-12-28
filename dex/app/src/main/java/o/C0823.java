package o;

import android.widget.ListAdapter;
import java.nio.ByteBuffer;

/* renamed from: o.祵, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0823 extends ub {
    C0823() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 602;
        int i3 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        int[] iArr = new int[i];
        for (int i4 = 0; i4 < i; i4++) {
            iArr[i4] = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        }
        if (z) {
            return;
        }
        C1008[] c1008Arr = new C1008[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            c1008Arr[i5] = new C1008(iArr[i5]);
        }
        C0876 c0876 = C0358.f6674.f42.f1753;
        c0876.f8045 = new C0798(this, i3);
        c0876.f8046.setAdapter((ListAdapter) new C0471((int[]) null, c1008Arr));
        c0876.h_();
    }
}
