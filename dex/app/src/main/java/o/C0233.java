package o;

import java.nio.ByteBuffer;
import java.util.Iterator;
import o.C0685;

/* renamed from: o.ȡ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0233 extends ub {
    C0233() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 225;
        int i3 = byteBuffer.getInt();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        if (z || C0358.f6664.f2004.f8616 == null) {
            return;
        }
        Iterator<C0685.C0686> it = C0358.f6664.f2004.f8616.f7620.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0685.C0686 next = it.next();
            if (next.f7626.equals(strM978)) {
                next.f7627 = i3 > 0;
            }
        }
        C0358.f6674.f42.f1755.m1602();
    }
}
