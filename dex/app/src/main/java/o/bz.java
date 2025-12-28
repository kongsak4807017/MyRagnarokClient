package o;

import java.util.Iterator;
import o.lo;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class bz implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ bo f871;

    bz(bo boVar) {
        this.f871 = boVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ch chVar = C0358.f6674.f42.f1781;
        C1035 c1035 = C0358.f6664.f2004;
        chVar.f903.setText(c1035.f8368);
        chVar.m479(c1035);
        lo.C0060 c0060 = C0358.f6685.f1030.f985.f2006.get(Integer.valueOf(c1035.f2001));
        chVar.f892.setText(c0060 != null ? c0060.f2013 : "Poring");
        chVar.m478(c1035);
        chVar.m477(c1035);
        chVar.m476(c1035);
        chVar.m472(c1035);
        chVar.m473(c1035);
        chVar.m474(c1035);
        chVar.m475(c1035);
        Iterator<nt> it = C0358.f6664.f2004.f8351.keySet().iterator();
        while (it.hasNext()) {
            C0358.f6674.f42.m726(it.next().f3206);
        }
    }
}
