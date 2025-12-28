package o;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: o.昗, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0737 extends ub {
    C0737() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) throws IOException {
        md mdVarM818;
        this.f5008 = (short) 2813;
        int i3 = byteBuffer.getInt();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        if (z || (mdVarM818 = C0358.f6669.m818(i3)) == null) {
            return;
        }
        mdVarM818.f2101.f8359 = strM978;
        if (C0358.f6669.f2061 == mdVarM818) {
            if (mdVarM818.f2129 != null) {
                mdVarM818.f2129.m175(mdVarM818);
            } else {
                mdVarM818.f2129 = new a(mdVarM818);
            }
        }
    }
}
