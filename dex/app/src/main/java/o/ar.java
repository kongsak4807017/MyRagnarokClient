package o;

import android.support.v4.view.ViewCompat;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ar extends C0784 {

    /* renamed from: Ą, reason: contains not printable characters */
    private static final int[] f697 = {2634565, 3372142, 987406, 4982803, 3366715, 7632966, 4404548, 3748647, 7829365, 131889, 795167, 327680};

    ar(C0539 c0539, int i) {
        if (!(C0358.f6669.f2048.f1554.f1675.get("party_minimap_mark") != null)) {
            byte[] bArr = new byte[36];
            bArr[7] = 1;
            bArr[8] = 1;
            bArr[9] = 1;
            bArr[10] = 1;
            bArr[13] = 1;
            bArr[14] = 1;
            bArr[15] = 1;
            bArr[16] = 1;
            bArr[19] = 1;
            bArr[20] = 1;
            bArr[21] = 1;
            bArr[22] = 1;
            bArr[25] = 1;
            bArr[26] = 1;
            bArr[27] = 1;
            bArr[28] = 1;
            int[] iArr = new int[256];
            iArr[0] = -1;
            iArr[1] = -16777216;
            C0358.f6669.f2048.f1554.m691(bArr, iArr, 6, 6, "party_minimap_mark", null);
            C0851 c0851 = C0358.f6669.f2066;
            as asVar = new as();
            synchronized (c0851) {
                c0851.f7979.add(asVar);
            }
        }
        String str = "party_minimap_pal" + i;
        if (!(C0358.f6669.f2048.f1554.f1678.get(str) != null)) {
            int length = i % f697.length;
            int[] iArr2 = new int[256];
            iArr2[0] = -2130706433;
            iArr2[1] = f697[length] | ViewCompat.MEASURED_STATE_MASK;
            C0358.f6669.f2048.f1554.m690(iArr2, str);
            C0851 c08512 = C0358.f6669.f2066;
            at atVar = new at();
            synchronized (c08512) {
                c08512.f7979.add(atVar);
            }
        }
        super.m1471(c0539, C0358.f6669.f2048.f1554, "party_minimap_mark", 2.0f);
    }
}
