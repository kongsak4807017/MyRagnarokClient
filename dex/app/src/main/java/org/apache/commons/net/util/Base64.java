package org.apache.commons.net.util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class Base64 {
    static final int CHUNK_SIZE = 76;
    private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    private static final int MASK_6BITS = 63;
    private static final int MASK_8BITS = 255;
    private byte[] buffer;
    private int currentLinePos;
    private final int decodeSize;
    private final int encodeSize;
    private final byte[] encodeTable;
    private boolean eof;
    private final int lineLength;
    private final byte[] lineSeparator;
    private int modulus;
    private int pos;
    private int readPos;
    private int x;
    private static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte PAD = 61;
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, PAD, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    public Base64() {
        this(false);
    }

    public Base64(boolean z) {
        this(CHUNK_SIZE, CHUNK_SEPARATOR, z);
    }

    public Base64(int i) {
        this(i, CHUNK_SEPARATOR);
    }

    public Base64(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public Base64(int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            i = 0;
            bArr = EMPTY_BYTE_ARRAY;
        }
        this.lineLength = i > 0 ? (i / 4) * 4 : 0;
        this.lineSeparator = new byte[bArr.length];
        System.arraycopy(bArr, 0, this.lineSeparator, 0, bArr.length);
        if (i > 0) {
            this.encodeSize = bArr.length + 4;
        } else {
            this.encodeSize = 4;
        }
        this.decodeSize = this.encodeSize - 1;
        if (containsBase64Byte(bArr)) {
            throw new IllegalArgumentException("lineSeperator must not contain base64 characters: [" + newStringUtf8(bArr) + "]");
        }
        this.encodeTable = z ? URL_SAFE_ENCODE_TABLE : STANDARD_ENCODE_TABLE;
    }

    public boolean isUrlSafe() {
        return this.encodeTable == URL_SAFE_ENCODE_TABLE;
    }

    boolean hasData() {
        return this.buffer != null;
    }

    int avail() {
        if (this.buffer != null) {
            return this.pos - this.readPos;
        }
        return 0;
    }

    private void resizeBuffer() {
        if (this.buffer == null) {
            this.buffer = new byte[8192];
            this.pos = 0;
            this.readPos = 0;
        } else {
            byte[] bArr = new byte[this.buffer.length * 2];
            System.arraycopy(this.buffer, 0, bArr, 0, this.buffer.length);
            this.buffer = bArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    int readResults(byte[] r3, int r4, int r5) {
        /*
            r2 = this;
            byte[] r0 = r2.buffer
            if (r0 == 0) goto L26
            int r0 = r2.avail()
            int r5 = java.lang.Math.min(r0, r5)
            byte[] r0 = r2.buffer
            if (r0 == r3) goto L22
            byte[] r0 = r2.buffer
            int r1 = r2.readPos
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)
            int r0 = r2.readPos
            int r0 = r0 + r5
            r2.readPos = r0
            int r0 = r2.readPos
            int r1 = r2.pos
            if (r0 < r1) goto L25
        L22:
            r0 = 0
            r2.buffer = r0
        L25:
            return r5
        L26:
            boolean r0 = r2.eof
            if (r0 == 0) goto L2c
            r0 = -1
            return r0
        L2c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.util.Base64.readResults(byte[], int, int):int");
    }

    void setInitialBuffer(byte[] bArr, int i, int i2) {
        if (bArr != null && bArr.length == i2) {
            this.buffer = bArr;
            this.pos = i;
            this.readPos = i;
        }
    }

    void encode(byte[] bArr, int i, int i2) {
        if (this.eof) {
            return;
        }
        if (i2 < 0) {
            this.eof = true;
            if (this.buffer == null || this.buffer.length - this.pos < this.encodeSize) {
                resizeBuffer();
            }
            switch (this.modulus) {
                case 1:
                    byte[] bArr2 = this.buffer;
                    int i3 = this.pos;
                    this.pos = i3 + 1;
                    bArr2[i3] = this.encodeTable[(this.x >> 2) & MASK_6BITS];
                    byte[] bArr3 = this.buffer;
                    int i4 = this.pos;
                    this.pos = i4 + 1;
                    bArr3[i4] = this.encodeTable[(this.x << 4) & MASK_6BITS];
                    if (this.encodeTable == STANDARD_ENCODE_TABLE) {
                        byte[] bArr4 = this.buffer;
                        int i5 = this.pos;
                        this.pos = i5 + 1;
                        bArr4[i5] = PAD;
                        byte[] bArr5 = this.buffer;
                        int i6 = this.pos;
                        this.pos = i6 + 1;
                        bArr5[i6] = PAD;
                        break;
                    }
                    break;
                case 2:
                    byte[] bArr6 = this.buffer;
                    int i7 = this.pos;
                    this.pos = i7 + 1;
                    bArr6[i7] = this.encodeTable[(this.x >> 10) & MASK_6BITS];
                    byte[] bArr7 = this.buffer;
                    int i8 = this.pos;
                    this.pos = i8 + 1;
                    bArr7[i8] = this.encodeTable[(this.x >> 4) & MASK_6BITS];
                    byte[] bArr8 = this.buffer;
                    int i9 = this.pos;
                    this.pos = i9 + 1;
                    bArr8[i9] = this.encodeTable[(this.x << 2) & MASK_6BITS];
                    if (this.encodeTable == STANDARD_ENCODE_TABLE) {
                        byte[] bArr9 = this.buffer;
                        int i10 = this.pos;
                        this.pos = i10 + 1;
                        bArr9[i10] = PAD;
                        break;
                    }
                    break;
            }
            if (this.lineLength > 0 && this.pos > 0) {
                System.arraycopy(this.lineSeparator, 0, this.buffer, this.pos, this.lineSeparator.length);
                this.pos += this.lineSeparator.length;
                return;
            }
            return;
        }
        for (int i11 = 0; i11 < i2; i11++) {
            if (this.buffer == null || this.buffer.length - this.pos < this.encodeSize) {
                resizeBuffer();
            }
            int i12 = this.modulus + 1;
            this.modulus = i12;
            this.modulus = i12 % 3;
            int i13 = i;
            i++;
            int i14 = bArr[i13];
            if (i14 < 0) {
                i14 += 256;
            }
            this.x = (this.x << 8) + i14;
            if (this.modulus == 0) {
                byte[] bArr10 = this.buffer;
                int i15 = this.pos;
                this.pos = i15 + 1;
                bArr10[i15] = this.encodeTable[(this.x >> 18) & MASK_6BITS];
                byte[] bArr11 = this.buffer;
                int i16 = this.pos;
                this.pos = i16 + 1;
                bArr11[i16] = this.encodeTable[(this.x >> 12) & MASK_6BITS];
                byte[] bArr12 = this.buffer;
                int i17 = this.pos;
                this.pos = i17 + 1;
                bArr12[i17] = this.encodeTable[(this.x >> 6) & MASK_6BITS];
                byte[] bArr13 = this.buffer;
                int i18 = this.pos;
                this.pos = i18 + 1;
                bArr13[i18] = this.encodeTable[this.x & MASK_6BITS];
                this.currentLinePos += 4;
                if (this.lineLength > 0 && this.lineLength <= this.currentLinePos) {
                    System.arraycopy(this.lineSeparator, 0, this.buffer, this.pos, this.lineSeparator.length);
                    this.pos += this.lineSeparator.length;
                    this.currentLinePos = 0;
                }
            }
        }
    }

    void decode(byte[] bArr, int i, int i2) {
        byte b;
        if (this.eof) {
        }
        if (i2 < 0) {
            this.eof = true;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            if (this.buffer == null || this.buffer.length - this.pos < this.decodeSize) {
                resizeBuffer();
            }
            int i4 = i;
            i++;
            byte b2 = bArr[i4];
            if (b2 == 61) {
                this.eof = true;
                break;
            }
            if (b2 >= 0 && b2 < DECODE_TABLE.length && (b = DECODE_TABLE[b2]) >= 0) {
                int i5 = this.modulus + 1;
                this.modulus = i5;
                this.modulus = i5 % 4;
                this.x = (this.x << 6) + b;
                if (this.modulus == 0) {
                    byte[] bArr2 = this.buffer;
                    int i6 = this.pos;
                    this.pos = i6 + 1;
                    bArr2[i6] = (byte) ((this.x >> 16) & 255);
                    byte[] bArr3 = this.buffer;
                    int i7 = this.pos;
                    this.pos = i7 + 1;
                    bArr3[i7] = (byte) ((this.x >> 8) & 255);
                    byte[] bArr4 = this.buffer;
                    int i8 = this.pos;
                    this.pos = i8 + 1;
                    bArr4[i8] = (byte) (this.x & 255);
                }
            }
            i3++;
        }
        if (this.eof && this.modulus != 0) {
            this.x <<= 6;
            switch (this.modulus) {
                case 2:
                    this.x <<= 6;
                    byte[] bArr5 = this.buffer;
                    int i9 = this.pos;
                    this.pos = i9 + 1;
                    bArr5[i9] = (byte) ((this.x >> 16) & 255);
                    break;
                case 3:
                    byte[] bArr6 = this.buffer;
                    int i10 = this.pos;
                    this.pos = i10 + 1;
                    bArr6[i10] = (byte) ((this.x >> 16) & 255);
                    byte[] bArr7 = this.buffer;
                    int i11 = this.pos;
                    this.pos = i11 + 1;
                    bArr7[i11] = (byte) ((this.x >> 8) & 255);
                    break;
            }
        }
    }

    public static boolean isBase64(byte b) {
        if (b != 61) {
            return b >= 0 && b < DECODE_TABLE.length && DECODE_TABLE[b] != -1;
        }
        return true;
    }

    public static boolean isArrayByteBase64(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (!isBase64(bArr[i]) && !isWhiteSpace(bArr[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean containsBase64Byte(byte[] bArr) {
        for (byte b : bArr) {
            if (isBase64(b)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public static String encodeBase64String(byte[] bArr) {
        return newStringUtf8(encodeBase64(bArr, true));
    }

    public static String encodeBase64StringUnChunked(byte[] bArr) {
        return newStringUtf8(encodeBase64(bArr, false));
    }

    public static String encodeBase64String(byte[] bArr, boolean z) {
        return newStringUtf8(encodeBase64(bArr, z));
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return encodeBase64(bArr, false, true);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return newStringUtf8(encodeBase64(bArr, false, true));
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public byte[] decode(String str) {
        return decode(getBytesUtf8(str));
    }

    private byte[] getBytesUtf8(String str) {
        try {
            return str.getBytes("UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public byte[] decode(byte[] bArr) {
        reset();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[(bArr.length * 3) / 4];
        setInitialBuffer(bArr2, 0, bArr2.length);
        decode(bArr, 0, bArr.length);
        decode(bArr, 0, -1);
        byte[] bArr3 = new byte[this.pos];
        readResults(bArr3, 0, bArr3.length);
        return bArr3;
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z) {
        return encodeBase64(bArr, z, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2) {
        return encodeBase64(bArr, z, z2, Integer.MAX_VALUE);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        long encodeLength = getEncodeLength(bArr, z ? CHUNK_SIZE : 0, z ? CHUNK_SEPARATOR : EMPTY_BYTE_ARRAY);
        if (encodeLength > i) {
            throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodeLength + ") than the specified maxium size of " + i);
        }
        return (z ? new Base64(z2) : new Base64(0, CHUNK_SEPARATOR, z2)).encode(bArr);
    }

    public static byte[] decodeBase64(String str) {
        return new Base64().decode(str);
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return new Base64().decode(bArr);
    }

    private static boolean isWhiteSpace(byte b) {
        switch (b) {
            case 9:
            case 10:
            case 13:
            case 32:
                return true;
            default:
                return false;
        }
    }

    public String encodeToString(byte[] bArr) {
        return newStringUtf8(encode(bArr));
    }

    private static String newStringUtf8(byte[] bArr) {
        try {
            return new String(bArr, "UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public byte[] encode(byte[] bArr) {
        reset();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) getEncodeLength(bArr, this.lineLength, this.lineSeparator)];
        setInitialBuffer(bArr2, 0, bArr2.length);
        encode(bArr, 0, bArr.length);
        encode(bArr, 0, -1);
        if (this.buffer != bArr2) {
            readResults(bArr2, 0, bArr2.length);
        }
        if (isUrlSafe() && this.pos < bArr2.length) {
            byte[] bArr3 = new byte[this.pos];
            System.arraycopy(bArr2, 0, bArr3, 0, this.pos);
            return bArr3;
        }
        return bArr2;
    }

    private static long getEncodeLength(byte[] bArr, int i, byte[] bArr2) {
        int i2 = (i / 4) * 4;
        long length = (bArr.length * 4) / 3;
        long j = length;
        long j2 = length % 4;
        if (j2 != 0) {
            j += 4 - j2;
        }
        if (i2 > 0) {
            boolean z = j % ((long) i2) == 0;
            long length2 = j + ((j / i2) * bArr2.length);
            if (!z) {
                return length2 + bArr2.length;
            }
            return length2;
        }
        return j;
    }

    public static BigInteger decodeInteger(byte[] bArr) {
        return new BigInteger(1, decodeBase64(bArr));
    }

    public static byte[] encodeInteger(BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new NullPointerException("encodeInteger called with null parameter");
        }
        return encodeBase64(toIntegerBytes(bigInteger), false);
    }

    static byte[] toIntegerBytes(BigInteger bigInteger) {
        int iBitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == iBitLength / 8) {
            return byteArray;
        }
        int i = 0;
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            i = 1;
            length--;
        }
        int i2 = (iBitLength / 8) - length;
        byte[] bArr = new byte[iBitLength / 8];
        System.arraycopy(byteArray, i, bArr, i2, length);
        return bArr;
    }

    private void reset() {
        this.buffer = null;
        this.pos = 0;
        this.readPos = 0;
        this.currentLinePos = 0;
        this.modulus = 0;
        this.eof = false;
    }

    int getLineLength() {
        return this.lineLength;
    }

    byte[] getLineSeparator() {
        return (byte[]) this.lineSeparator.clone();
    }
}
