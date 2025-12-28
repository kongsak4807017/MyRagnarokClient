package o;

import java.nio.ByteBuffer;
import java.util.MissingResourceException;

/* renamed from: o.뮳, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1070 extends ub {
    C1070() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) throws MissingResourceException {
        this.f5008 = (short) 107;
        int iPosition = byteBuffer.position();
        if (C0358.f6667.f4800 >= 20100413) {
            byteBuffer.get();
        }
        if (C0358.f6667.f4800 >= 20100413) {
            byteBuffer.get();
        }
        if (C0358.f6667.f4800 >= 20100413) {
            byteBuffer.get();
        }
        byteBuffer.get(new byte[20]);
        int iPosition2 = byteBuffer.position();
        og[] ogVarArr = new og[i];
        for (int i3 = 0; i3 < ogVarArr.length; i3++) {
            ogVarArr[i3] = new og(byteBuffer);
        }
        if (z) {
            return;
        }
        C0741.m1440(ogVarArr, i2 - (iPosition2 - iPosition));
    }
}
