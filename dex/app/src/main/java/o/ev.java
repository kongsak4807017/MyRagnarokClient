package o;

import android.content.DialogInterface;
import o.pj;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ev implements DialogInterface.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ pj.C0079 f1228;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ eu f1229;

    ev(eu euVar, pj.C0079 c0079) {
        this.f1229 = euVar;
        this.f1228 = c0079;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1229.f1227.m588(this.f1228);
    }
}
