package o;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class ub implements vf {

    /* renamed from: đ, reason: contains not printable characters */
    C0085 f5005 = new C0085();

    /* renamed from: ܕ, reason: contains not printable characters */
    public int f5006;

    /* renamed from: 庸, reason: contains not printable characters */
    public int f5007;

    /* renamed from: 躆, reason: contains not printable characters */
    public short f5008;

    /* renamed from: 鷭 */
    public abstract void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2);

    @Override // o.ve
    /* renamed from: ȃ */
    public final short mo1099() {
        return this.f5008;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final void m1104(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        mo1042(byteBuffer, 0, true, 0);
        this.f5006 = byteBuffer.position() - iPosition;
        byteBuffer.position(iPosition);
        mo1042(byteBuffer, 1, true, 0);
        this.f5007 = (byteBuffer.position() - iPosition) - this.f5006;
        if (this.f5008 == 0) {
            throw new uv(this);
        }
    }

    @Override // o.vf
    /* renamed from: 鷭, reason: contains not printable characters */
    public final void mo1105(ByteBuffer byteBuffer) {
        if (this.f5006 == 0 && this.f5007 == 0) {
            m1104(ByteBuffer.allocate(2048));
        }
        this.f5005.f5012 = byteBuffer;
        if (this.f5007 > 0) {
            try {
                short s = byteBuffer.getShort();
                if (s > byteBuffer.remaining() + 4) {
                    throw new uu("Packet 0x" + Integer.toHexString(pa.m968(this.f5008)) + ": full packet length is less than buffer remaining");
                }
                int i = (s - 4) - this.f5006;
                if (i < 0) {
                    throw new uu("Packet 0x" + Integer.toHexString(pa.m968(this.f5008)) + ": user sent a packet with negative calculated dynamic size. Dump: " + pa.m959(Arrays.copyOf(byteBuffer.array(), byteBuffer.limit())));
                }
                this.f5005.f5011 = i / this.f5007;
                if (i % this.f5007 > 0) {
                    pc.m997("Packet 0x" + Integer.toHexString(this.f5008) + ": total size doesn't fit into blocks. Expected block size=" + this.f5007 + " received dynamic size = " + i);
                }
            } catch (BufferUnderflowException e) {
                throw new RuntimeException("class=" + getClass() + " bb.position()=" + byteBuffer.position() + " bb.remaining()=" + byteBuffer.remaining(), e);
            }
        } else {
            this.f5005.f5011 = 0;
        }
        this.f5005.f5010 = this.f5006 + (this.f5005.f5011 * this.f5007);
    }

    /* renamed from: o.ub$鷭, reason: contains not printable characters */
    class C0085 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f5010;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f5011;

        /* renamed from: 鷭, reason: contains not printable characters */
        ByteBuffer f5012;

        C0085() {
        }
    }

    @Override // o.vf
    /* renamed from: 鷭 */
    public void mo1041() {
        try {
            mo1042(this.f5005.f5012, this.f5005.f5011, false, this.f5005.f5010);
        } catch (uz unused) {
            new StringBuilder("Received unsupported packet ").append(getClass()).append(" (0x").append(Integer.toHexString(this.f5008)).append(")");
            pc.m994();
        }
    }

    @Override // o.ve
    /* renamed from: 櫯 */
    public int mo1040() {
        if (this.f5007 > 0) {
            return -1;
        }
        return this.f5006;
    }
}
