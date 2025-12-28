package o;

import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;
import o.ph;

/* renamed from: o.즗, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1105 extends ub {
    C1105() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        AbstractC0988 abstractC0988;
        md mdVarM818;
        this.f5008 = (short) 478;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getInt();
        int i7 = byteBuffer.getInt();
        int i8 = byteBuffer.getInt();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
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
        if (b < 0 || b >= nq.valuesCustom().length) {
            return;
        }
        nq nqVar = nq.valuesCustom()[b];
        int iM839 = 0;
        if (s >= 13000) {
            return;
        }
        ph.C0072 c0072 = ph.f4539[s];
        md mdVarM8182 = C0358.f6669.m818(i4);
        if (abstractC09882 != null) {
            abstractC09882.m1562(s, s2, i4, i6, i7, i8, s3);
            mdVarM818 = C0358.f6669.m818(i3);
            if (mdVarM818 != null) {
                if (mdVarM818.f2123.f1997 != nu.MOB) {
                    gx gxVar = C0358.f6685.f1030.f968.f1411.get(Integer.valueOf(s));
                    mdVarM818.m842(String.valueOf(gxVar != null ? gxVar.f1427 : "Unknown Skill") + " !!", -1);
                }
                mdVarM818.f2103 = null;
                mv mvVar = mv.CAST;
                mdVarM818.m1423(((C0564) mdVarM818.f7638).m1372(mvVar, mdVarM818.f2130), System.currentTimeMillis());
                mdVarM818.f2126 = mvVar;
                mdVarM818.m834();
                if (i6 > 0) {
                    iM839 = mdVarM818.m839(i6, true);
                }
                if (c0072 != null) {
                    if (c0072.f4547 != null) {
                        C0358.f6685.mo139(new RunnableC0504(this, mdVarM818, mdVarM8182, c0072));
                    }
                    if (c0072.f4545 != null) {
                        C0358.f6663.m1535(c0072.f4545, 1.0f);
                    }
                }
            }
        } else {
            mdVarM818 = null;
        }
        if (i8 > 0 && mdVarM8182 != null) {
            int i9 = s == 56 ? 280 : 200;
            int i10 = 0;
            while (i10 < s3) {
                boolean z2 = i10 == 0;
                c_activity c_activityVar = C0358.f6674;
                RunnableC0481 runnableC0481 = new RunnableC0481(this, i8, s3, mdVarM8182, nqVar, i5, i7, c0072, z2, abstractC09882, mdVarM818);
                long j = iM839 + (i10 * i9);
                if (c_activityVar.f47 != null) {
                    c_activityVar.f47.postDelayed(new RunnableC1014(c_activityVar, runnableC0481), j);
                }
                i10++;
            }
        }
    }
}
