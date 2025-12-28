package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class aam extends aah {
    public aam(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final aam m234(byte[] bArr) {
        this.f163 = bArr;
        this.f164 = 0;
        return this;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final int m233() {
        return this.f163[this.f164] & 255;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m235(int i) {
        this.f163[this.f164] = (byte) i;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final int m231() {
        return this.f163[this.f164 + 1] & 255;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final void m232(int i) {
        this.f163[this.f164 + 1] = (byte) i;
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    public final void m230(int i) {
        byte[] bArr = this.f163;
        int i2 = this.f164 + 1;
        bArr[i2] = (byte) (bArr[i2] + i);
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    public final int m229() {
        return yu.m1180(this.f163, this.f164 + 2);
    }

    /* renamed from: Ą, reason: contains not printable characters */
    public final void m227(int i) {
        yu.m1182(this.f163, this.f164 + 2, i);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m236(aam aamVar) {
        System.arraycopy(aamVar.f163, aamVar.f164, this.f163, this.f164, 6);
    }

    /* renamed from: Ą, reason: contains not printable characters */
    public final aam m226() {
        mo197(this.f164 - 6);
        return this;
    }

    /* renamed from: ą, reason: contains not printable characters */
    public final aam m228() {
        mo197(this.f164 + 6);
        return this;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static void m225(aam aamVar, aam aamVar2) {
        byte[] bArr = aamVar.f163;
        byte[] bArr2 = aamVar2.f163;
        int i = 0;
        int i2 = aamVar.f164;
        int i3 = aamVar2.f164;
        while (i < 6) {
            byte b = bArr[i2];
            bArr[i2] = bArr2[i3];
            bArr2[i3] = b;
            i++;
            i2++;
            i3++;
        }
    }

    public final String toString() {
        return "State[\n  pos=" + this.f164 + "\n  size=6\n  symbol=" + (this.f163[this.f164] & 255) + "\n  freq=" + (this.f163[this.f164 + 1] & 255) + "\n  successor=" + yu.m1180(this.f163, this.f164 + 2) + "\n]";
    }
}
