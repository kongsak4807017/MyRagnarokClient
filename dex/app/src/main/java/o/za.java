package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class za extends yy {

    /* renamed from: Ć, reason: contains not printable characters */
    private short f6015;

    /* renamed from: ć, reason: contains not printable characters */
    private byte f6016;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private byte f6017;

    /* renamed from: 岱, reason: contains not printable characters */
    private short f6018;

    public za(yy yyVar, byte[] bArr) {
        super(yyVar);
        this.f6015 = (short) (((short) (((short) ((bArr[1] & 255) + 0)) << 8)) + (bArr[0] & 255));
        this.f6016 = (byte) (this.f6016 | (bArr[2] & 255));
        this.f6017 = (byte) (this.f6017 | (bArr[3] & 255));
        this.f6018 = (short) (((short) (((short) ((bArr[5] & 255) + 0)) << 8)) + (bArr[4] & 255));
    }
}
