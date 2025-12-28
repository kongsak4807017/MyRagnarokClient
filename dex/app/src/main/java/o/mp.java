package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class mp implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ hs f2146;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ mo f2147;

    mp(mo moVar, hs hsVar) {
        this.f2147 = moVar;
        this.f2146 = hsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mn mnVar = this.f2147.f2145;
        mnVar.f7638 = this.f2146;
        mnVar.m1423(mnVar.f7634, mnVar.f7629);
        ou ouVar = this.f2147.f2145.f7632;
        ouVar.f3378 = 1.0f;
        ouVar.f3377 = 1.0f;
        ouVar.f3376 = 1.0f;
        ouVar.f3379 = 1.0f;
    }
}
