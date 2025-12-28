package o;

import android.graphics.Point;
import com.roworkshop.andro.c_point;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class mn extends mc {

    /* renamed from: ċ, reason: contains not printable characters */
    byte f2137;

    /* renamed from: Ȋ, reason: contains not printable characters */
    mj f2139;

    /* renamed from: 纫, reason: contains not printable characters */
    int f2141;

    /* renamed from: 띥, reason: contains not printable characters */
    c_point f2142;

    /* renamed from: ē, reason: contains not printable characters */
    mw f2138 = mw.NUM8;

    /* renamed from: 㥳, reason: contains not printable characters */
    c_point f2140 = new c_point();

    mn(md mdVar, int i) {
        this.f2142 = new c_point();
        this.f2139 = mdVar;
        this.f2141 = i;
        lm lmVar = mdVar.f2123;
        byte b = ((AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null)).f8350;
        b = (b == -1 || b >= mw.valuesCustom().length) ? (byte) 0 : b;
        c_point c_pointVar = new c_point(this.f2139.f2123.f2002 - oa.f3230[b], this.f2139.f2123.f1999 - oa.f3229[b]);
        this.f2142 = c_pointVar;
        this.f2140.set(this.f2139.f2123.f2000.x, this.f2139.f2123.f2000.y);
        this.f2137 = AbstractC0988.m1559(m861());
        super.m826(C0358.f6669.f2048.f1552, c_pointVar, this.f2139.f2123.f2000);
        ou ouVar = this.f7632;
        ouVar.f3378 = 0.0f;
        ouVar.f3377 = 0.0f;
        ouVar.f3376 = 0.0f;
        ouVar.f3379 = 1.0f;
        C0358.f6685.mo139(new mo(this, i, mdVar));
    }

    /* renamed from: ą, reason: contains not printable characters */
    private c_point m861() {
        Point point = new Point((this.f2139.f2123.f2002 * 100) + this.f2139.f2123.f2000.x, (this.f2139.f2123.f1999 * 100) + this.f2139.f2123.f2000.y);
        Point point2 = new Point((this.f2077.x * 100) + this.f2074.x, (this.f2077.y * 100) + this.f2074.y);
        return new c_point(point.x - point2.x, point.y - point2.y);
    }

    @Override // o.mc
    /* renamed from: ˮ͈ */
    final void mo825() {
        c_point c_pointVarM861 = m861();
        double d = c_pointVarM861.x;
        double d2 = c_pointVarM861.y;
        int iSqrt = (int) Math.sqrt((d * d) + (d2 * d2));
        if (iSqrt > 100) {
            double d3 = 100.0d / iSqrt;
            c_pointVarM861.x = (int) (c_pointVarM861.x * d3);
            c_pointVarM861.y = (int) (c_pointVarM861.y * d3);
        }
        c_point c_pointVar = new c_point();
        Point point = new Point(this.f2139.f2123.f2002, this.f2139.f2123.f1999);
        c_point c_pointVar2 = this.f2139.f2123.f2000;
        c_pointVar.set((point.x * 100) + ((Point) c_pointVar2).x, (point.y * 100) + ((Point) c_pointVar2).y);
        c_pointVar.set(c_pointVar.x - ((Point) c_pointVarM861).x, c_pointVar.y - ((Point) c_pointVarM861).y);
        Point point2 = this.f2077;
        Point point3 = this.f2074;
        point2.x = ((Point) c_pointVar).x / 100;
        point3.x = ((Point) c_pointVar).x % 100;
        if (point3.x > 50) {
            point2.x++;
            point3.x -= 100;
        }
        point2.y = ((Point) c_pointVar).y / 100;
        point3.y = ((Point) c_pointVar).y % 100;
        if (point3.y > 50) {
            point2.y++;
            point3.y -= 100;
        }
        this.f2137 = AbstractC0988.m1559(m861());
    }
}
