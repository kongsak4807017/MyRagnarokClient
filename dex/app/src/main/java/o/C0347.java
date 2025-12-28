package o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̸, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0347 extends ub {
    C0347() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) throws NumberFormatException {
        this.f5008 = (short) 265;
        int i3 = byteBuffer.getInt();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (z) {
            return;
        }
        String strM1304 = C0358.m1304(bArr);
        C0358.f6674.f42.f1792.m1432(strM1304, 16764416);
        md mdVarM818 = C0358.f6669.m818(i3);
        if (mdVarM818 != null) {
            mdVarM818.m842(strM1304, -1);
        }
    }
}
