package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class yu {
    /* renamed from: 鷭, reason: contains not printable characters */
    public static final int m1180(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final long m1181(byte[] bArr) {
        return ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[0] & 255);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final void m1182(byte[] bArr, int i, int i2) {
        bArr[i + 3] = (byte) (i2 >>> 24);
        bArr[i + 2] = (byte) (i2 >>> 16);
        bArr[i + 1] = (byte) (i2 >>> 8);
        bArr[i] = (byte) (i2 & 255);
    }
}
