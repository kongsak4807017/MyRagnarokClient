package o;

import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class p implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ n f3389;

    p(n nVar) {
        this.f3389 = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n nVar = this.f3389;
        nVar.mo439();
        if (C0358.f6671 != null) {
            C0358.f6671.mo454(new C0196(nVar.f2327));
        }
    }
}
