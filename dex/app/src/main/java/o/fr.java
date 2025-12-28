package o;

import android.app.AlertDialog;
import android.os.Environment;
import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class fr implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ fn f1286;

    fr(fn fnVar) {
        this.f1286 = fnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setTitle("Set client directory");
        builder.setItems(new String[]{"Internal storage: " + C0358.f6674.getFilesDir().getAbsolutePath(), "External storage: " + Environment.getExternalStorageDirectory().getAbsolutePath(), "Custom"}, new fs(this));
        builder.show();
    }
}
