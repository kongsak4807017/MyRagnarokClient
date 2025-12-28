package o;

import android.util.Log;
import o.dw;
import o.hs;

/* renamed from: o.䌮, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0564 extends hs {

    /* renamed from: Ą, reason: contains not printable characters */
    hr f7298;

    /* renamed from: ą, reason: contains not printable characters */
    hr f7299;

    /* renamed from: Ć, reason: contains not printable characters */
    hr f7300;

    /* renamed from: ć, reason: contains not printable characters */
    hr f7301;

    /* renamed from: đ, reason: contains not printable characters */
    private int f7302;

    /* renamed from: Ē, reason: contains not printable characters */
    private int f7303;

    /* renamed from: ē, reason: contains not printable characters */
    private int f7304;

    /* renamed from: ȃ, reason: contains not printable characters */
    hr f7305;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    hr f7306;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    hr f7307;

    /* renamed from: ܕ, reason: contains not printable characters */
    private int f7308;

    /* renamed from: 㥳, reason: contains not printable characters */
    private int f7309;

    /* renamed from: 岱, reason: contains not printable characters */
    hr[] f7310;

    /* renamed from: 庸, reason: contains not printable characters */
    private byte f7311;

    /* renamed from: 櫯, reason: contains not printable characters */
    hr f7312;

    /* renamed from: 鷭, reason: contains not printable characters */
    nu f7313;

    /* renamed from: 띥, reason: contains not printable characters */
    private int f7314;

    C0564(lm lmVar) {
        hr[] hrVarArrM545;
        this.f7308 = -1;
        this.f7311 = (byte) -1;
        this.f7302 = -1;
        this.f7303 = -1;
        this.f7304 = -1;
        this.f7314 = -1;
        this.f7309 = -1;
        if (lmVar.f1997 == nu.ITEM) {
            this.f7313 = nu.ITEM;
        } else {
            cv cvVar = C0358.f6685;
            this.f7313 = lo.m781(lmVar.f2001);
        }
        if (lmVar.f1997 == nu.PC && this.f7313 != nu.PC) {
            this.f7313 = nu.PC;
            lmVar.f2001 = EnumC0134.NOVICE.f6499;
        }
        if (lmVar.f2001 != EnumC0431.HIDDEN_WARP_CLASS.f6846) {
            if (lmVar.f1997 == nu.PC) {
                if (this.f7313 != nu.PC) {
                    throw new UnsupportedOperationException("Cannot PC unit type with NPC sprite " + lmVar.f2001);
                }
                bh bhVar = (bh) lmVar;
                if (bhVar.f804 > cq.f962) {
                    bhVar.f804 = 0;
                }
                if (bhVar.f805 > cq.f964) {
                    bhVar.f805 = 1;
                }
                int iM459 = bhVar.m459(false);
                if (iM459 != this.f7308 || bhVar.f803 != this.f7311) {
                    this.f1522 = C0358.f6685.m542(iM459, bhVar.f803, false);
                }
                if (this.f7302 != bhVar.f805) {
                    this.f7312 = C0358.f6685.m544(EnumC0134.m1250(bhVar.f2001), bhVar.f805, bhVar.f803, false);
                }
                if (bhVar.f813 != this.f7303 || bhVar.f805 != this.f7302 || bhVar.f803 != this.f7311) {
                    this.f7306 = null;
                    if (bhVar.f813 > 0) {
                        this.f7306 = C0358.f6685.m543(bhVar.f813, bhVar.f805, bhVar.f803, false);
                    }
                }
                if (bhVar.f806 != this.f7304 || bhVar.f805 != this.f7302 || bhVar.f803 != this.f7311) {
                    this.f7305 = null;
                    if (bhVar.f806 > 0) {
                        this.f7305 = C0358.f6685.m543(bhVar.f806, bhVar.f805, bhVar.f803, false);
                    }
                }
                if (bhVar.f807 != this.f7314 || bhVar.f805 != this.f7302 || bhVar.f803 != this.f7311) {
                    this.f7298 = null;
                    if (bhVar.f807 > 0) {
                        this.f7298 = C0358.f6685.m543(bhVar.f807, bhVar.f805, bhVar.f803, false);
                    }
                }
                if (bhVar.f808 != this.f7309) {
                    this.f7307 = null;
                    if (bhVar.f808 > 0) {
                        cv cvVar2 = C0358.f6685;
                        int i = bhVar.f808;
                        int i2 = bhVar.f2001;
                        byte b = bhVar.f803;
                        cq cqVar = cvVar2.f1030;
                        int i3 = EnumC1048.m1617(EnumC0134.m1250(i2).m1256().f8819 & 4095).m1620(EnumC0765.valuesCustom()[b]).f6499;
                        C1126 c1126 = cqVar.f982;
                        String str = b == EnumC0765.MALE.ordinal() ? c1126.f8935 : c1126.f8934;
                        String strM784 = cqVar.f985.m784(i3, b);
                        dw.C0032 c0032 = cqVar.f981.f1124.get(Integer.valueOf(i));
                        String str2 = String.valueOf(cqVar.f982.f8937.f8940) + "\\" + (c0032 == null ? null : c0032.f1127) + "\\" + str + "\\" + strM784 + "_" + str;
                        hr hrVar = (hr) cp.m492(str2, hr.class, C0358.f6667.f4824, null);
                        if (hrVar == null && !C0358.f6667.f4824) {
                            throw new nv("Failed to init SPR: " + str2);
                        }
                        this.f7307 = hrVar;
                    }
                }
                this.f7302 = bhVar.f805;
                this.f7303 = bhVar.f813;
                this.f7304 = bhVar.f806;
                this.f7314 = bhVar.f806;
                this.f7309 = bhVar.f808;
                this.f7311 = bhVar.f803;
                this.f7308 = bhVar.f2001;
                try {
                    hrVarArrM545 = C0358.f6685.m545(bhVar);
                } catch (uw unused) {
                    nz.m907("failed to load weapon and shield; class=" + bhVar.f2001 + " weapon=" + bhVar.f818 + " shield=" + bhVar.f814);
                    hrVarArrM545 = new hr[3];
                }
                this.f7299 = hrVarArrM545[0];
                this.f7301 = hrVarArrM545[1];
                this.f7300 = hrVarArrM545[2];
                this.f1523 = new hr[2];
                this.f1525 = new String[2];
                if (bhVar.f817 > 0) {
                    this.f1523[0] = this.f1522;
                    this.f1525[0] = C0358.f6685.m540(EnumC0134.m1250(iM459), true, iM459, bhVar.f817, EnumC0765.valuesCustom()[bhVar.f803], false, true).f1038;
                }
                if (bhVar.f804 > 0) {
                    this.f1523[1] = this.f7312;
                    this.f1525[1] = C0358.f6685.m540(EnumC0134.m1250(iM459), false, bhVar.f805, bhVar.f804, EnumC0765.valuesCustom()[bhVar.f803], false, true).f1038;
                }
                hr hrVar2 = (hr) cp.m491("shadow", hr.class);
                this.f1521 = new hr[]{hrVar2, this.f7307, this.f1522, this.f7312, this.f7306, this.f7305, this.f7298, this.f7299, this.f7300, this.f7301};
                this.f7310 = new hr[]{hrVar2, this.f7301, this.f1522, this.f7312, this.f7306, this.f7305, this.f7298, this.f7307, this.f7299, this.f7300};
            } else if (lmVar.f1997 == nu.MER) {
                C0673 c0673 = (C0673) lmVar;
                hr hrVar3 = (hr) cp.m491("shadow", hr.class);
                if (this.f7313 == nu.MER) {
                    this.f1522 = new hr(C0358.f6685.f1030.m507(c0673.f2001, c0673.f7590));
                    this.f7312 = C0358.f6685.m544(EnumC0134.NOVICE, (int) c0673.f7594, c0673.f7590, false);
                    this.f7306 = null;
                    if (c0673.f7591 > 0) {
                        this.f7306 = C0358.f6685.m543((int) c0673.f7591, (int) c0673.f7594, c0673.f7590, false);
                    }
                    this.f7305 = null;
                    if (c0673.f7587 > 0) {
                        this.f7305 = C0358.f6685.m543((int) c0673.f7587, (int) c0673.f7594, c0673.f7590, false);
                    }
                    this.f7298 = null;
                    if (c0673.f7592 > 0) {
                        this.f7298 = C0358.f6685.m543((int) c0673.f7592, (int) c0673.f7594, c0673.f7590, false);
                    }
                    this.f1523 = new hr[2];
                    this.f1525 = new String[2];
                    if (c0673.f7593 > 0) {
                        this.f1523[0] = this.f1522;
                        this.f1525[0] = C0358.f6685.m540(EnumC0134.m1250(c0673.f2001), true, c0673.f2001, c0673.f7593, EnumC0765.valuesCustom()[c0673.f7590], false, true).f1038;
                    }
                    if (c0673.f7595 > 0) {
                        this.f1523[1] = this.f7312;
                        this.f1525[1] = C0358.f6685.m540(EnumC0134.m1250(c0673.f2001), false, c0673.f7594, c0673.f7595, EnumC0765.valuesCustom()[c0673.f7590], false, true).f1038;
                    }
                    hr[] hrVarArr = {hrVar3, this.f1522, this.f7312, this.f7306, this.f7305, this.f7298};
                    this.f7310 = hrVarArr;
                    this.f1521 = hrVarArr;
                } else {
                    this.f1522 = C0358.f6685.m541(c0673.f2001);
                    hr[] hrVarArr2 = {hrVar3, this.f1522};
                    this.f7310 = hrVarArr2;
                    this.f1521 = hrVarArr2;
                }
            } else if (this.f7313 == nu.MOB || this.f7313 == nu.HOM || this.f7313 == nu.PET || this.f7313 == nu.NPC || this.f7313 == nu.ELEM) {
                AbstractC0988 abstractC0988 = (AbstractC0988) lmVar;
                hr hrVarM541 = C0358.f6685.m541(abstractC0988.f2001);
                hr hrVar4 = (hr) cp.m491("shadow", hr.class);
                if (lmVar.f2001 == EnumC0431.FLAG_CLASS.f6846) {
                    hr[] hrVarArr3 = {hrVar4, hrVarM541, new C0409(abstractC0988.f8348, abstractC0988.f8349, false, false)};
                    this.f7310 = hrVarArr3;
                    this.f1521 = hrVarArr3;
                } else if (lmVar.f2001 == EnumC0431.WARP_CLASS.f6846 || lmVar.f2001 == EnumC0431.WARP_DEBUG_CLASS.f6846 || lmVar.f2001 == EnumC0431.INVISIBLE_CLASS.f6846) {
                    hr[] hrVarArr4 = {hrVarM541};
                    this.f7310 = hrVarArr4;
                    this.f1521 = hrVarArr4;
                } else {
                    hr[] hrVarArr5 = {hrVar4, hrVarM541};
                    this.f7310 = hrVarArr5;
                    this.f1521 = hrVarArr5;
                }
                this.f1522 = hrVarM541;
            } else if (this.f7313 == nu.ITEM) {
                C0489 c0489 = (C0489) (C0489.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
                cv cvVar3 = C0358.f6685;
                int i4 = c0489.f2001;
                boolean z = c0489.f6956;
                cq cqVar2 = cvVar3.f1030;
                String strM1647 = cqVar2.f967.m1647(i4, z);
                String str3 = strM1647 == null ? null : String.valueOf(cqVar2.f982.f8937.f8944) + "\\" + strM1647;
                hr hrVar5 = str3 == null ? null : (hr) cp.m491(str3, hr.class);
                this.f1521 = new hr[]{hrVar5};
                this.f1522 = hrVar5;
            } else {
                String str4 = "Unsupported unit type " + lmVar.f1997;
                Log.e("AndRO", str4);
                throw new nv(str4);
            }
        }
        m634(this.f1522, this.f1521);
        if (this.f7299 != null && lmVar.f1997 == nu.PC) {
            bh bhVar2 = (bh) lmVar;
            String strM808 = C0358.f6685.f1030.f973.m808(C0358.f6685.f1030.m514(bhVar2.f818, bhVar2.f814).m1395());
            if (strM808 == null || C0358.f6663.f8211.containsKey(strM808)) {
                return;
            }
            C0358.f6663.m1536(strM808, (byte[]) C0358.f6685.f1033.m519("data\\wav\\" + strM808, false));
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final int m1372(mv mvVar, mw mwVar) {
        int i;
        if (this.f7313 == nu.PC) {
            i = mvVar.f2194;
        } else {
            i = mvVar.f2195;
        }
        if (i == -1) {
            i = 0;
        }
        int iOrdinal = (i * 8) + mwVar.ordinal();
        if (iOrdinal >= this.f1524.length) {
            if (iOrdinal % 8 < this.f1524.length) {
                return iOrdinal % 8;
            }
            return 0;
        }
        return iOrdinal;
    }

    @Override // o.hs
    /* renamed from: 鷭 */
    final void mo633(int i) {
        hr[] hrVarArr;
        if (this.f1524[i] != null) {
            return;
        }
        mw mwVar = mw.valuesCustom()[i % 8];
        if (mwVar == mw.NUM6 || mwVar == mw.NUM7 || mwVar == mw.NUM8 || mwVar == mw.NUM9) {
            hrVarArr = this.f7310;
        } else {
            hrVarArr = this.f1521;
        }
        this.f1524[i] = new hs.C0049(hrVarArr, i, this.f1523, this.f1525);
    }
}
