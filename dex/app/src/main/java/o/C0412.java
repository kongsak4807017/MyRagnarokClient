package o;

import android.util.FloatMath;
import o.ui;

/* renamed from: o.ձ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0412 {

    /* renamed from: Ą, reason: contains not printable characters */
    C1030 f6796;

    /* renamed from: ą, reason: contains not printable characters */
    long f6797;

    /* renamed from: Ć, reason: contains not printable characters */
    long f6798;

    /* renamed from: ȃ, reason: contains not printable characters */
    float f6799;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    float f6800;

    /* renamed from: 櫯, reason: contains not printable characters */
    lr f6801;

    /* renamed from: 鷭, reason: contains not printable characters */
    String f6802;

    /* renamed from: 櫯, reason: contains not printable characters */
    private void m1321() {
        this.f6796 = new C1030();
        C1030 c1030 = this.f6796;
        lr lrVar = this.f6801;
        c1030.f8557 = new float[]{lrVar.f2020, lrVar.f2019, lrVar.f2018};
        this.f6796.f8559 = new float[]{this.f6796.f8557[0] + this.f6799, this.f6796.f8557[1] + this.f6799, this.f6796.f8557[2] + this.f6799};
        this.f6796.f8560 = new float[]{this.f6796.f8557[0] - this.f6799, this.f6796.f8557[1] - this.f6799, this.f6796.f8557[2] - this.f6799};
        this.f6796.m1608();
    }

    C0412(ui.aux auxVar) {
        this.f6802 = pa.m978(auxVar.f5203, ow.KOREAN);
        this.f6801 = new lr(auxVar.f5201[0], -auxVar.f5201[1], auxVar.f5201[2]);
        this.f6800 = auxVar.f5200;
        this.f6799 = auxVar.f5198;
        this.f6797 = (long) (auxVar.f5199 * 1000.0f);
        m1321();
        if (!C0358.f6663.f8211.containsKey(this.f6802)) {
            C0358.f6663.m1536(this.f6802, (byte[]) C0358.f6685.f1033.m519("data\\wav\\" + this.f6802, false));
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1322() {
        if (C0358.f6669.f2048.f1551 == null || C0358.f6669.f2048.f1551.f2076 == null) {
            return;
        }
        lr lrVar = C0358.f6669.f2048.f1551.f2076;
        lq lqVar = new lq(new lq(lrVar.f2020, lrVar.f2018));
        lr lrVar2 = this.f6801;
        lq lqVar2 = new lq(lrVar2.f2020, lrVar2.f2018);
        lqVar.f2017 -= lqVar2.f2017;
        lqVar.f2016 -= lqVar2.f2016;
        float fSqrt = 1.0f - (FloatMath.sqrt((lqVar.f2017 * lqVar.f2017) + (lqVar.f2016 * lqVar.f2016)) / this.f6799);
        if (fSqrt < 0.0f) {
            return;
        }
        C0358.f6663.m1535(this.f6802, this.f6800 * fSqrt);
        this.f6798 = System.currentTimeMillis();
    }
}
