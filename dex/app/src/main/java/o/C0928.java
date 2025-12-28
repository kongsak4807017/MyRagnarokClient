package o;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: o.髝, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0928 extends ub {
    C0928() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) throws IOException {
        this.f5008 = (short) 2783;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        ow owVar2 = ow.LOCAL;
        byte[] bArr2 = new byte[24];
        byteBuffer.get(bArr2);
        pa.m978(bArr2, owVar2);
        if (z) {
            return;
        }
        C0701.m1433(i3, strM978, null, null, null, i4);
    }
}
