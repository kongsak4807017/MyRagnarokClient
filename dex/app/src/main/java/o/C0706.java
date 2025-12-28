package o;

import android.widget.ListAdapter;
import java.nio.ByteBuffer;

/* renamed from: o.慑, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0706 extends ub {
    C0706() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 375;
        short[] sArr = new short[i];
        for (int i3 = 0; i3 < sArr.length; i3++) {
            sArr[i3] = byteBuffer.getShort();
        }
        if (z) {
            return;
        }
        int[] iArr = new int[i];
        C1008[] c1008Arr = new C1008[i];
        for (int i4 = 0; i4 < i; i4++) {
            iArr[i4] = sArr[i4] - 2;
            c1008Arr[i4] = C0358.f6664.f2004.f8622.get(Integer.valueOf(iArr[i4]));
            if (c1008Arr[i4] == null) {
                return;
            }
        }
        C0876 c0876 = C0358.f6674.f42.f1753;
        c0876.f8045 = new C0303(this);
        c0876.f8046.setAdapter((ListAdapter) new C0471(iArr, c1008Arr));
        c0876.h_();
    }
}
