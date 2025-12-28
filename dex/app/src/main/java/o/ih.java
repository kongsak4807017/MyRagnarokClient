package o;

import android.app.ProgressDialog;
import android.content.DialogInterface;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class ih implements DialogInterface.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ ProgressDialog f1605;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ ib f1606;

    public ih(ib ibVar, ProgressDialog progressDialog) {
        this.f1606 = ibVar;
        this.f1605 = progressDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1605.dismiss();
    }
}
