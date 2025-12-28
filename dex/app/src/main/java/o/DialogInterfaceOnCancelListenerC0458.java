package o;

import android.content.DialogInterface;

/* renamed from: o.ც, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class DialogInterfaceOnCancelListenerC0458 implements DialogInterface.OnCancelListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ RunnableC0407 f6905;

    DialogInterfaceOnCancelListenerC0458(RunnableC0407 runnableC0407) {
        this.f6905 = runnableC0407;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        throw new ut("Disconnected from master-server", false);
    }
}
