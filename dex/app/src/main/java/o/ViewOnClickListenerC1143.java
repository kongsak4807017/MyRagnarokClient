package o;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: o.툀, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC1143 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0767 f8984;

    ViewOnClickListenerC1143(C0767 c0767) {
        this.f8984 = c0767;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = C0358.f6667.f4810;
        if (str.startsWith("www.")) {
            str = "http://" + str;
        }
        C0358.f6674.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }
}
