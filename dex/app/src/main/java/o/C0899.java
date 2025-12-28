package o;

/* renamed from: o.閇, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class C0899 {

    /* renamed from: Ą, reason: contains not printable characters */
    private static final byte[] f8176;

    /* renamed from: ȃ, reason: contains not printable characters */
    private static final byte[] f8177;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static final byte[] f8178;

    /* renamed from: 櫯, reason: contains not printable characters */
    private static final byte[] f8179;

    /* renamed from: 鷭, reason: contains not printable characters */
    static final /* synthetic */ boolean f8180;

    static {
        f8180 = !C0899.class.desiredAssertionStatus();
        f8179 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f8178 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f8177 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
        f8176 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
    }

    private C0899() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static int m1527(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        if (bArr[2] == 61) {
            bArr2[i] = (byte) ((((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[bArr[1]] << 24) >>> 12)) >>> 16);
            return 1;
        }
        if (bArr[3] == 61) {
            int i2 = ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[2]] << 24) >>> 18);
            bArr2[i] = (byte) (i2 >>> 16);
            bArr2[i + 1] = (byte) (i2 >>> 8);
            return 2;
        }
        int i3 = ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[2]] << 24) >>> 18) | ((bArr3[bArr[3]] << 24) >>> 24);
        bArr2[i] = (byte) (i3 >> 16);
        bArr2[i + 1] = (byte) (i3 >> 8);
        bArr2[i + 2] = (byte) i3;
        return 3;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static byte[] m1528(String str) throws C0824 {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        byte[] bArr = f8177;
        byte[] bArr2 = new byte[((length * 3) / 4) + 2];
        int iM1527 = 0;
        byte[] bArr3 = new byte[4];
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            byte b = (byte) (bytes[i2 + 0] & 127);
            byte b2 = bArr[b];
            if (b2 < -5) {
                throw new C0824("Bad Base64 input character at " + i2 + ": " + ((int) bytes[i2 + 0]) + "(decimal)");
            }
            if (b2 >= -1) {
                if (b == 61) {
                    int i3 = length - i2;
                    byte b3 = (byte) (bytes[(length - 1) + 0] & 127);
                    if (i == 0 || i == 1) {
                        throw new C0824("invalid padding byte '=' at byte offset " + i2);
                    }
                    if ((i == 3 && i3 > 2) || (i == 4 && i3 > 1)) {
                        throw new C0824("padding byte '=' falsely signals end of encoded value at offset " + i2);
                    }
                    if (b3 != 61 && b3 != 10) {
                        throw new C0824("encoded value has invalid trailing byte");
                    }
                } else {
                    int i4 = i;
                    i++;
                    bArr3[i4] = b;
                    if (i == 4) {
                        iM1527 += m1527(bArr3, bArr2, iM1527, bArr);
                        i = 0;
                    }
                }
            }
            i2++;
        }
        if (i != 0) {
            if (i == 1) {
                throw new C0824("single trailing character at offset " + (length - 1));
            }
            bArr3[i] = 61;
            iM1527 += m1527(bArr3, bArr2, iM1527, bArr);
        }
        byte[] bArr4 = new byte[iM1527];
        System.arraycopy(bArr2, 0, bArr4, 0, iM1527);
        return bArr4;
    }
}
