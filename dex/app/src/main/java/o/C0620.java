package o;

import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;

/* renamed from: o.䵆, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0620 extends ub {
    C0620() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        md mdVarM818;
        this.f5008 = (short) 192;
        int i3 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        if (z || (mdVarM818 = C0358.f6669.m818(i3)) == null) {
            return;
        }
        if (b >= 34) {
            b = (byte) (b - 1);
        }
        if (b < 0 || b >= nd.valuesCustom().length) {
            return;
        }
        mdVarM818.f2104 = new C0449(mdVarM818, nd.valuesCustom()[b]);
        C0449 c0449 = mdVarM818.f2104;
        c_activity c_activityVar = C0358.f6674;
        me meVar = new me(mdVarM818, c0449);
        long jMin = Math.min(mdVarM818.f2104.f7630, 5000L);
        if (c_activityVar.f47 != null) {
            c_activityVar.f47.postDelayed(new RunnableC1014(c_activityVar, meVar), jMin);
        }
    }
}
