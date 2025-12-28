package o;

import android.content.DialogInterface;

/* renamed from: o.橉, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class DialogInterfaceOnClickListenerC0758 implements DialogInterface.OnClickListener {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ Thread f7752;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ Throwable f7753;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0850 f7754;

    DialogInterfaceOnClickListenerC0758(C0850 c0850, Throwable th, Thread thread) {
        this.f7754 = c0850;
        this.f7753 = th;
        this.f7752 = thread;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ((us) this.f7753).f5345.delete();
        this.f7754.m1489(this.f7752, this.f7753);
    }
}
