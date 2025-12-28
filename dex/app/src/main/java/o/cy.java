package o;

import android.content.DialogInterface;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class cy implements DialogInterface.OnClickListener {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ boolean[] f1050;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ boolean[] f1051;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ cw f1052;

    cy(cw cwVar, boolean[] zArr, boolean[] zArr2) {
        this.f1052 = cwVar;
        this.f1051 = zArr;
        this.f1050 = zArr2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1051[0] = true;
        this.f1050[0] = true;
    }
}
