package o;

import java.nio.ByteBuffer;

/* renamed from: o.闎, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0901 extends ub {
    C0901() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2435;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        int i4 = byteBuffer.getInt();
        byteBuffer.getInt();
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            iArr[i5] = byteBuffer.getInt();
        }
        if (z) {
            return;
        }
        m1529(s, i3, b, i4, iArr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1529(short s, int i, byte b, int i2, int[] iArr) {
        nt ntVarM896;
        md mdVarM818 = C0358.f6669.m818(i);
        if (mdVarM818 == null || (ntVarM896 = nt.m896(s)) == null) {
            return;
        }
        new StringBuilder("sc: start=").append((int) b).append(", type=").append(ntVarM896);
        if (b > 0) {
            mdVarM818.m845(ntVarM896, i2, iArr, i);
        } else {
            mdVarM818.m844(ntVarM896, i);
        }
    }
}
