package o;

import java.nio.ByteBuffer;

/* renamed from: o.憍, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0708 extends ub {
    C0708() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2628;
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        C0340[] c0340Arr = new C0340[i];
        for (int i3 = 0; i3 < c0340Arr.length; i3++) {
            C0340 c0340 = new C0340();
            c0340.f6655 = byteBuffer.getInt();
            byteBuffer.get(c0340.f6653);
            byteBuffer.get(c0340.f6652);
            c0340.f6648 = byteBuffer.get();
            c0340.f6649 = byteBuffer.get();
            c0340.f6650 = byteBuffer.getShort();
            c0340.f6651 = byteBuffer.getShort();
            c0340Arr[i3] = c0340;
        }
        if (z) {
            return;
        }
        C0976.m1556(strM978, c0340Arr);
    }
}
