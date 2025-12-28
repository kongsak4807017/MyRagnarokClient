package o;

import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class w implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ s f5452;

    w(s sVar) {
        this.f5452 = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f5452.m1087(Integer.parseInt(this.f5452.f4971.f8192.getText().toString()));
        } catch (NumberFormatException unused) {
        }
    }
}
