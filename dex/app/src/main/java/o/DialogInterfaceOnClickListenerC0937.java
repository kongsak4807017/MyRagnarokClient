package o;

import android.content.DialogInterface;

/* renamed from: o.鬱, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class DialogInterfaceOnClickListenerC0937 implements DialogInterface.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ int f8233;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0285 f8234;

    DialogInterfaceOnClickListenerC0937(C0285 c0285, int i) {
        this.f8234 = c0285;
        this.f8233 = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0358.f6671.mo454(new C0158(this.f8233, false));
    }
}
