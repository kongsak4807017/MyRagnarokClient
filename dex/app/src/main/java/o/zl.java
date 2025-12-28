package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class zl extends yy {

    /* renamed from: Ć, reason: contains not printable characters */
    private int f6076;

    /* renamed from: ć, reason: contains not printable characters */
    private short f6077;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private short f6078;

    public zl(yy yyVar, byte[] bArr) {
        super(yyVar);
        this.f6076 = 0;
        this.f6077 = (short) 0;
        this.f6078 = (short) 0;
        this.f6076 = yu.m1180(bArr, 0);
        this.f6077 = (short) (((short) (((short) ((bArr[5] & 255) + 0)) << 8)) + (bArr[4] & 255));
        this.f6078 = (short) (((short) (((short) ((bArr[7] & 255) + 0)) << 8)) + (bArr[6] & 255));
    }
}
