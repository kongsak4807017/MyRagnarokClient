package o;

import java.nio.ByteBuffer;
import java.util.HashMap;
import o.ck;

/* renamed from: o.뽟, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1079 extends ub {
    C1079() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 695;
        int i3 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        ck ckVar = C0358.f6679.f6832.get(Integer.valueOf(i3));
        if (ckVar == null) {
            HashMap<Integer, ck> map = C0358.f6679.f6832;
            Integer numValueOf = Integer.valueOf(i3);
            ckVar = new ck();
            map.put(numValueOf, ckVar);
        }
        ckVar.f923 = b != 0 ? ck.Cif.ACTIVE : ck.Cif.INACTIVE;
        C0358.f6674.f42.f1757.m484();
    }
}
