package o;

import android.graphics.Point;
import java.nio.ByteBuffer;

/* renamed from: o.ʇ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0266 extends ub {
    C0266() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        md mdVarM818;
        this.f5008 = (short) 136;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        if (z || (mdVarM818 = C0358.f6669.m818(i3)) == null) {
            return;
        }
        AbstractC0988 abstractC0988 = mdVarM818.f2101;
        Point point = new Point(s, s2);
        int i4 = point.x;
        int i5 = point.y;
        abstractC0988.f2002 = i4;
        abstractC0988.f1999 = i5;
        abstractC0988.f2000.x = 0;
        abstractC0988.f2000.y = 0;
        abstractC0988.f8353 = null;
        mv mvVar = mv.STAND;
        mdVarM818.m1423(((C0564) mdVarM818.f7638).m1372(mvVar, mdVarM818.f2130), System.currentTimeMillis());
        mdVarM818.f2126 = mvVar;
        mdVarM818.m834();
    }
}
