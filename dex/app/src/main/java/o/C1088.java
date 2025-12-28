package o;

import android.widget.ListAdapter;

/* renamed from: o.슐, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1088 extends xr implements vf {
    C1088() {
    }

    @Override // o.vf
    /* renamed from: 鷭 */
    public final void mo1041() {
        int[] iArr = new int[this.f5675.length];
        C1008[] c1008Arr = new C1008[this.f5675.length];
        for (int i = 0; i < c1008Arr.length; i++) {
            iArr[i] = this.f5675[i] - 2;
            c1008Arr[i] = C0358.f6664.f2004.f8622.get(Integer.valueOf(iArr[i]));
        }
        C0876 c0876 = C0358.f6674.f42.f1753;
        c0876.f8045 = new C0477(this);
        c0876.f8046.setAdapter((ListAdapter) new C0471(iArr, c1008Arr));
        c0876.h_();
    }
}
