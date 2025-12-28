package o;

import android.content.DialogInterface;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class db implements DialogInterface.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ boolean[] f1059;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ da f1060;

    db(da daVar, boolean[] zArr) {
        this.f1060 = daVar;
        this.f1059 = zArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        synchronized (this.f1059) {
            this.f1059.notify();
        }
    }
}
