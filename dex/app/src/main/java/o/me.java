package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class me implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ C0449 f2105;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ md f2106;

    me(md mdVar, C0449 c0449) {
        this.f2106 = mdVar;
        this.f2105 = c0449;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2106.f2104 == this.f2105) {
            this.f2106.f2104 = null;
        }
    }
}
