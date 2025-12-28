package o;

import java.nio.ByteBuffer;

/* renamed from: o.こ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0500 extends ub {
    C0500() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        md mdVarM818;
        this.f5008 = (short) 441;
        int i3 = byteBuffer.getInt();
        if (z || (mdVarM818 = C0358.f6669.m818(i3)) == null) {
            return;
        }
        lm lmVar = mdVarM818.f2123;
        AbstractC0988 abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        if (abstractC0988 != null) {
            abstractC0988.f8366 = null;
            mdVarM818.f2103 = null;
        }
    }
}
