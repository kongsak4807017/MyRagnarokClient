package o;

import java.nio.ByteBuffer;
import o.ck;

/* renamed from: o.ˮ͓, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0365 extends ub {
    C0365() {
    }

    /* renamed from: o.ˮ͓$鷭, reason: contains not printable characters */
    class C0366 {

        /* renamed from: 櫯, reason: contains not printable characters */
        byte f6718;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f6719;

        C0366(ByteBuffer byteBuffer) {
            this.f6719 = byteBuffer.getInt();
            this.f6718 = byteBuffer.get();
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 689;
        byteBuffer.getInt();
        C0366[] c0366Arr = new C0366[i];
        for (int i3 = 0; i3 < c0366Arr.length; i3++) {
            c0366Arr[i3] = new C0366(byteBuffer);
        }
        if (z) {
            return;
        }
        for (int i4 = 0; i4 < c0366Arr.length; i4++) {
            ck ckVar = new ck();
            ckVar.f923 = ck.Cif.valuesCustom()[c0366Arr[i4].f6718];
            C0358.f6679.f6832.put(Integer.valueOf(c0366Arr[i4].f6719), ckVar);
        }
        C0358.f6674.f42.f1757.m484();
    }
}
