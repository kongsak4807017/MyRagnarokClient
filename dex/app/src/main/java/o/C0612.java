package o;

import android.graphics.Point;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import com.roworkshop.andro.c_activity;
import com.roworkshop.andro.c_point;
import o.C1035;
import o.pj;

/* renamed from: o.䩚, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C0612 extends GLSurfaceView {

    /* renamed from: ć, reason: contains not printable characters */
    private static final int[] f7417 = {1, 1, 0, -1, -1, -1, 0, 1};

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private static final int[] f7418 = {0, 1, 1, 1, 0, -1, -1, -1};

    /* renamed from: 岱, reason: contains not printable characters */
    private static /* synthetic */ int[] f7419;

    /* renamed from: Ą, reason: contains not printable characters */
    int f7420;

    /* renamed from: ą, reason: contains not printable characters */
    Point f7421;

    /* renamed from: Ć, reason: contains not printable characters */
    long f7422;

    /* renamed from: ȃ, reason: contains not printable characters */
    C0613[] f7423;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    lq f7424;

    /* renamed from: 櫯, reason: contains not printable characters */
    Cif f7425;

    /* renamed from: 鷭, reason: contains not printable characters */
    public C0851 f7426;

    /* renamed from: o.䩚$if, reason: invalid class name */
    enum Cif {
        NONE,
        CAMERA,
        CONTINUOUS_MOVE,
        JOYSTICK_MOVE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Cif[] valuesCustom() {
            Cif[] cifArrValuesCustom = values();
            int length = cifArrValuesCustom.length;
            Cif[] cifArr = new Cif[length];
            System.arraycopy(cifArrValuesCustom, 0, cifArr, 0, length);
            return cifArr;
        }
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m1384() {
        int[] iArr = f7419;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[Cif.valuesCustom().length];
        try {
            iArr2[Cif.CAMERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[Cif.CONTINUOUS_MOVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[Cif.JOYSTICK_MOVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[Cif.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f7419 = iArr2;
        return iArr2;
    }

    /* renamed from: o.䩚$鷭, reason: contains not printable characters */
    class C0613 {

        /* renamed from: Ą, reason: contains not printable characters */
        long f7432;

        /* renamed from: ȃ, reason: contains not printable characters */
        long f7434;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        lq f7435;

        /* renamed from: 櫯, reason: contains not printable characters */
        lq f7436;

        /* renamed from: 鷭, reason: contains not printable characters */
        lq f7437;

        C0613() {
        }
    }

    public C0612(c_activity c_activityVar) {
        super(c_activityVar);
        this.f7425 = Cif.NONE;
        this.f7423 = new C0613[]{new C0613(), new C0613(), new C0613(), new C0613(), new C0613()};
        setEGLContextClientVersion(2);
        this.f7426 = new C0851(c_activityVar);
        super.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        setRenderer(this.f7426);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m1388() {
        if (this.f7425 != Cif.CONTINUOUS_MOVE) {
            return;
        }
        C0358.f6669.m820(this.f7424.f2017, this.f7424.f2016, false);
        c_activity c_activityVar = C0358.f6674;
        RunnableC0465 runnableC0465 = new RunnableC0465(this);
        if (c_activityVar.f47 != null) {
            c_activityVar.f47.postDelayed(new RunnableC1014(c_activityVar, runnableC0465), 700L);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static final lq m1387(MotionEvent motionEvent, int i) {
        if (motionEvent.getPointerCount() != 2) {
            throw new RuntimeException();
        }
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            if (i2 != i) {
                return new lq(motionEvent.getX(i2), motionEvent.getY(i2));
            }
        }
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: 櫯, reason: contains not printable characters */
    public final void m1385() {
        int i;
        if (this.f7425 != Cif.JOYSTICK_MOVE) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f7422;
        if (jCurrentTimeMillis >= 500) {
            Point point = this.f7421;
            int i2 = (int) (this.f7420 - ((C0358.f6669.f2057.f9041 - 22.5f) / 45.0f));
            while (i2 > 7) {
                i2 -= 8;
            }
            while (i2 < 0) {
                i2 += 8;
            }
            if (C0358.f6664.f2004 != null) {
                Point point2 = new Point(C0358.f6664.f2004.f2002, C0358.f6664.f2004.f1999);
                if (C0358.f6664.f2004.f8353 != null && (i = C0358.f6664.f2004.f8353.f8401.f2030[C0358.f6664.f2004.f8353.f8401.f2031]) != -1) {
                    point2.x += oa.f3230[i];
                    point2.y += oa.f3229[i];
                }
                c_point c_pointVar = new c_point(point2.x, point2.y);
                c_point c_pointVar2 = new c_point(c_pointVar.x, c_pointVar.y);
                for (int i3 = 0; i3 < 12; i3++) {
                    c_pointVar.offset(f7417[i2], f7418[i2]);
                    if (oa.m912((lu) null, C0358.f6664.f2004.f2002, C0358.f6664.f2004.f1999, c_pointVar.x, c_pointVar.y, C0358.f6667.f4776 == pj.EnumC0074.AEGIS, C0358.f6669.f2063.f6876)) {
                        c_pointVar2.set(((Point) c_pointVar).x, ((Point) c_pointVar).y);
                        if (C0358.f6664.f2004.f8353 != null && C0358.f6664.f2004.f8353.f8399.x == c_pointVar.x && C0358.f6664.f2004.f8353.f8399.y == c_pointVar.y && C0358.f6664.f2004.f8353.f8401.f2032 - C0358.f6664.f2004.f8353.f8401.f2031 > 5) {
                            break;
                        }
                    }
                }
                this.f7421 = c_pointVar2;
            }
            if (this.f7421 == null || C0358.f6664.f2004 == null || this.f7421.equals(C0358.f6664.f2004.f2002, C0358.f6664.f2004.f1999)) {
                return;
            }
            if (point == null || !this.f7421.equals(point) || jCurrentTimeMillis >= 2000) {
                if (C0358.f6664.f2004.f8618 != null && C0358.f6674.f42.f1814) {
                    C1035.Cif cif = C0358.f6664.f2004.f8618;
                    cif.f8649 = this.f7421.x;
                    cif.f8650 = this.f7421.y;
                    C0358.f6664.f2004.f8618.f8654 = nc.MOVE_CMD;
                    C1095 c1095 = C0358.f6685.f1030.f979;
                    nu nuVar = nu.HOM;
                    ln lnVar = C0358.f6664;
                    c1095.m1631(nuVar);
                }
                if (C0358.f6664.f2004.f8632 != null && C0358.f6674.f42.f1805) {
                    C1035.Cif cif2 = C0358.f6664.f2004.f8632;
                    cif2.f8649 = this.f7421.x;
                    cif2.f8650 = this.f7421.y;
                    C0358.f6664.f2004.f8632.f8654 = nc.MOVE_CMD;
                    C1095 c10952 = C0358.f6685.f1030.f979;
                    nu nuVar2 = nu.MER;
                    ln lnVar2 = C0358.f6664;
                    c10952.m1631(nuVar2);
                } else if (!C0358.f6674.f42.f1814 && !C0358.f6674.f42.f1814) {
                    C0358.f6671.mo454(new C0427((short) this.f7421.x, (short) this.f7421.y));
                }
                this.f7422 = System.currentTimeMillis();
            }
        }
        c_activity c_activityVar = C0358.f6674;
        RunnableC1099 runnableC1099 = new RunnableC1099(this);
        if (c_activityVar.f47 != null) {
            c_activityVar.f47.postDelayed(new RunnableC1014(c_activityVar, runnableC1099), 500L);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private final void m1389(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int actionMasked = motionEvent.getActionMasked();
        lq lqVar = new lq(motionEvent.getX(actionIndex), motionEvent.getY(actionIndex));
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            this.f7423[motionEvent.getPointerId(i)].f7437 = new lq(motionEvent.getX(i), motionEvent.getY(i));
        }
        switch (actionMasked) {
            case 0:
            case 5:
                this.f7423[motionEvent.getPointerId(actionIndex)].f7436 = new lq(lqVar);
                this.f7423[motionEvent.getPointerId(actionIndex)].f7434 = System.currentTimeMillis();
                break;
            case 1:
            case 6:
                this.f7423[motionEvent.getPointerId(actionIndex)].f7435 = new lq(lqVar);
                this.f7423[motionEvent.getPointerId(actionIndex)].f7432 = System.currentTimeMillis();
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:86:0x034b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 1323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0612.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
