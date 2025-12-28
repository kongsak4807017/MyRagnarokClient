package o;

import android.content.DialogInterface;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class ig implements DialogInterface.OnClickListener {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ String f1602;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ String f1603;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ ib f1604;

    public ig(ib ibVar, String str, String str2) {
        this.f1604 = ibVar;
        this.f1603 = str;
        this.f1602 = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ib ibVar = this.f1604;
        String str = this.f1603;
        String str2 = this.f1602;
        if (oc.f3247 == null) {
            oc.f3247 = new bg(null, false, false, str, str2, null);
        }
        ibVar.f1582.m137();
    }
}
