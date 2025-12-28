package o;

import java.nio.ByteBuffer;

/* renamed from: o.髩, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0929 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    int f8219;

    C0929() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        md mdVarM818;
        this.f5008 = (short) 306;
        this.f8219 = byteBuffer.getInt();
        if (z || (mdVarM818 = C0358.f6669.m818(this.f8219)) == null || mdVarM818.f2097 == null) {
            return;
        }
        ae aeVar = mdVarM818.f2097;
        if (aeVar.f550 != null) {
            if (aeVar.f557 != null) {
                aeVar.f557 = null;
            }
            aeVar.m387();
        }
    }
}
