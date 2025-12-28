package o;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ka implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je f1877;

    ka(je jeVar) {
        this.f1877 = jeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!C0358.f6667.f4815) {
            if (C0358.f6679.f6831.f8573.size() <= 0 && C0358.f6667.f4800 >= 20110614) {
                C0358.f6671.mo454(new C0894());
            }
            C0358.f6671.mo454(new C0541());
            return;
        }
        C0358.f6674.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C0358.f6667.f4846)));
    }
}
