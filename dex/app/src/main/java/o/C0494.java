package o;

import java.nio.ByteBuffer;
import java.util.Iterator;
import o.C1032;
import o.C1032.C1033;

/* renamed from: o.ↂ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0494 extends ub {
    C0494() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2250;
        byteBuffer.getShort();
        short s = byteBuffer.getShort();
        cn[] cnVarArr = new cn[i];
        for (int i3 = 0; i3 < i; i3++) {
            cnVarArr[i3] = new cn(byteBuffer);
        }
        if (z) {
            return;
        }
        m1353(s, cnVarArr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1353(int i, cn[] cnVarArr) {
        Iterator<C1032.C1033> it = C0358.f6679.f6831.f8573.iterator();
        while (it.hasNext()) {
            if (it.next().f8579 == i) {
                it.remove();
            }
        }
        C0358.f6674.f42.f1756.f6961 = 0;
        for (int i2 = 0; i2 < cnVarArr.length; i2++) {
            C1032.C1033 c1033 = C0358.f6679.f6831.new C1033();
            c1033.f8579 = i;
            c1033.f8578 = cnVarArr[i2].f943;
            c1033.f8577 = cnVarArr[i2].f942;
            C0358.f6679.f6831.f8573.add(c1033);
        }
        C0358.f6674.f42.f1756.g_();
    }
}
