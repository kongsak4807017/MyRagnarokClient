package o;

import android.graphics.Point;
import android.opengl.Matrix;
import com.roworkshop.andro.c_activity;
import com.roworkshop.andro.c_point;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import o.AbstractC0988;
import o.C0616.C0617;
import o.C0616.Cif;
import o.C1035;
import o.bj;
import o.hj;
import o.hs;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ly {

    /* renamed from: ć, reason: contains not printable characters */
    C0753 f2051;

    /* renamed from: ċ, reason: contains not printable characters */
    long f2052;

    /* renamed from: Ȋ, reason: contains not printable characters */
    public boolean f2056;

    /* renamed from: 岱, reason: contains not printable characters */
    public mj f2061;

    /* renamed from: 櫯, reason: contains not printable characters */
    public C0450 f2063;

    /* renamed from: 鷭, reason: contains not printable characters */
    C0851 f2066;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    C1157 f2057 = new C1157();

    /* renamed from: ȃ, reason: contains not printable characters */
    C0616 f2055 = new C0616();

    /* renamed from: Ą, reason: contains not printable characters */
    hu f2048 = new hu();

    /* renamed from: 䒧, reason: contains not printable characters */
    private C0753 f2060 = new C0753();

    /* renamed from: 躆, reason: contains not printable characters */
    private C0753 f2065 = new C0753();

    /* renamed from: ą, reason: contains not printable characters */
    C0753 f2049 = new C0753();

    /* renamed from: Ć, reason: contains not printable characters */
    C0753 f2050 = new C0753();

    /* renamed from: ܕ, reason: contains not printable characters */
    private C0753 f2059 = new C0753();

    /* renamed from: ˮ͍, reason: contains not printable characters */
    Point f2058 = new Point();

    /* renamed from: 庸, reason: contains not printable characters */
    private int f2062 = 2;

    /* renamed from: đ, reason: contains not printable characters */
    private lr[] f2053 = new lr[this.f2062];

    /* renamed from: Ē, reason: contains not printable characters */
    private Runnable f2054 = new lz(this);

    /* renamed from: 纫, reason: contains not printable characters */
    C0542 f2064 = null;

    ly() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final md m818(int i) {
        mj mjVar = this.f2048.f1545.get(Integer.valueOf(i));
        if (mjVar == null) {
            return null;
        }
        return (md) (md.class.isAssignableFrom(mjVar.getClass()) ? mjVar : null);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static lq m810(lr lrVar) {
        float[] fArr = new float[4];
        Matrix.multiplyMV(fArr, 0, C0358.f6669.f2050.f7745, 0, new float[]{lrVar.f2020, lrVar.f2019, lrVar.f2018, 1.0f}, 0);
        for (int i = 0; i < 3; i++) {
            fArr[i] = fArr[i] / fArr[3];
        }
        return new lq(fArr[0], fArr[1]);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final lq m814(lr lrVar) {
        lq lqVarM810 = m810(lrVar);
        if (lqVarM810 == null) {
            return null;
        }
        lqVarM810.f2017 += 1.0f;
        lqVarM810.f2016 += 1.0f;
        lqVarM810.f2017 /= 2.0f;
        lqVarM810.f2016 /= 2.0f;
        lqVarM810.f2017 *= this.f2058.x;
        lqVarM810.f2016 *= this.f2058.y;
        return lqVarM810;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final lr m817(int i, int i2, int i3, int i4) {
        lr lrVar = new lr();
        lrVar.f2020 = (-((((((i * 100) + i3) + 50) / 100.0f) / 2.0f) - (r0.f1655 / 2))) * this.f2063.f6872.f1662;
        lrVar.f2018 = ((((((i2 * 100) + i4) + 50) / 100.0f) / 2.0f) - (r5.f1656 / 2)) * this.f2063.f6872.f1662;
        lrVar.f2019 = this.f2063.m1339(lrVar.f2020, lrVar.f2018);
        return lrVar;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private C0787[] m813(long j) {
        synchronized (this.f2048.f1554) {
            int size = this.f2048.f1545.size();
            if (this.f2048.f1546 != null) {
                size++;
            }
            if (size == 0) {
                return null;
            }
            C0787[] c0787Arr = new C0787[size];
            int i = 0;
            if (this.f2048.f1546 != null) {
                bj bjVar = this.f2048.f1546;
                c0787Arr[0] = new C0787();
                c0787Arr[0].f7843 = bjVar;
                c0787Arr[0].f7834 = bjVar.f7632;
                int iMo462 = bjVar.mo462(j);
                if (iMo462 < 0) {
                    iMo462 = 0;
                }
                c0787Arr[0].f7832 = bjVar.mo840(iMo462);
                c0787Arr[0].f7824 = bjVar.f7637;
                i = 0 + 1;
            }
            for (mj mjVar : this.f2048.f1545.values()) {
                if (mjVar != null) {
                    lm lmVar = mjVar.f2123;
                    AbstractC0988 abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
                    if (abstractC0988 == null || ((abstractC0988.f8357 & 64) <= 0 && (abstractC0988.f8357 & 2) <= 0 && (abstractC0988.f8357 & 4) <= 0 && (abstractC0988.f8357 & 16384) <= 0)) {
                        hu huVar = this.f2048;
                        float f = this.f2057.f9041;
                        lm lmVar2 = mjVar.f2123;
                        mjVar.f2130 = huVar.m637(f, (AbstractC0988.class.isAssignableFrom(lmVar2.getClass()) ? lmVar2 : null) != null ? ((AbstractC0988) mjVar.f2123).f8350 : (byte) 0);
                        int i2 = mjVar.mo462(j);
                        if (i2 < 0) {
                            i2 = 0;
                        }
                        hs.C0049.C0050 c0050Mo840 = mjVar.mo840(i2);
                        float fM794 = new lr(mjVar.f2076).m793(new lr(this.f2057.f9035)).m794();
                        md mdVar = (md) (md.class.isAssignableFrom(mjVar.getClass()) ? mjVar : null);
                        if (mdVar != null && mdVar.f2098 != null) {
                            mdVar.f2098.f2138 = this.f2048.m637(this.f2057.f9041, mdVar.f2098.f2137);
                            if (mdVar.f2098.f7634 != mdVar.f2098.f2138.ordinal()) {
                                mdVar.f2098.m1423(mdVar.f2098.f2138.ordinal(), System.currentTimeMillis());
                            }
                        }
                        c0787Arr[i] = new C0787();
                        c0787Arr[i].f7832 = c0050Mo840;
                        c0787Arr[i].f7825 = fM794;
                        c0787Arr[i].f7843 = mjVar;
                        c0787Arr[i].f7824 = new C0753(Arrays.copyOf(mjVar.f7637.f7745, 16));
                        c0787Arr[i].f7840 = mjVar.f2128;
                        c0787Arr[i].f7834 = mjVar.f7632;
                        if (mdVar != null) {
                            c0787Arr[i].f7826 = mdVar.f2100;
                            c0787Arr[i].f7827 = mdVar.f2095;
                            c0787Arr[i].f7835 = mdVar.f2103;
                            c0787Arr[i].f7833 = mdVar.f2096;
                            if (mdVar == this.f2048.f1551) {
                                c0787Arr[i].f7838 = this.f2048.f1551.f2111;
                            }
                            if (mdVar.f2098 != null) {
                                float fM7942 = new lr(mdVar.f2098.f2076).m793(new lr(this.f2057.f9035)).m794();
                                C0787 c0787 = c0787Arr[i];
                                mn mnVar = mdVar.f2098;
                                c0787.f7836 = mnVar.mo840(mnVar.mo462(System.currentTimeMillis()));
                                c0787Arr[i].f7839 = mdVar.f2098.f7637;
                                c0787Arr[i].f7829 = fM7942;
                            }
                            if (mdVar.f2104 != null) {
                                C0787 c07872 = c0787Arr[i];
                                C0449 c0449 = mdVar.f2104;
                                c07872.f7828 = c0449.mo840(c0449.mo462(System.currentTimeMillis()));
                                c0787Arr[i].f7841 = mdVar.f2104.f7637;
                            }
                            if (mdVar.f2102 != null) {
                                C0787 c07873 = c0787Arr[i];
                                C0768 c0768 = mdVar.f2102;
                                c07873.f7837 = c0768.mo840(c0768.mo462(System.currentTimeMillis()));
                                c0787Arr[i].f7842 = mdVar.f2102.f7637;
                            }
                        }
                        if (mjVar.f2131 != null) {
                            C0787 c07874 = c0787Arr[i];
                            iq iqVar = mjVar.f2131;
                            c07874.f7831 = iqVar.mo840(iqVar.mo462(System.currentTimeMillis()));
                            c0787Arr[i].f7844 = mjVar.f2131.f7637;
                            c0787Arr[i].f7830 = this.f2056 ? iq.f1653 : iq.f1654;
                        }
                        i++;
                    }
                }
            }
            if (c0787Arr.length != i) {
                c0787Arr = (C0787[]) Arrays.copyOf(c0787Arr, i);
            }
            Arrays.sort(c0787Arr, new ma(this));
            return c0787Arr;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private mj m811(Point point) {
        for (mj mjVar : this.f2048.f1545.values()) {
            if (mjVar.m857() && mjVar.f2123.f2002 == point.x && mjVar.f2123.f1999 == point.y) {
                return mjVar;
            }
        }
        return null;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m820(float f, float f2, boolean z) {
        if (this.f2050 == null) {
            return;
        }
        float f3 = ((f - (this.f2058.x / 2)) / this.f2058.x) * 2.0f;
        float f4 = ((f2 - (this.f2058.y / 2)) / this.f2058.y) * (-2.0f);
        float[] fArr = new float[16];
        if (!Matrix.invertM(fArr, 0, this.f2050.f7745, 0)) {
            nz.m907("Matrix can't be inverted");
            return;
        }
        float[] fArr2 = {f3, f4, 0.0f, 1.0f};
        float[] fArr3 = new float[4];
        Matrix.multiplyMV(fArr3, 0, new C0753(fArr).f7745, 0, fArr2, 0);
        lr lrVar = new lr(fArr3[0] / fArr3[3], fArr3[1] / fArr3[3], fArr3[2] / fArr3[3]);
        fArr2[2] = 0.1f;
        Matrix.multiplyMV(fArr3, 0, new C0753(fArr).f7745, 0, fArr2, 0);
        lr lrVarM793 = new lr(new lr(fArr3[0] / fArr3[3], fArr3[1] / fArr3[3], fArr3[2] / fArr3[3])).m793(lrVar);
        lrVarM793.m792();
        lrVarM793.f2020 *= 1.0f;
        lrVarM793.f2019 *= 1.0f;
        lrVarM793.f2018 *= 1.0f;
        int i = (int) (oc.f3233 / 1.0f);
        if (this.f2053 == null || this.f2053.length != i) {
            this.f2053 = new lr[i];
        }
        for (int i2 = 0; i2 < this.f2053.length; i2++) {
            lr[] lrVarArr = this.f2053;
            lr lrVar2 = new lr(lrVarM793);
            float f5 = i2;
            lrVar2.f2020 *= f5;
            lrVar2.f2019 *= f5;
            lrVar2.f2018 *= f5;
            lrVarArr[i2] = lrVar2.m795(lrVar);
        }
        lq lqVar = new lq();
        if (this.f2063 == null || this.f2063.f6872 == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f2053.length) {
                break;
            }
            lr lrVar3 = this.f2053[i3];
            lqVar.f2017 = ((r9.f1655 / 2) - (lrVar3.f2020 / this.f2063.f6872.f1662)) * 2.0f;
            lqVar.f2016 = ((r9.f1656 / 2) + (lrVar3.f2018 / this.f2063.f6872.f1662)) * 2.0f;
            if (this.f2063.m1339(lrVar3.f2020, lrVar3.f2018) < lrVar3.f2019) {
                i3++;
            } else if (i3 > 0) {
                lr lrVar4 = this.f2053[i3 - 1];
                lqVar.f2017 = ((r9.f1655 / 2) - (lrVar4.f2020 / this.f2063.f6872.f1662)) * 2.0f;
                lqVar.f2016 = ((r9.f1656 / 2) + (lrVar4.f2018 / this.f2063.f6872.f1662)) * 2.0f;
            }
        }
        if (i3 == this.f2053.length) {
            return;
        }
        Point point = new Point((int) lqVar.f2017, (int) lqVar.f2016);
        if (C0358.f6664 == null || C0358.f6664.f2004 == null || this.f2048.f1551 == null) {
            return;
        }
        c_point c_pointVar = new c_point(point);
        mj mjVarM811 = m811(point);
        if (mjVarM811 == null && !z) {
            for (int i4 = point.x - 1; i4 <= point.x + 1; i4++) {
                for (int i5 = point.y - 1; i5 <= point.y + 1; i5++) {
                    if (i4 != point.x || i5 != point.y) {
                        c_pointVar.set(i4, i5);
                        mjVarM811 = m811(c_pointVar);
                        if (mjVarM811 != null && (mjVarM811 != this.f2048.f1551 || C0358.f6674.f42.f1822 != null)) {
                            break;
                        } else {
                            mjVarM811 = null;
                        }
                    }
                }
                if (mjVarM811 != null) {
                    break;
                }
            }
        }
        if (this.f2048.f1551.f2111 != null) {
            C0358.f6671.mo454(new C0739());
            this.f2048.f1551.f2111 = null;
        }
        if (C0358.f6674.f42.f1822 != null) {
            if ((C0358.f6674.f42.f1822.f1408 & 2) != 0) {
                if (!this.f2048.f1551.m852(0, point.x, point.y, C0358.f6674.f42.f1822.f1404, C0358.f6674.f42.f1822.f1409, C0358.f6674.f42.f1822.f1407)) {
                    if (C0358.f6674.f42.f1800.f1478 == hj.EnumC0047.SKILL_HOMUN && C0358.f6664.f2004.f8618 != null) {
                        C0358.f6664.f2004.f8618.f8654 = nc.SKILL_AREA_CMD;
                        C0358.f6664.f2004.f8618.f8649 = point.x;
                        C0358.f6664.f2004.f8618.f8650 = point.y;
                        C1095 c1095 = C0358.f6685.f1030.f979;
                        nu nuVar = nu.HOM;
                        ln lnVar = C0358.f6664;
                        c1095.m1631(nuVar);
                        C0358.f6664.f2004.f8618.f8654 = nc.NONE_CMD;
                    } else {
                        C0358.f6671.mo454(new C0889(C0358.f6674.f42.f1822.f1409, C0358.f6674.f42.f1822.f1407, point.x, point.y));
                    }
                }
                C0358.f6674.f42.m718();
                return;
            }
        }
        if (mjVarM811 != null && (mjVarM811.f2126 != mv.DEAD || (C0358.f6674.f42.f1822 != null && C0358.f6674.f42.f1822.f1409 == 54))) {
            this.f2048.f1551.m851(mjVarM811, (AbstractC0988.C0992) null);
            return;
        }
        if (this.f2056) {
            m809();
        }
        if (!C0358.f6674.f42.f1814 && !C0358.f6674.f42.f1805) {
            if (!C0358.f6664.f2004.f815) {
                if (!this.f2063.f6883.m1340(this.f2063, point)) {
                    this.f2063.f6883.f6893 = false;
                    return;
                } else {
                    C0358.f6671.mo454(new C0427((short) this.f2063.f6883.f6895.x, (short) this.f2063.f6883.f6895.y));
                    return;
                }
            }
            this.f2048.f1551.m850(new c_point(point));
            return;
        }
        if (C0358.f6674.f42.f1814 && C0358.f6664.f2004.f8618 != null) {
            if (!this.f2063.f6883.m1340(this.f2063, point)) {
                this.f2063.f6883.f6893 = false;
                return;
            }
            m812(C0358.f6664.f2004.f8618);
            C0358.f6664.f2004.f8618.f8654 = nc.MOVE_CMD;
            C1095 c10952 = C0358.f6685.f1030.f979;
            nu nuVar2 = nu.HOM;
            ln lnVar2 = C0358.f6664;
            c10952.m1631(nuVar2);
            return;
        }
        if (C0358.f6674.f42.f1805 && C0358.f6664.f2004.f8632 != null) {
            if (!this.f2063.f6883.m1340(this.f2063, point)) {
                this.f2063.f6883.f6893 = false;
                return;
            }
            m812(C0358.f6664.f2004.f8632);
            C0358.f6664.f2004.f8632.f8654 = nc.MOVE_CMD;
            C1095 c10953 = C0358.f6685.f1030.f979;
            nu nuVar3 = nu.MER;
            ln lnVar3 = C0358.f6664;
            c10953.m1631(nuVar3);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m812(C1035.Cif cif) {
        cif.f8649 = this.f2063.f6883.f6895.x;
        cif.f8650 = this.f2063.f6883.f6895.y;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m819() {
        C0542 c0542;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f2063 == null) {
            return;
        }
        if (this.f2064 != null) {
            c0542 = this.f2064;
            this.f2064 = null;
        } else {
            c0542 = new C0542();
        }
        c0542.f7267 = this.f2063;
        c0542.f7266 = this.f2048.f1554;
        if (this.f2066.f7970 == nh.NONE) {
            this.f2066.f7974 = c0542;
            return;
        }
        if (this.f2066.f7970 == nh.PREPARING) {
            return;
        }
        if (this.f2052 == 0) {
            this.f2052 = jCurrentTimeMillis;
        } else if (jCurrentTimeMillis - this.f2052 >= oc.f3244) {
            C0358.f6685.mo139(new mb(this));
            this.f2052 = jCurrentTimeMillis;
        }
        for (mj mjVar : this.f2048.f1545.values()) {
            if (mjVar != null) {
                mjVar.mo835(jCurrentTimeMillis);
            }
        }
        if (this.f2048.f1551 != null) {
            this.f2057.m1658();
        }
        float f = this.f2057.f9040;
        C0753 c0753 = new C0753();
        Matrix.setIdentityM(c0753.f7745, 0);
        Matrix.translateM(c0753.f7745, 0, 0.0f, 0.0f, f);
        float f2 = -this.f2057.f9031[0];
        float f3 = -this.f2057.f9031[1];
        float f4 = -this.f2057.f9031[2];
        C0753 c07532 = new C0753();
        Matrix.setIdentityM(c07532.f7745, 0);
        Matrix.translateM(c07532.f7745, 0, f2, f3, f4);
        this.f2060 = C0753.m1451(c0753, C0753.m1449(-0.7853982f, 1.0f, 0.0f, 0.0f), C0753.m1449((this.f2057.f9041 / 180.0f) * 3.1415927f, 0.0f, 1.0f, 0.0f), c07532);
        Matrix.setLookAtM(this.f2065.f7745, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f);
        this.f2050 = C0753.m1451(this.f2049, this.f2065, this.f2060);
        this.f2059 = C0753.m1451(C0753.m1449(((-this.f2057.f9041) / 180.0f) * 3.1415927f, 0.0f, 1.0f, 0.0f), C0753.m1449(0.7853982f, 1.0f, 0.0f, 0.0f));
        Matrix.multiplyMV(this.f2057.f9035, 0, this.f2050.f7745, 0, new float[]{this.f2057.f9031[0], this.f2057.f9031[1], this.f2057.f9031[2], 1.0f}, 0);
        if (this.f2057.f9036 || this.f2057.f9039) {
            if (C0358.f6663 != null && this.f2063.f6878 != null) {
                C0412[] c0412Arr = new C0412[this.f2063.f6878.length];
                C0412[] c0412Arr2 = this.f2055.f7472;
                int i = 0;
                int length = c0412Arr2 != null ? c0412Arr2.length : 0;
                if (this.f2048.f1551 != null && this.f2048.f1551.f2076 != null) {
                    for (C0412 c0412 : this.f2063.f6878) {
                        lr lrVar = this.f2048.f1551.f2076;
                        if (lrVar.f2020 >= c0412.f6796.f8557[0] - c0412.f6799 && lrVar.f2020 <= c0412.f6796.f8557[0] + c0412.f6799 && lrVar.f2019 >= c0412.f6796.f8557[1] - c0412.f6799 && lrVar.f2019 <= c0412.f6796.f8557[1] + c0412.f6799 && lrVar.f2018 >= c0412.f6796.f8557[2] - c0412.f6799 && lrVar.f2018 <= c0412.f6796.f8557[2] + c0412.f6799) {
                            int i2 = i;
                            i++;
                            c0412Arr[i2] = c0412;
                            int i3 = 0;
                            while (i3 < length && c0412Arr2[i3] != c0412) {
                                i3++;
                            }
                            if (i3 == length) {
                                c0412.m1322();
                            }
                        }
                    }
                }
                this.f2055.f7472 = (C0412[]) Arrays.copyOf(c0412Arr, i);
            }
            je jeVar = C0358.f6674.f42;
            if (jeVar.f1818 != null) {
                for (gq gqVar : jeVar.f1818) {
                    if (C0358.f6674.f44 != null) {
                        lq lqVarM814 = C0358.f6669.m814(C0358.f6669.m817(gqVar.f1374.f1388, gqVar.f1374.f1386, 0, 0));
                        if (lqVarM814.f2017 <= 0.0f || lqVarM814.f2017 >= C0358.f6669.f2058.x || lqVarM814.f2016 <= 0.0f || lqVarM814.f2016 >= C0358.f6669.f2058.y) {
                            gqVar.f1377.setVisibility(8);
                        } else {
                            gqVar.f1377.setVisibility(0);
                            lqVarM814.f2016 += gqVar.f1374.f1385;
                            c_point c_pointVar = new c_point((int) lqVarM814.f2017, (int) (C0358.f6674.f44.getHeight() - (lqVarM814.f2016 + ((C0358.f6674.getResources().getDisplayMetrics().densityDpi / 160.0f) * 45.0f))));
                            c_pointVar.y -= gqVar.f1373.y / 2;
                            c_activity c_activityVar = C0358.f6674;
                            je.m714(gqVar.f1377, c_pointVar, gqVar.f1373);
                        }
                    }
                }
            }
        }
        for (mj mjVar2 : this.f2048.f1545.values()) {
            if (mjVar2 != null) {
                if ((this.f2057.f9036 || this.f2057.f9039) || mjVar2.f2123.f2002 != mjVar2.f2124.x || mjVar2.f2123.f1999 != mjVar2.f2124.y || mjVar2.f2123.f2000.x != mjVar2.f2125.x || mjVar2.f2123.f2000.y != mjVar2.f2125.y) {
                    mjVar2.mo823();
                    mjVar2.f2124.set(mjVar2.f2123.f2002, mjVar2.f2123.f1999);
                    mjVar2.f2125.set(mjVar2.f2123.f2000.x, mjVar2.f2123.f2000.y);
                }
            }
        }
        Iterator<C1106> it = this.f2048.f1543.iterator();
        while (it.hasNext()) {
            if (it.next().m1634(jCurrentTimeMillis)) {
                it.remove();
            }
        }
        if (this.f2048.f1546 != null) {
            bj bjVar = this.f2048.f1546;
            if ((bjVar.f823 == bj.EnumC0025.SUCCESS || bjVar.f823 == bj.EnumC0025.FAIL) && jCurrentTimeMillis - bjVar.f824 > 2000) {
                this.f2048.f1546 = null;
            }
        }
        if (C0358.f6663 != null && this.f2055.f7472 != null) {
            for (C0412 c04122 : this.f2055.f7472) {
                if (c04122.f6797 != 0 && c04122.f6798 + c04122.f6797 < jCurrentTimeMillis) {
                    c04122.m1322();
                }
            }
        }
        int[] iArr = new int[this.f2048.f1545.size()];
        int i4 = 0;
        for (mj mjVar3 : this.f2048.f1545.values()) {
            if (mjVar3.f2126 == mv.DEAD && mjVar3.m1419(jCurrentTimeMillis) && mjVar3.f7632.f3379 == 0.0f && mjVar3.f2123.f1997 != nu.PC) {
                int i5 = i4;
                i4++;
                iArr[i5] = mjVar3.f2123.f1998;
            }
        }
        for (int i6 = 0; i6 < i4; i6++) {
            C0358 c0358 = C0358.f6688;
            C0358.m1306(iArr[i6]);
        }
        C1157 c1157 = this.f2057;
        float f5 = c1157.f9031[0] - c1157.f9032[0];
        float f6 = c1157.f9031[1] - c1157.f9032[1];
        float f7 = c1157.f9031[2] - c1157.f9032[2];
        if ((Math.sqrt((double) (((f5 * f5) + (f6 * f6)) + (f7 * f7))) > 5.0d || Math.abs(c1157.f9034 - c1157.f9041) > 1.0f) || this.f2057.f9039) {
            C0616 c0616 = this.f2055;
            ir irVar = this.f2063.f6872;
            lv lvVar = this.f2063.f6873;
            C0424[] c0424Arr = this.f2063.f6875;
            C1157 c11572 = this.f2057;
            int i7 = this.f2058.x;
            int i8 = this.f2058.y;
            c0616.m1398(irVar, lvVar, c0424Arr, c11572);
            this.f2057.f9032 = Arrays.copyOf(this.f2057.f9031, this.f2057.f9031.length);
            this.f2057.f9034 = this.f2057.f9041;
        }
        this.f2057.f9036 = false;
        this.f2057.f9039 = false;
        C0787[] c0787ArrM813 = m813(jCurrentTimeMillis);
        c0542.f7265 = this.f2055.clone();
        if (c0542.f7265.f7475 == null) {
            c0542.f7265.f7475 = c0542.f7265.new Cif();
            c0542.f7265.f7475.f7478 = this.f2063.f6872.f1663;
            c0542.f7265.f7475.f7477 = this.f2063.f6872.f1663.length;
        }
        if (c0542.f7265.f7474 == null) {
            c0542.f7265.f7474 = c0542.f7265.new Cif();
            c0542.f7265.f7474.f7478 = this.f2063.f6873.f2033;
            c0542.f7265.f7474.f7477 = this.f2063.f6873.f2033.length;
        }
        if (c0542.f7265.f7473 == null) {
            c0542.f7265.f7473 = c0542.f7265.new C0617();
            c0542.f7265.f7473.f7481 = this.f2063.f6875;
            c0542.f7265.f7473.f7480 = this.f2063.f6875.length;
        }
        c0542.f7264 = c0787ArrM813;
        c0542.f7261 = (LinkedList) this.f2048.f1543.clone();
        c0542.f7262 = new C0753(Arrays.copyOf(this.f2050.f7745, 16));
        c0542.f7263 = new C0753(Arrays.copyOf(this.f2059.f7745, 16));
        this.f2066.f7974 = c0542;
        if (C0358.f6664.f2004 != null) {
            if (C0358.f6664.f2004.f8618 != null && C0358.f6664.f2004.f8618.f8661.f8693 > 0) {
                C1095 c1095 = C0358.f6685.f1030.f979;
                nu nuVar = nu.HOM;
                ln lnVar = C0358.f6664;
                c1095.m1631(nuVar);
            }
            if (C0358.f6664.f2004.f8632 != null && C0358.f6664.f2004.f8632.f8661.f8693 > 0) {
                C1095 c10952 = C0358.f6685.f1030.f979;
                nu nuVar2 = nu.MER;
                ln lnVar2 = C0358.f6664;
                c10952.m1631(nuVar2);
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m821(mj mjVar, boolean z) {
        if (!mjVar.m857()) {
            return;
        }
        this.f2056 = z;
        if (this.f2061 != mjVar) {
            if (this.f2061 != null) {
                m816(this.f2061, false);
            }
            this.f2061 = mjVar;
            mj mjVar2 = this.f2061;
            if (mjVar2.f2131 == null) {
                mjVar2.f2131 = new iq(mjVar2);
            }
        }
        C0358.f6674.f42.m723();
        lm lmVar = mjVar.f2123;
        if (!((AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null) != null)) {
            if (mjVar.f2129 != null) {
                mjVar.f2129.m175(mjVar);
                return;
            } else {
                mjVar.f2129 = new a(mjVar);
                return;
            }
        }
        lm lmVar2 = mjVar.f2123;
        AbstractC0988 abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar2.getClass()) ? lmVar2 : null);
        if (abstractC0988.f8361 == AbstractC0988.Cif.UNRESOLVED) {
            abstractC0988.f8361 = AbstractC0988.Cif.RESOLVING;
            C0358.f6671.mo454(new C0958(abstractC0988.f1998));
        } else if (abstractC0988.f8361 == AbstractC0988.Cif.RESOLVED) {
            if (mjVar.f2129 != null) {
                mjVar.f2129.m175(mjVar);
            } else {
                mjVar.f2129 = new a(mjVar);
            }
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final void m816(mj mjVar, boolean z) {
        if (this.f2061 != mjVar) {
            return;
        }
        this.f2061.m858();
        this.f2061.f2131 = null;
        this.f2061 = null;
        C0358.f6664.f2004.f8360 = null;
        C0358.f6674.f42.m723();
        if (z) {
            m815();
        }
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private mj m809() {
        if (this.f2061 != null) {
            mj mjVar = this.f2061;
            m816(mjVar, true);
            return mjVar;
        }
        m815();
        return null;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final void m815() {
        c_point c_pointVar = new c_point(this.f2063.f6876.f5057 * 100, this.f2063.f6876.f5055 * 100);
        double d = c_pointVar.x;
        double d2 = c_pointVar.y;
        int iSqrt = (int) Math.sqrt((d * d) + (d2 * d2));
        mj mjVar = null;
        for (mj mjVar2 : this.f2048.f1545.values()) {
            if (mjVar2 != this.f2048.f1551) {
                lm lmVar = mjVar2.f2123;
                if ((AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null) != null) {
                    if (!((md) (md.class.isAssignableFrom(mjVar2.getClass()) ? mjVar2 : null)).f2101.f8371) {
                    }
                }
                if (mjVar2.m857() && mjVar2.f2123.f1997 != nu.MOB) {
                    c_point c_pointVar2 = new c_point((((mjVar2.f2123.f2002 * 100) + mjVar2.f2123.f2000.x) - (C0358.f6664.f2004.f2002 * 100)) - C0358.f6664.f2004.f2000.x, (((mjVar2.f2123.f1999 * 100) + mjVar2.f2123.f2000.y) - (C0358.f6664.f2004.f1999 * 100)) - C0358.f6664.f2004.f2000.y);
                    double d3 = c_pointVar2.x;
                    double d4 = c_pointVar2.y;
                    int iSqrt2 = (int) Math.sqrt((d3 * d3) + (d4 * d4));
                    if (iSqrt2 < iSqrt) {
                        iSqrt = iSqrt2;
                        mjVar = mjVar2;
                    }
                }
            }
        }
        if (mjVar != null) {
            m821(mjVar, false);
        }
    }
}
