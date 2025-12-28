package o;

import java.nio.ByteBuffer;

/* renamed from: o.鬁, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0931 extends ub {
    C0931() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 463;
        byteBuffer.getInt();
        int[] iArr = new int[5];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr[i3] = byteBuffer.getInt();
        }
        byteBuffer.getShort();
        if (!z) {
            throw new uz(this);
        }
    }
}
