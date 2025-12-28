package o;

import java.nio.ByteBuffer;
import o.AbstractC0689;
import o.ph;

/* renamed from: o.뛗, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1044 extends ub {
    C1044() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 282;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        m1614(s, s2, i3, i4, b);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1614(short s, short s2, int i, int i2, byte b) {
        AbstractC0988 abstractC0988;
        lm lmVar = C0358.f6664.f2005.get(i2);
        if (lmVar == null) {
            abstractC0988 = null;
        } else {
            abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        }
        AbstractC0988 abstractC09882 = abstractC0988;
        if (C0358.f6664.f2005.get(i) != null) {
        }
        if (b == 0) {
        }
        md mdVarM818 = C0358.f6669.m818(i2);
        if (abstractC09882 != null) {
            abstractC09882.m1562(s, 1, i, 0, 0, s2, 0);
            if (mdVarM818 != null && mdVarM818.f2123.f1997 != nu.MOB) {
                if (s != 51 && s != 135 && s != 389) {
                    gx gxVar = C0358.f6685.f1030.f968.f1411.get(Integer.valueOf(s));
                    mdVarM818.m842(String.valueOf(gxVar != null ? gxVar.f1427 : "Unknown Skill") + " !!", -1);
                }
                mdVarM818.f2103 = null;
                mv mvVar = mv.CAST;
                mdVarM818.m1423(((C0564) mdVarM818.f7638).m1372(mvVar, mdVarM818.f2130), System.currentTimeMillis());
                mdVarM818.f2126 = mvVar;
                mdVarM818.m834();
                mdVarM818.f7635 = AbstractC0689.EnumC0690.LOOP_ONCE;
            }
        }
        md mdVarM8182 = C0358.f6669.m818(i);
        ph.C0072 c0072 = ph.f4539[s];
        if (c0072 != null && c0072.f4546 != null) {
            C0358.f6685.mo139(new RunnableC1110(c0072, mdVarM818, mdVarM8182));
        }
        if (s2 > 0) {
            switch (s) {
                case 9:
                    if (mdVarM8182 != null) {
                        C0358.f6669.f2048.f1543.add(new C1106(s2, mdVarM8182, System.currentTimeMillis(), ne.SP_HEAL));
                        break;
                    }
                    break;
                case 28:
                case 70:
                case 322:
                case 2051:
                    if (mdVarM8182 != null) {
                        C0358.f6669.f2048.f1543.add(new C1106(s2, mdVarM8182, System.currentTimeMillis(), ne.HEAL));
                        break;
                    }
                    break;
            }
        }
    }
}
