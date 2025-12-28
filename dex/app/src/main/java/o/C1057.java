package o;

import java.nio.ByteBuffer;

/* renamed from: o.뢂, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1057 extends ub {
    C1057() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        md mdVarM818;
        this.f5008 = (short) 427;
        int i3 = byteBuffer.getInt();
        byteBuffer.getShort();
        int i4 = byteBuffer.getInt();
        if (z || (mdVarM818 = C0358.f6669.m818(i3)) == null) {
            return;
        }
        mdVarM818.f2101.f8345 = i4;
        mdVarM818.m832();
    }
}
