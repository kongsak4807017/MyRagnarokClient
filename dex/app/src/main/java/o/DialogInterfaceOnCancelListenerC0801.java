package o;

import android.content.DialogInterface;

/* renamed from: o.甄, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class DialogInterfaceOnCancelListenerC0801 implements DialogInterface.OnCancelListener {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ Throwable f7858;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ Thread f7859;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0850 f7860;

    DialogInterfaceOnCancelListenerC0801(C0850 c0850, Thread thread, Throwable th) {
        this.f7860 = c0850;
        this.f7859 = thread;
        this.f7858 = th;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f7860.m1489(this.f7859, this.f7858);
    }
}
