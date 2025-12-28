package o;

import java.nio.ByteBuffer;

/* renamed from: o.掂, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0726 {

    /* renamed from: Ą, reason: contains not printable characters */
    int f7689;

    /* renamed from: ą, reason: contains not printable characters */
    C0132 f7690;

    /* renamed from: Ć, reason: contains not printable characters */
    int f7691;

    /* renamed from: ć, reason: contains not printable characters */
    byte f7692;

    /* renamed from: ȃ, reason: contains not printable characters */
    short f7693;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    byte f7694;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f7695;

    /* renamed from: 鷭, reason: contains not printable characters */
    short f7696;

    C0726() {
    }

    C0726(short s, int i, byte b, short s2, int i2, C0132 c0132, int i3, byte b2) {
        this.f7696 = s;
        this.f7695 = i;
        this.f7694 = b;
        this.f7693 = s2;
        this.f7689 = i2;
        this.f7690 = c0132;
        this.f7691 = i3;
        this.f7692 = b2;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static C0726 m1437(ByteBuffer byteBuffer, int i, boolean z) {
        short s;
        int i2;
        byte b;
        short s2;
        int i3;
        C0132 c0132;
        int i4;
        byte b2;
        if (i == 0) {
            i = C0358.f6667.f4800;
        }
        if (i >= 20120712 || z) {
            s = byteBuffer.getShort();
            i2 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
            b = byteBuffer.get();
            s2 = byteBuffer.getShort();
            i3 = C0358.f6667.f4823 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
            c0132 = new C0132(byteBuffer);
            i4 = byteBuffer.getInt();
            b2 = byteBuffer.get();
        } else {
            s = byteBuffer.getShort();
            i2 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
            b = byteBuffer.get();
            if (byteBuffer.get() != 0) {
                b2 = 1;
            } else {
                b2 = 0;
            }
            s2 = byteBuffer.getShort();
            i3 = byteBuffer.getShort();
            if (i >= 5) {
                c0132 = new C0132(byteBuffer);
            } else {
                c0132 = new C0132(new short[4]);
            }
            if (i >= 20080102) {
                i4 = byteBuffer.getInt();
            } else {
                i4 = 0;
            }
        }
        return new C0726(s, i2, b, s2, i3, c0132, i4, b2);
    }
}
