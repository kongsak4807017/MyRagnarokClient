package o;

import java.nio.ByteBuffer;

/* renamed from: o.Ȧ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0235 extends ub {
    C0235() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 145;
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        if (z) {
            return;
        }
        String strM978 = pa.m978(bArr, ow.KOREAN);
        if (strM978.endsWith(".gat")) {
            strM978 = strM978.substring(0, strM978.length() - 4);
        }
        C0358.f6664.f2004.f8353 = null;
        C0358.f6664.f2004.f8366 = null;
        C0358.f6664.f2004.f8354 = null;
        C0358.f6671.m456(true);
        C0358.f6675.mo139(new RunnableC1007(this, strM978, s, s2));
    }
}
