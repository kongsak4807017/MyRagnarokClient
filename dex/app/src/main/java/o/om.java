package o;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class om {

    /* renamed from: 鷭, reason: contains not printable characters */
    public ByteBuffer f3345;

    public om() {
        this.f3345 = ByteBuffer.allocate(32);
    }

    public om(int i) {
        this.f3345 = ByteBuffer.allocate(i);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m924(int i) {
        while (this.f3345.remaining() < i) {
            this.f3345 = (ByteBuffer) ByteBuffer.wrap(Arrays.copyOf(this.f3345.array(), this.f3345.array().length * 2)).position(this.f3345.position());
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final om m921(byte[] bArr) {
        m924(bArr.length);
        this.f3345.put(bArr);
        return this;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final om m922(byte[] bArr, int i) {
        m924(i);
        this.f3345.put(bArr, 0, i);
        return this;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private int m920(byte[] bArr, int i) {
        byte[] bArrArray = this.f3345.array();
        int iPosition = this.f3345.position();
        while (i < (iPosition - bArr.length) + 1) {
            if (bArrArray[i] == bArr[0]) {
                int i2 = 0;
                while (i2 < bArr.length && bArrArray[i2 + i] == bArr[i2]) {
                    i2++;
                }
                if (i2 == bArr.length) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final om m923(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int iM920 = m920(bArr, i);
                if (iM920 == -1) {
                    break;
                }
                i = iM920 + 1;
                i2++;
            }
            if (i2 <= 0) {
                return this;
            }
            int length = bArr2.length - bArr.length;
            byte[] bArrArray = this.f3345.array();
            int iPosition = this.f3345.position();
            byte[] bArr3 = new byte[(length * i2) + iPosition];
            int i3 = 0;
            int length2 = 0;
            while (length2 < iPosition) {
                if (pa.m971(bArrArray, length2, bArr, bArr.length) == 0) {
                    for (byte b : bArr2) {
                        try {
                            int i4 = i3;
                            i3++;
                            bArr3[i4] = b;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            e.printStackTrace();
                        }
                    }
                    length2 += bArr.length;
                } else {
                    bArr3[i3] = bArrArray[length2];
                    i3++;
                    length2++;
                }
            }
            this.f3345 = ByteBuffer.wrap(bArr3);
            this.f3345.position(bArr3.length);
        } else {
            int i5 = 0;
            byte[] bArrArray2 = this.f3345.array();
            while (true) {
                int iM9202 = m920(bArr, i5);
                if (iM9202 == -1) {
                    break;
                }
                for (int i6 = 0; i6 < bArr2.length; i6++) {
                    bArrArray2[iM9202 + i6] = bArr2[i6];
                }
                i5 = iM9202 + 1;
            }
        }
        return this;
    }
}
