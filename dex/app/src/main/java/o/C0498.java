package o;

import java.nio.ByteBuffer;

/* renamed from: o.ぃ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0498 extends ub {

    /* renamed from: Ą, reason: contains not printable characters */
    int f6974;

    /* renamed from: ą, reason: contains not printable characters */
    byte f6975;

    /* renamed from: Ć, reason: contains not printable characters */
    byte f6976;

    /* renamed from: ȃ, reason: contains not printable characters */
    short f6977;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    short f6978;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f6979;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f6980;

    C0498() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2463;
        this.f6980 = byteBuffer.getInt();
        this.f6979 = byteBuffer.getInt();
        this.f6978 = byteBuffer.getShort();
        this.f6977 = byteBuffer.getShort();
        this.f6974 = byteBuffer.getInt();
        this.f6975 = byteBuffer.get();
        this.f6976 = byteBuffer.get();
        if (C0358.f6667.f4853) {
            byteBuffer.getInt();
        }
        byteBuffer.get(new byte[i]);
        if (z) {
            return;
        }
        AbstractC1101.m1632(this.f6980, this.f6979, this.f6978, this.f6977, this.f6974, this.f6975, this.f6976 != 0, 1);
    }
}
