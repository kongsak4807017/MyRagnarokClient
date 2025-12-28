package o;

import o.pr;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class qs extends pr {
    public qs(qo qoVar) {
        super(qoVar);
    }

    @Override // o.pr
    /* renamed from: 鷭 */
    public final int mo1079() {
        return 2087985426;
    }

    @Override // o.pr
    /* renamed from: 櫯 */
    protected final long mo1078() {
        return 81352129L;
    }

    @Override // o.pr
    /* renamed from: ˮ͈ */
    protected final long mo1077() {
        return -1473372722L;
    }

    @Override // o.pr
    /* renamed from: 鷭 */
    protected final long mo1081(pr.Cif cif, long j, long j2) {
        long j3 = j - ((597687458 * j) - (((int) j2) * 384493133));
        cif.f4950[(int) j2] = (j3 >> 3) & 255;
        return j3;
    }

    @Override // o.pr
    /* renamed from: 鷭 */
    protected final void mo1083(byte[] bArr, int i, int i2, pr.Cif cif) {
        long[] jArr = cif.f4950;
        int i3 = (int) cif.f4951;
        jArr[i3] = jArr[i3] ^ cif.f4953;
        long[] jArr2 = cif.f4950;
        int i4 = (int) cif.f4951;
        jArr2[i4] = jArr2[i4] & 255;
        cif.f4952 += cif.f4950[(int) cif.f4951] * 211;
        cif.f4952 &= 255;
        cif.f4953 -= cif.f4950[(int) cif.f4953] - 1;
        cif.f4953 &= 255;
        long[] jArr3 = cif.f4950;
        int i5 = (int) cif.f4953;
        jArr3[i5] = jArr3[i5] ^ cif.f4952;
        long[] jArr4 = cif.f4950;
        int i6 = (int) cif.f4953;
        jArr4[i6] = jArr4[i6] & 255;
        cif.f4952 += cif.f4953 ^ 235;
        cif.f4952 &= 255;
        bArr[i] = (byte) (bArr[i] ^ cif.f4950[(int) cif.f4951]);
        cif.f4952 ^= cif.f4951 - (i2 % 255);
        cif.f4952 &= 255;
        cif.f4951++;
        cif.f4951 &= 255;
    }
}
