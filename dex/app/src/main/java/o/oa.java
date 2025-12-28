package o;

import android.util.Log;
import org.apache.commons.net.bsd.RCommandClient;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class oa {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static final byte[][] f3228 = {new byte[]{1, 0, 7}, new byte[]{2, -1, 6}, new byte[]{3, 4, 5}};

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final short[] f3230 = {0, -1, -1, -1, 0, 1, 1, 1};

    /* renamed from: 櫯, reason: contains not printable characters */
    public static final short[] f3229 = {1, 1, 0, -1, -1, -1, 0, 1};

    oa() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final boolean m911(int i, int i2, int i3) {
        return (i * i) + (i2 * i2) <= (i3 * i3) + ((i == 0 || i2 == 0) ? 0 : 1);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final boolean m913(AbstractC0988 abstractC0988, int i, int i2, int i3) {
        int i4 = abstractC0988.f2002 - i;
        int i5 = abstractC0988.f1999 - i2;
        return (i4 * i4) + (i5 * i5) <= (i3 * i3) + ((i4 == 0 || i5 == 0) ? 0 : 1);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static final void m910(int[] iArr, iy[] iyVarArr, int i) {
        int i2 = iArr[0];
        iArr[0] = iArr[0] + 1;
        for (int i3 = (i2 - 1) / 2; i2 > 0 && iyVarArr[i + 0].f1703 < iyVarArr[iArr[i3 + 0 + 1] + 0].f1703; i3 = (i3 - 1) / 2) {
            iArr[i2 + 0 + 1] = iArr[i3 + 0 + 1];
            i2 = i3;
        }
        iArr[i2 + 0 + 1] = i;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static int m909(int[] iArr, iy[] iyVarArr, int i, int i2, int i3, int i4, int i5) {
        int i6 = ((i2 * 32) + i) & RCommandClient.MAX_CLIENT_PORT;
        if (iyVarArr[i6 + 0].f1708 == i && iyVarArr[i6 + 0].f1707 == i2) {
            if (iyVarArr[i6 + 0].f1706 > i3) {
                iyVarArr[i6 + 0].f1706 = i3;
                iyVarArr[i6 + 0].f1705 = i4;
                iyVarArr[i6 + 0].f1703 = i5;
                if (iyVarArr[i6 + 0].f1704 != 0) {
                    m910(iArr, iyVarArr, i6);
                } else {
                    int i7 = 0;
                    while (i7 < iArr[0] + 0 && iArr[i7 + 1] != i6) {
                        i7++;
                    }
                    if (i7 == iArr[0]) {
                        Log.e("AndRO", "update_heap_path bug\n");
                        throw new nv("update_heap_path bug\n");
                    }
                    for (int i8 = (i7 - 1) / 2; i7 > 0 && iyVarArr[i6 + 0].f1703 < iyVarArr[iArr[i8 + 0 + 1] + 0].f1703; i8 = (i8 - 1) / 2) {
                        iArr[i7 + 0 + 1] = iArr[i8 + 0 + 1];
                        i7 = i8;
                    }
                    iArr[i7 + 0 + 1] = i6;
                }
                iyVarArr[i6].f1704 = 0;
                return 0;
            }
            return 0;
        }
        if (iyVarArr[i6 + 0].f1708 != 0 || iyVarArr[i6 + 0].f1707 != 0) {
            return 1;
        }
        iyVarArr[i6 + 0].f1708 = i;
        iyVarArr[i6 + 0].f1707 = i2;
        iyVarArr[i6 + 0].f1706 = i3;
        iyVarArr[i6 + 0].f1705 = i4;
        iyVarArr[i6 + 0].f1703 = i5;
        iyVarArr[i6 + 0].f1704 = 0;
        m910(iArr, iyVarArr, i6);
        return 0;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static boolean m912(lu luVar, int i, int i2, int i3, int i4, boolean z, ue ueVar) {
        int i5;
        int i6;
        int[] iArr = new int[151];
        iy[] iyVarArr = new iy[1024];
        if (luVar == null) {
            luVar = new lu();
        }
        if (!ueVar.m1113(i, i2, -1) || ueVar.m1113(i, i2, 0)) {
            return false;
        }
        int i7 = i3 - i;
        int i8 = i7 != 0 ? i7 < 0 ? -1 : 1 : 0;
        int i9 = i4 - i2;
        int i10 = i9 != 0 ? i9 < 0 ? -1 : 1 : 0;
        int i11 = i;
        int i12 = i2;
        int i13 = 0;
        while (i13 < luVar.f2030.length && !ueVar.m1113(i11 + i8, i12 + i10, 0)) {
            luVar.f2030[i13] = f3228[(-i10) + 1][i8 + 1];
            i13++;
            i11 += i8;
            i12 += i10;
            if (i11 == i3) {
                i8 = 0;
            }
            if (i12 == i4) {
                i10 = 0;
            }
            if (i8 == 0 && i10 == 0) {
                break;
            }
        }
        if (i11 == i3 && i12 == i4) {
            luVar.f2032 = i13;
            luVar.f2031 = 0;
            return true;
        }
        if (z) {
            return false;
        }
        for (int i14 = 0; i14 < iyVarArr.length; i14++) {
            iyVarArr[i14] = new iy();
        }
        int i15 = (i + (i2 * 32)) & RCommandClient.MAX_CLIENT_PORT;
        iyVarArr[i15].f1708 = i;
        iyVarArr[i15].f1707 = i2;
        iyVarArr[i15].f1706 = 0;
        iyVarArr[i15].f1705 = 0;
        iyVarArr[i15].f1703 = ((Math.abs(i3 - iyVarArr[i15].f1708) + Math.abs(i4 - iyVarArr[i15].f1707)) * 10) + iyVarArr[i15].f1706;
        iyVarArr[i15].f1704 = 0;
        iArr[0] = 0;
        m910(iArr, iyVarArr, i15);
        int i16 = ueVar.f5057 - 1;
        int i17 = ueVar.f5055 - 1;
        do {
            int iM909 = 0;
            int i18 = 0;
            int[] iArr2 = new int[4];
            if (iArr[0] == 0) {
                return false;
            }
            if (iArr[0] <= 0) {
                i5 = -1;
            } else {
                int i19 = iArr[1];
                int i20 = iArr[iArr[0] + 0];
                iArr[0] = iArr[0] - 1;
                int i21 = 0;
                int i22 = 2;
                while (i22 < iArr[0]) {
                    if (iyVarArr[iArr[i22 + 0 + 1] + 0].f1703 > iyVarArr[iArr[i22 + 0] + 0].f1703) {
                        i22--;
                    }
                    iArr[i21 + 0 + 1] = iArr[i22 + 0 + 1];
                    i21 = i22;
                    i22 = (i22 * 2) + 2;
                }
                if (i22 == iArr[0]) {
                    iArr[i21 + 0 + 1] = iArr[i22 + 0];
                    i21 = i22 - 1;
                }
                for (int i23 = (i21 - 1) / 2; i21 > 0 && iyVarArr[iArr[i23 + 0 + 1] + 0].f1703 > iyVarArr[i20 + 0].f1703; i23 = (i23 - 1) / 2) {
                    iArr[i21 + 0 + 1] = iArr[i23 + 0 + 1];
                    i21 = i23;
                }
                iArr[i21 + 0 + 1] = i20;
                i5 = i19;
            }
            int i24 = iyVarArr[i5].f1708;
            int i25 = iyVarArr[i5].f1707;
            int i26 = iyVarArr[i5].f1706 + 10;
            int i27 = iyVarArr[i5].f1703;
            if (i24 != i3 || i25 != i4) {
                if (i25 < i17 && !ueVar.m1113(i24, i25 + 1, 0)) {
                    i18 = 1;
                    iArr2[0] = i25 >= i4 ? 20 : 0;
                    iM909 = m909(iArr, iyVarArr, i24, i25 + 1, i26, i5, i27 + iArr2[0]) + 0;
                }
                if (i24 > 0 && !ueVar.m1113(i24 - 1, i25, 0)) {
                    i18 |= 2;
                    iArr2[1] = i24 <= i3 ? 20 : 0;
                    iM909 += m909(iArr, iyVarArr, i24 - 1, i25, i26, i5, i27 + iArr2[1]);
                }
                if (i25 > 0 && !ueVar.m1113(i24, i25 - 1, 0)) {
                    i18 |= 4;
                    iArr2[2] = i25 <= i4 ? 20 : 0;
                    iM909 += m909(iArr, iyVarArr, i24, i25 - 1, i26, i5, i27 + iArr2[2]);
                }
                if (i24 < i16 && !ueVar.m1113(i24 + 1, i25, 0)) {
                    i18 |= 8;
                    iArr2[3] = i24 >= i3 ? 20 : 0;
                    iM909 += m909(iArr, iyVarArr, i24 + 1, i25, i26, i5, i27 + iArr2[3]);
                }
                if ((i18 & 3) == 3 && !ueVar.m1113(i24 - 1, i25 + 1, 0)) {
                    iM909 += m909(iArr, iyVarArr, i24 - 1, i25 + 1, i26 + 4, i5, ((i27 + iArr2[1]) + iArr2[0]) - 6);
                }
                if ((i18 & 6) == 6 && !ueVar.m1113(i24 - 1, i25 - 1, 0)) {
                    iM909 += m909(iArr, iyVarArr, i24 - 1, i25 - 1, i26 + 4, i5, ((i27 + iArr2[1]) + iArr2[2]) - 6);
                }
                if ((i18 & 12) == 12 && !ueVar.m1113(i24 + 1, i25 - 1, 0)) {
                    iM909 += m909(iArr, iyVarArr, i24 + 1, i25 - 1, i26 + 4, i5, ((i27 + iArr2[3]) + iArr2[2]) - 6);
                }
                if ((i18 & 9) == 9 && !ueVar.m1113(i24 + 1, i25 + 1, 0)) {
                    iM909 += m909(iArr, iyVarArr, i24 + 1, i25 + 1, i26 + 4, i5, ((i27 + iArr2[3]) + iArr2[0]) - 6);
                }
                iyVarArr[i5].f1704 = 1;
                if (iM909 != 0) {
                    return false;
                }
            } else {
                if (i24 != i3 || i25 != i4) {
                    return false;
                }
                int i28 = 0;
                int i29 = i5;
                while (i28 < 100 && i29 != ((i + (i2 * 32)) & RCommandClient.MAX_CLIENT_PORT)) {
                    i29 = iyVarArr[i29].f1705;
                    i28++;
                }
                if (i28 == 100 || i28 >= luVar.f2030.length) {
                    return false;
                }
                luVar.f2032 = i28;
                luVar.f2031 = 0;
                int i30 = i5;
                for (int i31 = i28 - 1; i31 >= 0; i31--) {
                    int i32 = iyVarArr[i30].f1708 - iyVarArr[iyVarArr[i30].f1705].f1708;
                    int i33 = iyVarArr[i30].f1707 - iyVarArr[iyVarArr[i30].f1705].f1707;
                    if (i32 == 0) {
                        i6 = i33 > 0 ? 0 : 4;
                    } else if (i32 > 0) {
                        i6 = i33 == 0 ? 6 : i33 < 0 ? 5 : 7;
                    } else {
                        i6 = i33 == 0 ? 2 : i33 > 0 ? 1 : 3;
                    }
                    luVar.f2030[i31] = i6;
                    i30 = iyVarArr[i30].f1705;
                }
                return true;
            }
        } while (iArr[0] < 145);
        return false;
    }
}
