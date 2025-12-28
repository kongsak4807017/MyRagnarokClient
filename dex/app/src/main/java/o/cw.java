package o;

import android.app.AlertDialog;
import o.pj;
import org.apache.http.HttpHeaders;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class cw implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ boolean[] f1045;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ boolean[] f1046;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ cv f1047;

    cw(cv cvVar, boolean[] zArr, boolean[] zArr2) {
        this.f1047 = cvVar;
        this.f1046 = zArr;
        this.f1045 = zArr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setCancelable(false);
        builder.setTitle(HttpHeaders.WARNING);
        builder.setMessage("Game client not found in:\n" + oc.f3240 + "\n\nPress \"Ignore (slow!)\" to run the game and download resources in real-time (slow!)\nPress \"Download all\" to download the game client before starting (~" + (C0358.f6667.f4771 == pj.aux.ClassicRONet ? "506 MB" : "2 GB") + ")");
        builder.setPositiveButton("Ignore", new cx(this, this.f1046));
        builder.setNegativeButton("Download all", new cy(this, this.f1046, this.f1045));
        builder.show();
    }
}
