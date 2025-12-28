package o;

import android.app.AlertDialog;
import o.C0640;

/* renamed from: o.do, reason: invalid class name */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class Cdo implements C0640.InterfaceC0642 {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ dl f1084;

    Cdo(dl dlVar) {
        this.f1084 = dlVar;
    }

    @Override // o.C0640.InterfaceC0642
    /* renamed from: 鷭, reason: contains not printable characters */
    public final void mo555(C0378 c0378, C1067 c1067) {
        if (!this.f1084.f1079) {
            throw new IllegalStateException("Not purchasing anything, yet received IabPurchaseFinished. Where this result could come from..?");
        }
        this.f1084.f1079 = false;
        if (!(c0378.f6733 == 0)) {
            nz.m907("Error while purchasing: " + c0378.f6732);
            new AlertDialog.Builder(C0358.f6674).setMessage("Purchase failed: " + c0378.f6732).show();
            C0358.f6674.mo139(new jt(C0358.f6674.f42));
            return;
        }
        this.f1084.m553(c1067);
    }
}
