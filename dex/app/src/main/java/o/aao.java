package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class aao {

    /* renamed from: ܕ, reason: contains not printable characters */
    static final /* synthetic */ boolean f184;

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final int f185;

    /* renamed from: Ą, reason: contains not printable characters */
    int f186;

    /* renamed from: ą, reason: contains not printable characters */
    int f187;

    /* renamed from: Ć, reason: contains not printable characters */
    int f188;

    /* renamed from: ć, reason: contains not printable characters */
    int f189;

    /* renamed from: ċ, reason: contains not printable characters */
    int f190;

    /* renamed from: Ȋ, reason: contains not printable characters */
    int f195;

    /* renamed from: 䒧, reason: contains not printable characters */
    byte[] f198;

    /* renamed from: 岱, reason: contains not printable characters */
    int f199;

    /* renamed from: 庸, reason: contains not printable characters */
    private int f200;

    /* renamed from: 纫, reason: contains not printable characters */
    int f202;

    /* renamed from: 躆, reason: contains not printable characters */
    int f203;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    int[] f196 = new int[38];

    /* renamed from: ȃ, reason: contains not printable characters */
    int[] f194 = new int[128];

    /* renamed from: ˮ͍, reason: contains not printable characters */
    final aak[] f197 = new aak[38];

    /* renamed from: đ, reason: contains not printable characters */
    private aak f191 = null;

    /* renamed from: Ē, reason: contains not printable characters */
    private aaj f192 = null;

    /* renamed from: ē, reason: contains not printable characters */
    private aaj f193 = null;

    /* renamed from: 띥, reason: contains not printable characters */
    private aaj f204 = null;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f201 = 0;

    static {
        f184 = !aao.class.desiredAssertionStatus();
        f185 = Math.max(aag.f150, 12);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m246(int i, int i2) {
        aak aakVar = this.f191;
        aakVar.mo197(i);
        aakVar.m222(this.f197[i2].m221());
        this.f197[i2].m223(aakVar);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final int m244(int i) {
        int iM221 = this.f197[i].m221();
        aak aakVar = this.f191;
        aakVar.mo197(iM221);
        this.f197[i].m222(aakVar.m221());
        return iM221;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    static int m239(int i) {
        return f185 * i;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m247(int i, int i2, int i3) {
        int i4 = this.f196[i2] - this.f196[i3];
        int i5 = i + (f185 * this.f196[i3]);
        int[] iArr = this.f196;
        int i6 = this.f194[i4 - 1];
        if (iArr[i6] != i4) {
            int i7 = i6 - 1;
            m246(i5, i7);
            int i8 = this.f196[i7];
            i5 += f185 * i8;
            i4 -= i8;
        }
        m246(i5, this.f194[i4 - 1]);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m245() {
        if (this.f201 != 0) {
            this.f201 = 0;
            this.f198 = null;
            this.f187 = 1;
            this.f191 = null;
            this.f192 = null;
            this.f193 = null;
            this.f204 = null;
        }
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public final boolean m241(int i) {
        int i2 = i << 20;
        if (this.f201 == i2) {
            return true;
        }
        m245();
        int i3 = ((i2 / 12) * f185) + f185;
        int i4 = i3 + 1 + 152;
        this.f200 = i4;
        int i5 = i4 + 12;
        this.f198 = new byte[i5];
        this.f187 = 1;
        this.f190 = (this.f187 + i3) - f185;
        this.f201 = i2;
        this.f203 = this.f187 + i3;
        if (!f184 && i5 - this.f200 != 12) {
            throw new AssertionError(String.valueOf(i5) + " " + this.f200 + " 12");
        }
        int i6 = 0;
        int i7 = this.f203;
        while (i6 < this.f197.length) {
            this.f197[i6] = new aak(this.f198);
            this.f197[i6].mo197(i7);
            i6++;
            i7 += 4;
        }
        this.f191 = new aak(this.f198);
        this.f192 = new aaj(this.f198);
        this.f193 = new aaj(this.f198);
        this.f204 = new aaj(this.f198);
        return true;
    }

    /* renamed from: Ą, reason: contains not printable characters */
    private int m238(int i) {
        if (this.f186 == 0) {
            this.f186 = 255;
            aaj aajVar = this.f192;
            aajVar.mo197(this.f200);
            aaj aajVar2 = this.f193;
            aaj aajVar3 = this.f204;
            if (this.f188 != this.f189) {
                this.f198[this.f188] = 0;
            }
            aajVar.m215(aajVar);
            aajVar.m217(aajVar);
            for (int i2 = 0; i2 < 38; i2++) {
                while (this.f197[i2].m221() != 0) {
                    aajVar2.mo197(m244(i2));
                    aajVar2.m220(aajVar);
                    aajVar2.m213();
                    aajVar2.m219(this.f196[i2]);
                }
            }
            aajVar2.mo197(aajVar.m216());
            while (aajVar2.m207() != aajVar.m207()) {
                aajVar3.mo197(aajVar2.m207() + (f185 * aajVar2.m214()));
                while (aajVar3.m212() == 65535 && aajVar2.m214() + aajVar3.m214() < 65536) {
                    aajVar3.m218();
                    aajVar2.m219(aajVar2.m214() + aajVar3.m214());
                    aajVar3.mo197(aajVar2.m207() + (f185 * aajVar2.m214()));
                }
                aajVar2.mo197(aajVar2.m216());
            }
            aajVar2.mo197(aajVar.m216());
            while (aajVar2.m207() != aajVar.m207()) {
                aajVar2.m218();
                int iM214 = aajVar2.m214();
                while (iM214 > 128) {
                    m246(aajVar2.m207(), 37);
                    iM214 -= 128;
                    aajVar2.mo197(aajVar2.m207() + (f185 * 128));
                }
                int[] iArr = this.f196;
                int i3 = this.f194[iM214 - 1];
                if (iArr[i3] != iM214) {
                    i3--;
                    int i4 = iM214 - this.f196[i3];
                    m246(aajVar2.m207() + (f185 * (iM214 - i4)), i4 - 1);
                }
                m246(aajVar2.m207(), i3);
                aajVar2.mo197(aajVar.m216());
            }
            if (this.f197[i].m221() != 0) {
                return m244(i);
            }
        }
        int i5 = i;
        do {
            i5++;
            if (i5 == 38) {
                this.f186--;
                int i6 = f185 * this.f196[i];
                int i7 = this.f196[i] * 12;
                if (this.f202 - this.f199 > i7) {
                    this.f202 -= i7;
                    this.f195 -= i6;
                    return this.f195;
                }
                return 0;
            }
        } while (this.f197[i5].m221() == 0);
        int iM244 = m244(i5);
        m247(iM244, i5, i);
        return iM244;
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    public final int m240(int i) {
        int i2 = this.f194[i - 1];
        if (this.f197[i2].m221() != 0) {
            return m244(i2);
        }
        int i3 = this.f188;
        this.f188 += f185 * this.f196[i2];
        if (this.f188 <= this.f189) {
            return i3;
        }
        this.f188 -= f185 * this.f196[i2];
        return m238(i2);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final int m242() {
        if (this.f189 != this.f188) {
            int i = this.f189 - f185;
            this.f189 = i;
            return i;
        }
        if (this.f197[0].m221() != 0) {
            return m244(0);
        }
        return m238(0);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final int m243(int i, int i2) {
        int i3 = this.f194[i2 - 1];
        if (i3 == this.f194[(i2 - 1) + 1]) {
            return i;
        }
        int iM240 = m240(i2 + 1);
        if (iM240 != 0) {
            byte[] bArr = this.f198;
            System.arraycopy(bArr, i, bArr, iM240, f185 * i2);
            m246(i, i3);
        }
        return iM240;
    }

    public String toString() {
        return "SubAllocator[\n  subAllocatorSize=" + this.f201 + "\n  glueCount=" + this.f186 + "\n  heapStart=" + this.f187 + "\n  loUnit=" + this.f188 + "\n  hiUnit=" + this.f189 + "\n  pText=" + this.f199 + "\n  unitsStart=" + this.f195 + "\n]";
    }
}
