package o;

import android.support.v4.media.TransportMediator;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ze {
    /* renamed from: 鷭, reason: contains not printable characters */
    public static String m1199(byte[] bArr, int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = i + 1;
        int i6 = bArr[i] & 255;
        StringBuffer stringBuffer = new StringBuffer();
        while (i5 < bArr.length) {
            if (i4 == 0) {
                int i7 = i5;
                i5++;
                i3 = bArr[i7] & 255;
                i4 = 8;
            }
            switch (i3 >> 6) {
                case 0:
                    int i8 = i5;
                    i5++;
                    stringBuffer.append((char) (bArr[i8] & 255));
                    i2++;
                    break;
                case 1:
                    int i9 = i5;
                    i5++;
                    stringBuffer.append((char) ((bArr[i9] & 255) + (i6 << 8)));
                    i2++;
                    break;
                case 2:
                    stringBuffer.append((char) (((bArr[i5 + 1] & 255) << 8) + (bArr[i5] & 255)));
                    i2++;
                    i5 += 2;
                    break;
                case 3:
                    int i10 = i5;
                    i5++;
                    int i11 = bArr[i10] & 255;
                    if ((i11 & 128) != 0) {
                        i5++;
                        int i12 = bArr[i5] & 255;
                        int i13 = (i11 & TransportMediator.KEYCODE_MEDIA_PAUSE) + 2;
                        while (i13 > 0 && i2 < bArr.length) {
                            stringBuffer.append((char) ((i6 << 8) + (((bArr[i2] & 255) + i12) & 255)));
                            i13--;
                            i2++;
                        }
                        break;
                    } else {
                        int i14 = i11 + 2;
                        while (i14 > 0 && i2 < bArr.length) {
                            stringBuffer.append((char) (bArr[i2] & 255));
                            i14--;
                            i2++;
                        }
                        break;
                    }
            }
            i3 = (i3 << 2) & 255;
            i4 -= 2;
        }
        return stringBuffer.toString();
    }
}
