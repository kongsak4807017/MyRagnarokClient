package o;

import android.view.View;

/* renamed from: o.ғ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0400 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0841 f6778;

    ViewOnClickListenerC0400(C0841 c0841) {
        this.f6778 = c0841;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            C0358.f6671.mo454(new C0176(Integer.parseInt(this.f6778.f7954.getText().toString())));
        } catch (NumberFormatException unused) {
        }
    }
}
