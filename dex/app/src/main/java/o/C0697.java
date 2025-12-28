package o;

import java.nio.ByteBuffer;

/* renamed from: o.怞, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0697 extends ub {

    /* renamed from: 櫯, reason: contains not printable characters */
    short f7647;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f7648;

    C0697() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        AbstractC0988 abstractC0988;
        this.f5008 = (short) 328;
        this.f7648 = byteBuffer.getInt();
        this.f7647 = byteBuffer.getShort();
        if (z) {
            return;
        }
        lm lmVar = C0358.f6664.f2005.get(this.f7648);
        if (lmVar == null) {
            abstractC0988 = null;
        } else {
            abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        }
        AbstractC0988 abstractC09882 = abstractC0988;
        if (abstractC0988 == null) {
            return;
        }
        abstractC09882.m1566(false);
        md mdVarM818 = C0358.f6669.m818(this.f7648);
        if (mdVarM818 == null) {
            return;
        }
        mv mvVar = mv.STAND;
        mdVarM818.m1423(((C0564) mdVarM818.f7638).m1372(mvVar, mdVarM818.f2130), System.currentTimeMillis());
        mdVarM818.f2126 = mvVar;
        mdVarM818.m834();
    }
}
