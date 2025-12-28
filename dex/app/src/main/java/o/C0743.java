package o;

import java.nio.ByteBuffer;

/* renamed from: o.枓, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0743 {

    /* renamed from: ȃ, reason: contains not printable characters */
    int f7715;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    byte f7716;

    /* renamed from: 櫯, reason: contains not printable characters */
    short f7717;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f7718;

    C0743(ByteBuffer byteBuffer) {
        this.f7718 = byteBuffer.getInt();
        this.f7717 = byteBuffer.getShort();
        this.f7716 = byteBuffer.get();
        this.f7715 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
    }
}
