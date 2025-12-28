package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ix implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ iw f1702;

    ix(iw iwVar) {
        this.f1702 = iwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        do {
            try {
                this.f1702.mo451();
            } catch (InterruptedException unused) {
                return;
            }
        } while (!Thread.interrupted());
    }
}
