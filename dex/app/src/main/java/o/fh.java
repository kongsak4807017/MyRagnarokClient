package o;

import android.app.AlertDialog;
import android.content.DialogInterface;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class fh extends fd {

    /* renamed from: ą, reason: contains not printable characters */
    String f1263;

    /* renamed from: Ć, reason: contains not printable characters */
    String[] f1264;

    /* renamed from: ć, reason: contains not printable characters */
    private DialogInterface.OnClickListener f1265 = new fi(this);

    fh(String str, String str2, String[] strArr) {
        this.f1263 = str2;
        this.f1264 = strArr;
        String str3 = strArr[C0358.f6687.m648(str2, 0)];
        this.f1258 = str;
        this.f1257 = str3;
    }

    @Override // o.fd
    /* renamed from: 鷭 */
    final void mo593() {
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setTitle(this.f1258);
        builder.setItems(this.f1264, this.f1265);
        builder.show();
    }
}
