package o;

import android.content.DialogInterface;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class kd implements DialogInterface.OnCancelListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ short f1882;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je f1883;

    kd(je jeVar, short s) {
        this.f1883 = jeVar;
        this.f1882 = s;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C0358.f6671.mo454(new C0319(this.f1882, "cancel"));
    }
}
