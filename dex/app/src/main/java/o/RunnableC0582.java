package o;

/* renamed from: o.䒮, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0582 implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ md f7369;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ md f7370;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ RunnableC0253 f7371;

    RunnableC0582(RunnableC0253 runnableC0253, md mdVar, md mdVar2) {
        this.f7371 = runnableC0253;
        this.f7370 = mdVar;
        this.f7369 = mdVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0933 c0933 = new C0933(this.f7370, this.f7369, pe.HIT1);
        md mdVar = this.f7370;
        synchronized (mdVar.f2127) {
            mdVar.f2127.add(c0933);
        }
    }
}
