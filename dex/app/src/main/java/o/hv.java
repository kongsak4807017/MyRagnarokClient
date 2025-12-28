package o;

import o.bj;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class hv implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ int f1564;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ hu f1565;

    hv(hu huVar, int i) {
        this.f1565 = huVar;
        this.f1564 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1565.f1546 == null) {
            this.f1565.f1546 = new bj(this.f1564);
        } else {
            this.f1565.f1546.f823 = bj.EnumC0025.UNKNOWN;
        }
    }
}
