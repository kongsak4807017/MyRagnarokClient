package o;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class bk {

    /* renamed from: Ą, reason: contains not printable characters */
    public short f831;

    /* renamed from: ą, reason: contains not printable characters */
    public short f832;

    /* renamed from: Ć, reason: contains not printable characters */
    public String f833;

    /* renamed from: ć, reason: contains not printable characters */
    public byte f834;

    /* renamed from: ȃ, reason: contains not printable characters */
    public short f835;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public short f836;

    /* renamed from: 櫯, reason: contains not printable characters */
    public short f837;

    /* renamed from: 鷭, reason: contains not printable characters */
    public short f838;

    bk(ByteBuffer byteBuffer) {
        this.f838 = byteBuffer.getShort();
        this.f837 = byteBuffer.getShort();
        this.f836 = byteBuffer.getShort();
        this.f835 = byteBuffer.getShort();
        this.f831 = byteBuffer.getShort();
        this.f832 = byteBuffer.getShort();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        this.f833 = pa.m978(bArr, owVar);
        this.f834 = byteBuffer.get();
    }
}
