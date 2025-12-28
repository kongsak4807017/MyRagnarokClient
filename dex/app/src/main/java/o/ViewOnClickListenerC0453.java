package o;

import android.view.View;
import o.C0744;

/* renamed from: o.ങ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0453 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0744 f6902;

    ViewOnClickListenerC0453(C0744 c0744) {
        this.f6902 = c0744;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0744.C0745 c0745;
        for (C0744.C0745 c07452 : this.f6902.f7725) {
            if (view == c07452.f7731 || view == c07452.f7726 || view == c07452.f7733) {
                c0745 = c07452;
                break;
            }
        }
        c0745 = null;
        C0744.C0745 c07453 = c0745;
        if (c0745 != null) {
            C0358.f6671.mo454(new C0205((short) c07453.f7728));
        }
    }
}
