package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ov {

    /* renamed from: ȃ, reason: contains not printable characters */
    public int f3380;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public int f3381;

    /* renamed from: 櫯, reason: contains not printable characters */
    public int f3382;

    /* renamed from: 鷭, reason: contains not printable characters */
    public int f3383;

    /* renamed from: 鷭, reason: contains not printable characters */
    public final ov m944(ov ovVar) {
        this.f3383 += ovVar.f3383;
        this.f3382 += ovVar.f3382;
        this.f3381 += ovVar.f3381;
        this.f3380 += ovVar.f3380;
        m941();
        return this;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m941() {
        if (this.f3383 > 255) {
            this.f3383 = 255;
        }
        if (this.f3382 > 255) {
            this.f3382 = 255;
        }
        if (this.f3381 > 255) {
            this.f3381 = 255;
        }
        if (this.f3380 > 255) {
            this.f3380 = 255;
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final ov m942(ov ovVar) {
        this.f3383 = ovVar.f3383;
        this.f3382 = ovVar.f3382;
        this.f3381 = ovVar.f3381;
        this.f3380 = ovVar.f3380;
        return this;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final ov m943(int i) {
        this.f3380 = (i >> 24) & 255;
        this.f3381 = (i >> 16) & 255;
        this.f3382 = (i >> 8) & 255;
        this.f3383 = i & 255;
        return this;
    }
}
