package o;

import android.util.Log;
import java.io.UnsupportedEncodingException;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class adq {

    /* renamed from: o.adq$鷭, reason: contains not printable characters */
    static abstract class AbstractC0010 {

        /* renamed from: 櫯, reason: contains not printable characters */
        public int f526;

        /* renamed from: 鷭, reason: contains not printable characters */
        public byte[] f527;

        AbstractC0010() {
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static String m351(byte[] bArr) {
        try {
            int length = bArr.length;
            Cif cif = new Cif(2, null);
            int i = (length / 3) * 4;
            if (!cif.f521) {
                switch (length % 3) {
                    case 1:
                        i += 2;
                        break;
                    case 2:
                        i += 3;
                        break;
                }
            } else if (length % 3 > 0) {
                i += 4;
            }
            if (cif.f519 && length > 0) {
                i += (((length - 1) / 57) + 1) * (cif.f520 ? 2 : 1);
            }
            cif.f527 = new byte[i];
            cif.m353(bArr, length);
            if (cif.f526 != i) {
                throw new AssertionError();
            }
            return new String(cif.f527, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: o.adq$if, reason: invalid class name */
    static class Cif extends AbstractC0010 {

        /* renamed from: Ć, reason: contains not printable characters */
        private static final byte[] f517 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: ć, reason: contains not printable characters */
        private static final byte[] f518 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: Ą, reason: contains not printable characters */
        public final boolean f519;

        /* renamed from: ą, reason: contains not printable characters */
        public final boolean f520;

        /* renamed from: ȃ, reason: contains not printable characters */
        public final boolean f521;

        /* renamed from: Ȋ, reason: contains not printable characters */
        private final byte[] f522;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f523;

        /* renamed from: ˮ͍, reason: contains not printable characters */
        private final byte[] f524;

        /* renamed from: 岱, reason: contains not printable characters */
        private int f525;

        public Cif(int i, byte[] bArr) {
            this.f527 = null;
            this.f521 = true;
            this.f519 = false;
            this.f520 = false;
            this.f522 = f517;
            this.f524 = new byte[2];
            this.f523 = 0;
            this.f525 = this.f519 ? 19 : -1;
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        public final boolean m353(byte[] bArr, int i) {
            byte b;
            byte b2;
            byte b3;
            byte[] bArr2 = this.f522;
            byte[] bArr3 = this.f527;
            int i2 = 0;
            int i3 = this.f525;
            int i4 = 0;
            int i5 = i + 0;
            int i6 = -1;
            switch (this.f523) {
                case 1:
                    if (2 <= i5) {
                        i4 = 0 + 1 + 1;
                        i6 = ((this.f524[0] & 255) << 16) | ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                        this.f523 = 0;
                        break;
                    }
                    break;
                case 2:
                    if (i5 > 0) {
                        i4 = 0 + 1;
                        i6 = ((this.f524[0] & 255) << 16) | ((this.f524[1] & 255) << 8) | (bArr[0] & 255);
                        this.f523 = 0;
                        break;
                    }
                    break;
            }
            if (i6 != -1) {
                bArr3[0] = bArr2[(i6 >> 18) & 63];
                bArr3[1] = bArr2[(i6 >> 12) & 63];
                bArr3[2] = bArr2[(i6 >> 6) & 63];
                i2 = 0 + 1 + 1 + 1 + 1;
                bArr3[3] = bArr2[i6 & 63];
                i3--;
                if (i3 == 0) {
                    if (this.f520) {
                        i2++;
                        bArr3[4] = 13;
                    }
                    int i7 = i2;
                    i2++;
                    bArr3[i7] = 10;
                    i3 = 19;
                }
            }
            while (i4 + 3 <= i5) {
                int i8 = ((bArr[i4] & 255) << 16) | ((bArr[i4 + 1] & 255) << 8) | (bArr[i4 + 2] & 255);
                bArr3[i2] = bArr2[(i8 >> 18) & 63];
                bArr3[i2 + 1] = bArr2[(i8 >> 12) & 63];
                bArr3[i2 + 2] = bArr2[(i8 >> 6) & 63];
                bArr3[i2 + 3] = bArr2[i8 & 63];
                i4 += 3;
                i2 += 4;
                i3--;
                if (i3 == 0) {
                    if (this.f520) {
                        i2++;
                        bArr3[i2] = 13;
                    }
                    int i9 = i2;
                    i2++;
                    bArr3[i9] = 10;
                    i3 = 19;
                }
            }
            if (i4 - this.f523 == i5 - 1) {
                int i10 = 0;
                if (this.f523 > 0) {
                    i10 = 0 + 1;
                    b3 = this.f524[0];
                } else {
                    int i11 = i4;
                    i4++;
                    b3 = bArr[i11];
                }
                int i12 = (b3 & 255) << 4;
                this.f523 -= i10;
                int i13 = i2;
                int i14 = i2 + 1;
                bArr3[i13] = bArr2[(i12 >> 6) & 63];
                i2 = i14 + 1;
                bArr3[i14] = bArr2[i12 & 63];
                if (this.f521) {
                    int i15 = i2 + 1;
                    bArr3[i2] = 61;
                    i2 = i15 + 1;
                    bArr3[i15] = 61;
                }
                if (this.f519) {
                    if (this.f520) {
                        int i16 = i2;
                        i2++;
                        bArr3[i16] = 13;
                    }
                    int i17 = i2;
                    i2++;
                    bArr3[i17] = 10;
                }
            } else if (i4 - this.f523 == i5 - 2) {
                int i18 = 0;
                if (this.f523 > 1) {
                    i18 = 0 + 1;
                    b = this.f524[0];
                } else {
                    int i19 = i4;
                    i4++;
                    b = bArr[i19];
                }
                int i20 = (b & 255) << 10;
                if (this.f523 > 0) {
                    int i21 = i18;
                    i18++;
                    b2 = this.f524[i21];
                } else {
                    int i22 = i4;
                    i4++;
                    b2 = bArr[i22];
                }
                int i23 = i20 | ((b2 & 255) << 2);
                this.f523 -= i18;
                int i24 = i2;
                int i25 = i2 + 1;
                bArr3[i24] = bArr2[(i23 >> 12) & 63];
                int i26 = i25 + 1;
                bArr3[i25] = bArr2[(i23 >> 6) & 63];
                i2 = i26 + 1;
                bArr3[i26] = bArr2[i23 & 63];
                if (this.f521) {
                    i2++;
                    bArr3[i2] = 61;
                }
                if (this.f519) {
                    if (this.f520) {
                        int i27 = i2;
                        i2++;
                        bArr3[i27] = 13;
                    }
                    int i28 = i2;
                    i2++;
                    bArr3[i28] = 10;
                }
            } else if (this.f519 && i2 > 0 && i3 != 19) {
                if (this.f520) {
                    int i29 = i2;
                    i2++;
                    bArr3[i29] = 13;
                }
                int i30 = i2;
                i2++;
                bArr3[i30] = 10;
            }
            if (this.f523 != 0) {
                String str = ("BASE64".length() == 0 || "BASE64".length() > 23) ? "HockeyApp" : "BASE64";
                if (adt.f529 <= 6) {
                    Log.e(str, "Error during encoding");
                }
            }
            if (i4 != i5) {
                String str2 = ("BASE64".length() == 0 || "BASE64".length() > 23) ? "HockeyApp" : "BASE64";
                if (adt.f529 <= 6) {
                    Log.e(str2, "Error during encoding");
                }
            }
            this.f526 = i2;
            this.f525 = i3;
            return true;
        }
    }
}
