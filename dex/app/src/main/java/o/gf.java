package o;

import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class gf implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ ge f1349;

    gf(ge geVar) {
        this.f1349 = geVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws NumberFormatException {
        int i;
        try {
            i = Integer.parseInt(this.f1349.f1341.f8192.getText().toString());
        } catch (NumberFormatException unused) {
            i = 1;
        }
        this.f1349.m600(this.f1349.f1336, i);
    }
}
