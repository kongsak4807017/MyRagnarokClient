package o;

import java.nio.ByteBuffer;

/* renamed from: o.㣮, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0529 extends ub {
    C0529() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 669;
        bl[] blVarArr = new bl[i];
        for (int i3 = 0; i3 < i; i3++) {
            blVarArr[i3] = new bl(byteBuffer);
        }
        if (z) {
            return;
        }
        for (bl blVar : blVarArr) {
            gt gtVar = new gt(blVar);
            if (C0358.f6664.f2004.f8632 != null) {
                C0358.f6664.f2004.f8632.f8666.f8673.put(Integer.valueOf(gtVar.f1409), gtVar);
                C0358.f6674.f42.f1800.m618();
                C0358.f6674.f42.m733(gtVar);
            }
        }
    }
}
