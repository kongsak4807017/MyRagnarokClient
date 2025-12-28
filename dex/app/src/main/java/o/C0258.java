package o;

import java.nio.ByteBuffer;
import o.ae.C0014;

/* renamed from: o.ɳ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0258 extends ub {
    C0258() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        md mdVarM818;
        this.f5008 = (short) 215;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        if (z || (mdVarM818 = C0358.f6669.m818(i3)) == null) {
            return;
        }
        mz mzVar = b == 1 ? mz.NORMAL : mz.PROTECTED;
        if (mdVarM818.f2097 == null) {
            mdVarM818.f2097 = new ae(mdVarM818);
        }
        ae aeVar = mdVarM818.f2097;
        aeVar.f553 = aeVar.new C0014(strM978, i4, mzVar, s, s2);
        aeVar.m387();
    }
}
