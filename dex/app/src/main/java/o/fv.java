package o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import java.io.File;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class fv implements DialogInterface.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ File f1292;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ ft f1293;

    fv(ft ftVar, File file) {
        this.f1293 = ftVar;
        this.f1292 = file;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        if (this.f1292.mkdirs()) {
            oc.f3245 = this.f1292.getAbsolutePath();
            C0358.f6674.f42.f1751.f1277.setText(oc.f3245);
            builder.setMessage(String.valueOf(oc.f3245) + ": directory has been successfully created. Please restart application for the changes to take effect.");
            builder.setPositiveButton("Quit", new fw(this));
            builder.setCancelable(false);
        } else {
            builder.setMessage(String.valueOf(this.f1292.getAbsolutePath()) + ": couldn't create directory!");
        }
        builder.show();
    }
}
