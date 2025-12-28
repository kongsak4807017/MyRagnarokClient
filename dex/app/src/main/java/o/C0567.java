package o;

import java.nio.ByteBuffer;

/* renamed from: o.䎤, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0567 extends ub {
    C0567() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2619;
        byteBuffer.getInt();
        byteBuffer.get();
        short[] sArr = new short[i];
        for (int i3 = 0; i3 < sArr.length; i3++) {
            sArr[i3] = byteBuffer.getShort();
        }
        if (!z) {
            throw new uz(this);
        }
    }
}
