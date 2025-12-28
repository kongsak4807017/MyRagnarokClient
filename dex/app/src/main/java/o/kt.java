package o;

import android.content.DialogInterface;
import o.je;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class kt implements DialogInterface.OnCancelListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je.C0055 f1908;

    kt(je.C0055 c0055) {
        this.f1908 = c0055;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f1908.f1832 = null;
        je.this.f1797.mo439();
        je.this.f1752.mo439();
        if (C0358.f6671 != null) {
            C0358.f6671.mo454(new C0166(this.f1908.f1831, (byte) -1));
        }
    }
}
