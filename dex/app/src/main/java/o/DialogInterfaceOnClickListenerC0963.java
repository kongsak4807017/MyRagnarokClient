package o;

import android.content.DialogInterface;

/* renamed from: o.齯, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class DialogInterfaceOnClickListenerC0963 implements DialogInterface.OnClickListener {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ Throwable f8280;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ Thread f8281;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0850 f8282;

    DialogInterfaceOnClickListenerC0963(C0850 c0850, Thread thread, Throwable th) {
        this.f8282 = c0850;
        this.f8281 = thread;
        this.f8280 = th;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8282.m1489(this.f8281, this.f8280);
    }
}
