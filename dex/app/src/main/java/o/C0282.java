package o;

import java.nio.ByteBuffer;

/* renamed from: o.ʛ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0282 extends ub {
    C0282() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2692;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getInt();
        int i7 = byteBuffer.getInt();
        int i8 = byteBuffer.getInt();
        int i9 = byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        int i10 = byteBuffer.getInt();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        ow owVar2 = ow.LOCAL;
        byte[] bArr2 = new byte[16];
        byteBuffer.get(bArr2);
        String strM9782 = pa.m978(bArr2, owVar2);
        int i11 = byteBuffer.getInt();
        int i12 = byteBuffer.getInt();
        if (z) {
            return;
        }
        C0281.m1276(i3, i4, i5, i6, i7, i8, i9, i10, strM978, null, strM9782, i11, i12);
    }
}
