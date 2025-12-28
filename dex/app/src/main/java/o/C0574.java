package o;

import java.nio.ByteBuffer;

/* renamed from: o.䑰, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0574 extends ub {
    C0574() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 467;
        ow owVar = ow.KOREAN;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        byteBuffer.get();
        byteBuffer.getInt();
        byteBuffer.getInt();
        if (z) {
            return;
        }
        String str = strM978;
        if (!strM978.endsWith(".wav")) {
            str = String.valueOf(str) + ".wav";
        }
        C0358.f6663.m1535(str, 1.0f);
    }
}
