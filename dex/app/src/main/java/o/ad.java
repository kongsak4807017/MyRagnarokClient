package o;

import android.view.View;
import o.C0181;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ad implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ y f453;

    ad(y yVar) {
        this.f453 = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f453.mo439();
        C0358.f6671.mo454(new C0181(C0181.EnumC0182.RESPAWN));
    }
}
