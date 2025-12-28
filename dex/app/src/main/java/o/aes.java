package o;

import java.util.Arrays;
import o.aer;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class aes extends aer {

    /* renamed from: ܕ, reason: contains not printable characters */
    private final C0019 f643;

    /* renamed from: 䒧, reason: contains not printable characters */
    final aev f644;

    /* renamed from: 庸, reason: contains not printable characters */
    private final C0019 f645;

    /* renamed from: 纫, reason: contains not printable characters */
    final aeq f646;

    /* renamed from: 躆, reason: contains not printable characters */
    private final Cif f647;

    public aes(aeq aeqVar, aew aewVar, int i, int i2, int i3) {
        super(i3);
        this.f643 = new C0019(this, null);
        this.f645 = new C0019(this, null);
        this.f646 = aeqVar;
        this.f644 = aewVar;
        this.f647 = new Cif(i, i2);
        super.mo423();
        Cif cif = this.f647;
        for (int i4 = 0; i4 < cif.f649.length; i4++) {
            Arrays.fill(cif.f649[i4].f637, (short) 1024);
        }
        this.f643.m424();
        this.f645.m424();
    }

    @Override // o.aer
    /* renamed from: 鷭 */
    public final void mo423() {
        super.mo423();
        Cif cif = this.f647;
        for (int i = 0; i < cif.f649.length; i++) {
            Arrays.fill(cif.f649[i].f637, (short) 1024);
        }
        this.f643.m424();
        this.f645.m424();
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final void m425() throws aem {
        int i;
        int iM426;
        aeq aeqVar = this.f646;
        if (aeqVar.f615 > 0) {
            aeqVar.m422(aeqVar.f616, aeqVar.f615);
        }
        while (true) {
            aeq aeqVar2 = this.f646;
            if (aeqVar2.f617 < aeqVar2.f614) {
                int i2 = this.f646.f617 & this.f632;
                if (this.f644.m428(this.f626[this.f628.f652], i2) == 0) {
                    Cif cif = this.f647;
                    Cif.C0018 c0018 = cif.f649[(aes.this.f646.m421(0) >> (8 - cif.f635)) + ((cif.f634 & aes.this.f646.f617) << cif.f635)];
                    int iM428 = 1;
                    if (aes.this.f628.f652 < 7) {
                        do {
                            iM428 = (iM428 << 1) | aes.this.f644.m428(c0018.f637, iM428);
                        } while (iM428 < 256);
                    } else {
                        int iM421 = aes.this.f646.m421(aes.this.f631[0]);
                        int i3 = 256;
                        do {
                            iM421 <<= 1;
                            int i4 = iM421 & i3;
                            int iM4282 = aes.this.f644.m428(c0018.f637, i3 + i4 + iM428);
                            iM428 = (iM428 << 1) | iM4282;
                            i3 &= (0 - iM4282) ^ (i4 ^ (-1));
                        } while (iM428 < 256);
                    }
                    aeq aeqVar3 = aes.this.f646;
                    byte[] bArr = aeqVar3.f620;
                    int i5 = aeqVar3.f617;
                    aeqVar3.f617 = i5 + 1;
                    bArr[i5] = (byte) iM428;
                    if (aeqVar3.f613 < aeqVar3.f617) {
                        aeqVar3.f613 = aeqVar3.f617;
                    }
                    aet aetVar = aes.this.f628;
                    if (aetVar.f652 <= 3) {
                        aetVar.f652 = 0;
                    } else if (aetVar.f652 <= 9) {
                        aetVar.f652 -= 3;
                    } else {
                        aetVar.f652 -= 6;
                    }
                } else {
                    if (this.f644.m428(this.f621, this.f628.f652) == 0) {
                        aet aetVar2 = this.f628;
                        aetVar2.f652 = aetVar2.f652 < 7 ? 7 : 10;
                        this.f631[3] = this.f631[2];
                        this.f631[2] = this.f631[1];
                        this.f631[1] = this.f631[0];
                        int iM4262 = this.f643.m426(i2);
                        aev aevVar = this.f644;
                        short[] sArr = this.f630[iM4262 < 6 ? iM4262 - 2 : 3];
                        int iM4283 = 1;
                        do {
                            iM4283 = (iM4283 << 1) | aevVar.m428(sArr, iM4283);
                        } while (iM4283 < sArr.length);
                        int length = iM4283 - sArr.length;
                        if (length < 4) {
                            this.f631[0] = length;
                        } else {
                            int i6 = (length >> 1) - 1;
                            this.f631[0] = ((length & 1) | 2) << i6;
                            if (length < 14) {
                                int[] iArr = this.f631;
                                iArr[0] = iArr[0] | this.f644.m427(this.f627[length - 4]);
                            } else {
                                int[] iArr2 = this.f631;
                                int i7 = iArr2[0];
                                aev aevVar2 = this.f644;
                                int i8 = i6 - 4;
                                int i9 = 0;
                                do {
                                    aevVar2.mo429();
                                    aevVar2.f654 >>>= 1;
                                    int i10 = (aevVar2.f653 - aevVar2.f654) >>> 31;
                                    aevVar2.f653 -= aevVar2.f654 & (i10 - 1);
                                    i9 = (i9 << 1) | (1 - i10);
                                    i8--;
                                } while (i8 != 0);
                                iArr2[0] = i7 | (i9 << 4);
                                int[] iArr3 = this.f631;
                                iArr3[0] = iArr3[0] | this.f644.m427(this.f625);
                            }
                        }
                        iM426 = iM4262;
                    } else {
                        if (this.f644.m428(this.f622, this.f628.f652) != 0) {
                            if (this.f644.m428(this.f623, this.f628.f652) == 0) {
                                i = this.f631[1];
                            } else {
                                if (this.f644.m428(this.f624, this.f628.f652) == 0) {
                                    i = this.f631[2];
                                } else {
                                    i = this.f631[3];
                                    this.f631[3] = this.f631[2];
                                }
                                this.f631[2] = this.f631[1];
                            }
                            this.f631[1] = this.f631[0];
                            this.f631[0] = i;
                        } else if (this.f644.m428(this.f629[this.f628.f652], i2) == 0) {
                            aet aetVar3 = this.f628;
                            aetVar3.f652 = aetVar3.f652 < 7 ? 9 : 11;
                            iM426 = 1;
                        }
                        aet aetVar4 = this.f628;
                        aetVar4.f652 = aetVar4.f652 < 7 ? 8 : 11;
                        iM426 = this.f645.m426(i2);
                    }
                    this.f646.m422(this.f631[0], iM426);
                }
            } else {
                this.f644.mo429();
                return;
            }
        }
    }

    /* renamed from: o.aes$if, reason: invalid class name */
    class Cif extends aer.Cif {

        /* renamed from: ȃ, reason: contains not printable characters */
        final C0018[] f649;

        Cif(int i, int i2) {
            super(aes.this, i, i2);
            this.f649 = new C0018[1 << (i + i2)];
            for (int i3 = 0; i3 < this.f649.length; i3++) {
                this.f649[i3] = new C0018(this, null);
            }
        }

        /* renamed from: o.aes$if$鷭, reason: contains not printable characters */
        class C0018 extends aer.Cif.AbstractC0016 {
            private C0018() {
                super(Cif.this);
            }

            /* synthetic */ C0018(Cif cif, C0018 c0018) {
                this();
            }
        }
    }

    /* renamed from: o.aes$鷭, reason: contains not printable characters */
    class C0019 extends aer.AbstractC0017 {
        private C0019() {
            super(aes.this);
        }

        /* synthetic */ C0019(aes aesVar, C0019 c0019) {
            this();
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        final int m426(int i) {
            if (aes.this.f644.m428(this.f642, 0) == 0) {
                aev aevVar = aes.this.f644;
                short[] sArr = this.f641[i];
                int iM428 = 1;
                do {
                    iM428 = (iM428 << 1) | aevVar.m428(sArr, iM428);
                } while (iM428 < sArr.length);
                return (iM428 - sArr.length) + 2;
            }
            if (aes.this.f644.m428(this.f642, 1) == 0) {
                aev aevVar2 = aes.this.f644;
                short[] sArr2 = this.f640[i];
                int iM4282 = 1;
                do {
                    iM4282 = (iM4282 << 1) | aevVar2.m428(sArr2, iM4282);
                } while (iM4282 < sArr2.length);
                return (iM4282 - sArr2.length) + 2 + 8;
            }
            aev aevVar3 = aes.this.f644;
            short[] sArr3 = this.f639;
            int iM4283 = 1;
            do {
                iM4283 = (iM4283 << 1) | aevVar3.m428(sArr3, iM4283);
            } while (iM4283 < sArr3.length);
            return (iM4283 - sArr3.length) + 2 + 8 + 8;
        }
    }
}
