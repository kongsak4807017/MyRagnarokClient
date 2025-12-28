package o;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class abc implements DialogInterface.OnClickListener {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final /* synthetic */ boolean f329;

    /* renamed from: 櫯, reason: contains not printable characters */
    final /* synthetic */ WeakReference f330;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ abi f331 = null;

    abc(abi abiVar, WeakReference weakReference, boolean z) {
        this.f330 = weakReference;
        this.f329 = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        abb.m294(acr.CrashManagerUserInputDontSend, this.f331, this.f330, this.f329);
    }
}
