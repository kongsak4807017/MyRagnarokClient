package o;

import android.view.View;
import o.C0181;
import o.je;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ko implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je.Cif f1903;

    ko(je.Cif cif) {
        this.f1903 = cif;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1903.f1828.dismiss();
        C0358.f6671.mo454(new C0181(C0181.EnumC0182.RESPAWN));
    }
}
