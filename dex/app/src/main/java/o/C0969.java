package o;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: o.ꃶ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0969 extends ub {
    C0969() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) throws IOException {
        this.f5008 = (short) 2608;
        int i3 = byteBuffer.getInt();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        ow owVar2 = ow.LOCAL;
        byte[] bArr2 = new byte[24];
        byteBuffer.get(bArr2);
        String strM9782 = pa.m978(bArr2, owVar2);
        ow owVar3 = ow.LOCAL;
        byte[] bArr3 = new byte[24];
        byteBuffer.get(bArr3);
        String strM9783 = pa.m978(bArr3, owVar3);
        ow owVar4 = ow.LOCAL;
        byte[] bArr4 = new byte[24];
        byteBuffer.get(bArr4);
        String strM9784 = pa.m978(bArr4, owVar4);
        int i4 = byteBuffer.getInt();
        if (z) {
            return;
        }
        C0701.m1433(i3, strM978, strM9782, strM9783, strM9784, i4);
    }
}
