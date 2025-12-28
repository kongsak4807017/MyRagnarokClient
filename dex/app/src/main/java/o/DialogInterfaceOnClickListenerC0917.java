package o;

import android.content.DialogInterface;

/* renamed from: o.驇, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class DialogInterfaceOnClickListenerC0917 implements DialogInterface.OnClickListener {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ Thread f8203;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ Throwable f8204;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0850 f8205;

    DialogInterfaceOnClickListenerC0917(C0850 c0850, Throwable th, Thread thread) {
        this.f8205 = c0850;
        this.f8204 = th;
        this.f8203 = thread;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8205.m1488("Resource name", ((uw) this.f8204).f5347, this.f8203, this.f8204);
    }
}
