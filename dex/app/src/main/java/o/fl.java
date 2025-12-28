package o;

import android.app.AlertDialog;
import android.widget.EditText;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class fl extends fd {

    /* renamed from: ą, reason: contains not printable characters */
    String f1271;

    /* renamed from: Ć, reason: contains not printable characters */
    String f1272;

    fl(String str, String str2, String str3) {
        this.f1271 = str2;
        this.f1272 = str3;
        this.f1258 = str;
        this.f1257 = str3;
    }

    @Override // o.fd
    /* renamed from: 鷭 */
    final void mo593() {
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setTitle(this.f1258);
        EditText editText = new EditText(C0358.f6674);
        editText.setText(this.f1272);
        builder.setView(editText);
        builder.setPositiveButton("OK", new fm(this, editText));
        builder.show();
    }
}
