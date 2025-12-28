package o;

import android.content.DialogInterface;

/* renamed from: o.零, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class DialogInterfaceOnClickListenerC0903 implements DialogInterface.OnClickListener {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ Throwable f8183;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ Thread f8184;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0850 f8185;

    DialogInterfaceOnClickListenerC0903(C0850 c0850, Thread thread, Throwable th) {
        this.f8185 = c0850;
        this.f8184 = thread;
        this.f8183 = th;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8185.m1489(this.f8184, this.f8183);
    }
}
