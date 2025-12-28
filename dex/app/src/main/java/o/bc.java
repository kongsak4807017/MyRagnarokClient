package o;

import android.app.AlertDialog;
import android.content.DialogInterface;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class bc implements DialogInterface.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ bf f786;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ az f787;

    bc(az azVar, bf bfVar) {
        this.f787 = azVar;
        this.f786 = bfVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case 0:
                AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
                builder.setTitle((CharSequence) null).setMessage("Do you really want to change party leadership to " + this.f786.f792.f695 + " ?");
                builder.setPositiveButton("Yes", new bd(this, this.f786));
                builder.setNegativeButton("No", (DialogInterface.OnClickListener) null);
                builder.show();
                break;
            case 1:
                C0358.f6671.mo454(new C0734(this.f786.f792.f696, this.f786.f792.f695));
                break;
        }
    }
}
