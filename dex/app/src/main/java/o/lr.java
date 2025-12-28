package o;

import android.util.FloatMath;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class lr {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public float f2018;

    /* renamed from: 櫯, reason: contains not printable characters */
    public float f2019;

    /* renamed from: 鷭, reason: contains not printable characters */
    public float f2020;

    lr() {
    }

    lr(float[] fArr) {
        this(fArr, 0);
    }

    private lr(float[] fArr, int i) {
        this.f2020 = fArr[0];
        this.f2019 = fArr[1];
        this.f2018 = fArr[2];
    }

    lr(lr lrVar) {
        this.f2020 = lrVar.f2020;
        this.f2019 = lrVar.f2019;
        this.f2018 = lrVar.f2018;
    }

    lr(float f, float f2, float f3) {
        this.f2020 = f;
        this.f2019 = f2;
        this.f2018 = f3;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final lr m795(lr lrVar) {
        this.f2020 += lrVar.f2020;
        this.f2019 += lrVar.f2019;
        this.f2018 += lrVar.f2018;
        return this;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final float m794() {
        return FloatMath.sqrt((this.f2020 * this.f2020) + (this.f2019 * this.f2019) + (this.f2018 * this.f2018));
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final lr m792() {
        float fM794 = 1.0f / m794();
        this.f2020 *= fM794;
        this.f2019 *= fM794;
        this.f2018 *= fM794;
        return this;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final lr m793(lr lrVar) {
        this.f2020 -= lrVar.f2020;
        this.f2019 -= lrVar.f2019;
        this.f2018 -= lrVar.f2018;
        return this;
    }
}
