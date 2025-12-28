package o;

import java.nio.ByteBuffer;

/* renamed from: o.廂, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0681 extends ub {
    C0681() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) -28666;
        byteBuffer.getShort();
        byte[] bArr = new byte[256];
        byteBuffer.get(bArr);
        if (z) {
            return;
        }
        String strM978 = pa.m978(bArr, ow.LATIN);
        if (C0358.f6671.f757 != null) {
            C0358.f6671.f757.f772 = null;
        }
        b bVar = C0358.f6671;
        bVar.mo139(new e(bVar, C0358.f6667.f4809, C0358.f6667.f4769, ns.LOGIN, C0358.f6674, new RunnableC0652(this, strM978), C0358.f6680, C0358.f6680));
    }
}
