package o;

import java.nio.ByteBuffer;

/* renamed from: o.倻, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0630 extends ub {
    C0630() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        AbstractC0988 abstractC0988;
        this.f5008 = (short) 156;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        byte b = byteBuffer.get();
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
        if (abstractC0988 == null) {
            return;
        }
        abstractC09882.f8350 = b;
        bh bhVar = (bh) (bh.class.isAssignableFrom(abstractC09882.getClass()) ? abstractC09882 : null);
        if (bhVar != null) {
            bhVar.f816 = s;
        }
    }
}
