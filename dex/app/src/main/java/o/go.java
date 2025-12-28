package o;

import android.view.View;
import o.gm;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class go implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ gm.C0042 f1371;

    go(gm.C0042 c0042) {
        this.f1371 = c0042;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strM606 = this.f1371.m606();
        if (strM606 == null) {
            return;
        }
        C0358.f6671.mo454(new C0154(C0358.f6664.f2004.f8368, strM606));
    }
}
