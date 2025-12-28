package o;

import android.content.DialogInterface;

/* renamed from: o.ʋ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class DialogInterfaceOnClickListenerC0269 implements DialogInterface.OnClickListener {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ int f6580;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ int f6581;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0934 f6582;

    DialogInterfaceOnClickListenerC0269(C0934 c0934, int i, int i2) {
        this.f6582 = c0934;
        this.f6581 = i;
        this.f6580 = i2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0358.f6671.mo454(new C0152(this.f6581, this.f6580, true));
    }
}
