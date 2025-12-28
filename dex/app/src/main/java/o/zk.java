package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class zk extends yz {

    /* renamed from: ċ, reason: contains not printable characters */
    private byte f6072;

    /* renamed from: Ȋ, reason: contains not printable characters */
    private int f6073;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private byte f6074;

    /* renamed from: 岱, reason: contains not printable characters */
    private short f6075;

    public zk(yz yzVar, byte[] bArr) {
        super(yzVar);
        this.f6074 = (byte) (this.f6074 | (bArr[0] & 255));
        this.f6075 = (short) (((short) (((short) ((bArr[1] & 255) + 0)) << 8)) + (bArr[0] & 255));
        this.f6073 = yu.m1180(bArr, 2);
        this.f6072 = (byte) (this.f6072 | (bArr[6] & 255));
    }
}
