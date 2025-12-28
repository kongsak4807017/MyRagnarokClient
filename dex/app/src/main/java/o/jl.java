package o;

import android.content.DialogInterface;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class jl implements DialogInterface.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ jk f1851;

    jl(jk jkVar) {
        this.f1851 = jkVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            je jeVar = this.f1851.f1850;
            jeVar.f1822 = null;
            jeVar.f1791.setVisibility(8);
            jeVar.f1812.setVisibility(8);
            jeVar.m723();
        }
    }
}
