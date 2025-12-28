package o;

import java.nio.ByteBuffer;

/* renamed from: o.ʦ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0289 extends ub {
    C0289() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 348;
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        ow owVar2 = ow.LOCAL;
        byte[] bArr2 = new byte[40];
        byteBuffer.get(bArr2);
        String strM9782 = pa.m978(bArr2, owVar2);
        if (!C0358.f6667.f4838) {
            ow owVar3 = ow.LOCAL;
            byte[] bArr3 = new byte[40];
            byteBuffer.get(bArr3);
            pa.m978(bArr3, owVar3);
        }
        if (z) {
            return;
        }
        C0290.m1279(this, strM978, strM9782);
    }
}
