package o;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class abe implements DialogInterface.OnClickListener {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final /* synthetic */ boolean f335;

    /* renamed from: 櫯, reason: contains not printable characters */
    final /* synthetic */ WeakReference f336;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ abi f337 = null;

    abe(abi abiVar, WeakReference weakReference, boolean z) {
        this.f336 = weakReference;
        this.f335 = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        abb.m294(acr.CrashManagerUserInputSend, this.f337, this.f336, this.f335);
    }
}
