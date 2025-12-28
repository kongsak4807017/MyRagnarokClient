package o;

import java.nio.ByteBuffer;

/* renamed from: o.ʎ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0271 extends ub {
    C0271() {
    }

    /* renamed from: o.ʎ$鷭, reason: contains not printable characters */
    class C0272 {

        /* renamed from: 櫯, reason: contains not printable characters */
        int f6587;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f6588;

        C0272(ByteBuffer byteBuffer) {
            this.f6588 = byteBuffer.getInt();
            this.f6587 = byteBuffer.getInt();
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 513;
        C0272[] c0272Arr = new C0272[i];
        for (int i3 = 0; i3 < c0272Arr.length; i3++) {
            c0272Arr[i3] = new C0272(byteBuffer);
        }
        if (z) {
            return;
        }
        C0358.f6664.f2004.f8613 = new C0729[c0272Arr.length];
        for (int i4 = 0; i4 < c0272Arr.length; i4++) {
            C0358.f6664.f2004.f8613[i4] = new C0729(c0272Arr[i4].f6588, c0272Arr[i4].f6587, false);
        }
        if (C0358.f6674.f42.f1775.f1994.getParent() != null) {
            C0358.f6674.f42.f1775.m1408(false);
        }
    }
}
