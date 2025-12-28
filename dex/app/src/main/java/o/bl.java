package o;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class bl {

    /* renamed from: Ą, reason: contains not printable characters */
    public short f839;

    /* renamed from: ą, reason: contains not printable characters */
    public String f840;

    /* renamed from: Ć, reason: contains not printable characters */
    public byte f841;

    /* renamed from: ȃ, reason: contains not printable characters */
    public short f842;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public short f843;

    /* renamed from: 櫯, reason: contains not printable characters */
    public int f844;

    /* renamed from: 鷭, reason: contains not printable characters */
    public short f845;

    bl(ByteBuffer byteBuffer) {
        this.f845 = byteBuffer.getShort();
        this.f844 = byteBuffer.getInt();
        this.f843 = byteBuffer.getShort();
        this.f842 = byteBuffer.getShort();
        this.f839 = byteBuffer.getShort();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        this.f840 = pa.m978(bArr, owVar);
        this.f841 = byteBuffer.get();
    }
}
