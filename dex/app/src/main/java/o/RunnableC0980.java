package o;

/* renamed from: o.ꍚ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0980 implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ Throwable f8336;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ Thread f8337;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0850 f8338;

    RunnableC0980(C0850 c0850, Thread thread, Throwable th) {
        this.f8338 = c0850;
        this.f8337 = thread;
        this.f8336 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8338.m1487(this.f8337, this.f8336);
    }
}
