package o;

/* renamed from: o.免, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0635 implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ du f7504;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ RunnableC0900 f7505;

    RunnableC0635(RunnableC0900 runnableC0900, du duVar) {
        this.f7505 = runnableC0900;
        this.f7504 = duVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7504.m452();
        this.f7505.f8181.f45 = null;
        this.f7504.f1700.interrupt();
    }
}
