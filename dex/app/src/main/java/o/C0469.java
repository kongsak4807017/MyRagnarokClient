package o;

import java.nio.ByteBuffer;

/* renamed from: o.ᒈ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0469 extends ub {
    C0469() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2641;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        if (z) {
            return;
        }
        C0358.f6674.f42.f1793.m575(i3, s, s2, strM978);
    }
}
