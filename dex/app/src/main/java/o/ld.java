package o;

import android.content.DialogInterface;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ld implements DialogInterface.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ kv f1953;

    ld(kv kvVar) {
        this.f1953 = kvVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case 0:
                kv.m747(this.f1953);
                break;
            case 1:
                kv.m749(this.f1953);
                break;
            case 2:
                C0358.f6674.mo139(new le(this));
                break;
        }
    }
}
