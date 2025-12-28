package o;

import android.content.DialogInterface;

/* renamed from: o.ʣ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class DialogInterfaceOnCancelListenerC0286 implements DialogInterface.OnCancelListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ int f6604;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0285 f6605;

    DialogInterfaceOnCancelListenerC0286(C0285 c0285, int i) {
        this.f6605 = c0285;
        this.f6604 = i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C0358.f6671.mo454(new C0158(this.f6604, false));
    }
}
