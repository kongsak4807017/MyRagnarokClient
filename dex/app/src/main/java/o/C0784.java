package o;

import android.graphics.Point;
import android.opengl.Matrix;
import com.roworkshop.andro.c_point;
import o.iu;

/* renamed from: o.灶, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class C0784 extends co {

    /* renamed from: ȃ, reason: contains not printable characters */
    byte f7820;

    /* renamed from: 鷭, reason: contains not printable characters */
    C0539 f7823;

    /* renamed from: 櫯, reason: contains not printable characters */
    lq f7822 = new lq();

    /* renamed from: ˮ͈, reason: contains not printable characters */
    Point f7821 = new Point(0, 0);

    @Deprecated
    C0784() {
    }

    C0784(C0539 c0539, iu iuVar, String str, float f) {
        m1471(c0539, iuVar, str, 4.0f);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1471(C0539 c0539, iu iuVar, String str, float f) {
        c_point c_pointVar;
        this.f7823 = c0539;
        iu.Cif cif = iuVar.f1675.get(str);
        if (cif == null) {
            C0406 c0406M919 = od.m919(str, (byte[]) C0358.f6685.f1033.m519(str, false));
            iuVar.m692(c0406M919.f6789, c0406M919.f6788, c0406M919.f6787.x, c0406M919.f6787.y, str, null, iuVar.f1667);
            c_pointVar = c0406M919.f6787;
        } else {
            c_pointVar = new c_point(cif.f1684, cif.f1685);
        }
        this.f7822 = new lq(c_pointVar.x, c_pointVar.y);
        lq lqVar = this.f7822;
        float f2 = (((C0358.f6674.getResources().getDisplayMetrics().densityDpi / 160.0f) * 80.0f) / 512.0f) * f;
        lqVar.f2017 *= f2;
        lqVar.f2016 *= f2;
        m487(str, iuVar, c0539.m1367(new Point(0, 0)), this.f7822);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1470(Point point, byte b) {
        this.f7821 = point;
        this.f7820 = b;
        mo481();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1469(Point point) {
        this.f7821 = point;
        this.f7820 = (byte) 0;
        mo481();
    }

    @Override // o.co
    /* renamed from: 櫯 */
    final void mo481() {
        if (C0358.f6664.f2004 == null) {
            return;
        }
        lq lqVarM1367 = this.f7823.m1367(this.f7821);
        lq lqVar = this.f945;
        lqVar.f2017 = lqVarM1367.f2017;
        lqVar.f2016 = lqVarM1367.f2016;
        this.f951 = (C0358.f6664.f2004.f8350 * 3.1415927f) / 4.0f;
        super.mo481();
        float f = C0358.f6669.f2058.x;
        float f2 = C0358.f6669.f2058.y;
        C0753 c0753 = new C0753();
        Matrix.setIdentityM(c0753.f7745, 0);
        Matrix.translateM(c0753.f7745, 0, f, f2, 0.0f);
        if (C0358.f6669.f2051 != null) {
            this.f949 = C0753.m1451(C0358.f6669.f2051, c0753, this.f949);
        }
    }
}
