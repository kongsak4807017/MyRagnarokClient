package o;

import android.content.DialogInterface;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class fi implements DialogInterface.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ fh f1266;

    fi(fh fhVar) {
        this.f1266 = fhVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        fh fhVar = this.f1266;
        fhVar.f1254.setText(fhVar.f1264[i]);
        C0358.f6687.m658(fhVar.f1263, 0, String.valueOf(i));
        C0358.f6687.m647();
    }
}
