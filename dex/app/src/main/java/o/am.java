package o;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.Arrays;
import o.an;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class am extends an {

    /* renamed from: Ą, reason: contains not printable characters */
    private final C0021[] f670 = {new C0021("clif->pWantToConnection", C1162$.m1519("o.釫")), new C0021("clif->pTickSend", C0834.class), new C0021("clif->pWalkToXY", C0427.class), new C0021("clif->pGetCharNameRequest", C0958.class), new C0021("clif->pActionRequest", C0678.class), new C0021("clif->pUseSkillToId", C0425.class), new C0021("clif->pChangeDir", C0151.class), new C0021("clif->pDropItem", C0566.class), new C0021("clif->pTakeItem", C0896.class), new C0021("clif->pMoveFromKafra", C0645.class), new C0021("clif->pMoveToKafra", C0815.class), new C0021("clif->pUseSkillToPos", C0889.class), new C0021("clif->pFriendsListAdd", C0153.class), new C0021("clif->pPartyInvite2", C0171.class), new C0021("clif->pSolveCharName", C0201.class), new C0021("clif->pUseItem", C0207.class), new C0021("clif->pItemListWindowSelected", C0687.class), new C0021("clif->pGlobalMessage", C0154.class), new C0021("clif->pReqOpenBuyingStore", C0786.class), new C0021("clif->pReqClickBuyingStore", C0476.class), new C0021("clif->pReqTradeBuyingStore", C0550.class), new C0021("clif->pReqCloseBuyingStore", C0179.class), new C0021("clif->pCloseKafra", C0813.class), new C0021("clif->pHomMenu", C1042.class)};

    /* renamed from: 鷭, reason: contains not printable characters */
    String[] f671;

    @Override // o.an, o.tx
    /* renamed from: 鷭 */
    public final /* bridge */ /* synthetic */ void mo432(pk pkVar) {
        super.mo432(pkVar);
    }

    @Override // o.an, o.tx
    /* renamed from: 鷭 */
    public final /* bridge */ /* synthetic */ void mo433(pk pkVar, int i) {
        super.mo433(pkVar, i);
    }

    @Override // o.an
    /* renamed from: 鷭 */
    public final /* bridge */ /* synthetic */ void mo434(vg vgVar, ByteBuffer byteBuffer, int i) {
        super.mo434(vgVar, byteBuffer, i);
    }

    /* renamed from: o.am$鷭, reason: contains not printable characters */
    class C0021 {

        /* renamed from: 櫯, reason: contains not printable characters */
        Class<? extends vg> f673;

        /* renamed from: 鷭, reason: contains not printable characters */
        String f674;

        C0021(String str, Class<? extends vg> cls) {
            this.f674 = str;
            this.f673 = cls;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private int m435(int i, String[] strArr, int i2, boolean z, boolean z2) throws NumberFormatException {
        while (i2 < strArr.length) {
            String strTrim = strArr[i2].trim();
            if (strTrim.length() > 0 && !strTrim.equals("#define MAP_PACKETS_H")) {
                if (strTrim.startsWith("#if")) {
                    String strSubstring = strTrim.substring(3);
                    if (strSubstring.startsWith("def") || strSubstring.startsWith("ndef")) {
                        boolean zStartsWith = strSubstring.startsWith("def");
                        String strTrim2 = strSubstring.substring(zStartsWith ? 3 : 4).trim();
                        int i3 = 0;
                        while (i3 < this.f671.length && !this.f671[i3].equals(strTrim2)) {
                            i3++;
                        }
                        i2 = m435(i, strArr, i2 + 1, z && z2, (zStartsWith && i3 < this.f671.length) || (!zStartsWith && i3 == this.f671.length));
                    } else if (strSubstring.startsWith(" PACKETVER >=")) {
                        i2 = m435(i, strArr, i2 + 1, z && z2, i >= Integer.parseInt(strSubstring.substring(13).trim()));
                    } else if (strSubstring.startsWith(" PACKETVER ==")) {
                        i2 = m435(i, strArr, i2 + 1, z && z2, i == Integer.parseInt(strSubstring.substring(13).trim()));
                    } else {
                        nz.m907("Unknown #if instruction, processing as inactive block. line=" + i2 + " text=" + strSubstring);
                        i2 = m435(i, strArr, i2 + 1, z && z2, false);
                    }
                } else if (strTrim.startsWith("#else")) {
                    z2 = !z2;
                } else {
                    if (strTrim.startsWith("#endif")) {
                        return i2;
                    }
                    if (z && z2) {
                        if (strTrim.startsWith("packetKeys(")) {
                            String[] strArrSplit = strTrim.substring("packetKeys(".length(), strTrim.lastIndexOf(")")).trim().split(",");
                            if (strArrSplit.length != 3) {
                                throw new nv();
                            }
                            this.f676 = new int[]{Integer.decode(strArrSplit[0]).intValue(), Integer.decode(strArrSplit[1]).intValue(), Integer.decode(strArrSplit[2]).intValue()};
                        } else if (!strTrim.startsWith("packet(")) {
                            nz.m907("invalid line " + strTrim);
                        } else {
                            String strTrim3 = strTrim.substring(7, strTrim.lastIndexOf(")")).trim();
                            String[] strArrSplit2 = strTrim3.split(",");
                            if (strArrSplit2.length < 2) {
                                nz.m907("invalid line split " + strTrim3);
                            } else {
                                for (int i4 = 0; i4 < strArrSplit2.length; i4++) {
                                    strArrSplit2[i4] = strArrSplit2[i4].trim();
                                }
                                if (!strArrSplit2[0].startsWith("0x")) {
                                    nz.m907("invalid new header at " + strTrim3);
                                } else {
                                    strArrSplit2[0] = strArrSplit2[0].substring(2);
                                    int i5 = Integer.parseInt(strArrSplit2[0], 16);
                                    if (i5 <= 0) {
                                        nz.m907("invalid new header at " + strTrim3);
                                    } else {
                                        int i6 = Integer.parseInt(strArrSplit2[1]);
                                        if (i6 < -1) {
                                            nz.m907("invalid length at " + strTrim3);
                                        } else {
                                            Class<? extends vg> cls = null;
                                            if (strArrSplit2.length >= 3) {
                                                C0021[] c0021Arr = this.f670;
                                                int length = c0021Arr.length;
                                                int i7 = 0;
                                                while (true) {
                                                    if (i7 >= length) {
                                                        break;
                                                    }
                                                    C0021 c0021 = c0021Arr[i7];
                                                    if (!strArrSplit2[2].equals(c0021.f674)) {
                                                        i7++;
                                                    } else {
                                                        cls = c0021.f673;
                                                        break;
                                                    }
                                                }
                                            }
                                            int[] iArr = null;
                                            if (strArrSplit2.length >= 4) {
                                                iArr = new int[strArrSplit2.length - 3];
                                                for (int i8 = 0; i8 < iArr.length; i8++) {
                                                    iArr[i8] = Integer.parseInt(strArrSplit2[i8 + 3]);
                                                }
                                            }
                                            vf vfVar = this.f4987.get(Integer.valueOf(i5));
                                            if (vfVar == null || vfVar.getClass() == C0218.class) {
                                                C0218 c0218 = new C0218((short) i5, i6);
                                                c0218.m1104(ByteBuffer.allocate(i6 == -1 ? 1 : i6));
                                                this.f4987.put(Integer.valueOf(pa.m968(c0218.mo1099())), c0218);
                                            }
                                            if (cls != null) {
                                                this.f675.put(cls, new an.C0022(cls, i5, i6, iArr));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i2++;
        }
        return strArr.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object[]] */
    am(int i, boolean z) throws NumberFormatException {
        this.f671 = new String[]{"PARTY_RECRUIT", "packet", "packetKeys"};
        String[] strArrSplit = pa.m957(String.valueOf(pa.m978(C0358.f6674.m140(2130968584), ow.UTF8)) + "\n" + pa.m978(C0358.f6674.m140(2130968585), ow.UTF8)).split("\n");
        if (z) {
            String[] strArr = this.f671;
            strArr = strArr == null ? (Object[]) Array.newInstance("PACKETVER_RE".getClass(), 0) : strArr;
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
            objArrCopyOf[strArr.length] = "PACKETVER_RE";
            this.f671 = (String[]) objArrCopyOf;
        }
        m435(i, strArrSplit, 0, true, true);
    }
}
