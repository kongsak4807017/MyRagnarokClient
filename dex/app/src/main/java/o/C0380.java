package o;

import java.nio.ByteBuffer;

/* renamed from: o.λ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0380 extends ub {
    C0380() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 270;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        short s4 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        gt gtVar = C0358.f6664.f2004.f8642.f8673.get(Integer.valueOf(s));
        if (gtVar == null) {
            gtVar = new gt();
            C0358.f6664.f2004.f8642.f8673.put(Integer.valueOf(s), gtVar);
        }
        gtVar.m611(s, gtVar.f1408, s2, s3, s4, b != 0);
        if (C0358.f6674.f42.f1800.f1994.getParent() != null) {
            C0358.f6674.f42.f1800.m618();
        }
        C0358.f6674.f42.m719();
    }
}
