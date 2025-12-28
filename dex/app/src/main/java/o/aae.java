package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class aae extends aah {
    public aae(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final aae m180(byte[] bArr) {
        this.f163 = bArr;
        this.f164 = 0;
        return this;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final int m179() {
        byte[] bArr = this.f163;
        int i = this.f164;
        return ((short) (((short) (((short) ((bArr[i + 1] & 255) + 0)) << 8)) + (bArr[i] & 255))) & 65535;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m181(int i) {
        byte[] bArr = this.f163;
        int i2 = this.f164;
        short s = (short) i;
        bArr[i2 + 1] = (byte) (s >>> 8);
        bArr[i2] = (byte) (s & 255);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final void m178(int i) {
        byte[] bArr = this.f163;
        int i2 = this.f164;
        int i3 = ((bArr[i2] & 255) + (i & 255)) >>> 8;
        bArr[i2] = (byte) (bArr[i2] + (i & 255));
        if (i3 > 0 || (65280 & i) != 0) {
            int i4 = i2 + 1;
            bArr[i4] = (byte) (bArr[i4] + ((i >>> 8) & 255) + i3);
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final int m177() {
        return yu.m1180(this.f163, this.f164 + 2);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m182(aam aamVar) {
        yu.m1182(this.f163, this.f164 + 2, aamVar.m207());
    }

    public final void a_(int i) {
        yu.m1182(this.f163, this.f164 + 2, i);
    }

    public final String toString() {
        return "FreqData[\n  pos=" + this.f164 + "\n  size=6\n  summFreq=" + m179() + "\n  stats=" + yu.m1180(this.f163, this.f164 + 2) + "\n]";
    }
}
