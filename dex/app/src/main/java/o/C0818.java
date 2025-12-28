package o;

import java.nio.ByteBuffer;

/* renamed from: o.磘, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0818 extends ub {
    C0818() {
    }

    /* renamed from: o.磘$鷭, reason: contains not printable characters */
    class C0819 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        byte[] f7929 = new byte[24];

        /* renamed from: 櫯, reason: contains not printable characters */
        int f7930;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f7931;

        C0819(ByteBuffer byteBuffer) {
            this.f7931 = byteBuffer.getInt();
            this.f7930 = byteBuffer.getInt();
            byteBuffer.get(this.f7929);
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 513;
        C0819[] c0819Arr = new C0819[i];
        for (int i3 = 0; i3 < c0819Arr.length; i3++) {
            c0819Arr[i3] = new C0819(byteBuffer);
        }
        if (z) {
            return;
        }
        C0358.f6664.f2004.f8613 = new C0729[c0819Arr.length];
        for (int i4 = 0; i4 < c0819Arr.length; i4++) {
            C0358.f6679.f6830.put(Integer.valueOf(c0819Arr[i4].f7930), pa.m978(c0819Arr[i4].f7929, ow.LOCAL));
            C0358.f6664.f2004.f8613[i4] = new C0729(c0819Arr[i4].f7931, c0819Arr[i4].f7930, false);
        }
        if (C0358.f6674.f42.f1775.f1994.getParent() != null) {
            C0358.f6674.f42.f1775.m1408(false);
        }
    }
}
