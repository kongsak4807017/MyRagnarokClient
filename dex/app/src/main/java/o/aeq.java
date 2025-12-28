package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class aeq {

    /* renamed from: 櫯, reason: contains not printable characters */
    public final int f619;

    /* renamed from: 鷭, reason: contains not printable characters */
    public final byte[] f620;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public int f618 = 0;

    /* renamed from: ȃ, reason: contains not printable characters */
    public int f617 = 0;

    /* renamed from: Ą, reason: contains not printable characters */
    public int f613 = 0;

    /* renamed from: ą, reason: contains not printable characters */
    public int f614 = 0;

    /* renamed from: Ć, reason: contains not printable characters */
    public int f615 = 0;

    /* renamed from: ć, reason: contains not printable characters */
    public int f616 = 0;

    public aeq(int i, byte[] bArr, ael aelVar) {
        this.f619 = i;
        this.f620 = new byte[this.f619];
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final int m421(int i) {
        int i2 = (this.f617 - i) - 1;
        if (i >= this.f617) {
            i2 += this.f619;
        }
        return this.f620[i2] & 255;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m422(int i, int i2) throws aem {
        if (i < 0 || i >= this.f613) {
            throw new aem();
        }
        int iMin = Math.min(this.f614 - this.f617, i2);
        this.f615 = i2 - iMin;
        this.f616 = i;
        int i3 = (this.f617 - i) - 1;
        if (i >= this.f617) {
            i3 += this.f619;
        }
        do {
            byte[] bArr = this.f620;
            int i4 = this.f617;
            this.f617 = i4 + 1;
            int i5 = i3;
            i3++;
            bArr[i4] = this.f620[i5];
            if (i3 == this.f619) {
                i3 = 0;
            }
            iMin--;
        } while (iMin > 0);
        if (this.f613 < this.f617) {
            this.f613 = this.f617;
        }
    }
}
