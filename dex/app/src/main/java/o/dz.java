package o;

import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class dz implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ dx f1141;

    dz(dx dxVar) {
        this.f1141 = dxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dx dxVar = this.f1141;
        if (dxVar.f1132 == null || dxVar.f1132.length <= 0) {
            return;
        }
        C0358.f6671.mo454(new C0189(dxVar.f1136.f7867, dxVar.f1136.f7868));
    }
}
