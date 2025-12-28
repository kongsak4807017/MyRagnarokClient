package o;

/* renamed from: o.ﰙ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1157 implements Cloneable {

    /* renamed from: ē, reason: contains not printable characters */
    float f9034;

    /* renamed from: 纫, reason: contains not printable characters */
    float f9040;

    /* renamed from: 鷭, reason: contains not printable characters */
    static float f9030 = 120.0f;

    /* renamed from: 櫯, reason: contains not printable characters */
    static float f9029 = 200.0f;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    static float f9027 = 160.0f;

    /* renamed from: ȃ, reason: contains not printable characters */
    static float f9026 = 30.0f;

    /* renamed from: Ą, reason: contains not printable characters */
    static float f9022 = 60.0f;

    /* renamed from: ą, reason: contains not printable characters */
    static float f9023 = 45.0f;

    /* renamed from: Ć, reason: contains not printable characters */
    static float f9024 = 120.0f;

    /* renamed from: ć, reason: contains not printable characters */
    static float f9025 = 300.0f;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    static float f9028 = 300.0f - ((300.0f - f9024) / 3.0f);

    /* renamed from: 岱, reason: contains not printable characters */
    float f9038 = 1.0f;

    /* renamed from: Ȋ, reason: contains not printable characters */
    float[] f9035 = new float[4];

    /* renamed from: ċ, reason: contains not printable characters */
    float[] f9031 = new float[3];

    /* renamed from: 䒧, reason: contains not printable characters */
    final float f9037 = 45.0f;

    /* renamed from: 躆, reason: contains not printable characters */
    float f9041 = 0.0f;

    /* renamed from: ܕ, reason: contains not printable characters */
    boolean f9036 = true;

    /* renamed from: 庸, reason: contains not printable characters */
    boolean f9039 = true;

    /* renamed from: đ, reason: contains not printable characters */
    float[] f9032 = new float[3];

    /* renamed from: Ē, reason: contains not printable characters */
    final float f9033 = 5.0f;

    /* renamed from: 띥, reason: contains not printable characters */
    final float f9042 = 1.0f;

    C1157() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final C1157 m1660() {
        try {
            return (C1157) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1661(float f) {
        float f2 = this.f9040;
        float f3 = f9030 / this.f9038;
        float f4 = f9029 / this.f9038;
        float f5 = f9024 / this.f9038;
        float f6 = f9025 / this.f9038;
        this.f9040 = f;
        if (C0358.f6669.f2063 == null) {
            return;
        }
        if (C0358.f6669.f2063.f6877) {
            if (this.f9040 < f3) {
                this.f9040 = f3;
            }
            if (this.f9040 > f4) {
                this.f9040 = f4;
            }
        } else {
            if (this.f9040 < f5) {
                this.f9040 = f5;
            }
            if (this.f9040 > f6) {
                this.f9040 = f6;
            }
        }
        if (this.f9040 != f2) {
            this.f9036 = true;
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final void m1659(float f) {
        float f2 = this.f9041;
        this.f9041 = f;
        while (this.f9041 > 180.0f) {
            this.f9041 -= 360.0f;
        }
        while (this.f9041 < -180.0f) {
            this.f9041 += 360.0f;
        }
        if (C0358.f6669.f2063.f6877) {
            if (this.f9041 < f9026) {
                this.f9041 = f9026;
            }
            if (this.f9041 > f9022) {
                this.f9041 = f9022;
            }
        }
        if (this.f9041 != f2) {
            this.f9039 = true;
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final void m1658() {
        if (C0358.f6669.f2063 == null || C0358.f6669.f2048.f1551 == null) {
            return;
        }
        mg mgVar = C0358.f6669.f2048.f1551;
        lr lrVar = new lr();
        lrVar.f2020 = (-((((((mgVar.f2123.f2002 * 100) + mgVar.f2123.f2000.x) + 50) / 100.0f) / 2.0f) - (r5.f1655 / 2))) * C0358.f6669.f2063.f6872.f1662;
        lrVar.f2018 = ((((((mgVar.f2123.f1999 * 100) + mgVar.f2123.f2000.y) + 50) / 100.0f) / 2.0f) - (r5.f1656 / 2)) * C0358.f6669.f2063.f6872.f1662;
        lrVar.f2019 = C0358.f6669.f2063.m1339(lrVar.f2020, lrVar.f2018);
        float f = lrVar.f2020;
        float f2 = lrVar.f2019;
        float f3 = lrVar.f2018;
        if (this.f9031[0] != f || this.f9031[1] != f2 || this.f9031[2] != f3) {
            this.f9036 = true;
        }
        this.f9031[0] = f;
        this.f9031[1] = f2;
        this.f9031[2] = f3;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final void m1657() {
        if (C0358.f6669.f2063.f6877) {
            m1659(f9023);
            m1661(f9027 / this.f9038);
        } else {
            m1659(0.0f);
            m1661(f9028 / this.f9038);
        }
    }
}
