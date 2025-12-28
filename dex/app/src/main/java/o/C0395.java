package o;

import java.nio.ByteBuffer;
import java.util.MissingResourceException;

/* renamed from: o.С, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0395 extends ub {
    C0395() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) throws MissingResourceException {
        this.f5008 = (short) 2461;
        og[] ogVarArr = new og[i];
        for (int i3 = 0; i3 < ogVarArr.length; i3++) {
            ogVarArr[i3] = new og(byteBuffer);
        }
        if (z) {
            return;
        }
        C0741.m1440(ogVarArr, i2);
    }
}
