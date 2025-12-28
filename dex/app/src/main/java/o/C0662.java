package o;

import java.nio.ByteBuffer;
import o.C1035.Cif;

/* renamed from: o.夈, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0662 extends ub {
    C0662() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 565;
        bk[] bkVarArr = new bk[i];
        for (int i3 = 0; i3 < i; i3++) {
            bkVarArr[i3] = new bk(byteBuffer);
        }
        if (z) {
            return;
        }
        for (bk bkVar : bkVarArr) {
            gt gtVar = new gt(bkVar);
            if (C0358.f6664.f2004.f8618 == null) {
                C0358.f6664.f2004.f8618 = C0358.f6664.f2004.new Cif();
            }
            C0358.f6664.f2004.f8618.f8666.f8673.put(Integer.valueOf(gtVar.f1409), gtVar);
            C0358.f6674.f42.f1800.m618();
            C0358.f6674.f42.m733(gtVar);
        }
    }
}
