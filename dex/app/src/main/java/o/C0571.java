package o;

import java.nio.ByteBuffer;

/* renamed from: o.䑎, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0571 extends ub {
    C0571() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 538;
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
        if (z) {
            return;
        }
        m1374("ALCHEMIST", strArr, iArr, -1);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1374(String str, String[] strArr, int[] iArr, int i) {
        C0358.f6674.f42.f1792.m1432("=== " + str + " RANK ===", 11927477);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            C0358.f6674.f42.f1792.m1432(String.format("[ %2d ] %24s : %d POINT", Integer.valueOf(i2 + 1), strArr[i2], Integer.valueOf(iArr[i2])), 11927477);
        }
        C0358.f6674.f42.f1792.m1432("=====================", 11927477);
        C0358.f6674.f42.f1792.m1432("MY POINT : " + (i == -1 ? C0358.f6664.f2004.f8606 : i) + " POINT", 11927477);
        C0358.f6674.f42.f1792.m1432("=====================", 11927477);
    }
}
