package o;

import java.nio.ByteBuffer;

/* renamed from: o.ʐ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0274 extends ub {
    C0274() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 518;
        byteBuffer.getInt();
        int i3 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        if (z) {
            return;
        }
        C0358.f6679.f6830.put(Integer.valueOf(i3), strM978);
        C0273.m1273(i3, b != 0);
    }
}
