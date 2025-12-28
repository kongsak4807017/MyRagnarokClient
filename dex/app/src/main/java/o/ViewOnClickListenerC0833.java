package o;

import android.view.View;
import o.C0804;

/* renamed from: o.絢, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0833 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0804.C0806 f7946;

    ViewOnClickListenerC0833(C0804.C0806 c0806) {
        this.f7946 = c0806;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0804.C0806 c0806 = this.f7946;
        cv cvVar = C0358.f6685;
        int i = this.f7946.f7910 - 1;
        while (i < 0) {
            i += 9;
        }
        while (i > 8) {
            i -= 9;
        }
        c0806.f7910 = i;
        this.f7946.m1478();
    }
}
