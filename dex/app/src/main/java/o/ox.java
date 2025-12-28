package o;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ox {
    /* renamed from: 鷭, reason: contains not printable characters */
    public static final byte[] m946(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length + bArr2.length);
        for (int i = 0; i < bArr2.length; i++) {
            bArrCopyOf[i + length] = bArr2[i];
        }
        return bArrCopyOf;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final <T> T[] m947(T[] tArr, int i) {
        if (i < 0 || i >= tArr.length) {
            throw new IndexOutOfBoundsException("length=" + tArr.length + ", index=" + i);
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr[0].getClass(), tArr.length - 1));
        for (int i2 = 0; i2 < i; i2++) {
            tArr2[i2] = tArr[i2];
        }
        for (int i3 = i; i3 < tArr2.length; i3++) {
            tArr2[i3] = tArr[i3 + 1];
        }
        return tArr2;
    }
}
