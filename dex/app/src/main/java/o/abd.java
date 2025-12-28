package o;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class abd implements DialogInterface.OnClickListener {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final /* synthetic */ boolean f332;

    /* renamed from: 櫯, reason: contains not printable characters */
    final /* synthetic */ WeakReference f333;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ abi f334 = null;

    abd(abi abiVar, WeakReference weakReference, boolean z) {
        this.f333 = weakReference;
        this.f332 = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        abb.m294(acr.CrashManagerUserInputAlwaysSend, this.f334, this.f333, this.f332);
    }
}
