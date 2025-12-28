package o;

import android.app.ProgressDialog;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class g implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ b f1302;

    g(b bVar) {
        this.f1302 = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0358.f6674.f42.f1773 = new ProgressDialog(C0358.f6674);
        C0358.f6674.f42.f1773.setTitle("Please wait");
        C0358.f6674.f42.f1773.setMessage("Connecting");
        C0358.f6674.f42.f1773.show();
    }
}
