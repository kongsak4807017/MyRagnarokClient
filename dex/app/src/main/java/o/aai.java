package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class aai {

    /* renamed from: Ą, reason: contains not printable characters */
    private zr f165;

    /* renamed from: ȃ, reason: contains not printable characters */
    final C0004 f166 = new C0004();

    /* renamed from: ˮ͈, reason: contains not printable characters */
    long f167;

    /* renamed from: 櫯, reason: contains not printable characters */
    long f168;

    /* renamed from: 鷭, reason: contains not printable characters */
    long f169;

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m211(zr zrVar) {
        this.f165 = zrVar;
        this.f168 = 0L;
        this.f169 = 0L;
        this.f167 = 4294967295L;
        for (int i = 0; i < 4; i++) {
            this.f168 = ((this.f168 << 8) | this.f165.m1224()) & 4294967295L;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final int m210() {
        this.f167 = (this.f167 / this.f166.f170) & 4294967295L;
        return (int) ((this.f168 - this.f169) / this.f167);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final void m209() {
        this.f169 = (this.f169 + (this.f167 * (this.f166.f172 & 4294967295L))) & 4294967295L;
        this.f167 = (this.f167 * (this.f166.f171 - (this.f166.f172 & 4294967295L))) & 4294967295L;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public final void m208() {
        boolean z = false;
        while (true) {
            if ((this.f169 ^ (this.f169 + this.f167)) >= 16777216) {
                z = this.f167 < 32768;
                if (!z) {
                    return;
                }
            }
            if (z) {
                this.f167 = (-this.f169) & 32767 & 4294967295L;
                z = false;
            }
            this.f168 = ((this.f168 << 8) | this.f165.m1224()) & 4294967295L;
            this.f167 = (this.f167 << 8) & 4294967295L;
            this.f169 = (this.f169 << 8) & 4294967295L;
        }
    }

    public final String toString() {
        return "RangeCoder[\n  low=" + this.f169 + "\n  code=" + this.f168 + "\n  range=" + this.f167 + "\n  subrange=" + this.f166 + "]";
    }

    /* renamed from: o.aai$鷭, reason: contains not printable characters */
    public static class C0004 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        long f170;

        /* renamed from: 櫯, reason: contains not printable characters */
        long f171;

        /* renamed from: 鷭, reason: contains not printable characters */
        long f172;

        public final String toString() {
            return "SubRange[\n  lowCount=" + this.f172 + "\n  highCount=" + this.f171 + "\n  scale=" + this.f170 + "]";
        }
    }
}
