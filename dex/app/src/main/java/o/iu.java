package o;

import android.graphics.Point;
import android.util.Log;
import com.roworkshop.andro.Quantize32;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class iu {

    /* renamed from: ć, reason: contains not printable characters */
    public static int f1665 = 4096;

    /* renamed from: Ą, reason: contains not printable characters */
    int f1666;

    /* renamed from: ą, reason: contains not printable characters */
    int f1667;

    /* renamed from: Ć, reason: contains not printable characters */
    boolean f1668;

    /* renamed from: ċ, reason: contains not printable characters */
    private C0054[] f1669;

    /* renamed from: đ, reason: contains not printable characters */
    private int f1670;

    /* renamed from: Ē, reason: contains not printable characters */
    private byte[] f1671;

    /* renamed from: ȃ, reason: contains not printable characters */
    int f1672;

    /* renamed from: Ȋ, reason: contains not printable characters */
    Cif[] f1673;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    Point f1674;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    HashMap<String, Cif> f1675;

    /* renamed from: ܕ, reason: contains not printable characters */
    private int f1676;

    /* renamed from: 䒧, reason: contains not printable characters */
    private int[] f1677;

    /* renamed from: 岱, reason: contains not printable characters */
    HashMap<String, C0054> f1678;

    /* renamed from: 庸, reason: contains not printable characters */
    private int f1679;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f1680;

    /* renamed from: 纫, reason: contains not printable characters */
    private int[] f1681;

    /* renamed from: 躆, reason: contains not printable characters */
    private final int f1682;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f1683;

    /* renamed from: o.iu$if, reason: invalid class name */
    class Cif {

        /* renamed from: Ą, reason: contains not printable characters */
        short f1684;

        /* renamed from: ą, reason: contains not printable characters */
        short f1685;

        /* renamed from: Ć, reason: contains not printable characters */
        int f1686;

        /* renamed from: ć, reason: contains not printable characters */
        boolean f1687;

        /* renamed from: ȃ, reason: contains not printable characters */
        short f1688;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        short f1689;

        /* renamed from: ˮ͍, reason: contains not printable characters */
        boolean f1690 = m694();

        /* renamed from: 櫯, reason: contains not printable characters */
        String f1692;

        /* renamed from: 鷭, reason: contains not printable characters */
        byte[] f1693;

        Cif(byte[] bArr, short s, short s2, short s3, short s4, String str, int i) {
            this.f1689 = s;
            this.f1688 = s2;
            this.f1684 = s3;
            this.f1685 = s4;
            this.f1692 = str;
            this.f1686 = i;
            this.f1693 = Arrays.copyOf(bArr, s3 * s4);
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        final float[] m695() {
            short s = oc.f3231 ? (short) 1 : (short) 0;
            return new float[]{0.0f, 0.0f, this.f1689, this.f1688, 0.0f, this.f1685 - s, this.f1689, this.f1688, this.f1684 - s, 0.0f, this.f1689, this.f1688, this.f1684 - s, this.f1685 - s, this.f1689, this.f1688};
        }

        /* renamed from: 櫯, reason: contains not printable characters */
        private boolean m694() {
            int i = 1;
            while (i < this.f1684) {
                i *= 2;
            }
            if (i != this.f1684) {
                return false;
            }
            int i2 = 1;
            while (i2 < this.f1685) {
                i2 *= 2;
            }
            if (i2 != this.f1685) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: o.iu$鷭, reason: contains not printable characters */
    class C0054 {

        /* renamed from: ȃ, reason: contains not printable characters */
        int[] f1695;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        String f1696;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f1697;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f1698;

        C0054() {
        }
    }

    iu() {
        this(0, 0, 0, false);
    }

    iu(int i, int i2, int i3, boolean z) {
        this.f1674 = new Point();
        this.f1668 = false;
        this.f1682 = 1;
        this.f1675 = new HashMap<>(30);
        this.f1678 = new HashMap<>(30);
        this.f1668 = false;
        this.f1667 = i > 0 ? i : 1;
        this.f1676 = f1665;
        this.f1683 = 1;
        this.f1680 = 1;
        this.f1672 = 1;
        this.f1666 = 1;
        while (this.f1672 < 32) {
            this.f1672 *= 2;
        }
        while (this.f1666 < 32) {
            this.f1666 *= 2;
        }
        this.f1681 = new int[(this.f1672 * this.f1666) / 8];
        this.f1677 = new int[this.f1666];
        this.f1669 = new C0054[this.f1683 * this.f1680];
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private final boolean m689(int i, int i2) {
        int i3 = i + (this.f1672 * i2);
        return (this.f1681[i3 >> 5] & (1 << (i3 & 31))) != 0;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private final int m687(int i, int i2, int i3, int i4, boolean z) {
        int i5 = this.f1672 >>> 5;
        int i6 = i + (this.f1672 * i2);
        int i7 = i3 + (i6 - 1);
        int i8 = (-1) << (i6 & 31);
        int i9 = (-1) >>> ((i7 & 31) ^ 31);
        int i10 = i7 >> 5;
        int i11 = i10 - (i6 >> 5);
        if (i11 == 0) {
            i9 &= i8;
            i8 = i9;
        }
        if (z) {
            int i12 = 0;
            int i13 = 0;
            while (i13 < i4) {
                if ((this.f1681[i10] & i9) != 0) {
                    i8 = i9;
                    i12 = (i11 > 0 ? 0 : i12) | (this.f1681[i10] & i9);
                    i11 = 0;
                }
                for (int i14 = (i10 - i11) + 1; i14 < i10; i14++) {
                    if (this.f1681[i14] != 0) {
                        i8 = -1;
                        i11 = i10 - i14;
                        i12 = this.f1681[i14];
                    }
                }
                if (i11 > 0 && (this.f1681[i10 - i11] & i8) != 0) {
                    i12 |= this.f1681[i10 - i11] & i8;
                }
                i13++;
                i10 += i5;
            }
            if (i12 != 0) {
                int i15 = (((i10 - i11) % (this.f1672 >> 5)) << 5) - 1;
                while (i12 != 0) {
                    i12 >>>= 1;
                    i15++;
                }
                return i15;
            }
            return -1;
        }
        int i16 = 0;
        while (i16 < i4) {
            int[] iArr = this.f1681;
            int i17 = i10 - i11;
            iArr[i17] = iArr[i17] | i8;
            int[] iArr2 = this.f1681;
            iArr2[i10] = iArr2[i10] | i9;
            for (int i18 = (i10 - i11) + 1; i18 < i10; i18++) {
                this.f1681[i18] = -1;
            }
            i16++;
            i10 += i5;
        }
        return 0;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private int m685(int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < (this.f1666 + 1) - i2; i4++) {
            if (this.f1677[i4] <= 0 || i < this.f1677[i4]) {
                int i5 = 0;
                while (true) {
                    int i6 = this.f1672 - i;
                    int i7 = i5;
                    int i8 = i4 * (this.f1672 >> 5);
                    int i9 = i7 >> 5;
                    int i10 = (-1) << (i7 & 31);
                    if ((this.f1681[i9 + i8] & i10) == i10) {
                        do {
                            i9++;
                            if ((i9 << 5) > i6) {
                                break;
                            }
                        } while (this.f1681[i8 + i9] == -1);
                        i7 = i9 << 5;
                    }
                    while (true) {
                        if (i7 > i6) {
                            i3 = -1;
                            break;
                        }
                        if ((this.f1681[i8 + i9] & (1 << (i7 & 31))) == 0) {
                            i3 = i7;
                            break;
                        }
                        i7++;
                    }
                    if (i3 >= 0) {
                        int i11 = i4;
                        int i12 = i3;
                        int iM687 = (i12 + i > this.f1672 || i11 + i2 > this.f1666) ? this.f1672 : (m689((i12 + i) + (-1), i11) || m689((i12 + i) + (-1), (i11 + i2) + (-1))) ? (i12 + i) - 1 : (m689(i12, i11) || m689(i12, (i11 + i2) + (-1))) ? i12 : m687(i12, i11, i, i2, true);
                        if (iM687 >= 0) {
                            i5 = iM687 + 1;
                        } else {
                            return (this.f1672 * i4) + i3;
                        }
                    } else if (this.f1677[i4] == 0 || this.f1677[i4] > i) {
                        this.f1677[i4] = i;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private void m684(int i, int i2) {
        int i3;
        int i4;
        if (this.f1672 == this.f1676 && this.f1666 == this.f1676) {
            throw new nv("Texture atlas reached its maximum dimension of " + this.f1676 + " x " + this.f1676 + " and can't be resized further. Downsampling=" + this.f1667);
        }
        if (i > 0 && i2 > 0) {
            int iMax = Math.max(i, this.f1672);
            int iMax2 = Math.max(i2, this.f1666);
            int i5 = 1;
            int i6 = 1;
            while (i5 < iMax) {
                i5 *= 2;
            }
            while (i6 < iMax2) {
                i6 *= 2;
            }
            i4 = i5;
            i3 = i6;
        } else if (this.f1672 < this.f1666) {
            i4 = this.f1672 * 2;
            i3 = this.f1666;
        } else {
            i3 = this.f1666 * 2;
            i4 = this.f1672;
        }
        int[] iArr = new int[(i4 * i3) / 32];
        for (int i7 = 0; i7 < this.f1666; i7++) {
            System.arraycopy(this.f1681, (this.f1672 * i7) / 32, iArr, (i7 * i4) / 32, this.f1672 / 32);
        }
        this.f1672 = i4;
        this.f1666 = i3;
        this.f1681 = iArr;
        this.f1677 = new int[this.f1666];
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final int[] m693() {
        int i = this.f1683;
        int i2 = this.f1680;
        int i3 = this.f1683 * 16;
        C0054[] c0054Arr = this.f1669;
        int[] iArr = new int[i * 16 * i2 * 16];
        for (int i4 = 0; i4 < c0054Arr.length; i4++) {
            if (c0054Arr[i4] != null) {
                Point point = new Point(i4 % i, i4 / i);
                Point point2 = new Point(point.x * 16, point.y * 16);
                Point point3 = new Point();
                Point point4 = new Point();
                point3.y = 0;
                while (point3.y < 16) {
                    point3.x = 0;
                    while (point3.x < 16) {
                        point4.x = point2.x + point3.x;
                        point4.y = point2.y + point3.y;
                        iArr[point4.x + (point4.y * i3)] = c0054Arr[i4].f1695[point3.x + (point3.y * 16)];
                        point3.x++;
                    }
                    point3.y++;
                }
            }
        }
        return iArr;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final Cif m692(int[] iArr, int[] iArr2, int i, int i2, String str, String str2, int i3) {
        int i4;
        synchronized (this) {
            while (true) {
                if (this.f1672 >= i && this.f1666 >= i2) {
                    break;
                }
                m684(i, i2);
            }
            byte[] bArr = this.f1671;
            Cif cif = this.f1675.get(str);
            if (cif != null) {
                return cif;
            }
            if (i3 <= 0) {
                i3 = this.f1667;
            }
            if (i3 > 1) {
                int iMax = Math.max(i / i3, 1);
                int iMax2 = Math.max(i2 / i3, 1);
                if (this.f1671 == null || this.f1671.length < iMax * iMax2) {
                    this.f1671 = new byte[iMax * iMax2];
                    bArr = this.f1671;
                }
                if (iArr2 != null) {
                    for (int i5 = 0; i5 < iMax2; i5++) {
                        for (int i6 = 0; i6 < iMax; i6++) {
                            bArr[i6 + (iMax * i5)] = (byte) iArr[(i6 * i3) + (i * i5 * i3)];
                        }
                    }
                } else {
                    iArr2 = new int[256];
                    int[] iArr3 = new int[iMax * iMax2];
                    for (int i7 = 0; i7 < iMax2; i7++) {
                        for (int i8 = 0; i8 < iMax; i8++) {
                            iArr3[i8 + (iMax * i7)] = iArr[(i8 * i3) + (i * i7 * i3)];
                        }
                    }
                    m688(iArr3, iMax, bArr, iArr2);
                }
                i = iMax;
                i2 = iMax2;
            } else {
                if (this.f1671 == null || this.f1671.length < i * i2) {
                    this.f1671 = new byte[i * i2];
                    bArr = this.f1671;
                }
                if (iArr2 != null) {
                    for (int i9 = 0; i9 < iArr.length; i9++) {
                        bArr[i9] = (byte) iArr[i9];
                    }
                } else {
                    iArr2 = new int[256];
                    m688(iArr, i, bArr, iArr2);
                }
            }
            if (this.f1675.size() == 0) {
                this.f1679 = i;
                this.f1670 = i2;
            } else {
                this.f1679 = Math.min(this.f1679, i);
                this.f1670 = Math.min(this.f1670, i2);
            }
            int i10 = i2;
            int i11 = i;
            int iM685 = m685(i11, i10);
            if (iM685 != -1) {
                i4 = iM685;
            } else {
                m684(0, 0);
                int iM6852 = m685(i11, i10);
                if (iM6852 == -1) {
                    String str3 = "Couldn't find a place for " + i11 + "x" + i10 + " texture even after resize";
                    Log.e("AndRO", str3);
                    throw new nv(str3);
                }
                i4 = iM6852;
            }
            int i12 = i4 % this.f1672;
            int i13 = i4 / this.f1672;
            m687(i12, i13, i, i2, false);
            Cif cif2 = new Cif(bArr, (short) i12, (short) i13, (short) i, (short) i2, str, m690(iArr2, str2));
            this.f1675.put(str, cif2);
            if (this.f1673 == null) {
                this.f1673 = new Cif[1];
            } else {
                this.f1673 = (Cif[]) Arrays.copyOf(this.f1673, this.f1673.length + 1);
            }
            this.f1673[this.f1673.length - 1] = cif2;
            Arrays.sort(this.f1673, new iv(this));
            return cif2;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final int m690(int[] iArr, String str) {
        int i;
        int i2;
        synchronized (this) {
            if (str != null) {
                C0054 c0054 = this.f1678.get(str);
                if (c0054 != null) {
                    c0054.f1697++;
                    return c0054.f1698;
                }
            }
            int[] iArr2 = new int[256];
            for (int i3 = 0; i3 < iArr.length; i3++) {
                int i4 = iArr[i3];
                iArr2[i3] = ((-16711936) & i4) | ((16711680 & i4) >> 16) | ((i4 & 255) << 16);
            }
            int i5 = 0;
            while (true) {
                if (i5 >= this.f1669.length) {
                    i = -1;
                    break;
                }
                if (this.f1669[i5] == null) {
                    i = i5;
                    break;
                }
                i5++;
            }
            int i6 = i;
            if (i == -1) {
                int i7 = this.f1683;
                int i8 = this.f1680;
                if (this.f1683 < this.f1680) {
                    i7 *= 2;
                } else {
                    i8 *= 2;
                }
                this.f1669 = (C0054[]) Arrays.copyOf(this.f1669, i7 * i8);
                this.f1683 = i7;
                this.f1680 = i8;
                int i9 = 0;
                while (true) {
                    if (i9 >= this.f1669.length) {
                        i2 = -1;
                        break;
                    }
                    if (this.f1669[i9] == null) {
                        i2 = i9;
                        break;
                    }
                    i9++;
                }
                i6 = i2;
                if (i2 == -1) {
                    Log.e("AndRO", "Failed to find palette rect even after resize.");
                    throw new nv("Failed to find palette rect even after resize.");
                }
            }
            C0054 c00542 = new C0054();
            c00542.f1697 = 1;
            c00542.f1698 = i6;
            c00542.f1696 = str;
            c00542.f1695 = Arrays.copyOf(iArr2, 256);
            for (int i10 = 0; i10 < c00542.f1695.length; i10++) {
                if ((c00542.f1695[i10] & (-986896)) == -1048336) {
                    c00542.f1695[i10] = 0;
                }
            }
            this.f1669[i6] = c00542;
            if (str != null) {
                this.f1678.put(str, c00542);
            }
            return i6;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final Cif m691(byte[] bArr, int[] iArr, int i, int i2, String str, String str2) {
        int[] iArr2 = new int[bArr.length];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            iArr2[i3] = pa.m967(bArr[i3]);
        }
        return m692(iArr2, iArr, i, i2, str, str2, this.f1667);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private static boolean m686(int[] iArr, int i, byte[] bArr, int[] iArr2) {
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = 0;
            while (i4 < i2 && iArr2[i4] != iArr[i3]) {
                i4++;
            }
            bArr[i3] = (byte) i4;
            if (i4 >= i2) {
                if (i2 == i) {
                    return false;
                }
                iArr2[i2] = iArr[i3];
                i2++;
            }
        }
        return true;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m688(int[] iArr, int i, byte[] bArr, int[] iArr2) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if ((iArr[i2] & (-986896)) == -1048336) {
                iArr[i2] = 0;
            }
        }
        if (!m686(iArr, iArr2.length, bArr, iArr2)) {
            int[] iArrM128 = Quantize32.m128(iArr, i, iArr2.length);
            for (int i3 = 0; i3 < iArr.length; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
            System.arraycopy(iArrM128, 0, iArr2, 0, iArrM128.length);
        }
    }
}
