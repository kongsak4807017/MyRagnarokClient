package o;

import java.nio.ByteBuffer;

/* renamed from: o.γ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0379 extends ub {
    C0379() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 271;
        yk[] ykVarArr = new yk[i];
        for (int i3 = 0; i3 < i; i3++) {
            ykVarArr[i3] = new yk(byteBuffer);
        }
        if (z) {
            return;
        }
        for (int i4 = 0; i4 < i; i4++) {
            gt gtVar = new gt(ykVarArr[i4]);
            C0358.f6664.f2004.f8642.f8673.put(Integer.valueOf(gtVar.f1409), gtVar);
        }
        if (C0358.f6674.f42.f1800 != null && C0358.f6674.f42.f1800.f1994.getParent() != null) {
            C0358.f6674.f42.f1800.m618();
        }
        C0358.f6674.f42.m719();
    }
}
