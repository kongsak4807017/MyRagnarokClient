package o;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class oo {

    /* renamed from: o.oo$if, reason: invalid class name */
    public enum Cif {
        TGA_OK,
        TGA_ERROR_FILE_OPEN,
        TGA_ERROR_READING_FILE,
        TGA_ERROR_INDEXED_COLOR,
        TGA_ERROR_MEMORY,
        TGA_ERROR_COMPRESSED_FILE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Cif[] valuesCustom() {
            Cif[] cifArrValuesCustom = values();
            int length = cifArrValuesCustom.length;
            Cif[] cifArr = new Cif[length];
            System.arraycopy(cifArrValuesCustom, 0, cifArr, 0, length);
            return cifArr;
        }
    }

    /* renamed from: o.oo$鷭, reason: contains not printable characters */
    public static class C0064 {

        /* renamed from: Ą, reason: contains not printable characters */
        public int f3353;

        /* renamed from: ą, reason: contains not printable characters */
        public byte[] f3354;

        /* renamed from: Ć, reason: contains not printable characters */
        int f3355;

        /* renamed from: ȃ, reason: contains not printable characters */
        public int f3356;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public int f3357;

        /* renamed from: 櫯, reason: contains not printable characters */
        public int f3358;

        /* renamed from: 鷭, reason: contains not printable characters */
        Cif f3359;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static void m928(BufferedInputStream bufferedInputStream, C0064 c0064) throws IOException {
        int i = c0064.f3357 / 8;
        int i2 = c0064.f3353 * c0064.f3356 * i;
        bufferedInputStream.read(c0064.f3354, 0, i2);
        if (i >= 3) {
            for (int i3 = 0; i3 < i2; i3 += i) {
                byte b = c0064.f3354[i3];
                byte[] bArr = c0064.f3354;
                bArr[i3] = bArr[i3 + 2];
                c0064.f3354[i3 + 2] = b;
            }
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private static void m926(BufferedInputStream bufferedInputStream, C0064 c0064) throws IOException {
        boolean z;
        int i = 0;
        byte[] bArr = new byte[4];
        int i2 = 0;
        int i3 = 0;
        int i4 = c0064.f3357 / 8;
        int i5 = c0064.f3353 * c0064.f3356;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i2 != 0) {
                i2--;
                z = i3 != 0;
            } else {
                i2 = bufferedInputStream.read();
                if (i2 == -1) {
                    return;
                }
                i3 = i2 & 128;
                if (i3 != 0) {
                    i2 -= 128;
                }
                z = false;
            }
            if (!z) {
                if (bufferedInputStream.read(bArr, 0, i4) != i4) {
                    return;
                }
                if (i4 >= 3) {
                    byte b = bArr[0];
                    bArr[0] = bArr[2];
                    bArr[2] = b;
                }
            }
            System.arraycopy(bArr, 0, c0064.f3354, i, i4);
            i += i4;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static void m929(C0064 c0064) {
        int i = (c0064.f3357 / 8) * c0064.f3356;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < c0064.f3353 / 2; i2++) {
            System.arraycopy(c0064.f3354, i2 * i, bArr, 0, i);
            System.arraycopy(c0064.f3354, (c0064.f3353 - (i2 + 1)) * i, c0064.f3354, i2 * i, i);
            System.arraycopy(bArr, 0, c0064.f3354, (c0064.f3353 - (i2 + 1)) * i, i);
        }
        c0064.f3355 = 0;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static C0064 m927(ByteArrayInputStream byteArrayInputStream) throws IOException {
        C0064 c0064 = new C0064();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream);
            try {
                bufferedInputStream.read();
                bufferedInputStream.read();
                c0064.f3358 = (byte) bufferedInputStream.read();
                bufferedInputStream.read();
                bufferedInputStream.read();
                bufferedInputStream.read();
                bufferedInputStream.read();
                bufferedInputStream.read();
                bufferedInputStream.read();
                bufferedInputStream.read();
                bufferedInputStream.read();
                bufferedInputStream.read();
                c0064.f3356 = (bufferedInputStream.read() & 255) | ((bufferedInputStream.read() & 255) << 8);
                c0064.f3353 = (bufferedInputStream.read() & 255) | ((bufferedInputStream.read() & 255) << 8);
                c0064.f3357 = bufferedInputStream.read() & 255;
                int i = bufferedInputStream.read();
                c0064.f3355 = 0;
                if ((i & 32) != 0) {
                    c0064.f3355 = 1;
                }
                if (c0064.f3358 == 1) {
                    c0064.f3359 = Cif.TGA_ERROR_INDEXED_COLOR;
                    bufferedInputStream.close();
                    return c0064;
                }
                if (c0064.f3358 != 2 && c0064.f3358 != 3 && c0064.f3358 != 10) {
                    c0064.f3359 = Cif.TGA_ERROR_COMPRESSED_FILE;
                    bufferedInputStream.close();
                    return c0064;
                }
                c0064.f3354 = new byte[(c0064.f3357 / 8) * c0064.f3353 * c0064.f3356];
                try {
                    if (c0064.f3358 == 10) {
                        m926(bufferedInputStream, c0064);
                    } else {
                        m928(bufferedInputStream, c0064);
                    }
                    bufferedInputStream.close();
                    c0064.f3359 = Cif.TGA_OK;
                    if (c0064.f3355 != 0) {
                        m929(c0064);
                        if (c0064.f3355 != 0) {
                            c0064.f3359 = Cif.TGA_ERROR_MEMORY;
                        }
                    }
                    return c0064;
                } catch (Exception unused) {
                    c0064.f3359 = Cif.TGA_ERROR_READING_FILE;
                    bufferedInputStream.close();
                    return c0064;
                }
            } catch (Exception unused2) {
                c0064.f3359 = Cif.TGA_ERROR_READING_FILE;
                bufferedInputStream.close();
                return c0064;
            }
        } catch (Exception unused3) {
            c0064.f3359 = Cif.TGA_ERROR_FILE_OPEN;
            return c0064;
        }
    }
}
