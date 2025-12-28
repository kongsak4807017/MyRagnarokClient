package o;

import android.content.DialogInterface;

/* renamed from: o.춰, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class DialogInterfaceOnCancelListenerC1123 implements DialogInterface.OnCancelListener {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ Throwable f8930;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ Thread f8931;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0850 f8932;

    DialogInterfaceOnCancelListenerC1123(C0850 c0850, Thread thread, Throwable th) {
        this.f8932 = c0850;
        this.f8931 = thread;
        this.f8930 = th;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f8932.m1489(this.f8931, this.f8930);
    }
}
