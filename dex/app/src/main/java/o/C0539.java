package o;

import android.graphics.Point;
import android.opengl.Matrix;
import java.util.HashMap;
import java.util.Iterator;
import o.aq;

/* renamed from: o.㯲, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0539 extends co {

    /* renamed from: ȃ, reason: contains not printable characters */
    C0784 f7257;

    /* renamed from: 鷭, reason: contains not printable characters */
    lq f7260 = new lq();

    /* renamed from: 櫯, reason: contains not printable characters */
    lq f7259 = new lq();

    /* renamed from: ˮ͈, reason: contains not printable characters */
    Point f7258 = new Point();

    /* renamed from: Ą, reason: contains not printable characters */
    HashMap<Integer, ar> f7255 = new HashMap<>();

    /* renamed from: ą, reason: contains not printable characters */
    HashMap<Integer, C0413> f7256 = new HashMap<>();

    /* renamed from: 鷭, reason: contains not printable characters */
    final lq m1367(Point point) {
        if (point == null) {
            return new lq();
        }
        lq lqVar = new lq();
        Point point2 = new Point(point.x - (this.f7258.x / 2), point.y - (this.f7258.y / 2));
        float fMax = Math.max(this.f7258.x, this.f7258.y) / this.f7259.f2017;
        float fMax2 = Math.max(this.f7258.x, this.f7258.y) / this.f7259.f2016;
        lqVar.f2017 = this.f7260.f2017 + (point2.x / fMax);
        lqVar.f2016 = this.f7260.f2016 + (point2.y / fMax2);
        return lqVar;
    }

    C0539(String str, iu iuVar, Point point) {
        String str2 = String.valueOf(C0358.f6685.f1030.f982.f8938.f8962) + "\\map\\" + (str.contains(".") ? str.split(".")[0] : str) + ".bmp";
        String str3 = "data\\texture\\" + (C0358.f6685.f1030.f969.f1071.get(str2) != null ? C0358.f6685.f1030.f969.f1071.get(str2) : str2);
        C0406 c0406M919 = od.m919(str3, (byte[]) C0358.f6685.f1033.m519(str3, false));
        iuVar.m692(c0406M919.f6789, c0406M919.f6788, c0406M919.f6787.x, c0406M919.f6787.y, str3, null, iuVar.f1667);
        lq lqVar = new lq(c0406M919.f6787.x / 512.0f, c0406M919.f6787.y / 512.0f);
        lq lqVar2 = this.f7259;
        float f = (C0358.f6674.getResources().getDisplayMetrics().densityDpi / 160.0f) * 80.0f * lqVar.f2017;
        float f2 = (C0358.f6674.getResources().getDisplayMetrics().densityDpi / 160.0f) * 80.0f * lqVar.f2016;
        lqVar2.f2017 = f;
        lqVar2.f2016 = f2;
        lq lqVar3 = this.f7260;
        float f3 = (-this.f7259.f2017) / 2.0f;
        float f4 = (-this.f7259.f2016) / 2.0f;
        lqVar3.f2017 = f3;
        lqVar3.f2016 = f4;
        m487(str3, iuVar, this.f7260, this.f7259);
        ou ouVar = this.f944;
        ouVar.f3378 = 1.0f;
        ouVar.f3377 = 1.0f;
        ouVar.f3376 = 1.0f;
        ouVar.f3379 = 0.5f;
        this.f7258.set(point.x, point.y);
        this.f7257 = new C0784(this, iuVar, "data\\texture\\" + C0358.f6685.f1030.f982.f8938.f8962 + "\\map\\map_arrow.bmp", 4.0f);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1369(int i, int i2, int i3, int i4) {
        if (C0358.f6669.f2063 == null || i4 < 0) {
            return;
        }
        ar arVar = this.f7255.get(Integer.valueOf(i));
        if (arVar == null) {
            arVar = new ar(this, i4);
            this.f7255 = (HashMap) this.f7255.clone();
            this.f7255.put(Integer.valueOf(i), arVar);
        }
        arVar.m1469(new Point(i2, i3));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1368() {
        if (C0358.f6664.f2004.f8596 == null) {
            return;
        }
        for (int i = 0; i < C0358.f6664.f2004.f8596.f684.length; i++) {
            aq.C0023 c0023 = C0358.f6664.f2004.f8596.f684[i];
            if (c0023.f689 && c0023.f694.equals(C0358.f6669.f2063.f6887) && c0023.f690 > 0 && c0023.f691 > 0) {
                m1369(c0023.f696, c0023.f690, c0023.f691, i);
            }
        }
    }

    @Override // o.co
    /* renamed from: 櫯 */
    final void mo481() {
        super.mo481();
        float f = C0358.f6669.f2058.x;
        float f2 = C0358.f6669.f2058.y;
        C0753 c0753 = new C0753();
        Matrix.setIdentityM(c0753.f7745, 0);
        Matrix.translateM(c0753.f7745, 0, f, f2, 0.0f);
        if (C0358.f6669.f2051 != null) {
            this.f949 = C0753.m1451(C0358.f6669.f2051, c0753, this.f949);
        }
        if (this.f7257 != null) {
            this.f7257.mo481();
        }
        Iterator<ar> it = this.f7255.values().iterator();
        while (it.hasNext()) {
            it.next().mo481();
        }
        Iterator<C0413> it2 = this.f7256.values().iterator();
        while (it2.hasNext()) {
            it2.next().mo481();
        }
    }
}
