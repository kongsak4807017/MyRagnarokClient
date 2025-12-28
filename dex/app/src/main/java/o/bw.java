package o;

import o.C0851;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class bw implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ boolean[] f863;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ C0450[] f864;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ bo f865;

    bw(bo boVar, C0450[] c0450Arr, boolean[] zArr) {
        this.f865 = boVar;
        this.f864 = c0450Arr;
        this.f863 = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        C0851 c0851 = C0358.f6669.f2066;
        c0851.m1512(this.f864[0], C0358.f6669.f2048.f1554);
        c0851.m1511(C0358.f6669.f2048.f1554, C0851.Cif.SPRITE_COLORS, C0851.Cif.SPRITE_PALETTES, true);
        c0851.f7970 = nh.READY;
        this.f863[0] = true;
    }
}
