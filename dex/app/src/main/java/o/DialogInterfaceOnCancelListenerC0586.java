package o;

import android.content.DialogInterface;

/* renamed from: o.䓞, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class DialogInterfaceOnCancelListenerC0586 implements DialogInterface.OnCancelListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ int f7375;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0936 f7376;

    DialogInterfaceOnCancelListenerC0586(C0936 c0936, int i) {
        this.f7376 = c0936;
        this.f7375 = i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C0358.f6671.mo454(new C0155(this.f7375, false));
    }
}
