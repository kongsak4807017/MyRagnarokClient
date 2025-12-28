package o;

import java.nio.ByteBuffer;

/* renamed from: o.ˀ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0302 extends ub {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    short f6617;

    /* renamed from: 櫯, reason: contains not printable characters */
    short f6618;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f6619;

    C0302() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 262;
        this.f6619 = byteBuffer.getInt();
        this.f6618 = byteBuffer.getShort();
        this.f6617 = byteBuffer.getShort();
        if (z) {
            return;
        }
        C0971.m1553(this.f6619, (int) this.f6618, (int) this.f6617, false);
    }
}
