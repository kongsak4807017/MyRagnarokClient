package o;

import android.view.View;

/* renamed from: o.盂, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0809 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0653 f7921;

    ViewOnClickListenerC0809(C0653 c0653) {
        this.f7921 = c0653;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC0988 abstractC0988;
        C0653 c0653 = this.f7921;
        lm lmVar = C0358.f6664.f2005.get(C0358.f6664.f2004.f8618.f8661.f8689);
        if (lmVar == null) {
            abstractC0988 = null;
        } else {
            abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        }
        AbstractC0988 abstractC09882 = abstractC0988;
        if (abstractC0988 != null) {
            c0653.f7562.setEnabled(false);
            c0653.f7562.setInputType(524288);
            c0653.f7562.setTextColor(-1);
            abstractC09882.f8368 = c0653.f7562.getText().toString();
            c0653.f7555.setVisibility(4);
            C0358.f6671.mo454(new C0160(abstractC09882.f8368));
        }
    }
}
