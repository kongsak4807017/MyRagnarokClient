package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class bu implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ boolean[] f858;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ bo f859;

    bu(bo boVar, boolean[] zArr) {
        this.f859 = boVar;
        this.f858 = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0358.f6674.f42.f1777 != null) {
            C0358.f6674.f42.f1777.removeAllViews();
        }
        C0358.f6674.f42.f1799.clear();
        C0358.f6674.f42.f1811.clear();
        C0358.f6674.f42.m716();
        C0358.f6674.f42.f1794 = null;
        C0358.f6674.f42.f1818 = null;
        C0358.f6669.f2063 = null;
        this.f858[0] = true;
    }
}
