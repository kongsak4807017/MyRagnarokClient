package o;

import java.nio.ByteBuffer;

/* renamed from: o.琭, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0795 extends ub {

    /* renamed from: Ą, reason: contains not printable characters */
    byte f7849;

    /* renamed from: ą, reason: contains not printable characters */
    byte f7850;

    /* renamed from: Ć, reason: contains not printable characters */
    byte f7851;

    /* renamed from: ȃ, reason: contains not printable characters */
    short f7852;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    short f7853;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f7854;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f7855;

    C0795() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2247;
        this.f7855 = byteBuffer.getInt();
        this.f7854 = byteBuffer.getInt();
        this.f7853 = byteBuffer.getShort();
        this.f7852 = byteBuffer.getShort();
        this.f7849 = byteBuffer.get();
        this.f7850 = byteBuffer.get();
        this.f7851 = byteBuffer.get();
        byteBuffer.get(new byte[i]);
        if (z) {
            return;
        }
        AbstractC1101.m1632(this.f7855, this.f7854, this.f7853, this.f7852, this.f7849, this.f7850, this.f7851 != 0, 1);
    }
}
