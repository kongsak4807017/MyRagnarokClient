package o;

import java.util.Arrays;

/* renamed from: o.듦, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1030 {

    /* renamed from: 鷭, reason: contains not printable characters */
    float[] f8560 = {999999.0f, 999999.0f, 999999.0f};

    /* renamed from: 櫯, reason: contains not printable characters */
    float[] f8559 = {-999999.0f, -999999.0f, -999999.0f};

    /* renamed from: ˮ͈, reason: contains not printable characters */
    float[] f8558 = new float[3];

    /* renamed from: ȃ, reason: contains not printable characters */
    float[] f8557 = new float[3];

    C1030() {
    }

    /* renamed from: 鷭, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C1030 clone() {
        C1030 c1030 = new C1030();
        c1030.f8560 = Arrays.copyOf(this.f8560, 3);
        c1030.f8559 = Arrays.copyOf(this.f8559, 3);
        c1030.f8558 = Arrays.copyOf(this.f8558, 3);
        c1030.f8557 = Arrays.copyOf(this.f8557, 3);
        return c1030;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final void m1608() {
        for (int i = 0; i < 3; i++) {
            if (this.f8560[i] > this.f8559[i]) {
                float f = this.f8560[i];
                this.f8560[i] = this.f8559[i];
                this.f8559[i] = f;
            }
            this.f8558[i] = (this.f8559[i] - this.f8560[i]) / 2.0f;
            this.f8557[i] = this.f8560[i] + this.f8558[i];
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1610(float[] fArr) {
        for (int i = 0; i < 3; i++) {
            if (this.f8560[i] > fArr[i + 0]) {
                this.f8560[i] = fArr[i + 0];
            }
            if (this.f8559[i] < fArr[i + 0]) {
                this.f8559[i] = fArr[i + 0];
            }
        }
    }
}
