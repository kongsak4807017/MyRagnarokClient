package o;

import android.content.DialogInterface;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class fk implements DialogInterface.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ fj f1270;

    fk(fj fjVar) {
        this.f1270 = fjVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        oc.f3242 = fj.f1267[i];
        this.f1270.f1254.setText(fj.f1268[i]);
        C0358.f6687.m645();
        C0358.f6674.setRequestedOrientation(fj.f1267[i]);
    }
}
