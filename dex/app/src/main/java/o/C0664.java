package o;

import java.nio.ByteBuffer;

/* renamed from: o.奺, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0664 extends ub {
    C0664() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2303;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        int i4 = byteBuffer.getInt();
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            iArr[i5] = byteBuffer.getInt();
        }
        if (z) {
            return;
        }
        C0901.m1529(s, i3, (byte) 1, i4, iArr);
    }
}
