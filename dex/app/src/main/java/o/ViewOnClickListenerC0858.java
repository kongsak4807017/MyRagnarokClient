package o;

import android.view.View;
import o.C0804;

/* renamed from: o.襑, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0858 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0804.Cif f8034;

    ViewOnClickListenerC0858(C0804.Cif cif) {
        this.f8034 = cif;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0804.Cif cif = this.f8034;
        if (!C0358.f6667.f4779) {
            cif.m1475();
        } else if (cif.f7879.f7917.f3269 == 0) {
            C0358.f6671.mo454(new C0211(cif.f7879.f7917.f3294));
        } else {
            cif.m1475();
        }
    }
}
