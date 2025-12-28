package o;

import java.nio.ByteBuffer;

/* renamed from: o.ʳ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0296 extends ub {
    C0296() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 354;
        short s = byteBuffer.getShort();
        yk[] ykVarArr = new yk[i];
        for (int i3 = 0; i3 < ykVarArr.length; i3++) {
            ykVarArr[i3] = new yk(byteBuffer);
        }
        if (z) {
            return;
        }
        if (C0358.f6664.f2004.f8635 == null) {
            C0358.f6664.f2004.f8635 = new C0972();
        }
        C0972 c0972 = C0358.f6664.f2004.f8635;
        c0972.f8296 = s;
        c0972.f8305.clear();
        for (yk ykVar : ykVarArr) {
            c0972.f8305.add(new gt(ykVar));
        }
        if (C0358.f6674.f42.f1748.f1994.getParent() != null) {
            C0358.f6674.f42.f1748.f7700.mo1382();
        }
    }
}
