package o;

import java.nio.ByteBuffer;

/* renamed from: o.ʿ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0301 extends ub {
    C0301() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2560;
        C0606[] c0606Arr = new C0606[38];
        byteBuffer.get();
        for (int i3 = 0; i3 < c0606Arr.length; i3++) {
            c0606Arr[i3] = new C0606(byteBuffer);
        }
        if (!z) {
            throw new uz(this);
        }
    }
}
