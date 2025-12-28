package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ez implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ es f1236;

    ez(es esVar) {
        this.f1236 = esVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1236.f1219.f1700.interrupt();
        this.f1236.f1219 = null;
    }
}
