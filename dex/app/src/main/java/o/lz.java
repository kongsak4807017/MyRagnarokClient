package o;

import java.util.Arrays;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class lz implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ ly f2067;

    lz(ly lyVar) {
        this.f2067 = lyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0616 c0616 = new C0616();
        ir irVar = this.f2067.f2063.f6872;
        lv lvVar = this.f2067.f2063.f6873;
        C0424[] c0424Arr = this.f2067.f2063.f6875;
        C1157 c1157M1660 = this.f2067.f2057.m1660();
        new C0753(Arrays.copyOf(this.f2067.f2050.f7745, 16));
        int i = this.f2067.f2058.x;
        int i2 = this.f2067.f2058.y;
        c0616.m1398(irVar, lvVar, c0424Arr, c1157M1660);
        this.f2067.f2055.f7475 = c0616.f7475;
        this.f2067.f2055.f7473 = c0616.f7473;
        this.f2067.f2055.f7474 = c0616.f7474;
    }
}
