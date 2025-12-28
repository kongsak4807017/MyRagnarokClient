package o;

import o.fb;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ex implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ int f1232;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ int f1233;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ es f1234;

    ex(es esVar, int i, int i2) {
        this.f1234 = esVar;
        this.f1233 = i;
        this.f1232 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((fb.C0040) this.f1234.f1224.getItemAtPosition(this.f1233)).m591(this.f1232);
    }
}
