package o;

import android.content.DialogInterface;

/* renamed from: o.䓒, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class DialogInterfaceOnCancelListenerC0585 implements DialogInterface.OnCancelListener {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ int f7372;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ int f7373;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0934 f7374;

    DialogInterfaceOnCancelListenerC0585(C0934 c0934, int i, int i2) {
        this.f7374 = c0934;
        this.f7373 = i;
        this.f7372 = i2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C0358.f6671.mo454(new C0152(this.f7373, this.f7372, false));
    }
}
