package o;

import java.util.Arrays;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class zt extends zs {

    /* renamed from: 䲑, reason: contains not printable characters */
    protected int f6212;

    /* renamed from: 崲, reason: contains not printable characters */
    protected int f6214;

    /* renamed from: 瞣, reason: contains not printable characters */
    protected int f6216;

    /* renamed from: 黬, reason: contains not printable characters */
    protected int f6218;

    /* renamed from: ĺ, reason: contains not printable characters */
    public static final int[] f6202 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 20, 24, 28, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224};

    /* renamed from: Ļ, reason: contains not printable characters */
    public static final byte[] f6203 = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};

    /* renamed from: ɕ, reason: contains not printable characters */
    public static final int[] f6206 = {0, 1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 64, 96, 128, 192, 256, 384, 512, 768, 1024, 1536, 2048, 3072, 4096, 6144, 8192, 12288, 16384, 24576, 32768, 49152, 65536, 98304, 131072, 196608, 262144, 327680, 393216, 458752, 524288, 589824, 655360, 720896, 786432, 851968, 917504, 983040};

    /* renamed from: Ľ, reason: contains not printable characters */
    public static final int[] f6204 = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16};

    /* renamed from: ਓ, reason: contains not printable characters */
    public static final int[] f6207 = {0, 4, 8, 16, 32, 64, 128, 192};

    /* renamed from: Ŀ, reason: contains not printable characters */
    public static final int[] f6205 = {2, 2, 3, 4, 5, 6, 6, 6};

    /* renamed from: Į, reason: contains not printable characters */
    protected aab[] f6208 = new aab[4];

    /* renamed from: į, reason: contains not printable characters */
    protected byte[] f6209 = new byte[1028];

    /* renamed from: 簇, reason: contains not printable characters */
    protected zv[] f6217 = new zv[4];

    /* renamed from: 齴, reason: contains not printable characters */
    protected zz f6219 = new zz();

    /* renamed from: 差, reason: contains not printable characters */
    protected zy f6215 = new zy();

    /* renamed from: 䲕, reason: contains not printable characters */
    protected aaa f6213 = new aaa();

    /* renamed from: ĸ, reason: contains not printable characters */
    protected aac f6210 = new aac();

    /* renamed from: 㺗, reason: contains not printable characters */
    protected zw f6211 = new zw();

    /* JADX WARN: Removed duplicated region for block: B:124:0x036c  */
    /* renamed from: ˮ͈, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void m1244(boolean r11) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.zt.m1244(boolean):void");
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1240(int i, int i2) {
        int[] iArr = this.f6167;
        int i3 = this.f6200;
        this.f6200 = i3 + 1;
        iArr[i3 & 3] = i2;
        this.f6181 = i2;
        this.f6198 = i;
        this.f6194 -= i;
        int i4 = this.f6199 - i2;
        if (i4 < 4194004 && this.f6199 < 4194004) {
            byte[] bArr = this.f6183;
            int i5 = this.f6199;
            this.f6199 = i5 + 1;
            int i6 = i4 + 1;
            bArr[i5] = this.f6183[i4];
            byte[] bArr2 = this.f6183;
            int i7 = this.f6199;
            this.f6199 = i7 + 1;
            int i8 = i6 + 1;
            bArr2[i7] = this.f6183[i6];
            while (i > 2) {
                i--;
                byte[] bArr3 = this.f6183;
                int i9 = this.f6199;
                this.f6199 = i9 + 1;
                int i10 = i8;
                i8++;
                bArr3[i9] = this.f6183[i10];
            }
            return;
        }
        while (true) {
            int i11 = i;
            i--;
            if (i11 != 0) {
                int i12 = i4;
                i4++;
                this.f6183[this.f6199] = this.f6183[i12 & 4194303];
                this.f6199 = (this.f6199 + 1) & 4194303;
            } else {
                return;
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    protected static void m1241(byte[] bArr, int i, zx zxVar, int i2) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        Arrays.fill(iArr, 0);
        Arrays.fill(zxVar.m1246(), 0);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i + i3] & 15;
            iArr[i4] = iArr[i4] + 1;
        }
        iArr[0] = 0;
        iArr2[0] = 0;
        zxVar.f6240[0] = 0;
        zxVar.f6241[0] = 0;
        long j = 0;
        for (int i5 = 1; i5 < 16; i5++) {
            long j2 = (iArr[i5] + j) * 2;
            j = j2;
            long j3 = j2 << (15 - i5);
            long j4 = j3;
            if (j3 > 65535) {
                j4 = 65535;
            }
            zxVar.f6241[i5] = (int) j4;
            int[] iArr3 = zxVar.f6240;
            int i6 = iArr3[i5 - 1] + iArr[i5 - 1];
            iArr3[i5] = i6;
            iArr2[i5] = i6;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            if (bArr[i + i7] != 0) {
                int[] iArrM1246 = zxVar.m1246();
                int i8 = bArr[i + i7] & 15;
                int i9 = iArr2[i8];
                iArr2[i8] = i9 + 1;
                iArrM1246[i9] = i7;
            }
        }
        zxVar.f6242 = i2;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    protected final int m1245(zx zxVar) {
        int i;
        long j = m249() & 65534;
        int[] iArr = zxVar.f6241;
        if (j < iArr[8]) {
            if (j < iArr[4]) {
                if (j < iArr[2]) {
                    if (j < iArr[1]) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                } else if (j < iArr[3]) {
                    i = 3;
                } else {
                    i = 4;
                }
            } else if (j < iArr[6]) {
                if (j < iArr[5]) {
                    i = 5;
                } else {
                    i = 6;
                }
            } else if (j < iArr[7]) {
                i = 7;
            } else {
                i = 8;
            }
        } else if (j < iArr[12]) {
            if (j < iArr[10]) {
                if (j < iArr[9]) {
                    i = 9;
                } else {
                    i = 10;
                }
            } else if (j < iArr[11]) {
                i = 11;
            } else {
                i = 12;
            }
        } else if (j >= iArr[14]) {
            i = 15;
        } else if (j < iArr[13]) {
            i = 13;
        } else {
            i = 14;
        }
        m253(i);
        int i2 = zxVar.f6240[i] + ((((int) j) - iArr[i - 1]) >>> (16 - i));
        if (i2 >= zxVar.f6242) {
            i2 = 0;
        }
        return zxVar.m1246()[i2];
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private boolean m1242() {
        int i;
        int i2;
        byte[] bArr = new byte[19];
        byte[] bArr2 = new byte[1028];
        if (this.f206 > this.f6185 - 25 && !m1237()) {
            return false;
        }
        int i3 = m249();
        this.f6216 = 32768 & i3;
        if ((i3 & 16384) == 0) {
            Arrays.fill(this.f6209, (byte) 0);
        }
        m253(2);
        if (this.f6216 != 0) {
            this.f6218 = ((i3 >>> 12) & 3) + 1;
            if (this.f6214 >= this.f6218) {
                this.f6214 = 0;
            }
            m253(2);
            i = this.f6218 * 257;
        } else {
            i = 374;
        }
        for (int i4 = 0; i4 < 19; i4++) {
            bArr[i4] = (byte) (m249() >>> 12);
            m253(4);
        }
        m1241(bArr, 0, this.f6211, 19);
        int i5 = 0;
        while (i5 < i) {
            if (this.f206 > this.f6185 - 5 && !m1237()) {
                return false;
            }
            int iM1245 = m1245(this.f6211);
            if (iM1245 < 16) {
                bArr2[i5] = (byte) ((this.f6209[i5] + iM1245) & 15);
                i5++;
            } else if (iM1245 == 16) {
                int i6 = (m249() >>> 14) + 3;
                m253(2);
                while (true) {
                    int i7 = i6;
                    i6--;
                    if (i7 <= 0 || i5 >= i) {
                        break;
                    }
                    bArr2[i5] = bArr2[i5 - 1];
                    i5++;
                }
            } else {
                if (iM1245 == 17) {
                    i2 = (m249() >>> 13) + 3;
                    m253(3);
                } else {
                    i2 = (m249() >>> 9) + 11;
                    m253(7);
                }
                while (true) {
                    int i8 = i2;
                    i2--;
                    if (i8 <= 0 || i5 >= i) {
                        break;
                    }
                    int i9 = i5;
                    i5++;
                    bArr2[i9] = 0;
                }
            }
        }
        if (this.f206 > this.f6185) {
            return true;
        }
        if (this.f6216 != 0) {
            for (int i10 = 0; i10 < this.f6218; i10++) {
                m1241(bArr2, i10 * 257, this.f6208[i10], 257);
            }
        } else {
            m1241(bArr2, 0, this.f6219, 298);
            m1241(bArr2, 298, this.f6215, 48);
            m1241(bArr2, 346, this.f6210, 28);
        }
        for (int i11 = 0; i11 < this.f6209.length; i11++) {
            this.f6209[i11] = bArr2[i11];
        }
        return true;
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    protected final void m1243(boolean z) {
        if (!z) {
            this.f6214 = 0;
            this.f6212 = 0;
            this.f6218 = 1;
            Arrays.fill(this.f6217, new zv());
            Arrays.fill(this.f6209, (byte) 0);
        }
    }
}
