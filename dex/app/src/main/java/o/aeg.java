package o;

import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class aeg implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ aee f590;

    aeg(aee aeeVar) {
        this.f590 = aeeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aee aeeVar = this.f590;
        aeeVar.f588.removeView(aeeVar);
    }
}
