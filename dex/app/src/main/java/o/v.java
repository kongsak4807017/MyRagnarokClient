package o;

import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class v implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ s f5348;

    v(s sVar) {
        this.f5348 = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f5348.f4972 = new C0906("Change item amount", true, null, this.f5348.f4982);
        this.f5348.f4972.h_();
    }
}
