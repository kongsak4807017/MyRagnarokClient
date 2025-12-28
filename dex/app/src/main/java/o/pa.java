package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.UnmappableCharacterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class pa {

    /* renamed from: Ą, reason: contains not printable characters */
    public static CharsetEncoder f3390;

    /* renamed from: ą, reason: contains not printable characters */
    public static CharsetEncoder f3391;

    /* renamed from: Ć, reason: contains not printable characters */
    static byte[] f3392;

    /* renamed from: ć, reason: contains not printable characters */
    static NumberFormat f3393;

    /* renamed from: ċ, reason: contains not printable characters */
    private static Charset f3394;

    /* renamed from: ȃ, reason: contains not printable characters */
    public static CharsetDecoder f3395;

    /* renamed from: Ȋ, reason: contains not printable characters */
    private static CharsetDecoder f3396;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public static CharsetDecoder f3397;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private static Charset f3398;

    /* renamed from: 䒧, reason: contains not printable characters */
    private static CharsetDecoder f3399;

    /* renamed from: 岱, reason: contains not printable characters */
    private static CharsetEncoder f3400;

    /* renamed from: 櫯, reason: contains not printable characters */
    public static Charset f3401;

    /* renamed from: 纫, reason: contains not printable characters */
    private static CharsetEncoder f3402;

    /* renamed from: 躆, reason: contains not printable characters */
    private static Charset f3403;

    /* renamed from: 鷭, reason: contains not printable characters */
    static MessageDigest f3404;

    static {
        try {
            f3404 = MessageDigest.getInstance("MD5");
            Charset charsetForName = Charset.forName("windows-949");
            f3398 = charsetForName;
            f3400 = charsetForName.newEncoder();
            f3396 = f3398.newDecoder();
            Charset charsetForName2 = Charset.forName("windows-1252");
            f3394 = charsetForName2;
            f3402 = charsetForName2.newEncoder();
            f3399 = f3394.newDecoder();
            m980((String) null);
            byte[] bArr = new byte[2048];
            f3392 = bArr;
            bArr[48] = 0;
            f3392[49] = 1;
            f3392[50] = 2;
            f3392[51] = 3;
            f3392[52] = 4;
            f3392[53] = 5;
            f3392[54] = 6;
            f3392[55] = 7;
            f3392[56] = 8;
            f3392[57] = 9;
            f3392[65] = 10;
            f3392[66] = 11;
            f3392[67] = 12;
            f3392[68] = 13;
            f3392[69] = 14;
            f3392[70] = 15;
            f3392[97] = 10;
            f3392[98] = 11;
            f3392[99] = 12;
            f3392[100] = 13;
            f3392[101] = 14;
            f3392[102] = 15;
            f3393 = NumberFormat.getInstance();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final String m975(byte[] bArr) {
        f3404.update(bArr, 0, bArr.length);
        return m977(f3404.digest(), (String) null);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final int m967(byte b) {
        return b & 255;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final long m972(int i) {
        return i >= 0 ? i : i + 4294967296L;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final int m968(short s) {
        return 65535 & s;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final int m969(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public static final byte m962(byte[] bArr, int i) {
        if (bArr == null || bArr.equals(null)) {
            return (byte) 0;
        }
        return bArr[i];
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final boolean m983(byte[] bArr, byte[] bArr2, int i, int i2) {
        if (bArr2 == null || i2 < 0) {
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = bArr2[i2 + i3];
        }
        return true;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public static final byte[] m961(byte[] bArr, int i) {
        if (bArr == null || bArr.equals(null)) {
            return null;
        }
        int i2 = 0;
        while (i2 < 108 && bArr[i + i2] != 0) {
            i2++;
        }
        byte[] bArr2 = new byte[i2];
        if (m983(bArr2, bArr, i2, i)) {
            return bArr2;
        }
        return null;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public static final int m964(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static CharsetEncoder m979(ow owVar) {
        if (owVar == ow.KOREAN) {
            return f3400;
        }
        if (owVar == ow.LATIN) {
            return f3402;
        }
        if (owVar == ow.LOCAL) {
            return f3390;
        }
        if (owVar == ow.UTF8) {
            return f3391;
        }
        return null;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private static CharsetDecoder m965(ow owVar) {
        if (owVar == ow.KOREAN) {
            return f3396;
        }
        if (owVar == ow.LATIN) {
            return f3399;
        }
        if (owVar == ow.LOCAL) {
            return f3397;
        }
        if (owVar == ow.UTF8) {
            return f3395;
        }
        return null;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final void m980(String str) {
        String country = Locale.getDefault().getCountry();
        if (str != null) {
            f3401 = Charset.forName(str);
        } else if (country.equals("TH")) {
            f3401 = Charset.forName("windows-874");
        } else if (country.equals("RU")) {
            f3401 = Charset.forName("windows-1251");
        } else if (country.equals("JP")) {
            f3401 = Charset.forName("shift-jis");
        } else {
            f3401 = Charset.forName("windows-1252");
        }
        f3403 = Charset.forName("utf-8");
        f3397 = f3401.newDecoder();
        f3395 = f3403.newDecoder();
        f3390 = f3401.newEncoder().onUnmappableCharacter(CodingErrorAction.REPLACE).onMalformedInput(CodingErrorAction.REPLACE).replaceWith(new byte[]{63});
        f3391 = f3403.newEncoder().onUnmappableCharacter(CodingErrorAction.REPLACE).onMalformedInput(CodingErrorAction.REPLACE).replaceWith(new byte[]{63});
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final synchronized String m976(byte[] bArr, int i, ow owVar) {
        int i2;
        int i3 = 0;
        while (true) {
            try {
                if (i3 >= bArr.length) {
                    i2 = i3;
                    break;
                }
                if (bArr[i3] == 0) {
                    i2 = i3;
                    break;
                }
                i3++;
            } catch (CharacterCodingException e) {
                pc.m997("bytes2str: failed to decode string to " + m965(owVar).charset().displayName() + ": " + e.toString() + " buf=" + new String(bArr, f3394) + Arrays.toString(bArr));
                return "";
            }
        }
        if (i2 < i) {
            i = i2;
        }
        return m965(owVar).decode(ByteBuffer.wrap(bArr, 0, i)).toString();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final String m978(byte[] bArr, ow owVar) {
        return m976(bArr, bArr.length, owVar);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final byte[] m986(String str, ow owVar, int i) {
        try {
            return Arrays.copyOf(m979(owVar).encode(CharBuffer.wrap(str)).array(), i);
        } catch (CharacterCodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final byte[] m987(String str, ow owVar, boolean z) {
        try {
            byte[] bArrArray = m979(owVar).encode(CharBuffer.wrap(str)).array();
            int i = -1;
            int length = bArrArray.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                if (bArrArray[length] == 0) {
                    length--;
                } else {
                    i = length + 1;
                    break;
                }
            }
            if (i == -1) {
                return bArrArray;
            }
            if (z) {
                i++;
            }
            if (i != bArrArray.length) {
                bArrArray = Arrays.copyOf(bArrArray, i);
            }
            if (z) {
                bArrArray[bArrArray.length - 1] = 0;
            }
            return bArrArray;
        } catch (UnmappableCharacterException e) {
            throw new RuntimeException("str=" + str, e);
        } catch (CharacterCodingException e2) {
            throw new RuntimeException("str=" + str, e2);
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public static final byte[] m966(String str) {
        if (m979(ow.LOCAL).canEncode(str)) {
            return m987(str, ow.LOCAL, true);
        }
        return m987("/" + str, ow.UTF8, true);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final int m970(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2.length > 0) {
            while (i < (bArr.length - bArr2.length) + 1) {
                int i2 = 0;
                while (i2 < bArr2.length && bArr[i + i2] == bArr2[i2]) {
                    i2++;
                }
                if (i2 != bArr2.length) {
                    i++;
                } else {
                    return i;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public static final byte[] m960(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (((byte) ((f3392[str.charAt(i)] & 15) << 4)) | ((byte) (f3392[str.charAt(i + 1)] & 15)));
        }
        return bArr;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final byte[] m985(String str, String str2) {
        String[] strArrSplit = str.split(str2);
        byte[] bArr = new byte[strArrSplit.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (((byte) ((f3392[strArrSplit[i].charAt(0)] & 15) << 4)) | ((byte) (f3392[strArrSplit[i].charAt(1)] & 15)));
        }
        return bArr;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final void m982(int[] iArr, int i, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = i8 + (i7 * i4);
                int i10 = i2 + i8;
                int i11 = i10 + ((i3 + i7) * i);
                if (i11 >= 0 && i11 < iArr.length && i10 >= 0 && i10 < i && ((iArr2[i9] >>> 24) & 255) != 0) {
                    iArr[i11] = iArr2[i9];
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099 A[SYNTHETIC] */
    /* renamed from: ȃ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m957(java.lang.String r8) {
        /*
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r0 = r8.length()
            r2.<init>(r0)
            java.lang.String r0 = "\n"
            java.lang.String[] r8 = r8.split(r0)
            r3 = 0
            r4 = 0
            goto La1
        L13:
            if (r3 == 0) goto L2d
            r5 = r8[r4]
        */
        //  java.lang.String r0 = "*/"
        /*
            int r0 = r5.indexOf(r0)
            r1 = -1
            if (r0 == r1) goto L9f
        */
        //  java.lang.String r0 = "\\*/"
        /*
            r1 = 2
            java.lang.String[] r7 = r5.split(r0, r1)
            r0 = 1
            r0 = r7[r0]
            r8[r4] = r0
            r3 = 0
        L2d:
            r5 = r8[r4]
            java.lang.String r0 = "//"
            int r6 = r5.indexOf(r0)
            java.lang.String r0 = "/*"
            int r7 = r5.indexOf(r0)
            r0 = -1
            if (r6 == r0) goto L4b
            r0 = -1
            if (r7 == r0) goto L4b
            int r0 = java.lang.Math.min(r6, r7)
            if (r0 != r6) goto L49
            r6 = 0
            goto L4a
        L49:
            r6 = 1
        L4a:
            goto L56
        L4b:
            r0 = -1
            if (r6 == r0) goto L50
            r6 = 0
            goto L56
        L50:
            r0 = -1
            if (r7 == r0) goto L55
            r6 = 1
            goto L56
        L55:
            r6 = -1
        L56:
            switch(r6) {
                case -1: goto L66;
                case 0: goto L6f;
                case 1: goto L82;
                default: goto L59;
            }
        L59:
            goto L99
        L66:
            r2.append(r5)
            java.lang.String r0 = "\n"
            r2.append(r0)
            goto L9f
        L6f:
            java.lang.String r0 = "//"
            r1 = 2
            java.lang.String[] r5 = r5.split(r0, r1)
            r0 = 0
            r0 = r5[r0]
            r2.append(r0)
            java.lang.String r0 = "\n"
            r2.append(r0)
            goto L9f
        L82:
            java.lang.String r0 = "/\\*"
            r1 = 2
            java.lang.String[] r5 = r5.split(r0, r1)
            r0 = 0
            r0 = r5[r0]
            r2.append(r0)
            r0 = r4
            int r4 = r4 + (-1)
            r1 = 1
            r1 = r5[r1]
            r8[r0] = r1
            r3 = 1
            goto L9f
        L99:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L9f:
            int r4 = r4 + 1
        La1:
            int r0 = r8.length
            if (r4 < r0) goto L13
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.pa.m957(java.lang.String):java.lang.String");
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final String[] m988(String str, boolean z, String str2) {
        CharBuffer charBufferAllocate = CharBuffer.allocate((str.length() * 2) + 100);
        if (z) {
            for (String str3 : str.split("\n")) {
                String[] strArrSplit = str3.split("//", 2);
                if (strArrSplit.length > 0) {
                    charBufferAllocate.put(String.valueOf(strArrSplit[0]) + "\n");
                }
            }
            charBufferAllocate.position(0);
            return String.valueOf(charBufferAllocate).split(str2);
        }
        return str.split(str2);
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public static final String m959(byte[] bArr) {
        return m977(bArr, (String) null);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final String m977(byte[] bArr, String str) {
        char[] cArr;
        if (str == null) {
            cArr = new char[bArr.length * 2];
        } else {
            cArr = new char[bArr.length * (str.length() + 2)];
        }
        int length = 0;
        for (byte b : bArr) {
            int i = b & 255;
            String hexString = Integer.toHexString(i);
            if ((i & 240) > 0) {
                cArr[length + 0] = hexString.charAt(0);
                cArr[length + 1] = hexString.charAt(1);
            } else {
                cArr[length + 0] = '0';
                cArr[length + 1] = hexString.charAt(0);
            }
            length += 2;
            if (str != null) {
                for (int i2 = 0; i2 < str.length(); i2++) {
                    cArr[length + i2] = str.charAt(i2);
                }
                length += str.length();
            }
        }
        return String.valueOf(cArr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final String m973(long j) {
        return f3393.format(j);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public static final int m963(int i) {
        int i2 = 1;
        while (i2 < i) {
            i2 *= 2;
        }
        return i2;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final String m974(Object obj) throws IllegalAccessException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        String string;
        StringBuilder sb = new StringBuilder();
        if (obj.getClass().isArray()) {
            sb.append(": { ");
            for (int i = 0; i < Array.getLength(obj); i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(Array.get(obj, i).toString());
            }
            sb.append(" } ");
            return sb.toString();
        }
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        sb.append(obj.getClass().getSimpleName()).append(" {");
        boolean z = true;
        for (Field field : declaredFields) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            field.setAccessible(true);
            try {
                Object obj2 = field.get(obj);
                if (obj2 == null) {
                    string = "null";
                } else {
                    string = obj2.toString();
                }
                sb.append(field.getName());
                if (obj2 != null && obj2.getClass().isArray()) {
                    sb.append(": { ");
                    for (int i2 = 0; i2 < Array.getLength(obj2); i2++) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        Object obj3 = Array.get(obj2, i2);
                        if (obj3 == null) {
                            sb.append("null");
                        } else {
                            sb.append(obj3.toString());
                        }
                    }
                    sb.append(" } ");
                } else {
                    sb.append('=').append('\'').append(string).append('\'');
                }
            } catch (IllegalAccessException unused) {
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: Ą, reason: contains not printable characters */
    public static final void m955(String str) {
        new File(str.substring(0, str.lastIndexOf("/"))).mkdirs();
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public static final String m958(int i) {
        return String.valueOf(i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final void m981(String str, char[] cArr) {
        int iMin = Math.min(str.length(), cArr.length);
        for (int i = 0; i < iMin; i++) {
            cArr[i] = str.charAt(i);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static byte[] m984(File file) throws IOException {
        byte[] bArr = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        int i = 0;
        while (true) {
            int i2 = fileInputStream.read(bArr, i, bArr.length - i);
            if (i2 <= 0) {
                break;
            }
            i += i2;
        }
        if (i != file.length()) {
            fileInputStream.close();
            throw new IOException("Failed to fully read file: " + file.getAbsolutePath());
        }
        fileInputStream.close();
        return bArr;
    }

    /* renamed from: ą, reason: contains not printable characters */
    public static final byte[] m956(String str) {
        return m984(new File(str));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final int m971(byte[] bArr, int i, byte[] bArr2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i + i3] - bArr2[i3 + 0];
            if (i4 > 0) {
                return 1;
            }
            if (i4 < 0) {
                return -1;
            }
        }
        return 0;
    }
}
