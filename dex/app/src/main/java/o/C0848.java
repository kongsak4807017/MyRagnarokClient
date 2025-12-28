package o;

import java.nio.ByteBuffer;
import o.pj;

/* renamed from: o.蔖, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0848 extends ub {
    C0848() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2043;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        byteBuffer.get();
        my myVar = oc.f3250;
        if ((myVar == my.MOTR || myVar == my.all) && C0358.f6667.f4771 == pj.aux.MOTR) {
            i5 ^= -391688254;
            s3 = (short) (((i5 << 3) & 983039) ^ s3);
            i4 ^= 476474;
            i3 ^= 30494367;
        }
        if (z) {
            return;
        }
        C0445.m1330(i3, i4, s, s2, s3, i5);
    }
}
