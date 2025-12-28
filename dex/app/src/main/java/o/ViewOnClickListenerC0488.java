package o;

import android.view.View;
import o.C0804;

/* renamed from: o.Ἆ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0488 implements View.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ C0906 f6953;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0804.Cif f6954;

    ViewOnClickListenerC0488(C0804.Cif cif, C0906 c0906) {
        this.f6954 = cif;
        this.f6953 = c0906;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0358.f6671.mo454(new C0526(this.f6954.f7879.f7917.f3294, this.f6953.f8192.getText().toString()));
        C0804.this.f7871 = this.f6954.f7879.f7917.f3294;
    }
}
