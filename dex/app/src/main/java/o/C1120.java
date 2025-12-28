package o;

import java.nio.ByteBuffer;

/* renamed from: o.쳨, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1120 extends ub {

    /* renamed from: Ą, reason: contains not printable characters */
    int f8919;

    /* renamed from: ą, reason: contains not printable characters */
    byte f8920;

    /* renamed from: Ć, reason: contains not printable characters */
    byte f8921;

    /* renamed from: ć, reason: contains not printable characters */
    byte f8922;

    /* renamed from: ȃ, reason: contains not printable characters */
    short f8923;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    short f8924;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f8925;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f8926;

    C1120() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2506;
        this.f8926 = byteBuffer.getInt();
        this.f8925 = byteBuffer.getInt();
        this.f8924 = byteBuffer.getShort();
        this.f8923 = byteBuffer.getShort();
        this.f8919 = byteBuffer.getInt();
        this.f8920 = byteBuffer.get();
        this.f8921 = byteBuffer.get();
        this.f8922 = byteBuffer.get();
        byteBuffer.get(new byte[i]);
        if (z) {
            return;
        }
        AbstractC1101.m1632(this.f8926, this.f8925, this.f8924, this.f8923, this.f8919, this.f8920, this.f8921 != 0, this.f8922);
    }
}
