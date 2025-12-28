package o;

import android.app.AlertDialog;
import android.content.DialogInterface;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class fj extends fd {

    /* renamed from: ą, reason: contains not printable characters */
    private static final int[] f1267 = {-1, 0, 1, 4};

    /* renamed from: Ć, reason: contains not printable characters */
    private static final String[] f1268 = {"Default", "Landscape", "Portrait", "Sensor"};

    /* renamed from: ć, reason: contains not printable characters */
    private DialogInterface.OnClickListener f1269 = new fk(this);

    fj() {
        for (int i = 0; i < f1267.length; i++) {
            if (oc.f3242 == f1267[i]) {
                String str = f1268[i];
                this.f1258 = "Screen orientation";
                this.f1257 = str;
                return;
            }
        }
        String str2 = f1268[0];
        this.f1258 = "Screen orientation";
        this.f1257 = str2;
    }

    @Override // o.fd
    /* renamed from: 鷭 */
    final void mo593() {
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setItems(f1268, this.f1269);
        builder.show();
    }
}
