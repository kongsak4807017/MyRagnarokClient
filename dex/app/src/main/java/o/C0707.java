package o;

import java.nio.ByteBuffer;

/* renamed from: o.慮, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0707 extends ub {

    /* renamed from: Ą, reason: contains not printable characters */
    byte f7659;

    /* renamed from: ą, reason: contains not printable characters */
    byte f7660;

    /* renamed from: ȃ, reason: contains not printable characters */
    short f7661;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    short f7662;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f7663;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f7664;

    C0707() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 287;
        this.f7664 = byteBuffer.getInt();
        this.f7663 = byteBuffer.getInt();
        this.f7662 = byteBuffer.getShort();
        this.f7661 = byteBuffer.getShort();
        this.f7659 = byteBuffer.get();
        if (C0358.f6667.f4853) {
            byteBuffer.getInt();
        } else {
            this.f7660 = byteBuffer.get();
        }
        if (z) {
            return;
        }
        AbstractC1101.m1632(this.f7664, this.f7663, this.f7662, this.f7661, this.f7659, 1, this.f7660 != 0, 1);
    }
}
