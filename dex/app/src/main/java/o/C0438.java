package o;

import java.nio.ByteBuffer;

/* renamed from: o.ઓ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0438 extends ub {
    C0438() {
    }

    /* renamed from: o.ઓ$鷭, reason: contains not printable characters */
    class C0439 {

        /* renamed from: 櫯, reason: contains not printable characters */
        int f6859;

        /* renamed from: 鷭, reason: contains not printable characters */
        short f6860;

        C0439(ByteBuffer byteBuffer) {
            this.f6860 = byteBuffer.getShort();
            this.f6859 = byteBuffer.getInt();
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 1086;
        for (int i3 = 0; i3 < i; i3++) {
            new C0439(byteBuffer);
        }
        if (!z) {
            throw new uz(this);
        }
    }
}
