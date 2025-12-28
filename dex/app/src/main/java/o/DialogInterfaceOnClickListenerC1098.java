package o;

import android.content.DialogInterface;

/* renamed from: o.윷, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class DialogInterfaceOnClickListenerC1098 implements DialogInterface.OnClickListener {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ Thread f8879;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ Throwable f8880;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0850 f8881;

    DialogInterfaceOnClickListenerC1098(C0850 c0850, Throwable th, Thread thread) {
        this.f8881 = c0850;
        this.f8880 = th;
        this.f8879 = thread;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8881.m1488("Corrupted file name", ((us) this.f8880).f5345.getAbsolutePath(), this.f8879, this.f8880);
    }
}
