package o;

import java.util.HashSet;

/* renamed from: o.ҧ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0402 {

    /* renamed from: 鷭, reason: contains not printable characters */
    HashSet<String> f6780 = new HashSet<>();

    C0402(cr crVar) {
        je jeVar = C0358.f6674.f42;
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Reading indoors_db..."));
        for (String str : pa.m988(pa.m978((byte[]) crVar.m519("data\\indoorrswtable.txt", false), ow.KOREAN), true, "#")) {
            String strTrim = str.trim();
            if (strTrim.endsWith(".rsw")) {
                this.f6780.add(strTrim);
            }
        }
    }
}
