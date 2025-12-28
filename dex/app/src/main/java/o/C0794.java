package o;

import java.nio.ByteBuffer;

/* renamed from: o.玕, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0794 extends ub {
    C0794() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 180;
        int i3 = byteBuffer.getInt();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (z) {
            return;
        }
        n nVar = C0358.f6674.f42.f1797;
        nVar.f2325.append(je.m710(String.valueOf(pa.m978(bArr, ow.LOCAL)) + "\n", false));
        nVar.f2327 = i3;
        nVar.h_();
    }
}
