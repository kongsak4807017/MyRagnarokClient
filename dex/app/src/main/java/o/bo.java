package o;

import android.graphics.Point;
import android.util.Log;
import java.util.HashMap;
import o.pj;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class bo extends iw {
    bo() {
        super("c_proc_thread");
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m469(boolean[] zArr) throws InterruptedException {
        while (!zArr[0]) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                Log.e("AndRO", e.toString());
                RuntimeException runtimeException = new RuntimeException(e.toString());
                runtimeException.setStackTrace(e.getStackTrace());
                throw runtimeException;
            }
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private static void m467(boolean[] zArr) throws InterruptedException {
        m469(zArr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m471(og ogVar, String str, short s, short s2) throws IllegalStateException, InterruptedException {
        C1035 c1035;
        C0358.f6671.m456(true);
        C0358.f6668.f6712 = str;
        boolean[] zArr = new boolean[1];
        if (C0358.f6669 == null) {
            C0358.f6685.mo139(new bp(this, zArr));
            m469(zArr);
        }
        mg mgVar = C0358.f6669.f2048.f1551;
        if (mgVar != null) {
            C1035 c10352 = mgVar.f2110;
            Point point = new Point(s, s2);
            int i = point.x;
            int i2 = point.y;
            c10352.f2002 = i;
            c10352.f1999 = i2;
            c10352.f2000.x = 0;
            c10352.f2000.y = 0;
            mgVar.f2110.m1566(false);
            mgVar.f2110.f815 = false;
        }
        zArr[0] = false;
        C0358.f6674.mo139(new bx(this, zArr));
        m467(zArr);
        String str2 = null;
        if (C0358.f6669.f2063 == null || !C0358.f6669.f2063.f6887.equals(str)) {
            str2 = C0358.f6669.f2063 == null ? null : C0358.f6669.f2063.f6887;
            m468(str);
            if (mgVar != null) {
                zArr[0] = false;
                C0358.f6685.mo139(new by(this, mgVar, zArr));
                m467(zArr);
            }
        }
        if (mgVar == null) {
            c1035 = new C1035(ogVar, C0358.f6688.f6689, s, s2);
        } else {
            c1035 = mgVar.f2110;
        }
        ln lnVar = C0358.f6664;
        C1035 c10353 = c1035;
        lnVar.f2005.put(c10353.f1998, c10353);
        lnVar.f2004 = c10353;
        if (mgVar == null) {
            AbstractC0689 abstractC0689M856 = mj.m856(c1035);
            mgVar = (mg) (mg.class.isAssignableFrom(abstractC0689M856.getClass()) ? abstractC0689M856 : null);
        }
        C0358.f6669.f2048.f1545.put(Integer.valueOf(C0358.f6688.f6689), mgVar);
        C0358.f6669.f2048.f1551 = mgVar;
        C0358.f6674.mo139(new bz(this));
        if (C0358.f6669.f2063.f6881 != null) {
            C0358.f6669.f2063.f6881.m1368();
            C0358.f6669.f2063.f6881.f7257.m1469(new Point(mgVar.f2110.f2002, mgVar.f2110.f1999));
        }
        C0358.f6669.f2057.m1658();
        if (!C0358.f6669.f2063.f6887.equals(str2)) {
            C0358.f6669.f2057.m1657();
        }
        C0358.f6671.mo454(new C0162());
        C0358.f6671.m456(false);
        if (C0358.f6667.f4771 == pj.aux.iRO_Renewal) {
            C0358.f6671.mo454(new wr());
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m468(String str) throws IllegalStateException, InterruptedException {
        boolean[] zArr = new boolean[1];
        C0358.f6674.mo139(new ca(this));
        je jeVar = C0358.f6674.f42;
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Loading map"));
        if (C0358.f6667.f4776 == pj.EnumC0074.AEGIS) {
            C0358.f6671.f758 = false;
        }
        if (C0358.f6669.f2066 != null && C0358.f6669.f2066.f7974 != null) {
            C0358.f6669.f2066.f7974 = null;
        }
        m470();
        C0358.f6669.f2066 = null;
        zArr[0] = false;
        C0358.f6674.mo139(new cc(this, zArr));
        m469(zArr);
        zArr[0] = false;
        C0358.f6685.mo139(new cd(this, zArr));
        m469(zArr);
        cv cvVar = C0358.f6685;
        String strM1461 = C0776.m1461(str);
        String str2 = String.valueOf(oc.f3248 ? "AI/USER_AI/" : "AI/") + "AI.lua";
        String str3 = String.valueOf(oc.f3248 ? "AI/USER_AI/" : "AI/") + "Const.lua";
        String str4 = String.valueOf(oc.f3248 ? "AI/USER_AI/" : "AI/") + "Util.lua";
        zArr[0] = false;
        C0358.f6685.mo139(new cf(this, str, strM1461, str2, str3, str4, zArr));
        m467(zArr);
        C0358.f6663.m1534(String.valueOf(oc.f3240) + "/" + strM1461);
        zArr[0] = false;
        C0358.f6674.mo139(new cg(this, zArr));
        m467(zArr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m470() throws IllegalStateException, InterruptedException {
        boolean[] zArr = new boolean[1];
        if (C0358.f6669 == null || C0358.f6669.f2063 == null) {
            return;
        }
        C0358 c0358 = C0358.f6688;
        if (C0358.m1298()) {
            C0358.f6674.mo139(new br(this, zArr));
            m469(zArr);
        }
        C0919 c0919 = C0358.f6663;
        if (c0919.f8213.isPlaying()) {
            c0919.f8213.pause();
            c0919.f8212 = true;
        }
        C0358.f6663.m1533();
        zArr[0] = false;
        C0851 c0851 = C0358.f6669.f2066;
        bs bsVar = new bs(this, zArr);
        synchronized (c0851) {
            c0851.f7979.add(bsVar);
        }
        m469(zArr);
        cv.f1006 = new HashMap<>();
        cv.f1007 = new HashMap<>();
        zArr[0] = false;
        C0358.f6685.mo139(new bt(this, zArr));
        m467(zArr);
        zArr[0] = false;
        C0358.f6674.mo139(new bu(this, zArr));
        m467(zArr);
    }
}
