package o;

import android.graphics.Point;
import java.nio.ByteBuffer;

/* renamed from: o.憎, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1153 extends ub {
    C1153() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2324;
        oj ojVar = new oj();
        ojVar.f3335 = byteBuffer.get();
        ojVar.f3332 = byteBuffer.getInt();
        ojVar.f3315 = byteBuffer.getShort();
        ojVar.f3301 = byteBuffer.getShort();
        ojVar.f3302 = byteBuffer.getShort();
        ojVar.f3303 = byteBuffer.getInt();
        ojVar.f3304 = byteBuffer.getShort();
        ojVar.f3319 = byteBuffer.getShort();
        ojVar.f3328 = byteBuffer.getShort();
        ojVar.f3316 = byteBuffer.getShort();
        ojVar.f3305 = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        ojVar.f3333 = byteBuffer.getShort();
        ojVar.f3326 = byteBuffer.getShort();
        ojVar.f3334 = byteBuffer.getShort();
        ojVar.f3320 = byteBuffer.getShort();
        ojVar.f3329 = byteBuffer.getShort();
        ojVar.f3306 = C0358.f6667.f4777 ? byteBuffer.getShort() : (short) 0;
        ojVar.f3307 = byteBuffer.getInt();
        ojVar.f3308 = byteBuffer.getShort();
        ojVar.f3336 = byteBuffer.getShort();
        ojVar.f3323 = byteBuffer.getInt();
        ojVar.f3309 = byteBuffer.get();
        ojVar.f3310 = byteBuffer.get();
        bn bnVar = new bn(byteBuffer);
        ojVar.f3311 = new Point((short) (((bnVar.f847[0] & 255) << 2) | ((bnVar.f847[1] & 255) >> 6)), bnVar.m466());
        ojVar.f3330 = byteBuffer.get();
        ojVar.f3327 = byteBuffer.get();
        ojVar.f3331 = byteBuffer.getShort();
        ojVar.f3325 = byteBuffer.getShort();
        ojVar.f3317 = byteBuffer.getInt();
        ojVar.f3313 = byteBuffer.getInt();
        ojVar.f3321 = byteBuffer.get();
        byteBuffer.get(new byte[i]);
        if (z) {
            return;
        }
        m1653(ojVar, i3, bnVar);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1653(oj ojVar, int i, bn bnVar) {
        ln lnVar = C0358.f6664;
        lm lmVarM775 = lnVar.f2005.get(ojVar.f3332);
        if (lmVarM775 == null) {
            lmVarM775 = lm.m775(ojVar);
            C0358 c0358 = C0358.f6688;
            C0358.m1308(lmVarM775);
        } else {
            lmVarM775.mo460(ojVar);
            md mdVarM818 = C0358.f6669.m818(ojVar.f3332);
            if (mdVarM818 != null) {
                mdVarM818.m860();
            }
        }
        AbstractC0988 abstractC0988 = (AbstractC0988) lmVarM775;
        ue ueVar = C0358.f6669.f2063.f6876;
        short s = (short) (((bnVar.f847[0] & 255) << 2) | ((bnVar.f847[1] & 255) >> 6));
        short sM466 = bnVar.m466();
        short sM465 = bnVar.m465();
        short sM464 = bnVar.m464();
        b bVar = C0358.f6671;
        abstractC0988.m1568(ueVar, s, sM466, sM465, sM464, pa.m972(i) + (bVar.f760 - bVar.f763));
    }
}
