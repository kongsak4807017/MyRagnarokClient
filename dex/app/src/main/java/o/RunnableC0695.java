package o;

import o.C0851;

/* renamed from: o.徹, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0695 implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1106 f7646;

    RunnableC0695(C1106 c1106) {
        this.f7646 = c1106;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            C0358.f6669.f2066.m1511(C0358.f6669.f2048.f1554, C0851.Cif.SPRITE_COLORS, C0851.Cif.SPRITE_PALETTES, false);
        } catch (nv e) {
            nz.m907("Flying damage error " + e.getMessage());
        }
    }
}
