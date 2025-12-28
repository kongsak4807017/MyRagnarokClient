package o;

import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class kj implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je f1898;

    kj(je jeVar) {
        this.f1898 = jeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f1898.f1810.f1994.getParent() != null) {
            this.f1898.f1810.mo439();
        } else {
            this.f1898.f1810.h_();
        }
    }
}
