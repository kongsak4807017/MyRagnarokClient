package o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̀, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0313 extends ub {
    C0313() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        boolean z2;
        this.f5008 = (short) 2824;
        if (C0358.f6667.f4833) {
            z2 = C0358.f6667.f4800 >= 20180919;
        } else if (C0358.f6667.f4801) {
            z2 = C0358.f6667.f4800 >= 20180919;
        } else {
            z2 = C0358.f6667.f4800 >= 20181002;
        }
        if (C0358.f6667.f4845) {
            byteBuffer.get();
        }
        int i3 = z2 ? i : 24;
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[i3];
        byteBuffer.get(bArr);
        pa.m978(bArr, owVar);
        if (z) {
        }
    }
}
