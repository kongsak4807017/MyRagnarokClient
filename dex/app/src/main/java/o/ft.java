package o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Environment;
import android.util.Log;
import android.widget.EditText;
import java.io.File;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ft implements DialogInterface.OnClickListener {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ int f1288;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ EditText f1289;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ fs f1290;

    ft(fs fsVar, EditText editText, int i) {
        this.f1290 = fsVar;
        this.f1289 = editText;
        this.f1288 = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        File file;
        String string = this.f1289.getText().toString();
        switch (this.f1288) {
            case 0:
                file = new File(String.valueOf(C0358.f6674.getFilesDir().getAbsolutePath()) + "/" + string);
                break;
            case 1:
                file = new File(String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath()) + "/" + string);
                break;
            case 2:
                file = new File(string);
                break;
            default:
                Log.e("AndRO", "Unexpected choise");
                throw new nv("Unexpected choise");
        }
        if (file.exists()) {
            oc.f3245 = file.getAbsolutePath();
            C0358.f6674.f42.f1751.f1277.setText(oc.f3245);
            AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
            builder.setMessage("Directory has been successfully changed~ Please restart application for the changes to take effect.");
            builder.setPositiveButton("Quit", new fu(this));
            builder.show();
            return;
        }
        AlertDialog.Builder builder2 = new AlertDialog.Builder(C0358.f6674);
        builder2.setMessage(String.valueOf(string) + ": directory doesn't exist. Create?");
        builder2.setPositiveButton("Create", new fv(this, file));
        builder2.setNegativeButton("Cancel", (DialogInterface.OnClickListener) null);
        builder2.show();
    }
}
