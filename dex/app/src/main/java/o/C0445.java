package o;

import android.graphics.Point;
import java.nio.ByteBuffer;

/* renamed from: o.ଥ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0445 extends ub {
    C0445() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 318;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        if (z) {
            return;
        }
        m1330(i3, i4, s, s2, s3, i5);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1330(int i, int i2, short s, short s2, short s3, int i3) {
        AbstractC0988 abstractC0988;
        AbstractC0988 abstractC09882;
        lm lmVar = C0358.f6664.f2005.get(i);
        if (lmVar == null) {
            abstractC0988 = null;
        } else {
            abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        }
        Cloneable cloneable = (lm) C0358.f6664.f2005.get(i2);
        if (cloneable == null) {
            abstractC09882 = null;
        } else {
            abstractC09882 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(cloneable.getClass()) ? cloneable : null);
        }
        AbstractC0988 abstractC09883 = abstractC09882;
        if (abstractC0988 != null) {
            abstractC0988.m1563(i2, s3, i3);
            md mdVarM818 = C0358.f6669.m818(abstractC0988.f1998);
            if (mdVarM818 != null && mdVarM818.f2123.f1997 != nu.MOB) {
                gx gxVar = C0358.f6685.f1030.f968.f1411.get(Integer.valueOf(s3));
                mdVarM818.m842(String.valueOf(gxVar != null ? gxVar.f1427 : "Unknown Skill") + " !!", -1);
            }
            if (abstractC09883 != null && abstractC09883 != abstractC0988) {
                abstractC0988.m1564(abstractC09883);
            }
            if (s != 0 || s2 != 0) {
                abstractC0988.f8350 = AbstractC0988.m1559(new Point(s - abstractC0988.f2002, s2 - abstractC0988.f1999));
            }
        }
    }
}
