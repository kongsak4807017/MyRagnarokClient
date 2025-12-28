package o;

import java.nio.ByteBuffer;

/* renamed from: o.뙟, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1040 extends ub {
    C1040() {
    }

    /* renamed from: o.뙟$鷭, reason: contains not printable characters */
    class C1041 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f8695;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f8696;

        /* renamed from: 鷭, reason: contains not printable characters */
        short f8697;

        C1041(ByteBuffer byteBuffer) {
            this.f8697 = byteBuffer.getShort();
            this.f8696 = byteBuffer.getInt();
            this.f8695 = byteBuffer.getInt();
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2437;
        for (int i3 = 0; i3 < i; i3++) {
            new C1041(byteBuffer);
        }
        if (!z) {
            throw new uz(this);
        }
    }
}
