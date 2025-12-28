package o;

import android.app.AlertDialog;
import android.view.View;

/* renamed from: o.릯, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC1061 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0804 f8838;

    ViewOnClickListenerC1061(C0804 c0804) {
        this.f8838 = c0804;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dl dlVar = C0358.f6676;
        if (dlVar.f1079) {
            new AlertDialog.Builder(C0358.f6674).setMessage("Already processing other purchase, can't show buying menu").show();
            return;
        }
        if (dlVar.f1080 == null) {
            new AlertDialog.Builder(C0358.f6674).setMessage("Can't start purchase process: not connected to Billing Server. Please try again later.").show();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setTitle("Store");
        String[] strArr = new String[C0632.f7498.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = String.valueOf(C0632.f7498[i].f7502) + " -> $" + C0632.f7498[i].f7501;
        }
        builder.setItems(strArr, new dt(dlVar));
        builder.show();
    }
}
