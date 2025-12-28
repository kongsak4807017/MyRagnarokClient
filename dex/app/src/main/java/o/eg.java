package o;

import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class eg implements View.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ lg f1172;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ ef f1173;

    eg(ef efVar, lg lgVar) {
        this.f1173 = efVar;
        this.f1172 = lgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws NumberFormatException {
        int i = Integer.parseInt(this.f1173.f1171.f1160.f8192.getText().toString());
        if (i <= 0 || i > this.f1172.f1964.f8500) {
            return;
        }
        C0358.f6671.mo454(new C0186(this.f1172.f1967, i));
    }
}
