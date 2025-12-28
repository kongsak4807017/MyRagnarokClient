package o;

import java.nio.ByteBuffer;

/* renamed from: o.ʄ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0265 extends ub {
    C0265() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2429;
        nr nrVar = nr.valuesCustom()[byteBuffer.getShort()];
        String[] strArr = new String[10];
        for (int i3 = 0; i3 < strArr.length; i3++) {
            ow owVar = ow.LOCAL;
            byte[] bArr = new byte[24];
            byteBuffer.get(bArr);
            strArr[i3] = pa.m978(bArr, owVar);
        }
        int[] iArr = new int[10];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            iArr[i4] = byteBuffer.getInt();
        }
        int i5 = byteBuffer.getInt();
        if (z) {
            return;
        }
        C0571.m1374(nrVar.name(), strArr, iArr, i5);
    }
}
