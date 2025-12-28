package o;

import java.nio.ByteBuffer;
import o.pj;

/* renamed from: o.ㆪ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0511 extends ub {
    C0511() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 746;
        C0726[] c0726Arr = new C0726[i];
        if (C0358.f6667.f4776 == pj.EnumC0074.HERCULES && byteBuffer.position() >= 4 && byteBuffer.getShort(byteBuffer.position() - 2) == 28) {
            c0726Arr = new C0726[0];
        }
        for (int i3 = 0; i3 < c0726Arr.length; i3++) {
            c0726Arr[i3] = C0726.m1437(byteBuffer, C0358.f6667.f4800, false);
        }
        if (z) {
            return;
        }
        C0953.m1547(c0726Arr);
    }
}
