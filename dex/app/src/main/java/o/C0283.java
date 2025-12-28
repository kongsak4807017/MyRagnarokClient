package o;

import java.nio.ByteBuffer;

/* renamed from: o.ʜ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0283 extends ub {
    C0283() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 364;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        byteBuffer.getInt();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        if (z) {
            return;
        }
        C0358.f6664.f2004.f8348 = i3;
        C0358.f6664.f2004.f8349 = (short) i4;
        C0358.f6664.f2004.f810 = (i5 & 1) > 0;
        C0358.f6664.f2004.f811 = (i5 & 16) > 0;
        C0358.f6664.f2004.f812 = b > 0;
        C0358.f6664.f2004.f8369 = strM978;
        C0358.f6674.f42.f1740.m675();
        C0358.f6674.f42.f1787.b_();
    }
}
