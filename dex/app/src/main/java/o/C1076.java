package o;

/* renamed from: o.뼠, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1076 {

    /* renamed from: 鷭, reason: contains not printable characters */
    cr f8860;

    C1076(cr crVar) {
        je jeVar = C0358.f6674.f42;
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Reading msg_db..."));
        this.f8860 = crVar;
        byte[] bArr = (byte[]) crVar.m519("data\\msgstringtable.txt", false);
        String strM975 = pa.m975(bArr);
        if (C0358.f6687.m652("data\\msgstringtable.txt", bArr.length, 0, strM975) != -1) {
            return;
        }
        C0358.f6687.m662(pa.m988(pa.m978(bArr, ow.LOCAL), false, "#"));
        C0358.f6687.m653(true, -1, "data\\msgstringtable.txt", bArr.length, 0, strM975);
    }
}
