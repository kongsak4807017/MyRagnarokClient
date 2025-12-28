package o;

import android.opengl.Matrix;
import android.util.FloatMath;

/* renamed from: o.榊, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0753 {

    /* renamed from: 鷭, reason: contains not printable characters */
    float[] f7745;

    C0753() {
        this.f7745 = new float[16];
    }

    C0753(float[] fArr) {
        this.f7745 = new float[16];
        this.f7745 = fArr;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static C0753 m1451(C0753... c0753Arr) {
        C0753 c0753 = new C0753();
        Matrix.setIdentityM(c0753.f7745, 0);
        for (C0753 c07532 : c0753Arr) {
            float[] fArr = new float[16];
            Matrix.multiplyMM(fArr, 0, c0753.f7745, 0, c07532.f7745, 0);
            c0753.f7745 = fArr;
        }
        return c0753;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static C0753 m1449(float f, float f2, float f3, float f4) {
        C0753 c0753 = new C0753();
        Matrix.setIdentityM(c0753.f7745, 0);
        float fSqrt = FloatMath.sqrt((f2 * f2) + (f3 * f3) + (f4 * f4));
        if (fSqrt == 0.0f) {
            return c0753;
        }
        if (fSqrt != 1.0f) {
            float f5 = 1.0f / fSqrt;
            f2 *= f5;
            f3 *= f5;
            f4 *= f5;
        }
        float fSin = FloatMath.sin(f);
        float fCos = FloatMath.cos(f);
        float f6 = 1.0f - fCos;
        float f7 = c0753.f7745[0];
        float f8 = c0753.f7745[1];
        float f9 = c0753.f7745[2];
        float f10 = c0753.f7745[3];
        float f11 = c0753.f7745[4];
        float f12 = c0753.f7745[5];
        float f13 = c0753.f7745[6];
        float f14 = c0753.f7745[7];
        float f15 = c0753.f7745[8];
        float f16 = c0753.f7745[9];
        float f17 = c0753.f7745[10];
        float f18 = c0753.f7745[11];
        float f19 = (f2 * f2 * f6) + fCos;
        float f20 = (f3 * f2 * f6) + (f4 * fSin);
        float f21 = ((f4 * f2) * f6) - (f3 * fSin);
        float f22 = ((f2 * f3) * f6) - (f4 * fSin);
        float f23 = (f3 * f3 * f6) + fCos;
        float f24 = (f4 * f3 * f6) + (f2 * fSin);
        float f25 = (f2 * f4 * f6) + (f3 * fSin);
        float f26 = ((f3 * f4) * f6) - (f2 * fSin);
        float f27 = (f4 * f4 * f6) + fCos;
        c0753.f7745[0] = (f7 * f19) + (f11 * f20) + (f15 * f21);
        c0753.f7745[1] = (f8 * f19) + (f12 * f20) + (f16 * f21);
        c0753.f7745[2] = (f9 * f19) + (f13 * f20) + (f17 * f21);
        c0753.f7745[3] = (f10 * f19) + (f14 * f20) + (f18 * f21);
        c0753.f7745[4] = (f7 * f22) + (f11 * f23) + (f15 * f24);
        c0753.f7745[5] = (f8 * f22) + (f12 * f23) + (f16 * f24);
        c0753.f7745[6] = (f9 * f22) + (f13 * f23) + (f17 * f24);
        c0753.f7745[7] = (f10 * f22) + (f14 * f23) + (f18 * f24);
        c0753.f7745[8] = (f7 * f25) + (f11 * f26) + (f15 * f27);
        c0753.f7745[9] = (f8 * f25) + (f12 * f26) + (f16 * f27);
        c0753.f7745[10] = (f9 * f25) + (f13 * f26) + (f17 * f27);
        c0753.f7745[11] = (f10 * f25) + (f14 * f26) + (f18 * f27);
        return c0753;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1455(float f) {
        float fSin = FloatMath.sin(f);
        float fCos = FloatMath.cos(f);
        float f2 = this.f7745[4];
        float f3 = this.f7745[5];
        float f4 = this.f7745[6];
        float f5 = this.f7745[7];
        float f6 = this.f7745[8];
        float f7 = this.f7745[9];
        float f8 = this.f7745[10];
        float f9 = this.f7745[11];
        this.f7745[4] = (f2 * fCos) + (f6 * fSin);
        this.f7745[5] = (f3 * fCos) + (f7 * fSin);
        this.f7745[6] = (f4 * fCos) + (f8 * fSin);
        this.f7745[7] = (f5 * fCos) + (f9 * fSin);
        this.f7745[8] = ((-fSin) * f2) + (f6 * fCos);
        this.f7745[9] = ((-fSin) * f3) + (f7 * fCos);
        this.f7745[10] = ((-fSin) * f4) + (f8 * fCos);
        this.f7745[11] = ((-fSin) * f5) + (f9 * fCos);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final void m1454(float f) {
        float fSin = FloatMath.sin(f);
        float fCos = FloatMath.cos(f);
        float f2 = this.f7745[0];
        float f3 = this.f7745[1];
        float f4 = this.f7745[2];
        float f5 = this.f7745[3];
        float f6 = this.f7745[8];
        float f7 = this.f7745[9];
        float f8 = this.f7745[10];
        float f9 = this.f7745[11];
        this.f7745[0] = (f2 * fCos) + ((-fSin) * f6);
        this.f7745[1] = (f3 * fCos) + ((-fSin) * f7);
        this.f7745[2] = (f4 * fCos) + ((-fSin) * f8);
        this.f7745[3] = (f5 * fCos) + ((-fSin) * f9);
        this.f7745[8] = (f2 * fSin) + (f6 * fCos);
        this.f7745[9] = (f3 * fSin) + (f7 * fCos);
        this.f7745[10] = (f4 * fSin) + (f8 * fCos);
        this.f7745[11] = (f5 * fSin) + (f9 * fCos);
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final void m1453(float f) {
        float fSin = FloatMath.sin(f);
        float fCos = FloatMath.cos(f);
        float f2 = this.f7745[0];
        float f3 = this.f7745[1];
        float f4 = this.f7745[2];
        float f5 = this.f7745[3];
        float f6 = this.f7745[4];
        float f7 = this.f7745[5];
        float f8 = this.f7745[6];
        float f9 = this.f7745[7];
        this.f7745[0] = (f2 * fCos) + (f6 * fSin);
        this.f7745[1] = (f3 * fCos) + (f7 * fSin);
        this.f7745[2] = (f4 * fCos) + (f8 * fSin);
        this.f7745[3] = (f5 * fCos) + (f9 * fSin);
        this.f7745[4] = ((-fSin) * f2) + (f6 * fCos);
        this.f7745[5] = ((-fSin) * f3) + (f7 * fCos);
        this.f7745[6] = ((-fSin) * f4) + (f8 * fCos);
        this.f7745[7] = ((-fSin) * f5) + (f9 * fCos);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static float[] m1452(float[] fArr, C0753 c0753) {
        float[] fArr2 = new float[4];
        Matrix.multiplyMV(fArr2, 0, c0753.f7745, 0, fArr.length >= 4 ? fArr : new float[]{fArr[0], fArr[1], fArr[2], 1.0f}, 0);
        return fArr2;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static C0753 m1450(float[] fArr) {
        return new C0753(new float[]{fArr[0], fArr[1], fArr[2], 0.0f, fArr[3], fArr[4], fArr[5], 0.0f, fArr[6], fArr[7], fArr[8], 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
    }
}
