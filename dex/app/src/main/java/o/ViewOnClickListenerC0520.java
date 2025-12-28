package o;

import android.view.View;

/* renamed from: o.㓫, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0520 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0744 f7220;

    ViewOnClickListenerC0520(C0744 c0744) {
        this.f7220 = c0744;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0744 c0744 = this.f7220;
        c0744.f7722.setVisibility(4);
        c0744.f7723.setVisibility(0);
        c0744.f7719.setText("Equipment");
        c0744.f7720 = false;
        c0744.m1441();
    }
}
