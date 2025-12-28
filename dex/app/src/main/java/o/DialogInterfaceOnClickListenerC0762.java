package o;

import android.content.DialogInterface;
import o.kv;

/* renamed from: o.檝, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class DialogInterfaceOnClickListenerC0762 implements DialogInterface.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ C0757 f7765;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0668 f7766;

    DialogInterfaceOnClickListenerC0762(C0668 c0668, C0757 c0757) {
        this.f7766 = c0668;
        this.f7765 = c0757;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            C0358.f6671.mo454(new C0884(this.f7765.f7750));
        } else {
            C0358.f6674.f42.m735(kv.EnumC0058.EMOTION, this.f7765.f7750.ordinal(), -1, 0, (byte) 0);
            this.f7766.f7580.mo439();
        }
    }
}
