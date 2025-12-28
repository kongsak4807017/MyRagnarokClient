package o;

import java.nio.ByteBuffer;
import o.ae.C0015;

/* renamed from: o.Ǿ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0223 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    byte[] f6515 = new byte[80];

    C0223() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        md mdVarM818;
        this.f5008 = (short) 2068;
        int i3 = byteBuffer.getInt();
        byteBuffer.get(this.f6515);
        if (z || (mdVarM818 = C0358.f6669.m818(i3)) == null) {
            return;
        }
        String strM978 = pa.m978(this.f6515, ow.LOCAL);
        if (mdVarM818.f2097 == null) {
            mdVarM818.f2097 = new ae(mdVarM818);
        }
        ae aeVar = mdVarM818.f2097;
        aeVar.f554 = aeVar.new C0015(strM978);
        aeVar.m387();
    }
}
