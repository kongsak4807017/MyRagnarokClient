package o;

import java.util.HashMap;
import java.util.Map;

/* renamed from: o.訍, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0860 {

    /* renamed from: 鷭, reason: contains not printable characters */
    Map<Integer, String> f8035 = new HashMap();

    C0860(cr crVar) {
        je jeVar = C0358.f6674.f42;
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Reading metalprocessitemlist_db..."));
        String[] strArrM988 = pa.m988(pa.m978((byte[]) crVar.m519("data\\metalprocessitemlist.txt", false), ow.LOCAL), true, "#");
        for (int i = 0; i < strArrM988.length - 1; i += 2) {
            this.f8035.put(Integer.valueOf(Integer.parseInt(strArrM988[i].trim())), strArrM988[i + 1]);
        }
    }
}
