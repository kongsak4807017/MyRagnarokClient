package o;

import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class li implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ lg f1988;

    li(lg lgVar) {
        this.f1988 = lgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws NumberFormatException {
        lg lgVar = this.f1988;
        try {
            int i = Integer.parseInt(lgVar.f1963.f8192.getText().toString());
            if (i <= 0) {
                return;
            }
            if (i > lgVar.f1964.f8500) {
                i = lgVar.f1964.f8500;
            }
            lgVar.m769(lgVar.f1966, i);
        } catch (NumberFormatException unused) {
        }
    }
}
