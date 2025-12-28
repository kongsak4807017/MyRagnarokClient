package o;

import android.app.ProgressDialog;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class jr implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ String f1861;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je f1862;

    jr(je jeVar, String str) {
        this.f1862 = jeVar;
        this.f1861 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1862.f1734 == null) {
            this.f1862.f1734 = ProgressDialog.show(C0358.f6674, "Loading", this.f1861);
        } else {
            this.f1862.f1734.setMessage(this.f1861);
        }
    }
}
