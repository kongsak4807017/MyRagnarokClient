package o;

import android.app.AlertDialog;
import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class hd implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ hc f1466;

    hd(hc hcVar) {
        this.f1466 = hcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gx gxVarM613 = C0358.f6685.f1030.f968.m613(this.f1466.f1461.f1409);
        if (oc.f3251) {
            C0358.f6671.mo454(new C0789(this.f1466.f1461.f1409));
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setTitle((CharSequence) null);
        builder.setMessage("Are you sure you want to learn " + gxVarM613.f1427 + " [Lv. " + (this.f1466.f1461.f1407 + 1) + "] ?");
        builder.setPositiveButton("Yes", new he(this));
        builder.setNegativeButton("No", new hf(this));
        builder.show();
    }
}
