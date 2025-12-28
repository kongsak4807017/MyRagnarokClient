package o;

import java.nio.ByteBuffer;

/* renamed from: o.ꆌ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0971 extends ub {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    int f8285;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f8286;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f8287;

    C0971() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2062;
        this.f8287 = byteBuffer.getInt();
        this.f8286 = byteBuffer.getInt();
        this.f8285 = byteBuffer.getInt();
        if (z) {
            return;
        }
        m1553(this.f8287, this.f8286, this.f8285, false);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1553(int i, int i2, int i3, boolean z) {
        AbstractC0988 abstractC0988;
        lm lmVar = C0358.f6664.f2005.get(i);
        if (lmVar == null) {
            abstractC0988 = null;
        } else {
            abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        }
        AbstractC0988 abstractC09882 = abstractC0988;
        if (abstractC0988 == null) {
            return;
        }
        abstractC09882.f8346 = i2;
        abstractC09882.f8358 = i3;
        md mdVarM818 = C0358.f6669.m818(i);
        if (i3 > 0) {
            mdVarM818.m848(z);
        } else {
            mdVarM818.f2100 = null;
        }
    }
}
