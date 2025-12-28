package o;

import java.nio.ByteBuffer;

/* renamed from: o.魹, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0947 extends ub {

    /* renamed from: 櫯, reason: contains not printable characters */
    int f8246;

    /* renamed from: 鷭, reason: contains not printable characters */
    short f8247;

    C0947() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2018;
        this.f8247 = byteBuffer.getShort();
        this.f8246 = byteBuffer.getInt();
        if (z) {
            return;
        }
        cv cvVar = C0358.f6685;
        int i3 = this.f8247 + 1;
        String strM649 = C0358.f6687.m649(i3);
        String str = strM649 == null ? "MSG" + i3 : strM649;
        if (str == null) {
            return;
        }
        C0358.f6674.f42.f1792.m1432(String.format(str, Integer.valueOf(this.f8246)), 16776960);
    }
}
