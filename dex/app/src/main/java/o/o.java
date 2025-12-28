package o;

import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class o implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ n f3227;

    o(n nVar) {
        this.f3227 = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n nVar = this.f3227;
        nVar.f2325.setText("");
        nVar.f2326.setVisibility(4);
        if (C0358.f6671 != null) {
            C0358.f6671.mo454(new C0197(nVar.f2327));
        }
    }
}
