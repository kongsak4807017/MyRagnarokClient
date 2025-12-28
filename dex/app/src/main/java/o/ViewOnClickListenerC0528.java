package o;

import android.view.View;
import o.C0358;

/* renamed from: o.㣖, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0528 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0570 f7240;

    ViewOnClickListenerC0528(C0570 c0570) {
        this.f7240 = c0570;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f7240.mo439();
        C0358.f6671.mo454(new C0204(this.f7240.f7337.f2123.f1998));
        C0358.C0361 c0361 = C0358.f6668;
        lm lmVar = this.f7240.f7337.f2123;
        c0361.f6714 = ((AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null)).f8368;
    }
}
