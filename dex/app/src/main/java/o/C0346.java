package o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̷, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0346 extends ub {
    C0346() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2788;
        int i3 = byteBuffer.getInt();
        byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        byteBuffer.getShort();
        byteBuffer.getShort();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        ow owVar2 = ow.LOCAL;
        byte[] bArr2 = new byte[24];
        byteBuffer.get(bArr2);
        String strM9782 = pa.m978(bArr2, owVar2);
        ow owVar3 = ow.LOCAL;
        byte[] bArr3 = new byte[16];
        byteBuffer.get(bArr3);
        String strM9783 = pa.m978(bArr3, owVar3);
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        if (z) {
            return;
        }
        C0882.m1517(i3, i4, s, s2, b, strM978, strM9782, strM9783, b3, b2);
    }
}
