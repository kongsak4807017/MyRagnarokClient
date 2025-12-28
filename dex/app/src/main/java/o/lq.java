package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class lq {

    /* renamed from: 櫯, reason: contains not printable characters */
    public float f2016;

    /* renamed from: 鷭, reason: contains not printable characters */
    public float f2017;

    public lq() {
    }

    public lq(lq lqVar) {
        this.f2017 = lqVar.f2017;
        this.f2016 = lqVar.f2016;
    }

    public lq(float f, float f2) {
        this.f2017 = f;
        this.f2016 = f2;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final float m791() {
        if (this.f2017 == 0.0f) {
            if (this.f2016 == 0.0f) {
                return 0.0f;
            }
            if (this.f2016 > 0.0f) {
                return 1.5707964f;
            }
            if (this.f2016 < 0.0f) {
                return -1.5707964f;
            }
        }
        float fAtan = (float) Math.atan(this.f2016 / this.f2017);
        if (this.f2017 > 0.0f) {
            return fAtan;
        }
        return 3.1415927f + fAtan;
    }
}
