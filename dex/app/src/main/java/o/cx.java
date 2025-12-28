package o;

import android.content.DialogInterface;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class cx implements DialogInterface.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ boolean[] f1048;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ cw f1049;

    cx(cw cwVar, boolean[] zArr) {
        this.f1049 = cwVar;
        this.f1048 = zArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1048[0] = true;
    }
}
