package o;

import java.nio.ByteBuffer;
import o.an;
import o.pj;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class al extends an {

    /* renamed from: 鷭, reason: contains not printable characters */
    private final C0020[] f666 = {new C0020("wanttoconnection", C1162$.m1519("o.釫")), new C0020("ticksend", C0834.class), new C0020("walktoxy", C0427.class), new C0020("getcharnamerequest", C0958.class), new C0020("actionrequest", C0678.class), new C0020("useskilltoid", C0425.class), new C0020("changedir", C0151.class), new C0020("dropitem", C0566.class), new C0020("takeitem", C0896.class), new C0020("movefromkafra", C0645.class), new C0020("movetokafra", C0815.class), new C0020("useskilltopos", C0889.class), new C0020("friendslistadd", C0153.class), new C0020("partyinvite2", C0171.class), new C0020("solvecharname", C0201.class), new C0020("useritem", C0207.class), new C0020("itemlistwindowselected", C0687.class), new C0020("globalmessage", C0154.class), new C0020("reqopenbuyingstore", C0786.class), new C0020("reqclickbuyingstore", C0476.class), new C0020("reqtradebuyingstore", C0550.class), new C0020("reqclosebuyingstore", C0179.class), new C0020("closekafra", C0813.class), new C0020("hommenu", C1042.class)};

    @Override // o.an, o.tx
    /* renamed from: 鷭, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void mo432(pk pkVar) {
        super.mo432(pkVar);
    }

    @Override // o.an, o.tx
    /* renamed from: 鷭, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void mo433(pk pkVar, int i) {
        super.mo433(pkVar, i);
    }

    @Override // o.an
    /* renamed from: 鷭, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void mo434(vg vgVar, ByteBuffer byteBuffer, int i) {
        super.mo434(vgVar, byteBuffer, i);
    }

    /* renamed from: o.al$鷭, reason: contains not printable characters */
    class C0020 {

        /* renamed from: 櫯, reason: contains not printable characters */
        Class<? extends vg> f668;

        /* renamed from: 鷭, reason: contains not printable characters */
        String f669;

        C0020(String str, Class<? extends vg> cls) {
            this.f669 = str;
            this.f668 = cls;
        }
    }

    al(int i, pj.aux auxVar) {
        if (i == 0) {
            throw new nv("packet_db.txt packet version not specified for this server");
        }
        String strM957 = pa.m957(pa.m978(C0358.f6674.m140(2130968582), ow.UTF8));
        if (auxVar == pj.aux.iRO_Renewal) {
            strM957 = String.valueOf(strM957) + pa.m957(pa.m978(C0358.f6674.m140(2130968583), ow.UTF8));
            i = Integer.MAX_VALUE;
        }
        String[] strArrSplit = strM957.split("\n");
        int iIntValue = 0;
        for (String str : strArrSplit) {
            String strTrim = str.trim();
            if (strTrim.length() > 0) {
                if (strTrim.startsWith("packet_ver:")) {
                    String[] strArrSplit2 = strTrim.substring("packet_ver:".length()).split(",");
                    for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
                        strArrSplit2[i2] = strArrSplit2[i2].trim();
                    }
                    if (strArrSplit2.length <= 0) {
                        throw new nv();
                    }
                    iIntValue = Integer.valueOf(strArrSplit2[0]).intValue();
                    if (strArrSplit2.length <= 1) {
                        continue;
                    } else {
                        if (strArrSplit2.length != 4) {
                            throw new nv();
                        }
                        if (i == iIntValue) {
                            this.f676 = new int[]{Integer.decode(strArrSplit2[1]).intValue(), Integer.decode(strArrSplit2[2]).intValue(), Integer.decode(strArrSplit2[3]).intValue()};
                        }
                    }
                } else if (i >= iIntValue) {
                    String[] strArrSplit3 = strTrim.split(",");
                    if (strArrSplit3.length < 2) {
                        throw new nv();
                    }
                    int iIntValue2 = Integer.decode(strArrSplit3[0]).intValue();
                    int iIntValue3 = Integer.valueOf(strArrSplit3[1]).intValue();
                    if (iIntValue3 != 0) {
                        int length = this.f666.length;
                        if (strArrSplit3.length > 2) {
                            String str2 = strArrSplit3[2];
                            length = 0;
                            while (length < this.f666.length && !this.f666[length].f669.equalsIgnoreCase(str2)) {
                                length++;
                            }
                        }
                        int[] iArr = null;
                        if (strArrSplit3.length > 3) {
                            String[] strArrSplit4 = strArrSplit3[3].split(":");
                            iArr = new int[strArrSplit4.length];
                            for (int i3 = 0; i3 < strArrSplit4.length; i3++) {
                                iArr[i3] = Integer.parseInt(strArrSplit4[i3]);
                            }
                        }
                        vf vfVar = this.f4987.get(Integer.valueOf(iIntValue2));
                        if (vfVar == null || vfVar.getClass() == C0218.class) {
                            C0218 c0218 = new C0218((short) iIntValue2, iIntValue3);
                            c0218.m1104(ByteBuffer.allocate(iIntValue3 == -1 ? 1 : iIntValue3));
                            this.f4987.put(Integer.valueOf(pa.m968(c0218.mo1099())), c0218);
                        }
                        if (length < this.f666.length) {
                            this.f675.put(this.f666[length].f668, new an.C0022(this.f666[length].f668, iIntValue2, iIntValue3, iArr));
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
