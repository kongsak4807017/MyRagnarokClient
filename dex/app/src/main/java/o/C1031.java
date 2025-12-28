package o;

import java.nio.ByteBuffer;

/* renamed from: o.딃, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1031 {

    /* renamed from: Ą, reason: contains not printable characters */
    int f8561;

    /* renamed from: ą, reason: contains not printable characters */
    byte f8562;

    /* renamed from: Ć, reason: contains not printable characters */
    byte f8563;

    /* renamed from: ć, reason: contains not printable characters */
    byte f8564;

    /* renamed from: ċ, reason: contains not printable characters */
    short f8565;

    /* renamed from: ȃ, reason: contains not printable characters */
    byte f8566;

    /* renamed from: Ȋ, reason: contains not printable characters */
    int f8567;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    short f8568;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    C0132 f8569;

    /* renamed from: 岱, reason: contains not printable characters */
    C0637 f8570;

    /* renamed from: 櫯, reason: contains not printable characters */
    short f8571;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f8572;

    C1031(ByteBuffer byteBuffer) {
        this.f8572 = byteBuffer.getInt();
        this.f8571 = byteBuffer.getShort();
        this.f8568 = byteBuffer.getShort();
        this.f8566 = byteBuffer.get();
        this.f8561 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        this.f8562 = byteBuffer.get();
        this.f8563 = byteBuffer.get();
        this.f8564 = byteBuffer.get();
        this.f8569 = new C0132(byteBuffer);
        if (C0358.f6667.f4785) {
            this.f8570 = new C0637(byteBuffer);
        }
        if (C0358.f6667.f4786) {
            this.f8567 = byteBuffer.getInt();
            this.f8565 = byteBuffer.getShort();
        } else {
            this.f8567 = 0;
            this.f8565 = (short) -1;
        }
    }
}
