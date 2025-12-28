package o;

import o.C0640;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class dn implements C0640.InterfaceC0643 {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ dl f1083;

    dn(dl dlVar) {
        this.f1083 = dlVar;
    }

    @Override // o.C0640.InterfaceC0643
    /* renamed from: 鷭, reason: contains not printable characters */
    public final void mo554(C1067 c1067, C0378 c0378) {
        this.f1083.f1078 = null;
        this.f1083.f1079 = false;
        if (!(c0378.f6733 == 0)) {
            nz.m907("Error while consuming: " + c0378.f6732);
            return;
        }
        new StringBuilder("Consumption finished. Purchase: ").append(c1067).append(", result: ").append(c0378);
        C0358.f6674.mo139(new jt(C0358.f6674.f42));
        dl dlVar = this.f1083;
        C1067 c1067Poll = dlVar.f1074.poll();
        if (c1067Poll != null) {
            dlVar.m553(c1067Poll);
        }
    }
}
