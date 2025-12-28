package o;

import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;

/* renamed from: o.髵, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0930 extends ub {
    C0930() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 737;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getInt();
        int i7 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        byte b = byteBuffer.get();
        int i8 = byteBuffer.getInt();
        if (z) {
            return;
        }
        m1538(i3, i4, i5, i6, i7, s, b, i8);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1538(int i, int i2, int i3, int i4, int i5, short s, byte b, int i6) {
        lm lmVar = C0358.f6664.f2005.get(i);
        lm lmVar2 = C0358.f6664.f2005.get(i2);
        if (b < 0 || b >= nq.valuesCustom().length) {
            b = 0;
        }
        nq nqVar = nq.valuesCustom()[b];
        if (nqVar == nq.ITEMPICKUP) {
            if (lmVar == null || lmVar2 == null) {
                nz.m907("Src/Dst == null");
                return;
            }
            AbstractC0988 abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
            if (abstractC0988 == null) {
                nz.m907("src is not creature");
                return;
            }
            C0489 c0489 = (C0489) (C0489.class.isAssignableFrom(lmVar2.getClass()) ? lmVar2 : null);
            if (c0489 == null) {
                nz.m907("dst is not floor item");
                return;
            }
            abstractC0988.m1564(lmVar2);
            C0358 c0358 = C0358.f6688;
            C0358.m1306(lmVar2.f1998);
            md mdVarM818 = C0358.f6669.m818(i);
            abstractC0988.f8353 = null;
            mv mvVar = mv.PICK;
            mdVarM818.m1423(((C0564) mdVarM818.f7638).m1372(mvVar, mdVarM818.f2130), System.currentTimeMillis());
            mdVarM818.f2126 = mvVar;
            mdVarM818.m834();
            C0358.f6685.f1030.f967.m1648(c0489.f2001);
            return;
        }
        if (nqVar == nq.SIT || nqVar == nq.STAND) {
            if (nqVar == nq.SIT) {
                if (lmVar == null || lmVar.f1997 != nu.PC) {
                    return;
                }
                ((bh) lmVar).f815 = true;
                return;
            }
            if (nqVar == nq.STAND) {
                if (lmVar == null || lmVar.f1997 != nu.PC) {
                    return;
                }
                ((bh) lmVar).f815 = false;
                return;
            }
            nz.m907("Unsupported damage type: " + nq.valuesCustom()[b]);
            return;
        }
        if (lmVar == null || lmVar2 == null) {
            return;
        }
        if ((AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null) != null) {
            if (!((AbstractC0988.class.isAssignableFrom(lmVar2.getClass()) ? lmVar2 : null) != null)) {
                return;
            }
            AbstractC0988 abstractC09882 = (AbstractC0988) lmVar;
            abstractC09882.m1565(lmVar2, i3, i4, i5, s, i6);
            long jCurrentTimeMillis = System.currentTimeMillis();
            md mdVar = (md) C0358.f6669.f2048.f1545.get(Integer.valueOf(lmVar2.f1998));
            md mdVar2 = (md) C0358.f6669.f2048.f1545.get(Integer.valueOf(lmVar.f1998));
            mv mvVarM841 = mdVar2.m841(C0358.f6685.f1030);
            mdVar2.m1423(((C0564) mdVar2.f7638).m1372(mvVarM841, mdVar2.f2130), System.currentTimeMillis());
            mdVar2.f2126 = mvVarM841;
            mdVar2.m834();
            int iM839 = 0;
            if (i3 > 0) {
                iM839 = mdVar2.m839(i3, false);
            }
            if (i5 > 0) {
                c_activity c_activityVar = C0358.f6674;
                RunnableC0253 runnableC0253 = new RunnableC0253(i5, mdVar, jCurrentTimeMillis, i6, nqVar, i4, lmVar, mdVar2, abstractC09882);
                long j = iM839;
                if (c_activityVar.f47 != null) {
                    c_activityVar.f47.postDelayed(new RunnableC1014(c_activityVar, runnableC0253), j);
                }
            }
        }
    }
}
