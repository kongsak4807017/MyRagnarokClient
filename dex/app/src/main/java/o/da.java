package o;

import android.app.AlertDialog;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class da implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ boolean[] f1057;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ cv f1058;

    da(cv cvVar, boolean[] zArr) {
        this.f1058 = cvVar;
        this.f1057 = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setCancelable(false);
        builder.setMessage("Game client resources have been successfully downloaded");
        builder.setPositiveButton("Ok", new db(this, this.f1057));
        builder.show();
    }
}
