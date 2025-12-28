package o;

import o.pr;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class qx extends pr {
    public qx(qo qoVar) {
        super(qoVar);
    }

    @Override // o.pr
    /* renamed from: 鷭 */
    public final int mo1079() {
        return 745573477;
    }

    @Override // o.pr
    /* renamed from: 櫯 */
    protected final long mo1078() {
        return 1490834532L;
    }

    @Override // o.pr
    /* renamed from: ˮ͈ */
    protected final long mo1077() {
        return 512869015L;
    }

    @Override // o.pr
    /* renamed from: 鷭 */
    protected final long mo1081(pr.Cif cif, long j, long j2) {
        long j3 = j - ((923778252 * j) + (((int) j2) * 513921204));
        cif.f4950[(int) j2] = (j3 >> 16) & 255;
        return j3;
    }

    @Override // o.pr
    /* renamed from: 鷭 */
    protected final void mo1083(byte[] bArr, int i, int i2, pr.Cif cif) {
        cif.f4952 -= cif.f4950[(int) cif.f4953] * 209;
        cif.f4952 &= 255;
        long[] jArr = cif.f4950;
        int i3 = (int) cif.f4951;
        jArr[i3] = jArr[i3] ^ cif.f4952;
        long[] jArr2 = cif.f4950;
        int i4 = (int) cif.f4951;
        jArr2[i4] = jArr2[i4] & 255;
        cif.f4953 -= cif.f4950[(int) cif.f4951] + 205;
        cif.f4953 &= 255;
        long[] jArr3 = cif.f4950;
        int i5 = (int) cif.f4952;
        jArr3[i5] = jArr3[i5] ^ cif.f4953;
        long[] jArr4 = cif.f4950;
        int i6 = (int) cif.f4952;
        jArr4[i6] = jArr4[i6] & 255;
        cif.f4952 += cif.f4952 * 104;
        cif.f4952 &= 255;
        bArr[i] = (byte) (bArr[i] ^ cif.f4950[(int) cif.f4953]);
        cif.f4953 ^= cif.f4951 + (i2 % 255);
        cif.f4953 &= 255;
        cif.f4951++;
        cif.f4951 &= 255;
    }
}
