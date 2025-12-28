package o;

import android.graphics.Point;
import com.roworkshop.andro.c_point;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class mm extends mc {

    /* renamed from: ē, reason: contains not printable characters */
    c_point f2135 = new c_point();

    /* renamed from: 纫, reason: contains not printable characters */
    mj f2136;

    mm(mj mjVar, hs hsVar, c_point c_pointVar) {
        this.f2136 = mjVar;
        this.f2135.set(((Point) c_pointVar).x, ((Point) c_pointVar).y);
        super.m826(hsVar, new Point(mjVar.f2123.f2002, mjVar.f2123.f1999), mjVar.f2123.f2000);
    }

    @Override // o.mc
    /* renamed from: ˮ͈ */
    final void mo825() {
        if (this.f2136 == null) {
            return;
        }
        this.f2077.set(this.f2136.f2123.f2002, this.f2136.f2123.f1999);
        this.f2074.set(this.f2136.f2123.f2000.x, this.f2136.f2123.f2000.y);
    }

    @Override // o.mc
    /* renamed from: ȃ */
    final void mo824() {
        super.mo824();
        this.f2076.f2020 += this.f2135.x;
        this.f2076.f2019 += this.f2135.y;
    }
}
