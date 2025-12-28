package o;

import java.nio.ByteBuffer;

/* renamed from: o.Ȯ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0239 extends ub {
    C0239() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 553;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        int i4 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        m1265(i3, s, s2, i4, b);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1265(int i, short s, short s2, int i2, byte b) {
        AbstractC0988 abstractC0988;
        md mdVarM818;
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
        int i3 = abstractC09882.f8357;
        abstractC09882.f8357 = i2;
        abstractC09882.f8355 = s;
        abstractC09882.f8343 = s2;
        abstractC09882.f8344 = b;
        if (i3 == abstractC09882.f8357 || (mdVarM818 = C0358.f6669.m818(i)) == null) {
            return;
        }
        if ((i3 & 1928) > 0 && (abstractC09882.f8357 & 1928) == 0) {
            mdVarM818.f2098 = null;
        } else if ((i3 & 1928) == 0 && (abstractC09882.f8357 & 1928) > 0) {
            if ((abstractC09882.f8357 & 8) > 0) {
                mdVarM818.m837(1, false);
            }
            if ((abstractC09882.f8357 & 128) > 0) {
                mdVarM818.m837(2, false);
            }
            if ((abstractC09882.f8357 & 256) > 0) {
                mdVarM818.m837(3, false);
            }
            if ((abstractC09882.f8357 & 512) > 0) {
                mdVarM818.m837(4, false);
            }
            if ((abstractC09882.f8357 & 1024) > 0) {
                mdVarM818.m837(5, false);
            }
        }
        mdVarM818.m860();
        C0358.f6674.f42.f1787.c_();
    }
}
