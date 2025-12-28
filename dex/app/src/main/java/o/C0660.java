package o;

import java.nio.ByteBuffer;

/* renamed from: o.墛, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0660 extends ub {
    C0660() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2725;
        C0954[] c0954Arr = new C0954[i];
        for (int i3 = 0; i3 < c0954Arr.length; i3++) {
            C0954 c0954 = new C0954();
            c0954.f8264 = byteBuffer.getInt();
            c0954.f8262 = byteBuffer.getInt();
            c0954.f8259 = byteBuffer.getShort();
            c0954.f8257 = byteBuffer.getShort();
            c0954.f8252 = byteBuffer.getShort();
            c0954.f8253 = byteBuffer.getShort();
            c0954.f8254 = byteBuffer.getShort();
            c0954.f8255 = byteBuffer.getInt();
            c0954.f8260 = byteBuffer.getInt();
            c0954.f8261 = byteBuffer.getInt();
            c0954.f8263 = byteBuffer.getInt();
            c0954Arr[i3] = c0954;
        }
        if (z) {
            return;
        }
        C0812.m1481(c0954Arr);
    }
}
