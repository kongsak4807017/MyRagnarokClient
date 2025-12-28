package o;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Iterator;
import o.C0804;
import o.C0804.C0808;

/* renamed from: o.馋, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0914 implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ ArrayList f8200;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ RunnableC0410 f8201;

    RunnableC0914(RunnableC0410 runnableC0410, ArrayList arrayList) {
        this.f8201 = runnableC0410;
        this.f8200 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        C0358.f6674.mo139(new jt(C0358.f6674.f42));
        C0804 c0804 = this.f8201.f6794;
        ArrayList arrayList = this.f8200;
        C0804.C0805 c0805 = this.f8201.f6794.f7870;
        C0804.C0808 c0808 = (C0804.C0808) c0804.f7869.getAdapter();
        Iterator<C0804.C0807> it = (c0808 != null ? c0808.m1479() : new ArrayList<>()).iterator();
        while (it.hasNext()) {
            C0804.C0807 next = it.next();
            boolean z = false;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (((C0804.C0807) it2.next()).f7917.f3266 == next.f7917.f3266) {
                    z = true;
                    break;
                }
            }
            if (z) {
                next.f7919.recycle();
            } else {
                arrayList.add(next);
            }
        }
        int i = 0;
        int iM648 = C0358.f6687.m648("last_char_slot", 0);
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                break;
            }
            if (((C0804.C0807) arrayList.get(i2)).f7917.f3266 == iM648) {
                i = i2;
                break;
            }
            i2++;
        }
        c0804.f7869.setAdapter(c0804.new C0808(arrayList, c0805));
        c0804.f7869.setCurrentItem(i);
        if (oc.f3247 != null && oc.f3247.f796 != null && !oc.f3247.f796.isEmpty()) {
            Iterator<C0804.Cif> it3 = ((C0804.C0808) this.f8201.f6794.f7869.getAdapter()).m1480().iterator();
            while (it3.hasNext()) {
                C0804.Cif next2 = it3.next();
                if (pa.m978(next2.f7879.f7917.f3280, ow.LOCAL).equals(oc.f3247.f796)) {
                    oc.f3247.f796 = null;
                    next2.m1476();
                }
            }
        }
    }
}
