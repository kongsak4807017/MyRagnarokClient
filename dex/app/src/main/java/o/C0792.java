package o;

import java.nio.ByteBuffer;

/* renamed from: o.狽, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0792 extends ub {
    C0792() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2541;
        mt mtVar = mt.valuesCustom()[byteBuffer.get()];
        if (z) {
            return;
        }
        C0698 c0698 = C0358.f6674.f42.f1792;
        cv cvVar = C0358.f6685;
        int i3 = mtVar.f2171;
        String strM649 = C0358.f6687.m649(i3);
        c0698.m1432(strM649 == null ? "MSG" + i3 : strM649, 16776960);
        C0358.f6674.f42.f1793.mo439();
    }
}
