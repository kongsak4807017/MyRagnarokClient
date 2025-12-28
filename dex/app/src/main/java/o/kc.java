package o;

import android.content.DialogInterface;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class kc implements DialogInterface.OnClickListener {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ short f1879;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ String[] f1880;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je f1881;

    kc(je jeVar, String[] strArr, short s) {
        this.f1881 = jeVar;
        this.f1880 = strArr;
        this.f1879 = s;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == this.f1880.length - 1) {
            C0358.f6671.mo454(new C0319(this.f1879, "cancel"));
            C0358.f6671.mo454(new C0172());
        } else {
            C0358.f6671.mo454(new C0319(this.f1879, this.f1880[i]));
        }
    }
}
