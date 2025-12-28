package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import org.apache.http.HttpStatus;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class zr extends zt {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public static int[] f6129 = {4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 14, 0, 12};

    /* renamed from: ō, reason: contains not printable characters */
    private boolean f6130;

    /* renamed from: Ŏ, reason: contains not printable characters */
    private int f6131;

    /* renamed from: ŏ, reason: contains not printable characters */
    private int f6132;

    /* renamed from: 䕌, reason: contains not printable characters */
    private aad f6134;

    /* renamed from: 櫯, reason: contains not printable characters */
    public int f6135;

    /* renamed from: 漐, reason: contains not printable characters */
    private boolean f6136;

    /* renamed from: 釯, reason: contains not printable characters */
    private int f6138;

    /* renamed from: 釳, reason: contains not printable characters */
    private long f6139;

    /* renamed from: 냆, reason: contains not printable characters */
    private boolean f6142;

    /* renamed from: 鷭, reason: contains not printable characters */
    public final aaf f6140 = new aaf();

    /* renamed from: 釫, reason: contains not printable characters */
    private aaq f6137 = new aaq();

    /* renamed from: ꑣ, reason: contains not printable characters */
    private List<zu> f6141 = new ArrayList();

    /* renamed from: 졸, reason: contains not printable characters */
    private List<zu> f6143 = new ArrayList();

    /* renamed from: 䍼, reason: contains not printable characters */
    private List<Integer> f6133 = new ArrayList();

    /* renamed from: 진, reason: contains not printable characters */
    private byte[] f6144 = new byte[HttpStatus.SC_NOT_FOUND];

    public zr(zq zqVar) {
        this.f6165 = zqVar;
        this.f6183 = null;
        this.f6163 = false;
        this.f6164 = false;
        this.f6166 = false;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m1225() {
        this.f6183 = new byte[4194304];
        this.f206 = 0;
        mo1228(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:266:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016f  */
    /* renamed from: 鷭, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1226(int r14, boolean r15) throws o.yq, java.io.IOException {
        /*
            Method dump skipped, instructions count: 849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.zr.m1226(int, boolean):void");
    }

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private void m1217() throws IOException {
        zu zuVar;
        int i = this.f6192;
        int i2 = (this.f6199 - i) & 4194303;
        int i3 = 0;
        while (i3 < this.f6143.size()) {
            zu zuVar2 = this.f6143.get(i3);
            if (zuVar2 != null) {
                if (zuVar2.f6222) {
                    zuVar2.f6222 = false;
                } else {
                    int i4 = zuVar2.f6225;
                    int i5 = zuVar2.f6224;
                    if (((i4 - i) & 4194303) >= i2) {
                        continue;
                    } else {
                        if (i != i4) {
                            m1220(i, i4);
                            i = i4;
                            i2 = (this.f6199 - i) & 4194303;
                        }
                        if (i5 <= i2) {
                            int i6 = (i4 + i5) & 4194303;
                            if (i4 < i6 || i6 == 0) {
                                this.f6137.m267(0, this.f6183, i4, i5);
                            } else {
                                int i7 = 4194304 - i4;
                                this.f6137.m267(0, this.f6183, i4, i7);
                                this.f6137.m267(i7, this.f6183, 0, i6);
                            }
                            aax aaxVar = this.f6141.get(zuVar2.f6220).f6221;
                            aax aaxVar2 = zuVar2.f6221;
                            if (aaxVar.f297.size() > 64) {
                                aaxVar2.f297.setSize(aaxVar.f297.size());
                                for (int i8 = 0; i8 < aaxVar.f297.size() - 64; i8++) {
                                    aaxVar2.f297.set(i8 + 64, aaxVar.f297.get(i8 + 64));
                                }
                            }
                            m1221(aaxVar2);
                            if (aaxVar2.f297.size() > 64) {
                                if (aaxVar.f297.size() < aaxVar2.f297.size()) {
                                    aaxVar.f297.setSize(aaxVar2.f297.size());
                                }
                                for (int i9 = 0; i9 < aaxVar2.f297.size() - 64; i9++) {
                                    aaxVar.f297.set(i9 + 64, aaxVar2.f297.get(i9 + 64));
                                }
                            } else {
                                aaxVar.f297.clear();
                            }
                            int i10 = aaxVar2.f295;
                            int i11 = aaxVar2.f296;
                            byte[] bArr = new byte[i11];
                            for (int i12 = 0; i12 < i11; i12++) {
                                bArr[i12] = this.f6137.f215[i10 + i12];
                            }
                            this.f6143.set(i3, null);
                            while (i3 + 1 < this.f6143.size() && (zuVar = this.f6143.get(i3 + 1)) != null && zuVar.f6225 == i4 && zuVar.f6224 == i11 && !zuVar.f6222) {
                                this.f6137.m267(0, bArr, 0, i11);
                                aax aaxVar3 = this.f6141.get(zuVar.f6220).f6221;
                                aax aaxVar4 = zuVar.f6221;
                                if (aaxVar3.f297.size() > 64) {
                                    aaxVar4.f297.setSize(aaxVar3.f297.size());
                                    for (int i13 = 0; i13 < aaxVar3.f297.size() - 64; i13++) {
                                        aaxVar4.f297.set(i13 + 64, aaxVar3.f297.get(i13 + 64));
                                    }
                                }
                                m1221(aaxVar4);
                                if (aaxVar4.f297.size() > 64) {
                                    if (aaxVar3.f297.size() < aaxVar4.f297.size()) {
                                        aaxVar3.f297.setSize(aaxVar4.f297.size());
                                    }
                                    for (int i14 = 0; i14 < aaxVar4.f297.size() - 64; i14++) {
                                        aaxVar3.f297.set(i14 + 64, aaxVar4.f297.get(i14 + 64));
                                    }
                                } else {
                                    aaxVar3.f297.clear();
                                }
                                int i15 = aaxVar4.f295;
                                i11 = aaxVar4.f296;
                                bArr = new byte[i11];
                                for (int i16 = 0; i16 < i11; i16++) {
                                    bArr[i16] = aaxVar4.f297.get(i15 + i16).byteValue();
                                }
                                i3++;
                                this.f6143.set(i3, null);
                            }
                            this.f6165.m1210(bArr, 0, i11);
                            this.f6166 = true;
                            this.f6139 += i11;
                            i = i6;
                            i2 = (this.f6199 - i) & 4194303;
                        } else {
                            for (int i17 = i3; i17 < this.f6143.size(); i17++) {
                                zu zuVar3 = this.f6143.get(i17);
                                if (zuVar3 != null && zuVar3.f6222) {
                                    zuVar3.f6222 = false;
                                }
                            }
                            this.f6192 = i;
                            return;
                        }
                    }
                }
            }
            i3++;
        }
        m1220(i, this.f6199);
        this.f6192 = this.f6199;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1220(int i, int i2) throws IOException {
        if (i2 != i) {
            this.f6166 = true;
        }
        if (i2 < i) {
            m1222(this.f6183, i, (-i) & 4194303);
            m1222(this.f6183, 0, i2);
            this.f6164 = true;
            return;
        }
        m1222(this.f6183, i, i2 - i);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1222(byte[] bArr, int i, int i2) throws IOException {
        if (this.f6139 >= this.f6194) {
            return;
        }
        int i3 = i2;
        long j = this.f6194 - this.f6139;
        if (i2 > j) {
            i3 = (int) j;
        }
        this.f6165.m1210(bArr, i, i3);
        this.f6139 += i2;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private void m1216(int i) {
        this.f6167[3] = this.f6167[2];
        this.f6167[2] = this.f6167[1];
        this.f6167[1] = this.f6167[0];
        this.f6167[0] = i;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private void m1219(int i, int i2) {
        int i3 = this.f6199 - i2;
        if (i3 >= 0 && i3 < 4194044 && this.f6199 < 4194044) {
            do {
                byte[] bArr = this.f6183;
                int i4 = this.f6199;
                this.f6199 = i4 + 1;
                int i5 = i3;
                i3++;
                bArr[i4] = this.f6183[i5];
                i--;
            } while (i > 0);
            return;
        }
        while (true) {
            int i6 = i;
            i--;
            if (i6 != 0) {
                int i7 = i3;
                i3++;
                this.f6183[this.f6199] = this.f6183[i7 & 4194303];
                this.f6199 = (this.f6199 + 1) & 4194303;
            } else {
                return;
            }
        }
    }

    @Override // o.zs
    /* renamed from: 鷭, reason: contains not printable characters */
    protected final void mo1228(boolean z) {
        if (!z) {
            this.f6142 = false;
            Arrays.fill(this.f6167, 0);
            this.f6200 = 0;
            this.f6181 = 0;
            this.f6198 = 0;
            Arrays.fill(this.f6144, (byte) 0);
            this.f6199 = 0;
            this.f6192 = 0;
            this.f6135 = 2;
            m1218();
        }
        m248();
        this.f6130 = false;
        this.f6139 = 0L;
        this.f6185 = 0;
        this.f6182 = 0;
        m1243(z);
    }

    /* renamed from: 岱, reason: contains not printable characters */
    private void m1218() {
        this.f6133.clear();
        this.f6138 = 0;
        this.f6141.clear();
        this.f6143.clear();
    }

    /* renamed from: Ȋ, reason: contains not printable characters */
    private boolean m1215() {
        int iM249;
        int iM2492;
        byte[] bArr = new byte[20];
        byte[] bArr2 = new byte[HttpStatus.SC_NOT_FOUND];
        if (this.f206 > this.f6185 - 25 && !m1237()) {
            return false;
        }
        m253((8 - this.f207) & 7);
        long jM249 = m249() & (-1);
        if ((jM249 & 32768) != 0) {
            this.f6134 = aad.BLOCK_PPM;
            return this.f6140.m189(this);
        }
        this.f6134 = aad.BLOCK_LZ;
        this.f6131 = 0;
        this.f6132 = 0;
        if ((16384 & jM249) == 0) {
            Arrays.fill(this.f6144, (byte) 0);
        }
        m253(2);
        int i = 0;
        while (i < 20) {
            int iM2493 = (m249() >>> 12) & 255;
            m253(4);
            if (iM2493 == 15) {
                int iM2494 = (m249() >>> 12) & 255;
                m253(4);
                if (iM2494 == 0) {
                    bArr[i] = 15;
                } else {
                    int i2 = iM2494 + 2;
                    while (true) {
                        int i3 = i2;
                        i2--;
                        if (i3 <= 0 || i >= bArr.length) {
                            break;
                        }
                        int i4 = i;
                        i++;
                        bArr[i4] = 0;
                    }
                    i--;
                }
            } else {
                bArr[i] = (byte) iM2493;
            }
            i++;
        }
        m1241(bArr, 0, this.f6211, 20);
        int i5 = 0;
        while (i5 < 404) {
            if (this.f206 > this.f6185 - 5 && !m1237()) {
                return false;
            }
            int i6 = m1245(this.f6211);
            if (i6 < 16) {
                bArr2[i5] = (byte) ((this.f6144[i5] + i6) & 15);
                i5++;
            } else if (i6 < 18) {
                if (i6 == 16) {
                    iM249 = (m249() >>> 13) + 3;
                    m253(3);
                } else {
                    iM249 = (m249() >>> 9) + 11;
                    m253(7);
                }
                while (true) {
                    int i7 = iM249;
                    iM249--;
                    if (i7 <= 0 || i5 >= 404) {
                        break;
                    }
                    bArr2[i5] = bArr2[i5 - 1];
                    i5++;
                }
            } else {
                if (i6 == 18) {
                    iM2492 = (m249() >>> 13) + 3;
                    m253(3);
                } else {
                    iM2492 = (m249() >>> 9) + 11;
                    m253(7);
                }
                while (true) {
                    int i8 = iM2492;
                    iM2492--;
                    if (i8 <= 0 || i5 >= 404) {
                        break;
                    }
                    int i9 = i5;
                    i5++;
                    bArr2[i9] = 0;
                }
            }
        }
        this.f6142 = true;
        if (this.f206 > this.f6185) {
            return false;
        }
        m1241(bArr2, 0, this.f6219, 299);
        m1241(bArr2, 299, this.f6215, 60);
        m1241(bArr2, 359, this.f6213, 17);
        m1241(bArr2, 376, this.f6210, 28);
        for (int i10 = 0; i10 < this.f6144.length; i10++) {
            this.f6144[i10] = bArr2[i10];
        }
        return true;
    }

    /* renamed from: ċ, reason: contains not printable characters */
    private boolean m1214() {
        int i = m249() >> 8;
        m253(8);
        int i2 = (i & 7) + 1;
        if (i2 == 7) {
            i2 = (m249() >> 8) + 7;
            m253(8);
        } else if (i2 == 8) {
            i2 = m249();
            m253(16);
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f206 >= this.f6185 - 1 && !m1237() && i3 < i2 - 1) {
                return false;
            }
            arrayList.add(Byte.valueOf((byte) (m249() >> 8)));
            m253(8);
        }
        return m1223(i, arrayList);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private boolean m1223(int i, List<Byte> list) {
        int iM257;
        zu zuVar;
        zu zuVar2;
        int iIntValue;
        int iM2572;
        aap aapVar = new aap();
        aapVar.m248();
        for (int i2 = 0; i2 < Math.min(32768, list.size()); i2++) {
            aapVar.m251()[i2] = list.get(i2).byteValue();
        }
        aaq aaqVar = this.f6137;
        if (aaqVar.f215 == null) {
            aaqVar.f215 = new byte[262148];
        }
        if ((i & 128) != 0) {
            iM257 = aaq.m257(aapVar);
            if (iM257 == 0) {
                m1218();
            } else {
                iM257--;
            }
        } else {
            iM257 = this.f6138;
        }
        if (iM257 > this.f6141.size() || iM257 > this.f6133.size()) {
            return false;
        }
        this.f6138 = iM257;
        boolean z = iM257 == this.f6141.size();
        zu zuVar3 = new zu();
        if (z) {
            if (iM257 > 1024) {
                return false;
            }
            zuVar = new zu();
            this.f6141.add(zuVar);
            zuVar3.f6220 = this.f6141.size() - 1;
            this.f6133.add(0);
            zuVar.f6223 = 0;
        } else {
            zuVar = this.f6141.get(iM257);
            zuVar3.f6220 = iM257;
            zuVar.f6223++;
        }
        this.f6143.add(zuVar3);
        zuVar3.f6223 = zuVar.f6223;
        int iM2573 = aaq.m257(aapVar);
        if ((i & 64) != 0) {
            iM2573 += 258;
        }
        zuVar3.f6225 = (this.f6199 + iM2573) & 4194303;
        if ((i & 32) != 0) {
            zuVar2 = zuVar3;
            iIntValue = aaq.m257(aapVar);
        } else {
            zuVar2 = zuVar3;
            if (iM257 < this.f6133.size()) {
                iIntValue = this.f6133.get(iM257).intValue();
            } else {
                iIntValue = 0;
            }
        }
        zuVar2.f6224 = iIntValue;
        zuVar3.f6222 = this.f6192 != this.f6199 && ((this.f6192 - this.f6199) & 4194303) <= iM2573;
        this.f6133.set(iM257, Integer.valueOf(zuVar3.f6224));
        Arrays.fill(zuVar3.f6221.f294, 0);
        zuVar3.f6221.f294[3] = 245760;
        zuVar3.f6221.f294[4] = zuVar3.f6224;
        zuVar3.f6221.f294[5] = zuVar3.f6223;
        if ((i & 16) != 0) {
            int iM249 = aapVar.m249() >>> 9;
            aapVar.m253(7);
            for (int i3 = 0; i3 < 7; i3++) {
                if (((1 << i3) & iM249) != 0) {
                    zuVar3.f6221.f294[i3] = aaq.m257(aapVar);
                }
            }
        }
        if (z) {
            int iM2574 = aaq.m257(aapVar);
            if (iM2574 >= 65536 || iM2574 == 0) {
                return false;
            }
            byte[] bArr = new byte[iM2574];
            for (int i4 = 0; i4 < iM2574; i4++) {
                if (aapVar.m250()) {
                    return false;
                }
                bArr[i4] = (byte) (aapVar.m249() >> 8);
                aapVar.m253(8);
            }
            this.f6137.m269(bArr, iM2574, zuVar.f6221);
        }
        zuVar3.f6221.f299 = zuVar.f6221.f300;
        zuVar3.f6221.f298 = zuVar.f6221.f298;
        int size = zuVar.f6221.f293.size();
        if (size > 0 && size < 8192) {
            zuVar3.f6221.f293 = zuVar.f6221.f293;
        }
        if (zuVar3.f6221.f297.size() < 64) {
            zuVar3.f6221.f297.clear();
            zuVar3.f6221.f297.setSize(64);
        }
        Vector<Byte> vector = zuVar3.f6221.f297;
        for (int i5 = 0; i5 < 7; i5++) {
            aaq.m261(vector, i5 * 4, zuVar3.f6221.f294[i5]);
        }
        aaq.m261(vector, 28, zuVar3.f6224);
        aaq.m261(vector, 32, 0);
        aaq.m261(vector, 36, 0);
        aaq.m261(vector, 40, 0);
        aaq.m261(vector, 44, zuVar3.f6223);
        for (int i6 = 0; i6 < 16; i6++) {
            vector.set(i6 + 48, (byte) 0);
        }
        if ((i & 8) != 0) {
            if (aapVar.m250() || (iM2572 = aaq.m257(aapVar)) > 8128) {
                return false;
            }
            int size2 = zuVar3.f6221.f297.size();
            if (size2 < iM2572 + 64) {
                zuVar3.f6221.f297.setSize((iM2572 + 64) - size2);
            }
            Vector<Byte> vector2 = zuVar3.f6221.f297;
            for (int i7 = 0; i7 < iM2572; i7++) {
                if (aapVar.m250()) {
                    return false;
                }
                vector2.set(i7 + 64, Byte.valueOf((byte) (aapVar.m249() >>> 8)));
                aapVar.m253(8);
            }
            return true;
        }
        return true;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1221(aax aaxVar) {
        if (aaxVar.f297.size() > 0) {
            aaxVar.f294[6] = (int) this.f6139;
            aaq.m261(aaxVar.f297, 36, (int) this.f6139);
            aaq.m261(aaxVar.f297, 40, (int) (this.f6139 >>> 32));
            this.f6137.m268(aaxVar);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m1227(long j) {
        this.f6194 = j;
        this.f6136 = false;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final int m1224() {
        if (this.f206 > 32738) {
            m1237();
        }
        byte[] bArr = this.f205;
        int i = this.f206;
        this.f206 = i + 1;
        return bArr[i] & 255;
    }
}
