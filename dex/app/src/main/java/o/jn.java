package o;

import android.content.DialogInterface;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class jn implements DialogInterface.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je f1853;

    jn(je jeVar) {
        this.f1853 = jeVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        nb[] nbVarArr = {nb.HOMUN_INFORM, nb.FEED};
        C0358.f6671.mo454(new C1042((byte) nbVarArr[i].ordinal()));
        if (nbVarArr[i].ordinal() == 0) {
            C0358.f6674.f42.f1741.h_();
        }
    }
}
