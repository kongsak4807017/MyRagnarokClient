package o;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: o.亶, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0624 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0767 f7489;

    ViewOnClickListenerC0624(C0767 c0767) {
        this.f7489 = c0767;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0358.f6674.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C0358.f6667.f4773)));
    }
}
