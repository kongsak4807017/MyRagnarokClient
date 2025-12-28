package o;

import java.nio.ByteBuffer;

/* renamed from: o.酣, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class C0881 extends ub {
    C0881() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2554;
        byteBuffer.getShort();
        C0771[] c0771Arr = new C0771[i];
        for (int i3 = 0; i3 < c0771Arr.length; i3++) {
            C0771 c0771 = new C0771();
            c0771.f7802 = byteBuffer.getInt();
            c0771.f7800 = byteBuffer.getInt();
            c0771.f7799 = byteBuffer.getShort();
            c0771.f7798 = byteBuffer.getShort();
            c0771Arr[i3] = c0771;
        }
        if (z) {
            return;
        }
        C0371.m1314(c0771Arr);
    }
}
