package o;

import java.nio.ByteBuffer;
import o.C0924;

/* renamed from: o.Ȟ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0232 extends ub {
    C0232() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1260(int i, int i2, C0924.C0925[] c0925Arr) {
        C0358.f6679.f6831.f8575 = i;
        C0358.f6679.f6831.f8574 = i2;
        C0358.f6674.f42.f1742.m603(c0925Arr);
        C0358.f6674.f42.f1742.h_();
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 647;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        C0924.C0925[] c0925Arr = new C0924.C0925[i];
        for (int i5 = 0; i5 < i; i5++) {
            c0925Arr[i5] = new C0924.C0925(byteBuffer);
        }
        if (z) {
            return;
        }
        m1260(i3, i4, c0925Arr);
    }
}
