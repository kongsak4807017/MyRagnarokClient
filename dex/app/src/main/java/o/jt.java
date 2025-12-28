package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class jt implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je f1864;

    jt(je jeVar) {
        this.f1864 = jeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1864.f1734 != null) {
            this.f1864.f1734.dismiss();
            this.f1864.f1734 = null;
        }
        if (this.f1864.f1735 != null) {
            this.f1864.f1735.dismiss();
            this.f1864.f1735 = null;
        }
    }
}
