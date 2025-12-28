package o;

import java.nio.ByteBuffer;

/* renamed from: o.邴, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0872 extends ub {
    C0872() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 435;
        ow owVar = ow.KOREAN;
        byte[] bArr = new byte[64];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        if (strM978.equals("") || b == -1) {
            C0358.f6674.f42.f1752.mo439();
            return;
        }
        C0483 c0483 = C0358.f6674.f42.f1752;
        if (c0483.f6943 == null || !c0483.f6943.equals(strM978)) {
            c0483.f6943 = strM978;
            c0483.f6944.setImageBitmap(null);
            C0358.f6685.mo139(new RunnableC0691(c0483, strM978));
        }
        C0358.f6674.f42.f1752.h_();
    }
}
