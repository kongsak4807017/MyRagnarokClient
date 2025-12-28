package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class zc extends yy {

    /* renamed from: Ć, reason: contains not printable characters */
    private int f6024;

    /* renamed from: ć, reason: contains not printable characters */
    private short f6025;

    public zc(yy yyVar, byte[] bArr) {
        super(yyVar);
        int i = 0;
        if (m1194()) {
            this.f6024 = yu.m1180(bArr, 0);
            i = 0 + 4;
        }
        if (m1192()) {
            int i2 = i;
            this.f6025 = (short) (((short) (((short) ((bArr[i2 + 1] & 255) + 0)) << 8)) + (bArr[i2] & 255));
        }
    }
}
