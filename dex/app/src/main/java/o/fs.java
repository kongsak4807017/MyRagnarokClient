package o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.EditText;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class fs implements DialogInterface.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ fr f1287;

    fs(fr frVar) {
        this.f1287 = frVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        EditText editText = new EditText(C0358.f6674);
        editText.setText(oc.f3245);
        builder.setTitle("Input client subdirectory name");
        editText.setText("ragnarok");
        builder.setView(editText);
        builder.setPositiveButton("Ok", new ft(this, editText, i));
        builder.setNegativeButton("Cancel", (DialogInterface.OnClickListener) null);
        builder.show();
    }
}
