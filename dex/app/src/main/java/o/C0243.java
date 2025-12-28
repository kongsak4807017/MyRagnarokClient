package o;

import java.nio.ByteBuffer;

/* renamed from: o.ɒ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0243 extends ub {
    C0243() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        AbstractC0988 abstractC0988;
        this.f5008 = (short) 432;
        int i3 = byteBuffer.getInt();
        byteBuffer.get();
        int i4 = byteBuffer.getInt();
        if (z) {
            return;
        }
        lm lmVar = C0358.f6664.f2005.get(i3);
        if (lmVar == null) {
            abstractC0988 = null;
        } else {
            abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        }
        AbstractC0988 abstractC09882 = abstractC0988;
        if (abstractC0988 == null || abstractC09882.f2001 == i4) {
            return;
        }
        abstractC09882.f2001 = i4;
        C0358.f6669.f2048.f1545.get(Integer.valueOf(i3)).m860();
    }
}
