package o;

import android.view.View;

/* renamed from: o.橙, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0759 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0399 f7755;

    ViewOnClickListenerC0759(C0399 c0399) {
        this.f7755 = c0399;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0399 c0399 = this.f7755;
        C0927 c0927 = (C0927) c0399.f6758.getAdapter();
        C0927 c09272 = (C0927) c0399.f6760.getAdapter();
        if (c0927 != null) {
            C0358.f6671.mo454(new C0550(c0399.f6770, c0399.f6773, c0927.f8218));
            for (int i = 0; i < c09272.f8218.size(); i++) {
                c09272.f8218.get(i).f7409.f8500 = c09272.f8218.get(i).f7409.f8500;
            }
            c0399.f6775 = 0;
            c0399.f6771 = 0;
            c0399.f6776 = 0;
            c0399.mo439();
        }
    }
}
