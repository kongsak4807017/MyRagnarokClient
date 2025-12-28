package o;

import android.view.View;
import android.widget.AutoCompleteTextView;

/* renamed from: o.Ȩ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0236 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0570 f6532;

    ViewOnClickListenerC0236(C0570 c0570) {
        this.f6532 = c0570;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f6532.mo439();
        C0358.f6674.f42.f1792.h_();
        AutoCompleteTextView autoCompleteTextView = C0358.f6674.f42.f1792.f7651;
        lm lmVar = this.f6532.f7337.f2123;
        autoCompleteTextView.setText(((bh) (bh.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null)).f8368);
    }
}
