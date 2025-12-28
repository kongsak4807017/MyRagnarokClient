package o;

import java.nio.ByteBuffer;

/* renamed from: o.姈, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0667 extends ub {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    int f7577;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f7578;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f7579;

    C0667() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2423;
        this.f7579 = byteBuffer.getInt();
        this.f7578 = byteBuffer.getInt();
        this.f7577 = byteBuffer.getInt();
        if (z) {
            return;
        }
        C0971.m1553(this.f7579, this.f7578, this.f7577, true);
    }
}
