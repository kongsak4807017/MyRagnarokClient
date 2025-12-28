package o;

import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ki implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je f1897;

    ki(je jeVar) {
        this.f1897 = jeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0698 c0698 = this.f1897.f1792;
        if (c0698.f7652.getVisibility() == 0) {
            c0698.mo439();
        } else {
            c0698.h_();
        }
    }
}
