package o;

import android.view.View;

/* renamed from: o.灛, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0783 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0744 f7819;

    ViewOnClickListenerC0783(C0744 c0744) {
        this.f7819 = c0744;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0744 c0744 = this.f7819;
        c0744.f7723.setVisibility(4);
        c0744.f7722.setVisibility(0);
        c0744.f7719.setText("Costumes");
        c0744.f7720 = true;
        c0744.m1441();
    }
}
