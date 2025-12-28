package o;

import android.support.v4.internal.view.SupportMenu;
import o.aai;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class aag extends aah {

    /* renamed from: Ą, reason: contains not printable characters */
    aag f151;

    /* renamed from: ċ, reason: contains not printable characters */
    private final aam f152;

    /* renamed from: Ȋ, reason: contains not printable characters */
    private int f153;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final aam f154;

    /* renamed from: ܕ, reason: contains not printable characters */
    private final aam f155;

    /* renamed from: 䒧, reason: contains not printable characters */
    private final aam f156;

    /* renamed from: 岱, reason: contains not printable characters */
    private int f157;

    /* renamed from: 庸, reason: contains not printable characters */
    private final int[] f158;

    /* renamed from: 櫯, reason: contains not printable characters */
    final aae f159;

    /* renamed from: 纫, reason: contains not printable characters */
    private final aam f160;

    /* renamed from: 躆, reason: contains not printable characters */
    private final aam f161;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private static final int f149 = Math.max(6, 6);

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final int f150 = (f149 + 2) + 4;

    /* renamed from: ȃ, reason: contains not printable characters */
    public static final int[] f148 = {25, 14, 9, 7, 5, 5, 4, 4, 4, 3, 3, 3, 2, 2, 2, 2};

    public aag(byte[] bArr) {
        super(bArr);
        this.f152 = new aam(null);
        this.f160 = new aam(null);
        this.f156 = new aam(null);
        this.f161 = new aam(null);
        this.f155 = new aam(null);
        this.f151 = null;
        this.f158 = new int[256];
        this.f154 = new aam(bArr);
        this.f159 = new aae(bArr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final aag m203(byte[] bArr) {
        this.f163 = bArr;
        this.f164 = 0;
        this.f154.m234(bArr);
        this.f159.m180(bArr);
        return this;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final int m202() {
        if (this.f163 != null) {
            byte[] bArr = this.f163;
            int i = this.f164;
            this.f157 = ((short) (((short) (((short) ((bArr[i + 1] & 255) + 0)) << 8)) + (bArr[i] & 255))) & 65535;
        }
        return this.f157;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m204(int i) {
        this.f157 = 65535 & i;
        if (this.f163 != null) {
            byte[] bArr = this.f163;
            int i2 = this.f164;
            short s = (short) i;
            bArr[i2 + 1] = (byte) (s >>> 8);
            bArr[i2] = (byte) (s & 255);
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final int m199() {
        if (this.f163 != null) {
            this.f153 = yu.m1180(this.f163, this.f164 + 8);
        }
        return this.f153;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final void m200(int i) {
        this.f153 = i;
        if (this.f163 != null) {
            yu.m1182(this.f163, this.f164 + 8, i);
        }
    }

    @Override // o.aah
    /* renamed from: ˮ͈, reason: contains not printable characters */
    public final void mo197(int i) {
        super.mo197(i);
        this.f154.mo197(i + 2);
        this.f159.mo197(i + 2);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private aag m193(byte[] bArr) {
        if (this.f151 == null) {
            this.f151 = new aag(null);
        }
        aag aagVar = this.f151;
        aagVar.f163 = bArr;
        aagVar.f164 = 0;
        aagVar.f154.m234(bArr);
        aagVar.f159.m180(bArr);
        return aagVar;
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    private void m191(aaf aafVar) {
        int i;
        int iM202 = m202();
        int iM2022 = m202() - 1;
        aam aamVar = new aam(aafVar.f121.f198);
        aam aamVar2 = new aam(aafVar.f121.f198);
        aam aamVar3 = new aam(aafVar.f121.f198);
        aamVar2.mo197(aafVar.f131.m207());
        while (aamVar2.m207() != this.f159.m177()) {
            aamVar3.mo197(aamVar2.m207() - 6);
            aam.m225(aamVar2, aamVar3);
            aamVar2.m226();
        }
        aamVar3.mo197(this.f159.m177());
        aamVar3.m230(4);
        this.f159.m178(4);
        int iM179 = this.f159.m179() - aamVar2.m231();
        int i2 = aafVar.f117 != 0 ? 1 : 0;
        aamVar2.m232((aamVar2.m231() + i2) >>> 1);
        this.f159.m181(aamVar2.m231());
        do {
            aamVar2.m228();
            iM179 -= aamVar2.m231();
            aamVar2.m232((aamVar2.m231() + i2) >>> 1);
            this.f159.m178(aamVar2.m231());
            aamVar3.mo197(aamVar2.m207() - 6);
            if (aamVar2.m231() > aamVar3.m231()) {
                aamVar.mo197(aamVar2.m207());
                aan aanVar = new aan();
                aanVar.f182 = aamVar.m231() & 255;
                aanVar.f181 = aamVar.m229();
                aanVar.f183 = aamVar.m233() & 255;
                aam aamVar4 = new aam(aafVar.f121.f198);
                aam aamVar5 = new aam(aafVar.f121.f198);
                do {
                    aamVar4.mo197(aamVar.m207() - 6);
                    aamVar.m236(aamVar4);
                    aamVar.m226();
                    aamVar5.mo197(aamVar.m207() - 6);
                    if (aamVar.m207() == this.f159.m177()) {
                        break;
                    }
                } while (aanVar.f182 > aamVar5.m231());
                aamVar.m235(aanVar.f183);
                aamVar.m232(aanVar.f182);
                aamVar.m227(aanVar.f181);
            }
            iM2022--;
        } while (iM2022 != 0);
        if (aamVar2.m231() == 0) {
            do {
                iM2022++;
                aamVar2.m226();
            } while (aamVar2.m231() == 0);
            iM179 += iM2022;
            m204(m202() - iM2022);
            if (m202() == 1) {
                aan aanVar2 = new aan();
                aamVar3.mo197(this.f159.m177());
                aanVar2.f182 = aamVar3.m231() & 255;
                aanVar2.f181 = aamVar3.m229();
                aanVar2.f183 = aamVar3.m233() & 255;
                do {
                    aanVar2.f182 = (aanVar2.f182 - (aanVar2.f182 >>> 1)) & 255;
                    iM179 >>>= 1;
                } while (iM179 > 1);
                aao aaoVar = aafVar.f121;
                aaoVar.m246(this.f159.m177(), aaoVar.f194[((iM202 + 1) >>> 1) - 1]);
                aam aamVar6 = this.f154;
                aamVar6.m235(aanVar2.f183);
                aamVar6.m232(aanVar2.f182);
                aamVar6.m227(aanVar2.f181);
                aafVar.f131.mo197(this.f154.m207());
                return;
            }
        }
        this.f159.m178(iM179 - (iM179 >>> 1));
        int i3 = (iM202 + 1) >>> 1;
        int iM2023 = (m202() + 1) >>> 1;
        if (i3 != iM2023) {
            aae aaeVar = this.f159;
            aao aaoVar2 = aafVar.f121;
            int iM177 = this.f159.m177();
            int i4 = aaoVar2.f194[i3 - 1];
            int i5 = aaoVar2.f194[iM2023 - 1];
            if (i4 == i5) {
                i = iM177;
            } else if (aaoVar2.f197[i5].m221() != 0) {
                int iM244 = aaoVar2.m244(i5);
                byte[] bArr = aaoVar2.f198;
                System.arraycopy(bArr, iM177, bArr, iM244, aao.m239(iM2023));
                aaoVar2.m246(iM177, i4);
                i = iM244;
            } else {
                aaoVar2.m247(iM177, i4, i5);
                i = iM177;
            }
            aaeVar.a_(i);
        }
        aafVar.f131.mo197(this.f159.m177());
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private int m195(aaf aafVar, aam aamVar) {
        aag aagVarM193 = m193(aafVar.f121.f198);
        if (this.f163 != null) {
            this.f153 = yu.m1180(this.f163, this.f164 + 8);
        }
        int i = this.f153;
        super.mo197(i);
        aagVarM193.f154.mo197(i + 2);
        aagVarM193.f159.mo197(i + 2);
        return aafVar.f137 + 0 + aafVar.f129[aagVarM193.m202() - 1] + aafVar.f145 + (aafVar.f120[aamVar.m233()] * 2) + ((aafVar.f118 >>> 26) & 32);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m205(aaf aafVar) {
        aam aamVarM234 = this.f152.m234(aafVar.f121.f198);
        aamVarM234.mo197(this.f154.m207());
        aafVar.f145 = aafVar.f120[aafVar.f131.m233()] & 255;
        int iM231 = aamVarM234.m231() - 1;
        int iM195 = m195(aafVar, aamVarM234);
        int i = aafVar.f133[iM231][iM195];
        aai aaiVar = aafVar.f140;
        aaiVar.f167 >>>= 14;
        if ((((aaiVar.f168 - aaiVar.f169) / aaiVar.f167) & 4294967295L) < i) {
            aafVar.f131.mo197(aamVarM234.m207());
            aamVarM234.m230(aamVarM234.m231() < 128 ? 1 : 0);
            aafVar.f140.f166.f172 = 0L;
            aafVar.f140.f166.f171 = i & 4294967295L;
            aafVar.f133[iM231][iM195] = ((i + 128) - ((i + 32) >>> 7)) & SupportMenu.USER_MASK;
            aafVar.f137 = 1;
            aafVar.f118++;
            return;
        }
        aafVar.f140.f166.f172 = i & 4294967295L;
        int i2 = (i - ((i + 32) >>> 7)) & SupportMenu.USER_MASK;
        aafVar.f133[iM231][iM195] = i2;
        aafVar.f140.f166.f171 = 16384L;
        aafVar.f116 = f148[i2 >>> 10];
        aafVar.f128 = 1;
        aafVar.f132[aamVarM234.m233()] = aafVar.f144;
        aafVar.f137 = 0;
        aafVar.f131.mo197(0);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m196(aaf aafVar, int i) {
        aafVar.f131.mo197(i);
        aafVar.f131.m230(4);
        this.f159.m178(4);
        aam aamVarM234 = this.f156.m234(aafVar.f121.f198);
        aam aamVarM2342 = this.f161.m234(aafVar.f121.f198);
        aamVarM234.mo197(i);
        aamVarM2342.mo197(i - 6);
        if (aamVarM234.m231() > aamVarM2342.m231()) {
            aam.m225(aamVarM234, aamVarM2342);
            aafVar.f131.mo197(aamVarM2342.m207());
            if (aamVarM2342.m231() > 124) {
                m191(aafVar);
            }
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final boolean m201(aaf aafVar) {
        int iM202 = m202() - aafVar.f128;
        aal aalVarM192 = m192(aafVar, iM202);
        aai aaiVar = aafVar.f140;
        aam aamVarM234 = this.f152.m234(aafVar.f121.f198);
        aam aamVarM2342 = this.f160.m234(aafVar.f121.f198);
        aamVarM234.mo197(this.f159.m177() - 6);
        int i = 0;
        int iM231 = 0;
        while (true) {
            aamVarM234.m228();
            if (aafVar.f132[aamVarM234.m233()] != aafVar.f144) {
                iM231 += aamVarM234.m231();
                int i2 = i;
                i++;
                this.f158[i2] = aamVarM234.m207();
                iM202--;
                if (iM202 == 0) {
                    break;
                }
            }
        }
        aai.C0004 c0004 = aaiVar.f166;
        c0004.f170 = (c0004.f170 + iM231) & 4294967295L;
        long jM210 = aaiVar.m210();
        if (jM210 >= aaiVar.f166.f170) {
            return false;
        }
        int i3 = 0;
        aamVarM234.mo197(this.f158[0]);
        if (jM210 < iM231) {
            int iM2312 = 0;
            while (true) {
                iM2312 += aamVarM234.m231();
                if (iM2312 <= jM210) {
                    i3++;
                    aamVarM234.mo197(this.f158[i3]);
                } else {
                    aaiVar.f166.f171 = iM2312 & 4294967295L;
                    aaiVar.f166.f172 = (iM2312 - aamVarM234.m231()) & 4294967295L;
                    aalVarM192.m224();
                    m194(aafVar, aamVarM234.m207());
                    return true;
                }
            }
        } else {
            aaiVar.f166.f172 = iM231 & 4294967295L;
            aaiVar.f166.f171 = aaiVar.f166.f170 & 4294967295L;
            int iM2022 = m202() - aafVar.f128;
            int i4 = 0 - 1;
            do {
                i4++;
                aamVarM2342.mo197(this.f158[i4]);
                aafVar.f132[aamVarM2342.m233()] = aafVar.f144;
                iM2022--;
            } while (iM2022 != 0);
            aalVarM192.f180 = (aalVarM192.f180 + ((int) aaiVar.f166.f170)) & SupportMenu.USER_MASK;
            aafVar.f128 = m202();
            return true;
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private void m194(aaf aafVar, int i) {
        aam aamVarM234 = this.f155.m234(aafVar.f121.f198);
        aamVarM234.mo197(i);
        aafVar.f131.mo197(i);
        aafVar.f131.m230(4);
        this.f159.m178(4);
        if (aamVarM234.m231() > 124) {
            m191(aafVar);
        }
        aafVar.f144 = (aafVar.f144 + 1) & 255;
        aafVar.f118 = aafVar.f119;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private aal m192(aaf aafVar, int i) {
        int iM202 = m202();
        if (iM202 != 256) {
            aag aagVarM193 = m193(aafVar.f121.f198);
            if (this.f163 != null) {
                this.f153 = yu.m1180(this.f163, this.f164 + 8);
            }
            int i2 = this.f153;
            super.mo197(i2);
            aagVarM193.f154.mo197(i2 + 2);
            aagVarM193.f159.mo197(i2 + 2);
            aal aalVar = aafVar.f146[aafVar.f139[i - 1]][(i < aagVarM193.m202() - iM202 ? 1 : 0) + 0 + ((this.f159.m179() < iM202 * 11 ? 1 : 0) * 2) + ((aafVar.f128 > i ? 1 : 0) * 4) + aafVar.f145];
            aai.C0004 c0004 = aafVar.f140.f166;
            int i3 = aalVar.f180 >>> aalVar.f179;
            aalVar.f180 -= i3;
            c0004.f170 = ((i3 == 0 ? 1 : 0) + i3) & 4294967295L;
            return aalVar;
        }
        aal aalVar2 = aafVar.f143;
        aafVar.f140.f166.f170 = 1L;
        return aalVar2;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public final boolean m198(aaf aafVar) {
        aai aaiVar = aafVar.f140;
        aaiVar.f166.f170 = this.f159.m179() & 4294967295L;
        aam aamVar = new aam(aafVar.f121.f198);
        aamVar.mo197(this.f159.m177());
        long jM210 = aaiVar.m210();
        if (jM210 >= aaiVar.f166.f170) {
            return false;
        }
        int iM231 = aamVar.m231();
        if (jM210 < iM231) {
            aaiVar.f166.f171 = iM231 & 4294967295L;
            aafVar.f137 = (((long) (iM231 * 2)) > aaiVar.f166.f170 ? 1 : 0) & 255;
            aafVar.f118 += aafVar.f137;
            int i = iM231 + 4;
            aafVar.f131.mo197(aamVar.m207());
            aafVar.f131.m232(i);
            this.f159.m178(4);
            if (i > 124) {
                m191(aafVar);
            }
            aaiVar.f166.f172 = 0L;
            return true;
        }
        if (aafVar.f131.m207() == 0) {
            return false;
        }
        aafVar.f137 = 0;
        int iM202 = m202();
        int i2 = iM202 - 1;
        do {
            iM231 += aamVar.m228().m231();
            if (iM231 <= jM210) {
                i2--;
            } else {
                aaiVar.f166.f172 = (iM231 - aamVar.m231()) & 4294967295L;
                aaiVar.f166.f171 = iM231 & 4294967295L;
                m196(aafVar, aamVar.m207());
                return true;
            }
        } while (i2 != 0);
        aafVar.f145 = aafVar.f120[aafVar.f131.m233()] & 255;
        aaiVar.f166.f172 = iM231 & 4294967295L;
        aafVar.f132[aamVar.m233()] = aafVar.f144;
        aafVar.f128 = iM202;
        int i3 = iM202 - 1;
        aafVar.f131.mo197(0);
        do {
            aafVar.f132[aamVar.m226().m233()] = aafVar.f144;
            i3--;
        } while (i3 != 0);
        aaiVar.f166.f171 = aaiVar.f166.f170 & 4294967295L;
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PPMContext[");
        sb.append("\n  pos=");
        sb.append(this.f164);
        sb.append("\n  size=");
        sb.append(f150);
        sb.append("\n  numStats=");
        sb.append(m202());
        sb.append("\n  Suffix=");
        if (this.f163 != null) {
            this.f153 = yu.m1180(this.f163, this.f164 + 8);
        }
        sb.append(this.f153);
        sb.append("\n  freqData=");
        sb.append(this.f159);
        sb.append("\n  oneState=");
        sb.append(this.f154);
        sb.append("\n]");
        return sb.toString();
    }
}
