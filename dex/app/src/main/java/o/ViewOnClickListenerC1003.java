package o;

import android.view.View;
import android.widget.Toast;
import o.C0804;

/* renamed from: o.꽵, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC1003 implements View.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ C0906 f8477;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0804.Cif f8478;

    ViewOnClickListenerC1003(C0804.Cif cif, C0906 c0906) {
        this.f8478 = cif;
        this.f8477 = c0906;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string = this.f8477.f8192.getText().toString();
        if (string.length() != 6) {
            Toast.makeText(C0358.f6674, "Birth date should have YYMMDD format and have 6 digits.", 1).show();
        } else {
            C0358.f6671.mo454(new C0214(this.f8478.f7879.f7917.f3294, pa.m986(string, ow.LATIN, 6)));
        }
    }
}
