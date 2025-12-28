package o;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class vj {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    @vm(m1154 = 3)
    public byte f5395;

    /* renamed from: 櫯, reason: contains not printable characters */
    @vm(m1154 = 2)
    public short f5396;

    /* renamed from: 鷭, reason: contains not printable characters */
    @vm(m1154 = 1)
    public short f5397;

    public vj() {
    }

    public vj(ByteBuffer byteBuffer) {
        this.f5397 = byteBuffer.getShort();
        this.f5396 = byteBuffer.getShort();
        this.f5395 = byteBuffer.get();
    }
}
