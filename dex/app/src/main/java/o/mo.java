package o;

import o.C1126;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class mo implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ mj f2143;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ int f2144;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ mn f2145;

    mo(mn mnVar, int i, md mdVar) {
        this.f2145 = mnVar;
        this.f2144 = i;
        this.f2143 = mdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C1126.Cif cif = C0358.f6685.f1030.f982.f8937;
        hr hrVar = new hr("shadow");
        String str2 = String.valueOf(cif.f8942.f8958) + "\\";
        switch (this.f2144) {
            case 10:
                str = String.valueOf(str2) + "선물상자카트";
                if ((EnumC0134.m1250(this.f2143.f2123.f2001).m1256().f8819 & 8192) > 0) {
                    str = String.valueOf(str) + "_미니";
                    break;
                }
                break;
            case 11:
                str = String.valueOf(str2) + "포링싣은카트";
                if ((EnumC0134.m1250(this.f2143.f2123.f2001).m1256().f8819 & 8192) > 0) {
                    str = String.valueOf(str) + "_미니";
                    break;
                }
                break;
            case 12:
                str = String.valueOf(str2) + "포링카트";
                if ((EnumC0134.m1250(this.f2143.f2123.f2001).m1256().f8819 & 8192) > 0) {
                    str = String.valueOf(str) + "_미니";
                    break;
                }
                break;
            default:
                str = String.valueOf(cif.f8942.f8958) + "\\" + cif.f8942.f8957;
                if (this.f2144 > 1) {
                    str = String.valueOf(str) + (this.f2144 - 1);
                    break;
                }
                break;
        }
        hr hrVar2 = new hr(str);
        C0358.f6674.mo139(new mp(this, new hs(hrVar2, new hr[]{hrVar, hrVar2})));
    }
}
