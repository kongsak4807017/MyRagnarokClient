package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class pk extends ub implements vg {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public short f4870;

    /* renamed from: ȃ, reason: contains not printable characters */
    byte[] f4869 = new byte[2048];

    /* renamed from: Ą, reason: contains not printable characters */
    public ByteBuffer f4868 = ByteBuffer.wrap(this.f4869).order(ByteOrder.LITTLE_ENDIAN);

    /* renamed from: 鷭 */
    public abstract void mo592(ByteBuffer byteBuffer, int i);

    @Override // o.ub, o.vf
    /* renamed from: 鷭, reason: contains not printable characters */
    public final void mo1041() {
        throw new uz(this);
    }

    @Override // o.ub
    /* renamed from: 鷭, reason: contains not printable characters */
    public void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4868 = null;
        this.f4869 = null;
        mo592(byteBuffer, i);
        if (z) {
        } else {
            throw new uz(this);
        }
    }

    @Override // o.vg
    /* renamed from: 鷭, reason: contains not printable characters */
    public final void mo1043(ByteBuffer byteBuffer, boolean z) {
        if (z) {
            byteBuffer.putShort(this.f5008);
        }
        if (this.f4870 != 0) {
            byteBuffer.putShort(this.f4870);
        }
        byteBuffer.put(this.f4868.array(), 0, this.f4868.position());
    }

    @Override // o.ub, o.ve
    /* renamed from: 櫯, reason: contains not printable characters */
    public final int mo1040() {
        if (this.f4868.position() <= 0) {
            throw new RuntimeException("get_expected_length called for uninitialized packet");
        }
        if (this.f4870 > 0) {
            return -1;
        }
        return this.f4868.position();
    }
}
