package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class yx extends yy {

    /* renamed from: Ć, reason: contains not printable characters */
    private byte f6001;

    /* renamed from: ć, reason: contains not printable characters */
    private byte f6002;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private byte f6003;

    /* renamed from: 岱, reason: contains not printable characters */
    private int f6004;

    public yx(yy yyVar, byte[] bArr) {
        super(yyVar);
        this.f6001 = (byte) (this.f6001 | (bArr[0] & 255));
        this.f6002 = (byte) (this.f6002 | (bArr[1] & 255));
        this.f6003 = (byte) (this.f6003 | (bArr[2] & 255));
        this.f6004 = yu.m1180(bArr, 3);
    }
}
