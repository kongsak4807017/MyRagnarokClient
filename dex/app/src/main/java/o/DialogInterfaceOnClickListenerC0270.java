package o;

import android.content.DialogInterface;

/* renamed from: o.ʌ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class DialogInterfaceOnClickListenerC0270 implements DialogInterface.OnClickListener {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ int f6583;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ int f6584;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0934 f6585;

    DialogInterfaceOnClickListenerC0270(C0934 c0934, int i, int i2) {
        this.f6585 = c0934;
        this.f6584 = i;
        this.f6583 = i2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0358.f6671.mo454(new C0152(this.f6584, this.f6583, false));
    }
}
