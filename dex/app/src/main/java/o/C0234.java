package o;

import java.nio.ByteBuffer;

/* renamed from: o.Ȣ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0234 extends ub {
    C0234() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 223;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        byteBuffer.getShort();
        byte b = byteBuffer.get();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[37];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        if (z) {
            return;
        }
        if (C0358.f6664.f2004.f8616 == null) {
            C0358.f6664.f2004.f8616 = new C0685();
        }
        C0685 c0685 = C0358.f6664.f2004.f8616;
        c0685.f7624 = i3;
        c0685.f7623 = i4;
        c0685.f7622 = s;
        c0685.f7621 = b != 0;
        c0685.f7619 = strM978;
        C0358.f6674.f42.f1755.h_();
    }
}
