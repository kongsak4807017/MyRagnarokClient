package o;

import android.support.v4.internal.view.SupportMenu;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.apache.commons.net.ftp.FTPReply;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class aaf {

    /* renamed from: 㥳, reason: contains not printable characters */
    private static int[] f115 = {15581, 7999, 22975, 18675, 25761, 23228, 26162, 24657};

    /* renamed from: Ą, reason: contains not printable characters */
    int f116;

    /* renamed from: ą, reason: contains not printable characters */
    int f117;

    /* renamed from: Ć, reason: contains not printable characters */
    int f118;

    /* renamed from: ć, reason: contains not printable characters */
    int f119;

    /* renamed from: ȃ, reason: contains not printable characters */
    int f128;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    aam f131;

    /* renamed from: 䒧, reason: contains not printable characters */
    int f137;

    /* renamed from: 櫯, reason: contains not printable characters */
    aal f143;

    /* renamed from: 纫, reason: contains not printable characters */
    int f144;

    /* renamed from: 躆, reason: contains not printable characters */
    int f145;

    /* renamed from: 띥, reason: contains not printable characters */
    private int f147;

    /* renamed from: 鷭, reason: contains not printable characters */
    aal[][] f146 = (aal[][]) Array.newInstance((Class<?>) aal.class, 25, 16);

    /* renamed from: ˮ͍, reason: contains not printable characters */
    int[] f132 = new int[256];

    /* renamed from: 岱, reason: contains not printable characters */
    int[] f139 = new int[256];

    /* renamed from: Ȋ, reason: contains not printable characters */
    int[] f129 = new int[256];

    /* renamed from: ċ, reason: contains not printable characters */
    int[] f120 = new int[256];

    /* renamed from: ܕ, reason: contains not printable characters */
    int[][] f133 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 128, 64);

    /* renamed from: 庸, reason: contains not printable characters */
    aai f140 = new aai();

    /* renamed from: đ, reason: contains not printable characters */
    public aao f121 = new aao();

    /* renamed from: Ė, reason: contains not printable characters */
    private final aam f124 = new aam(null);

    /* renamed from: ė, reason: contains not printable characters */
    private final aam f125 = new aam(null);

    /* renamed from: Ę, reason: contains not printable characters */
    private final aam f126 = new aam(null);

    /* renamed from: ę, reason: contains not printable characters */
    private final aam f127 = new aam(null);

    /* renamed from: 廂, reason: contains not printable characters */
    private final aan f141 = new aan();

    /* renamed from: 囃, reason: contains not printable characters */
    private final aan f138 = new aan();

    /* renamed from: ঽ্, reason: contains not printable characters */
    private final aag f134 = new aag(null);

    /* renamed from: 廅, reason: contains not printable characters */
    private final aag f142 = new aag(null);

    /* renamed from: 㵼, reason: contains not printable characters */
    private final aag f136 = new aag(null);

    /* renamed from: 㱽, reason: contains not printable characters */
    private final aag f135 = new aag(null);

    /* renamed from: Ƞ, reason: contains not printable characters */
    private final int[] f130 = new int[64];

    /* renamed from: Ē, reason: contains not printable characters */
    private aag f122 = null;

    /* renamed from: ē, reason: contains not printable characters */
    private aag f123 = null;

    /* renamed from: 櫯, reason: contains not printable characters */
    private void m185() {
        Arrays.fill(this.f132, 0);
        aao aaoVar = this.f121;
        Arrays.fill(aaoVar.f198, aaoVar.f203, aaoVar.f203 + (aaoVar.f197.length * 4), (byte) 0);
        aaoVar.f199 = aaoVar.f187;
        int i = ((aaoVar.f201 / 8) / 12) * 7 * 12;
        int i2 = (i / 12) * aao.f185;
        int i3 = aaoVar.f201 - i;
        int i4 = ((i3 / 12) * aao.f185) + (i3 % 12);
        aaoVar.f189 = aaoVar.f187 + aaoVar.f201;
        int i5 = aaoVar.f187 + i4;
        aaoVar.f195 = i5;
        aaoVar.f188 = i5;
        aaoVar.f202 = aaoVar.f187 + i3;
        aaoVar.f189 = aaoVar.f188 + i2;
        int i6 = 0;
        int i7 = 1;
        while (i6 < 4) {
            aaoVar.f196[i6] = i7 & 255;
            i6++;
            i7++;
        }
        int i8 = i7 + 1;
        while (i6 < 8) {
            aaoVar.f196[i6] = i8 & 255;
            i6++;
            i8 += 2;
        }
        int i9 = i8 + 1;
        while (i6 < 12) {
            aaoVar.f196[i6] = i9 & 255;
            i6++;
            i9 += 3;
        }
        int i10 = i9 + 1;
        while (i6 < 38) {
            aaoVar.f196[i6] = i10 & 255;
            i6++;
            i10 += 4;
        }
        aaoVar.f186 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 128; i12++) {
            i11 += aaoVar.f196[i11] < i12 + 1 ? 1 : 0;
            aaoVar.f194[i12] = i11 & 255;
        }
        this.f119 = (-(this.f147 < 12 ? this.f147 : 12)) - 1;
        int iM242 = this.f121.m242();
        this.f122.mo197(iM242);
        this.f123.mo197(iM242);
        this.f122.m200(0);
        this.f117 = this.f147;
        this.f122.m204(256);
        this.f122.f159.m181(this.f122.m202() + 1);
        int iM240 = this.f121.m240(128);
        this.f131.mo197(iM240);
        this.f122.f159.a_(iM240);
        aam aamVar = new aam(this.f121.f198);
        int iM177 = this.f122.f159.m177();
        this.f118 = this.f119;
        this.f137 = 0;
        for (int i13 = 0; i13 < 256; i13++) {
            aamVar.mo197((i13 * 6) + iM177);
            aamVar.m235(i13);
            aamVar.m232(1);
            aamVar.m227(0);
        }
        for (int i14 = 0; i14 < 128; i14++) {
            for (int i15 = 0; i15 < 8; i15++) {
                for (int i16 = 0; i16 < 64; i16 += 8) {
                    this.f133[i14][i15 + i16] = 16384 - (f115[i15] / (i14 + 2));
                }
            }
        }
        for (int i17 = 0; i17 < 25; i17++) {
            for (int i18 = 0; i18 < 16; i18++) {
                aal aalVar = this.f146[i17][i18];
                aalVar.f179 = 3;
                aalVar.f180 = (((i17 * 5) + 10) << aalVar.f179) & SupportMenu.USER_MASK;
                aalVar.f178 = 4;
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m187(int i) {
        this.f144 = 1;
        this.f147 = i;
        m185();
        this.f129[0] = 0;
        this.f129[1] = 2;
        for (int i2 = 0; i2 < 9; i2++) {
            this.f129[i2 + 2] = 4;
        }
        for (int i3 = 0; i3 < 245; i3++) {
            this.f129[i3 + 11] = 6;
        }
        int i4 = 0;
        while (i4 < 3) {
            this.f139[i4] = i4;
            i4++;
        }
        int i5 = 3;
        int i6 = 1;
        int i7 = 1;
        while (i4 < 256) {
            this.f139[i4] = i5;
            i6--;
            if (i6 == 0) {
                i7++;
                i6 = i7;
                i5++;
            }
            i4++;
        }
        for (int i8 = 0; i8 < 64; i8++) {
            this.f120[i8] = 0;
        }
        for (int i9 = 0; i9 < 192; i9++) {
            this.f120[i9 + 64] = 8;
        }
        this.f143.f179 = 7;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final boolean m189(zr zrVar) {
        int iM1224 = zrVar.m1224() & 255;
        boolean z = (iM1224 & 32) != 0;
        int iM12242 = 0;
        if (z) {
            iM12242 = zrVar.m1224();
        } else if (this.f121.f201 == 0) {
            return false;
        }
        if ((iM1224 & 64) != 0) {
            zrVar.f6135 = zrVar.m1224();
        }
        this.f140.m211(zrVar);
        if (z) {
            int i = (iM1224 & 31) + 1;
            if (i > 16) {
                i = ((i - 16) * 3) + 16;
            }
            if (i == 1) {
                this.f121.m245();
                return false;
            }
            this.f121.m241(iM12242 + 1);
            this.f122 = new aag(this.f121.f198);
            this.f123 = new aag(this.f121.f198);
            this.f131 = new aam(this.f121.f198);
            this.f143 = new aal();
            for (int i2 = 0; i2 < 25; i2++) {
                for (int i3 = 0; i3 < 16; i3++) {
                    this.f146[i2][i3] = new aal();
                }
            }
            m187(i);
        }
        return this.f122.m207() != 0;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final int m188() {
        if (this.f122.m207() <= this.f121.f199 || this.f122.m207() > this.f121.f190) {
            return -1;
        }
        if (this.f122.m202() != 1) {
            if (this.f122.f159.m177() <= this.f121.f199 || this.f122.f159.m177() > this.f121.f190 || !this.f122.m198(this)) {
                return -1;
            }
        } else {
            this.f122.m205(this);
        }
        this.f140.m209();
        while (this.f131.m207() == 0) {
            this.f140.m208();
            do {
                this.f117++;
                this.f122.mo197(this.f122.m199());
                if (this.f122.m207() <= this.f121.f199 || this.f122.m207() > this.f121.f190) {
                    return -1;
                }
            } while (this.f122.m202() == this.f128);
            if (!this.f122.m201(this)) {
                return -1;
            }
            this.f140.m209();
        }
        int iM233 = this.f131.m233();
        if (this.f117 == 0 && this.f131.m229() > this.f121.f199) {
            int iM229 = this.f131.m229();
            this.f122.mo197(iM229);
            this.f123.mo197(iM229);
        } else {
            m184();
            if (this.f144 == 0) {
                this.f144 = 1;
                Arrays.fill(this.f132, 0);
            }
        }
        this.f140.m208();
        return iM233;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private int m186(boolean z, aam aamVar) {
        int i;
        aan aanVar = this.f138;
        aam aamVarM234 = this.f124.m234(this.f121.f198);
        aag aagVarM203 = this.f134.m203(this.f121.f198);
        aagVarM203.mo197(this.f122.m207());
        aag aagVarM2032 = this.f142.m203(this.f121.f198);
        aagVarM2032.mo197(this.f131.m229());
        aam aamVarM2342 = this.f125.m234(this.f121.f198);
        int i2 = 0;
        boolean z2 = false;
        if (!z) {
            i2 = 0 + 1;
            this.f130[0] = this.f131.m207();
            if (aagVarM203.m199() == 0) {
                z2 = true;
            }
        }
        if (!z2) {
            boolean z3 = false;
            if (aamVar.m207() != 0) {
                aamVarM2342.mo197(aamVar.m207());
                aagVarM203.mo197(aagVarM203.m199());
                z3 = true;
            }
            while (true) {
                if (!z3) {
                    aagVarM203.mo197(aagVarM203.m199());
                    if (aagVarM203.m202() != 1) {
                        aamVarM2342.mo197(aagVarM203.f159.m177());
                        if (aamVarM2342.m233() != this.f131.m233()) {
                            do {
                                aamVarM2342.m228();
                            } while (aamVarM2342.m233() != this.f131.m233());
                        }
                    } else {
                        aamVarM2342.mo197(aagVarM203.f154.m207());
                    }
                }
                z3 = false;
                if (aamVarM2342.m229() != aagVarM2032.m207()) {
                    aagVarM203.mo197(aamVarM2342.m229());
                    break;
                }
                int i3 = i2;
                i2++;
                this.f130[i3] = aamVarM2342.m207();
                if (aagVarM203.m199() == 0) {
                    break;
                }
            }
        }
        if (i2 == 0) {
            return aagVarM203.m207();
        }
        aanVar.f183 = this.f121.f198[aagVarM2032.m207()] & 255;
        aanVar.f181 = aagVarM2032.m207() + 1;
        if (aagVarM203.m202() != 1) {
            if (aagVarM203.m207() <= this.f121.f199) {
                return 0;
            }
            aamVarM2342.mo197(aagVarM203.f159.m177());
            if (aamVarM2342.m233() != aanVar.f183) {
                do {
                    aamVarM2342.m228();
                } while (aamVarM2342.m233() != aanVar.f183);
            }
            int iM231 = aamVarM2342.m231() - 1;
            int iM179 = (aagVarM203.f159.m179() - aagVarM203.m202()) - iM231;
            if (iM231 * 2 <= iM179) {
                i = iM231 * 5 > iM179 ? 1 : 0;
            } else {
                i = (((iM231 * 2) + (iM179 * 3)) - 1) / (iM179 * 2);
            }
            aanVar.f182 = (i + 1) & 255;
        } else {
            aanVar.f182 = aagVarM203.f154.m231() & 255;
        }
        do {
            i2--;
            aamVarM234.mo197(this.f130[i2]);
            byte[] bArr = this.f121.f198;
            if (aagVarM203.f151 == null) {
                aagVarM203.f151 = new aag(null);
            }
            aag aagVarM2033 = aagVarM203.f151.m203(bArr);
            aagVarM2033.mo197(this.f121.m242());
            if (aagVarM2033 != null) {
                aagVarM2033.m204(1);
                aam aamVar2 = aagVarM2033.f154;
                aamVar2.m235(aanVar.f183);
                aamVar2.m232(aanVar.f182);
                aamVar2.m227(aanVar.f181);
                aagVarM2033.m200(aagVarM203.m207());
                aamVarM234.m227(aagVarM2033.m207());
            }
            aagVarM203.mo197(aagVarM2033.m207());
            if (aagVarM203.m207() == 0) {
                return 0;
            }
        } while (i2 != 0);
        return aagVarM203.m207();
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private void m184() {
        int i;
        aan aanVar = this.f141;
        aam aamVar = this.f131;
        aanVar.f182 = aamVar.m231() & 255;
        aanVar.f181 = aamVar.m229();
        aanVar.f183 = aamVar.m233() & 255;
        aam aamVarM234 = this.f126.m234(this.f121.f198);
        aam aamVarM2342 = this.f127.m234(this.f121.f198);
        aag aagVarM203 = this.f136.m203(this.f121.f198);
        aag aagVarM2032 = this.f135.m203(this.f121.f198);
        aagVarM203.mo197(this.f122.m199());
        if (aanVar.f182 < 31 && aagVarM203.m207() != 0) {
            if (aagVarM203.m202() != 1) {
                aamVarM234.mo197(aagVarM203.f159.m177());
                if (aamVarM234.m233() != aanVar.f183) {
                    do {
                        aamVarM234.m228();
                    } while (aamVarM234.m233() != aanVar.f183);
                    aamVarM2342.mo197(aamVarM234.m207() - 6);
                    if (aamVarM234.m231() >= aamVarM2342.m231()) {
                        aam.m225(aamVarM234, aamVarM2342);
                        aamVarM234.m226();
                    }
                }
                if (aamVarM234.m231() < 115) {
                    aamVarM234.m230(2);
                    aagVarM203.f159.m178(2);
                }
            } else {
                aamVarM234.mo197(aagVarM203.f154.m207());
                if (aamVarM234.m231() < 32) {
                    aamVarM234.m230(1);
                }
            }
        }
        if (this.f117 != 0) {
            this.f121.f198[this.f121.f199] = (byte) aanVar.f183;
            this.f121.f199++;
            aagVarM2032.mo197(this.f121.f199);
            if (this.f121.f199 >= this.f121.f202) {
                m185();
                this.f144 = 0;
                return;
            }
            if (aanVar.f181 != 0) {
                if (aanVar.f181 <= this.f121.f199) {
                    aanVar.f181 = m186(false, aamVarM234);
                    if (aanVar.f181 == 0) {
                        m185();
                        this.f144 = 0;
                        return;
                    }
                }
                int i2 = this.f117 - 1;
                this.f117 = i2;
                if (i2 == 0) {
                    aagVarM2032.mo197(aanVar.f181);
                    if (this.f123.m207() != this.f122.m207()) {
                        aao aaoVar = this.f121;
                        aaoVar.f199--;
                    }
                }
            } else {
                this.f131.m227(aagVarM2032.m207());
                aanVar.f181 = this.f122.m207();
            }
            int iM202 = this.f122.m202();
            int iM179 = (this.f122.f159.m179() - iM202) - (aanVar.f182 - 1);
            aagVarM203.mo197(this.f123.m207());
            while (aagVarM203.m207() != this.f122.m207()) {
                int iM2022 = aagVarM203.m202();
                if (iM2022 != 1) {
                    if ((iM2022 & 1) == 0) {
                        aagVarM203.f159.a_(this.f121.m243(aagVarM203.f159.m177(), iM2022 >>> 1));
                        if (aagVarM203.f159.m177() == 0) {
                            m185();
                            this.f144 = 0;
                            return;
                        }
                    }
                    aagVarM203.f159.m178((iM2022 * 2 < iM202 ? 1 : 0) + (((iM2022 * 4 <= iM202 ? 1 : 0) & (aagVarM203.f159.m179() <= iM2022 * 8 ? 1 : 0)) * 2));
                } else {
                    aamVarM234.mo197(this.f121.m240(1));
                    if (aamVarM234.m207() == 0) {
                        m185();
                        this.f144 = 0;
                        return;
                    }
                    aamVarM234.m236(aagVarM203.f154);
                    aagVarM203.f159.m182(aamVarM234);
                    if (aamVarM234.m231() < 30) {
                        aamVarM234.m230(aamVarM234.m231());
                    } else {
                        aamVarM234.m232(FTPReply.SERVICE_NOT_READY);
                    }
                    aagVarM203.f159.m181(aamVarM234.m231() + this.f116 + (iM202 > 3 ? 1 : 0));
                }
                int iM1792 = aanVar.f182 * 2 * (aagVarM203.f159.m179() + 6);
                int iM1793 = iM179 + aagVarM203.f159.m179();
                if (iM1792 < iM1793 * 6) {
                    i = (iM1792 > iM1793 ? 1 : 0) + 1 + (iM1792 >= iM1793 * 4 ? 1 : 0);
                    aagVarM203.f159.m178(3);
                } else {
                    i = (iM1792 >= iM1793 * 9 ? 1 : 0) + 4 + (iM1792 >= iM1793 * 12 ? 1 : 0) + (iM1792 >= iM1793 * 15 ? 1 : 0);
                    aagVarM203.f159.m178(i);
                }
                aamVarM234.mo197(aagVarM203.f159.m177() + (iM2022 * 6));
                aamVarM234.m227(aagVarM2032.m207());
                aamVarM234.m235(aanVar.f183);
                aamVarM234.m232(i);
                aagVarM203.m204(iM2022 + 1);
                aagVarM203.mo197(aagVarM203.m199());
            }
            int i3 = aanVar.f181;
            this.f123.mo197(i3);
            this.f122.mo197(i3);
            return;
        }
        this.f131.m227(m186(true, aamVarM234));
        this.f122.mo197(this.f131.m229());
        this.f123.mo197(this.f131.m229());
        if (this.f122.m207() == 0) {
            m185();
            this.f144 = 0;
        }
    }

    public final String toString() {
        return "ModelPPM[\n  numMasked=" + this.f128 + "\n  initEsc=" + this.f116 + "\n  orderFall=" + this.f117 + "\n  maxOrder=" + this.f147 + "\n  runLength=" + this.f118 + "\n  initRL=" + this.f119 + "\n  escCount=" + this.f144 + "\n  prevSuccess=" + this.f137 + "\n  foundState=" + this.f131 + "\n  coder=" + this.f140 + "\n  subAlloc=" + this.f121 + "\n]";
    }
}
