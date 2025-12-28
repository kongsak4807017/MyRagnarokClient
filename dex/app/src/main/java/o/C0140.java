package o;

import java.nio.ByteBuffer;

/* renamed from: o.ģ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0140 {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    String f6505;

    /* renamed from: 櫯, reason: contains not printable characters */
    short f6506;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f6507;

    C0140(ByteBuffer byteBuffer) {
        this.f6507 = byteBuffer.getInt();
        this.f6506 = byteBuffer.getShort();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        this.f6505 = pa.m978(bArr, owVar);
    }
}
