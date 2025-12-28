package o;

import java.nio.ByteBuffer;

/* renamed from: o.燍, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0788 extends ub {
    C0788() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2240;
        int i3 = byteBuffer.getInt();
        byteBuffer.getShort();
        cn[] cnVarArr = new cn[i];
        for (int i4 = 0; i4 < cnVarArr.length; i4++) {
            cnVarArr[i4] = new cn(byteBuffer);
        }
        if (z) {
            return;
        }
        C0494.m1353(i3, cnVarArr);
    }
}
