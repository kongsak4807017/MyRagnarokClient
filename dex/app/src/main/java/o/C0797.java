package o;

import java.nio.ByteBuffer;

/* renamed from: o.璇, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0797 extends ub {
    C0797() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2756;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        byteBuffer.getInt();
        ow owVar = ow.LATIN;
        byte[] bArr = new byte[26];
        byteBuffer.get(bArr);
        pa.m978(bArr, owVar);
        byte b = byteBuffer.get();
        ow owVar2 = ow.LATIN;
        byte[] bArr2 = new byte[16];
        byteBuffer.get(bArr2);
        pa.m978(bArr2, owVar2);
        byteBuffer.get();
        C1112[] c1112Arr = new C1112[i];
        for (int i6 = 0; i6 < i; i6++) {
            C1112 c1112 = new C1112();
            c1112.f8911 = byteBuffer.getInt();
            c1112.f8910 = byteBuffer.getShort();
            ow owVar3 = ow.LOCAL;
            byte[] bArr3 = new byte[20];
            byteBuffer.get(bArr3);
            c1112.f8909 = pa.m978(bArr3, owVar3);
            c1112.f8908 = byteBuffer.getShort();
            c1112.f8905 = byteBuffer.getShort();
            c1112.f8906 = byteBuffer.getShort();
            byte[] bArr4 = new byte[128];
            byteBuffer.get(bArr4);
            c1112.f8907 = bArr4;
            c1112Arr[i6] = c1112;
        }
        if (z) {
            return;
        }
        C0740.m1439(i3, i4, i5, b, c1112Arr);
    }
}
