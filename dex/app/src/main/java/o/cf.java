package o;

import com.roworkshop.andro.c_point;
import o.pl;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class cf implements Runnable {

    /* renamed from: Ą, reason: contains not printable characters */
    private final /* synthetic */ String f882;

    /* renamed from: ą, reason: contains not printable characters */
    private final /* synthetic */ String f883;

    /* renamed from: Ć, reason: contains not printable characters */
    private final /* synthetic */ boolean[] f884;

    /* renamed from: ȃ, reason: contains not printable characters */
    private final /* synthetic */ String f885;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ String f886;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ String f887;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ bo f888;

    cf(bo boVar, String str, String str2, String str3, String str4, String str5, boolean[] zArr) {
        this.f888 = boVar;
        this.f887 = str;
        this.f886 = str2;
        this.f885 = str3;
        this.f882 = str4;
        this.f883 = str5;
        this.f884 = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hu huVar = C0358.f6669.f2048;
        oj ojVar = new oj();
        ojVar.f3335 = (byte) 5;
        ojVar.f3304 = (short) 1002;
        ojVar.f3332 = 10000000;
        huVar.f1552 = new C0564(new C0475(ojVar));
        og ogVar = new og();
        ogVar.f3287 = (short) EnumC0134.NOVICE.f6499;
        ogVar.f3258 = (short) 1;
        ogVar.f3288 = (short) 1;
        ogVar.f3263 = (short) 40;
        ogVar.f3261 = (short) 53;
        ogVar.f3278 = (short) 150;
        huVar.f1548 = new C0564(new bh(ogVar, 1000000, 0, 0));
        oj ojVar2 = new oj();
        ojVar2.f3335 = (byte) -1;
        ojVar2.f3304 = (short) 48;
        huVar.f1547 = new C0564(new i(ojVar2));
        huVar.f1553 = new C0564(new C0489(0, 512, (byte) 0, 0, 0, 0, 0, 1));
        huVar.f1540 = new hr(String.valueOf(C0358.f6685.f1030.f982.f8937.f8942.f8958) + "\\" + C0358.f6685.f1030.f982.f8937.f8942.f8955);
        huVar.f1541 = new hr(String.valueOf(C0358.f6685.f1030.f982.f8937.f8942.f8958) + "\\msg");
        huVar.f1542 = new hs(new hr(String.valueOf(C0358.f6685.f1030.f982.f8937.f8942.f8958) + "\\emotion", false, true, false));
        huVar.f1549 = new hs(new hr("cursors"));
        hr hrVar = new hr("cursors", false, true, false);
        hrVar.m625();
        huVar.f1544 = new hs(hrVar);
        cv cvVar = C0358.f6685;
        cv cvVar2 = C0358.f6685;
        cvVar.f1017 = cv.m530(C0358.f6669.f2048.f1544, 17, new c_point(50, 50));
        cv cvVar3 = C0358.f6685;
        cv cvVar4 = C0358.f6685;
        cvVar3.f1016 = cv.m530(C0358.f6669.f2048.f1544, 19, new c_point(50, 50));
        cv cvVar5 = C0358.f6685;
        cv cvVar6 = C0358.f6685;
        cvVar5.f1015 = cv.m530(C0358.f6669.f2048.f1544, 7, new c_point(50, 50));
        cv cvVar7 = C0358.f6685;
        cv cvVar8 = C0358.f6685;
        cvVar7.f1018 = cv.m530(C0358.f6669.f2048.f1544, 22, new c_point(50, 50));
        try {
            C0358.f6669.f2063 = new C0450(this.f887, false);
            for (String str : new String[]{this.f886, this.f885, this.f882, this.f883}) {
                try {
                    cr.m517(oc.f3240, str, false, pl.Cif.SKIP, (po) null);
                } catch (uw unused) {
                }
            }
            cp.m493();
            this.f884[0] = true;
        } catch (ut e) {
            throw e;
        } catch (Exception e2) {
            throw new nv(e2, "Failed to load map: " + this.f887);
        }
    }
}
