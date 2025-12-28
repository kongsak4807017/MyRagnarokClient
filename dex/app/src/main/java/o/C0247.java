package o;

import java.nio.ByteBuffer;

/* renamed from: o.ɛ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0247 extends ub {
    C0247() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 705;
        int i3 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byte b4 = byteBuffer.get();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (z) {
            return;
        }
        String strM978 = pa.m978(bArr, ow.LOCAL);
        int iM952 = oz.m952(b, b2, b3, b4);
        C0358.f6674.f42.f1792.m1432(strM978, 16777215 & iM952);
        md mdVarM818 = C0358.f6669.m818(i3);
        if (mdVarM818 != null) {
            mdVarM818.m842(strM978, (-16777216) | iM952);
        }
    }
}
