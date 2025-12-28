package o;

import o.fb;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ew implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ int f1230;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ es f1231;

    ew(es esVar, int i) {
        this.f1231 = esVar;
        this.f1230 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((fb.C0040) this.f1231.f1224.getItemAtPosition(this.f1230)).m591(-2);
    }
}
