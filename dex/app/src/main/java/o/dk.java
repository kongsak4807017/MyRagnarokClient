package o;

import java.util.HashMap;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class dk {

    /* renamed from: 鷭, reason: contains not printable characters */
    HashMap<String, String> f1071 = new HashMap<>();

    dk(cr crVar) {
        je jeVar = C0358.f6674.f42;
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Reading resnametable..."));
        String[] strArrM988 = pa.m988(pa.m978((byte[]) crVar.m519("data\\resnametable.txt", false), ow.KOREAN), true, "#");
        for (int i = 0; i < strArrM988.length / 2; i++) {
            String strTrim = strArrM988[(i * 2) + 0].trim();
            String strTrim2 = strArrM988[(i * 2) + 1].trim();
            if (strTrim.length() > 0 && strTrim2.length() > 0) {
                this.f1071.put(strTrim, strTrim2);
            }
        }
    }
}
