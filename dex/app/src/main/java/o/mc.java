package o;

import android.graphics.Point;
import android.opengl.Matrix;
import com.roworkshop.andro.c_point;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class mc extends AbstractC0689 {

    /* renamed from: Ȋ, reason: contains not printable characters */
    private static /* synthetic */ int[] f2071;

    /* renamed from: đ, reason: contains not printable characters */
    lq f2072;

    /* renamed from: Ē, reason: contains not printable characters */
    final float f2073;

    /* renamed from: ܕ, reason: contains not printable characters */
    Point f2074;

    /* renamed from: 䒧, reason: contains not printable characters */
    EnumC0062 f2075;

    /* renamed from: 庸, reason: contains not printable characters */
    lr f2076;

    /* renamed from: 躆, reason: contains not printable characters */
    Point f2077;

    /* renamed from: o.mc$鷭, reason: contains not printable characters */
    enum EnumC0062 {
        SCREEN,
        WORLD;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0062[] valuesCustom() {
            EnumC0062[] enumC0062ArrValuesCustom = values();
            int length = enumC0062ArrValuesCustom.length;
            EnumC0062[] enumC0062Arr = new EnumC0062[length];
            System.arraycopy(enumC0062ArrValuesCustom, 0, enumC0062Arr, 0, length);
            return enumC0062Arr;
        }
    }

    /* renamed from: ą, reason: contains not printable characters */
    private static /* synthetic */ int[] m822() {
        int[] iArr = f2071;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0062.valuesCustom().length];
        try {
            iArr2[EnumC0062.SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0062.WORLD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f2071 = iArr2;
        return iArr2;
    }

    protected mc() {
        super(null, C0358.f6669.f2048.f1554.f1667);
        this.f2075 = EnumC0062.WORLD;
        this.f2077 = new Point();
        this.f2074 = new Point();
        this.f2076 = new lr();
        this.f2072 = new lq();
        this.f2073 = 0.15f;
    }

    mc(hs hsVar, c_point c_pointVar) {
        super(hsVar, C0358.f6669.f2048.f1554.f1667);
        this.f2075 = EnumC0062.WORLD;
        this.f2077 = new Point();
        this.f2074 = new Point();
        this.f2076 = new lr();
        this.f2072 = new lq();
        this.f2073 = 0.15f;
        this.f2075 = EnumC0062.SCREEN;
        float f = this.f2072.f2017;
        float f2 = this.f2072.f2016;
        C0753 c0753 = new C0753();
        Matrix.setIdentityM(c0753.f7745, 0);
        Matrix.translateM(c0753.f7745, 0, f, f2, 0.0f);
        C0753 c07532 = new C0753();
        Matrix.setIdentityM(c07532.f7745, 0);
        Matrix.scaleM(c07532.f7745, 0, 0.005f, 0.005f, 1.0f);
        float[] fArr = new float[16];
        Matrix.multiplyMM(fArr, 0, c0753.f7745, 0, c07532.f7745, 0);
        c0753.f7745 = fArr;
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, c0753.f7745, 0, C0753.m1449(0.0f, 0.0f, 0.0f, 1.0f).f7745, 0);
        c0753.f7745 = fArr2;
        this.f7637 = c0753;
    }

    @Deprecated
    /* renamed from: 鷭, reason: contains not printable characters */
    final void m826(hs hsVar, Point point, c_point c_pointVar) {
        this.f7638 = hsVar;
        this.f2077.set(point.x, point.y);
        this.f2074.set(((Point) c_pointVar).x, ((Point) c_pointVar).y);
        mo823();
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    void mo825() {
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    void mo824() {
        mo825();
        this.f2076 = C0358.f6669.m817(this.f2077.x, this.f2077.y, this.f2074.x, this.f2074.y);
    }

    /* renamed from: Ą, reason: contains not printable characters */
    void mo823() {
        switch (m822()[this.f2075.ordinal()]) {
            case 1:
                return;
            case 2:
                mo824();
                float f = this.f2076.f2020;
                float f2 = this.f2076.f2019 / this.f7636;
                float f3 = this.f2076.f2018;
                C0753 c0753 = new C0753();
                Matrix.setIdentityM(c0753.f7745, 0);
                Matrix.translateM(c0753.f7745, 0, f, f2, f3);
                ly lyVar = C0358.f6669;
                float f4 = this.f7636 * (-0.15f);
                float f5 = 0.15f * this.f7636;
                C0753 c07532 = new C0753();
                Matrix.setIdentityM(c07532.f7745, 0);
                Matrix.scaleM(c07532.f7745, 0, f4, f5, 1.0f);
                this.f7637 = C0753.m1451(c0753, C0753.m1449(((-C0358.f6669.f2057.f9041) / 180.0f) * 3.1415927f, 0.0f, 1.0f, 0.0f), C0753.m1449(0.7853982f, 1.0f, 0.0f, 0.0f), c07532);
                return;
            default:
                throw new nv();
        }
    }
}
