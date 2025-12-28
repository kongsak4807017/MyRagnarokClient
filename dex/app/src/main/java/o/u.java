package o;

import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class u implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ s f4997;

    u(s sVar) {
        this.f4997 = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4997.f4971 = new C0906("Change item price", true, null, this.f4997.f4978);
        this.f4997.f4971.h_();
    }
}
