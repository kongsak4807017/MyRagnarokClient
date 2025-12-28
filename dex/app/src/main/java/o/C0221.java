package o;

import java.nio.ByteBuffer;

/* renamed from: o.Ǻ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0221 extends ub {
    C0221() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 115;
        int i3 = byteBuffer.getInt();
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr);
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        if (z) {
            return;
        }
        C0572 c0572 = new C0572();
        c0572.f5517 = i3;
        c0572.f5516 = bArr;
        c0572.f5515 = (byte) -1;
        c0572.f5513[0] = b;
        c0572.f5513[1] = b2;
        c0572.mo1041();
    }
}
