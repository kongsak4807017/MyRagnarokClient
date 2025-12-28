package o;

import android.content.DialogInterface;

/* renamed from: o.ʗ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class DialogInterfaceOnClickListenerC0279 implements DialogInterface.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ int f6600;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0936 f6601;

    DialogInterfaceOnClickListenerC0279(C0936 c0936, int i) {
        this.f6601 = c0936;
        this.f6600 = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0358.f6671.mo454(new C0155(this.f6600, true));
    }
}
