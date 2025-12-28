package o;

import android.graphics.Point;
import java.nio.ByteBuffer;
import o.AbstractC0689;

/* renamed from: o.㨐, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0534 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    static int f7247 = 1;

    /* renamed from: Ą, reason: contains not printable characters */
    short f7248;

    /* renamed from: ą, reason: contains not printable characters */
    short f7249;

    /* renamed from: Ć, reason: contains not printable characters */
    int f7250;

    /* renamed from: ȃ, reason: contains not printable characters */
    short f7251;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    int f7252;

    /* renamed from: 櫯, reason: contains not printable characters */
    short f7253;

    C0534() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        md mdVarM818;
        this.f5008 = (short) 279;
        this.f7253 = byteBuffer.getShort();
        this.f7252 = byteBuffer.getInt();
        this.f7251 = byteBuffer.getShort();
        this.f7248 = byteBuffer.getShort();
        this.f7249 = byteBuffer.getShort();
        this.f7250 = byteBuffer.getInt();
        if (z || this.f7251 < 0 || (mdVarM818 = C0358.f6669.m818(this.f7252)) == null) {
            return;
        }
        AbstractC0988 abstractC0988 = mdVarM818.f2101;
        abstractC0988.f8350 = AbstractC0988.m1559(new Point(this.f7248 - abstractC0988.f2002, this.f7249 - abstractC0988.f1999));
        mdVarM818.m842(String.valueOf(C0358.f6685.f1030.f968.m613(this.f7253).f1427) + " !!", -1);
        mv mvVar = mv.CAST;
        mdVarM818.m1423(((C0564) mdVarM818.f7638).m1372(mvVar, mdVarM818.f2130), System.currentTimeMillis());
        mdVarM818.f2126 = mvVar;
        mdVarM818.m834();
        mdVarM818.f7635 = AbstractC0689.EnumC0690.LOOP_ONCE;
        mdVarM818.f2103 = null;
        f7247++;
    }
}
