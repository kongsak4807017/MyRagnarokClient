package o;

import android.content.DialogInterface;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class jz implements DialogInterface.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je f1876;

    jz(je jeVar) {
        this.f1876 = jeVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
