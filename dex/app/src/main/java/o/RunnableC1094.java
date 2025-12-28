package o;

import o.pl;

/* renamed from: o.왡, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC1094 implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ String f8870;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0835 f8871;

    RunnableC1094(C0835 c0835, String str) {
        this.f8871 = c0835;
        this.f8870 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            cr.m517(oc.f3240, this.f8870, false, pl.Cif.SKIP, (po) null);
        } catch (uw unused) {
        }
        C0358.f6674.mo139(new RunnableC1160(this, this.f8870));
    }
}
