package o;

import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class kk implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je f1899;

    kk(je jeVar) {
        this.f1899 = jeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f1899.f1781.f1994.getParent() != null) {
            ch chVar = this.f1899.f1781;
            chVar.mo439();
            chVar.f902.h_();
        } else {
            if (this.f1899.f1781.f902.f1994.getParent() != null) {
                this.f1899.f1781.f902.mo439();
            } else {
                this.f1899.f1781.h_();
            }
        }
    }
}
