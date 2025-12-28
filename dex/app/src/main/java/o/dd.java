package o;

import android.app.AlertDialog;
import java.io.File;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class dd implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ File f1062;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ dc f1063;

    dd(dc dcVar, File file) {
        this.f1063 = dcVar;
        this.f1062 = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setTitle("Fatal error");
        builder.setMessage(String.valueOf(this.f1062.getAbsolutePath()) + ": file corrupted. Delete file to repair client directory?");
        builder.setCancelable(false);
        builder.setNegativeButton("No (Quit)", new de(this));
        builder.setPositiveButton("Yes (recommended)", new df(this, this.f1062));
        builder.show();
    }
}
