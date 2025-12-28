package o;

import android.graphics.Point;
import android.util.FloatMath;
import com.roworkshop.andro.c_point;
import java.util.HashMap;
import java.util.Iterator;
import o.C0972;
import o.el;

/* renamed from: o.귊, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class AbstractC0988 extends lm {

    /* renamed from: 廅, reason: contains not printable characters */
    private static /* synthetic */ int[] f8342;

    /* renamed from: Ą, reason: contains not printable characters */
    int f8343;

    /* renamed from: ą, reason: contains not printable characters */
    int f8344;

    /* renamed from: Ć, reason: contains not printable characters */
    int f8345;

    /* renamed from: ć, reason: contains not printable characters */
    int f8346;

    /* renamed from: ċ, reason: contains not printable characters */
    int f8347;

    /* renamed from: đ, reason: contains not printable characters */
    int f8348;

    /* renamed from: Ē, reason: contains not printable characters */
    int f8349;

    /* renamed from: ē, reason: contains not printable characters */
    byte f8350;

    /* renamed from: Ė, reason: contains not printable characters */
    HashMap<nt, el.C0035> f8351;

    /* renamed from: ė, reason: contains not printable characters */
    int f8352;

    /* renamed from: Ę, reason: contains not printable characters */
    C0990 f8353;

    /* renamed from: ę, reason: contains not printable characters */
    C0991 f8354;

    /* renamed from: ȃ, reason: contains not printable characters */
    int f8355;

    /* renamed from: Ȋ, reason: contains not printable characters */
    int f8356;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    int f8357;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    int f8358;

    /* renamed from: ܕ, reason: contains not printable characters */
    String f8359;

    /* renamed from: ঽ্, reason: contains not printable characters */
    C0992 f8360;

    /* renamed from: 㥳, reason: contains not printable characters */
    Cif f8361;

    /* renamed from: 䒧, reason: contains not printable characters */
    String f8362;

    /* renamed from: 囃, reason: contains not printable characters */
    aux f8363;

    /* renamed from: 岱, reason: contains not printable characters */
    int f8364;

    /* renamed from: 庸, reason: contains not printable characters */
    int f8365;

    /* renamed from: 廂, reason: contains not printable characters */
    C0989 f8366;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f8367;

    /* renamed from: 纫, reason: contains not printable characters */
    String f8368;

    /* renamed from: 躆, reason: contains not printable characters */
    String f8369;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f8370;

    /* renamed from: 띥, reason: contains not printable characters */
    boolean f8371;

    /* renamed from: o.귊$if, reason: invalid class name */
    enum Cif {
        UNRESOLVED,
        RESOLVING,
        RESOLVED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Cif[] valuesCustom() {
            Cif[] cifArrValuesCustom = values();
            int length = cifArrValuesCustom.length;
            Cif[] cifArr = new Cif[length];
            System.arraycopy(cifArrValuesCustom, 0, cifArr, 0, length);
            return cifArr;
        }
    }

    /* renamed from: o.귊$櫯, reason: contains not printable characters */
    enum EnumC0993 {
        POSITION_CHANGED,
        POSITION_UNCHANGED,
        FINISHED_WALKING;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0993[] valuesCustom() {
            EnumC0993[] enumC0993ArrValuesCustom = values();
            int length = enumC0993ArrValuesCustom.length;
            EnumC0993[] enumC0993Arr = new EnumC0993[length];
            System.arraycopy(enumC0993ArrValuesCustom, 0, enumC0993Arr, 0, length);
            return enumC0993Arr;
        }
    }

    /* renamed from: o.귊$鷭, reason: contains not printable characters */
    enum EnumC0994 {
        NONE,
        DEAD,
        SIT;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0994[] valuesCustom() {
            EnumC0994[] enumC0994ArrValuesCustom = values();
            int length = enumC0994ArrValuesCustom.length;
            EnumC0994[] enumC0994Arr = new EnumC0994[length];
            System.arraycopy(enumC0994ArrValuesCustom, 0, enumC0994Arr, 0, length);
            return enumC0994Arr;
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private static /* synthetic */ int[] m1557() {
        int[] iArr = f8342;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[nu.valuesCustom().length];
        try {
            iArr2[nu.ALL.ordinal()] = 12;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[nu.CHAT.ordinal()] = 10;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[nu.ELEM.ordinal()] = 11;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[nu.HOM.ordinal()] = 5;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[nu.ITEM.ordinal()] = 7;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[nu.MER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[nu.MOB.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[nu.NPC.ordinal()] = 9;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[nu.NUL.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[nu.PC.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[nu.PET.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[nu.SKILL.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        f8342 = iArr2;
        return iArr2;
    }

    /* renamed from: o.귊$Ć, reason: contains not printable characters */
    class C0990 {

        /* renamed from: Ą, reason: contains not printable characters */
        long f8391;

        /* renamed from: ą, reason: contains not printable characters */
        long f8392;

        /* renamed from: ȃ, reason: contains not printable characters */
        int f8395;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f8397;

        /* renamed from: 櫯, reason: contains not printable characters */
        byte f8400;

        /* renamed from: 鷭, reason: contains not printable characters */
        lu f8401;

        /* renamed from: Ć, reason: contains not printable characters */
        c_point f8393 = new c_point();

        /* renamed from: ć, reason: contains not printable characters */
        c_point f8394 = new c_point();

        /* renamed from: ˮ͍, reason: contains not printable characters */
        c_point f8398 = new c_point();

        /* renamed from: 岱, reason: contains not printable characters */
        c_point f8399 = new c_point();

        C0990() {
        }
    }

    /* renamed from: o.귊$ȃ, reason: contains not printable characters */
    class C0991 {

        /* renamed from: Ą, reason: contains not printable characters */
        short f8402;

        /* renamed from: ą, reason: contains not printable characters */
        int f8403;

        /* renamed from: Ć, reason: contains not printable characters */
        long f8404;

        /* renamed from: ȃ, reason: contains not printable characters */
        int f8406;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f8407;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f8408;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f8409;

        C0991() {
        }
    }

    /* renamed from: o.귊$Ą, reason: contains not printable characters */
    class C0989 {

        /* renamed from: ȃ, reason: contains not printable characters */
        int f8387;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        long f8388;

        /* renamed from: 櫯, reason: contains not printable characters */
        long f8389;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f8390;

        C0989() {
        }
    }

    /* renamed from: o.귊$aux */
    class aux {

        /* renamed from: Ą, reason: contains not printable characters */
        int f8372;

        /* renamed from: ą, reason: contains not printable characters */
        int f8373;

        /* renamed from: Ć, reason: contains not printable characters */
        int f8374;

        /* renamed from: ć, reason: contains not printable characters */
        int f8375;

        /* renamed from: ȃ, reason: contains not printable characters */
        int f8376;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        Point f8377;

        /* renamed from: ˮ͍, reason: contains not printable characters */
        long f8378;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f8380;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f8381;

        aux() {
        }
    }

    /* renamed from: o.귊$ˮ͈, reason: contains not printable characters */
    class C0992 {

        /* renamed from: Ą, reason: contains not printable characters */
        int f8410;

        /* renamed from: ą, reason: contains not printable characters */
        int f8411;

        /* renamed from: ȃ, reason: contains not printable characters */
        int f8413;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f8414;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f8415;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f8416;

        C0992() {
        }
    }

    AbstractC0988(og ogVar, int i, int i2, int i3) {
        super(nu.PC, i, ogVar.f3287, i2, i3, 0, 0);
        this.f8371 = false;
        this.f8361 = Cif.UNRESOLVED;
        this.f8351 = new HashMap<>();
        this.f8367 = ogVar.f3295;
        this.f8357 = ogVar.f3256;
        this.f8344 = ogVar.f3277;
        this.f8345 = ogVar.f3286;
        this.f8346 = ogVar.f3257;
        this.f8358 = ogVar.f3292;
        this.f8364 = ogVar.f3284;
        this.f8356 = ogVar.f3293;
        this.f8347 = ogVar.f3278;
        this.f8368 = pa.m978(ogVar.f3280, ow.LOCAL);
    }

    AbstractC0988() {
        this.f8371 = false;
        this.f8361 = Cif.UNRESOLVED;
        this.f8351 = new HashMap<>();
    }

    @Override // o.lm
    /* renamed from: 鷭 */
    void mo460(oj ojVar) {
        super.mo460(ojVar);
        this.f2001 = ojVar.f3304;
        this.f8367 = ojVar.f3331;
        this.f8355 = ojVar.f3301;
        this.f8343 = ojVar.f3302;
        this.f8357 = ojVar.f3303;
        this.f8344 = ojVar.f3309;
        this.f8345 = ojVar.f3336;
        this.f8347 = ojVar.f3315;
        this.f8350 = (byte) ojVar.f3312;
        this.f8348 = ojVar.f3307;
        this.f8349 = ojVar.f3308;
        this.f8346 = ojVar.f3313;
        this.f8358 = ojVar.f3317;
        this.f1998 = ojVar.f3332;
        if ((EnumC0994.DEAD.ordinal() & ojVar.f3322) != 0) {
            m1566(true);
        } else {
            m1566(false);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1566(boolean z) {
        this.f8371 = z;
        if (z) {
            this.f2003 = nl.MOTION_DEAD;
            this.f8353 = null;
            this.f8354 = null;
            if (C0358.f6664.f2004.f8618 != null) {
                C1095 c1095 = C0358.f6685.f1030.f979;
                nu nuVar = nu.HOM;
                ln lnVar = C0358.f6664;
                c1095.m1631(nuVar);
            }
            if (C0358.f6664.f2004.f8632 != null) {
                C1095 c10952 = C0358.f6685.f1030.f979;
                nu nuVar2 = nu.MER;
                ln lnVar2 = C0358.f6664;
                c10952.m1631(nuVar2);
            }
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final void m1560(boolean z) {
        this.f8354 = null;
        this.f8353 = null;
        if (!z) {
            this.f8366 = null;
        }
        this.f8363 = null;
        this.f2000.x = 0;
        this.f2000.y = 0;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final boolean m1568(ue ueVar, int i, int i2, int i3, int i4, long j) {
        lu luVar = new lu();
        lu luVar2 = new lu();
        m1560(true);
        if (this.f1997 == nu.PC) {
            ((bh) (bh.class.isAssignableFrom(getClass()) ? this : null)).f816 = (short) 0;
        }
        if (!oa.m912(luVar, i, i2, i3, i4, false, ueVar)) {
            return false;
        }
        if (!oa.m912(luVar2, this.f2002, this.f1999, i3, i4, false, ueVar)) {
            this.f2002 = i;
            this.f1999 = i2;
            this.f2000.x = 0;
            this.f2000.y = 0;
            luVar2 = luVar;
        }
        this.f8353 = new C0990();
        this.f8353.f8391 = System.currentTimeMillis();
        double dM802 = 1.0d / (luVar2.m802() / ((luVar.m802() / (1.0d / this.f8347)) - (System.currentTimeMillis() - j)));
        this.f8353.f8401 = luVar2;
        this.f8353.f8395 = dM802 > 0.0d ? (int) dM802 : this.f8347;
        this.f8353.f8393.set(this.f2002, this.f1999);
        this.f8353.f8394.set(this.f2000.x, this.f2000.y);
        this.f8353.f8398.set(i, i2);
        this.f8353.f8399.set(i3, i4);
        return true;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1561(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f8360 = new C0992();
        this.f8360.f8416 = i;
        this.f8360.f8413 = i4;
        this.f8360.f8415 = i2;
        this.f8360.f8414 = i3;
        this.f8360.f8410 = i5;
        this.f8360.f8411 = i6;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1565(lm lmVar, int i, int i2, int i3, short s, int i4) {
        m1560(false);
        this.f8354 = new C0991();
        this.f8354.f8404 = System.currentTimeMillis();
        this.f8354.f8409 = lmVar.f1998;
        this.f8354.f8406 = i3;
        this.f8354.f8408 = i;
        this.f8354.f8407 = i2;
        this.f8354.f8402 = s;
        this.f8354.f8403 = i4;
        m1564(lmVar);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1563(int i, int i2, long j) {
        m1560(false);
        this.f8366 = new C0989();
        this.f8366.f8387 = i;
        this.f8366.f8390 = i2;
        this.f8366.f8389 = j;
        this.f8366.f8388 = System.currentTimeMillis();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1562(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        m1560(false);
        this.f8363 = new aux();
        this.f8363.f8381 = i;
        this.f8363.f8380 = i2;
        this.f8363.f8376 = i3;
        this.f8363.f8377 = null;
        this.f8363.f8372 = i4;
        this.f8363.f8373 = i5;
        this.f8363.f8374 = i6;
        this.f8363.f8375 = i7;
        this.f8363.f8378 = System.currentTimeMillis();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1564(lm lmVar) {
        this.f8350 = m1559(new Point(lmVar.f2002 - this.f2002, lmVar.f1999 - this.f1999));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static byte m1558(int i, int i2) {
        for (int i3 = 0; i3 < oa.f3230.length; i3++) {
            if (i == oa.f3230[i3] && i2 == oa.f3229[i3]) {
                return (byte) i3;
            }
        }
        return (byte) -1;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static byte m1559(Point point) {
        if (point.x == 0 && point.y == 0) {
            return (byte) -1;
        }
        if (point.x == 0) {
            return m1558(0, point.y > 0 ? 1 : -1);
        }
        if (point.y == 0) {
            return m1558(point.x > 0 ? 1 : -1, 0);
        }
        float f = point.x;
        float f2 = point.y;
        float fSqrt = f2 / FloatMath.sqrt((f * f) + (f2 * f2));
        float fAcos = (float) ((Math.acos(f / r5) / 3.141592653589793d) * 180.0d);
        if (fSqrt < 0.0f) {
            fAcos = -fAcos;
        }
        float f3 = (fAcos - 90.0f) + 23.0f;
        while (f3 < 0.0f) {
            f3 += 360.0f;
        }
        return (byte) (f3 / 45.0f);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final boolean m1567() {
        boolean z;
        boolean z2;
        if (this == C0358.f6664.f2004) {
            return false;
        }
        switch (m1557()[this.f1997.ordinal()]) {
            case 3:
                return true;
            case 4:
            case 7:
            case 9:
            case 10:
                return false;
            case 5:
            case 6:
            case 8:
            default:
                if (C0358.f6669 == null || C0358.f6669.f2063 == null) {
                    return false;
                }
                if (C0358.f6664.f2004.f8596 != null && C0358.f6664.f2004.f8596.m436(this.f1998) != -1) {
                    return false;
                }
                C0450 c0450 = C0358.f6669.f2063;
                switch (C0450.m1338()[c0450.f6884.ordinal()]) {
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                        z = true;
                        break;
                    case 4:
                    default:
                        switch (C0450.m1333()[c0450.f6879.ordinal()]) {
                            case 5:
                            case 6:
                            case 7:
                            case 12:
                            case 13:
                            case 21:
                                z = true;
                                break;
                            default:
                                z = false;
                                break;
                        }
                }
                if (z) {
                    return true;
                }
                C0450 c04502 = C0358.f6669.f2063;
                switch (C0450.m1338()[c04502.f6884.ordinal()]) {
                    case 4:
                        z2 = true;
                        break;
                    default:
                        switch (C0450.m1333()[c04502.f6879.ordinal()]) {
                            case 8:
                            case 9:
                            case 19:
                                z2 = true;
                                break;
                            default:
                                z2 = false;
                                break;
                        }
                }
                if (z2) {
                    if (C0358.f6664.f2004.f8348 == 0) {
                        return true;
                    }
                    if (C0358.f6664.f2004.f8348 == this.f8348) {
                        return false;
                    }
                    if (C0358.f6664.f2004.f8635 != null && C0358.f6664.f2004.f8635.f8292 != null) {
                        Iterator<C0972.C0975> it = C0358.f6664.f2004.f8635.f8292.iterator();
                        while (it.hasNext()) {
                            if (it.next().f8330 == this.f8348) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return true;
                }
                return false;
        }
    }
}
