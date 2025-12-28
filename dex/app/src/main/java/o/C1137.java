package o;

import java.util.HashMap;

/* renamed from: o.탐, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1137 {

    /* renamed from: 鷭, reason: contains not printable characters */
    HashMap<String, String> f8969 = new HashMap<>();

    C1137(cr crVar) {
        je jeVar = C0358.f6674.f42;
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Reading mapnametable..."));
        String[] strArrM988 = pa.m988(pa.m978((byte[]) crVar.m519("data\\mapnametable.txt", false), ow.LOCAL), true, "#");
        for (int i = 0; i < strArrM988.length / 2; i++) {
            String strTrim = strArrM988[(i * 2) + 0].trim();
            String strTrim2 = strArrM988[(i * 2) + 1].trim();
            if (strTrim.length() > 0 && strTrim2.length() > 0) {
                this.f8969.put(strTrim, strTrim2);
            }
        }
    }
}
