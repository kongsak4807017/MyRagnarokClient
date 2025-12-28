package o;

import android.content.DialogInterface;
import o.je;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ks implements DialogInterface.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je.C0055 f1907;

    ks(je.C0055 c0055) {
        this.f1907 = c0055;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1907.f1832 = null;
        if (C0358.f6671 != null) {
            C0358.f6671.mo454(new C0166(this.f1907.f1831, (byte) (i + 1)));
        }
    }
}
