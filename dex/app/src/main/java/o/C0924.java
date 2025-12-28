package o;

import java.nio.ByteBuffer;

/* renamed from: o.髅, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0924 extends ub {
    C0924() {
    }

    /* renamed from: o.髅$鷭, reason: contains not printable characters */
    static class C0925 {

        /* renamed from: ȃ, reason: contains not printable characters */
        int f8214;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        byte f8215;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f8216;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f8217;

        C0925(ByteBuffer byteBuffer) {
            this.f8217 = byteBuffer.getInt();
            this.f8216 = byteBuffer.getInt();
            this.f8215 = byteBuffer.get();
            this.f8214 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 647;
        int i3 = byteBuffer.getInt();
        C0925[] c0925Arr = new C0925[i];
        for (int i4 = 0; i4 < i; i4++) {
            c0925Arr[i4] = new C0925(byteBuffer);
        }
        if (z) {
            return;
        }
        C0232.m1260(i3, 0, c0925Arr);
    }
}
