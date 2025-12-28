package o;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class yk {

    /* renamed from: Ą, reason: contains not printable characters */
    public short f5959;

    /* renamed from: ą, reason: contains not printable characters */
    public short f5960;

    /* renamed from: Ć, reason: contains not printable characters */
    public String f5961;

    /* renamed from: ć, reason: contains not printable characters */
    public byte f5962;

    /* renamed from: ȃ, reason: contains not printable characters */
    public short f5963;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public short f5964;

    /* renamed from: 櫯, reason: contains not printable characters */
    public short f5965;

    /* renamed from: 鷭, reason: contains not printable characters */
    public short f5966;

    public yk(ByteBuffer byteBuffer) {
        this.f5966 = byteBuffer.getShort();
        this.f5965 = byteBuffer.getShort();
        this.f5964 = byteBuffer.getShort();
        this.f5963 = byteBuffer.getShort();
        this.f5959 = byteBuffer.getShort();
        this.f5960 = byteBuffer.getShort();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        this.f5961 = pa.m978(bArr, owVar);
        this.f5962 = byteBuffer.get();
    }
}
