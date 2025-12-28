package o;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class fm implements DialogInterface.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ EditText f1273;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ fl f1274;

    fm(fl flVar, EditText editText) {
        this.f1274 = flVar;
        this.f1273 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String string = this.f1273.getText().toString();
        if (string.length() > 1) {
            Toast.makeText(C0358.f6674, "Prefix' length must be 1 character", 1).show();
            return;
        }
        this.f1274.f1272 = string;
        this.f1273.setText(this.f1274.f1272);
        this.f1274.f1254.setText(this.f1274.f1272);
        C0358.f6687.m658(this.f1274.f1271, 0, this.f1274.f1272);
        C0358.f6687.m647();
    }
}
