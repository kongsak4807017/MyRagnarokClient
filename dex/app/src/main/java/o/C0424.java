package o;

import android.opengl.Matrix;
import android.util.Log;
import java.nio.BufferUnderflowException;
import o.ui;

/* renamed from: o.ڇ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0424 {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    C1030 f6826 = new C1030();

    /* renamed from: 櫯, reason: contains not printable characters */
    float[] f6827;

    /* renamed from: 鷭, reason: contains not printable characters */
    C0747 f6828;

    C0424() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static C0753 m1325(ui.C0105 c0105) {
        float f = c0105.f5224[0];
        float f2 = c0105.f5224[1];
        float f3 = c0105.f5224[2];
        C0753 c0753 = new C0753();
        Matrix.setIdentityM(c0753.f7745, 0);
        Matrix.scaleM(c0753.f7745, 0, f, f2, f3);
        C0753 c07532 = new C0753();
        Matrix.setIdentityM(c07532.f7745, 0);
        float f4 = (c0105.f5221[0] / 180.0f) * 3.1415927f;
        float f5 = (c0105.f5221[1] / 180.0f) * 3.1415927f;
        c07532.m1453((c0105.f5221[2] / 180.0f) * 3.1415927f);
        c07532.m1455(f4);
        c07532.m1454(f5);
        float f6 = c0105.f5220[0];
        float f7 = c0105.f5220[1];
        float f8 = c0105.f5220[2];
        C0753 c07533 = new C0753();
        Matrix.setIdentityM(c07533.f7745, 0);
        Matrix.translateM(c07533.f7745, 0, f6, f7, f8);
        C0753 c07534 = new C0753();
        Matrix.setIdentityM(c07534.f7745, 0);
        Matrix.scaleM(c07534.f7745, 0, -1.0f, -1.0f, 1.0f);
        C0753[] c0753Arr = {c07534, c07533, c07532, c0753};
        C0753 c07535 = new C0753();
        Matrix.setIdentityM(c07535.f7745, 0);
        for (C0753 c07536 : c0753Arr) {
            float[] fArr = new float[16];
            Matrix.multiplyMM(fArr, 0, c07535.f7745, 0, c07536.f7745, 0);
            c07535.f7745 = fArr;
        }
        return c07535;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static C0424 m1324(C0747 c0747, ui.C0105 c0105) {
        C0424 c0424 = new C0424();
        c0424.f6828 = c0747;
        c0424.f6827 = new float[c0747.f7734.length * 16];
        C0753 c0753M1325 = m1325(c0105);
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f};
        float[] fArr2 = new float[4];
        for (int i = 0; i < c0424.f6828.f7734.length; i++) {
            C0753[] c0753Arr = {c0753M1325, c0424.f6828.f7734[i]};
            C0753 c0753 = new C0753();
            Matrix.setIdentityM(c0753.f7745, 0);
            for (C0753 c07532 : c0753Arr) {
                float[] fArr3 = new float[16];
                Matrix.multiplyMM(fArr3, 0, c0753.f7745, 0, c07532.f7745, 0);
                c0753.f7745 = fArr3;
            }
            C1030 c1030 = new C1030();
            float[] fArrArray = c0424.f6828.f7739.array();
            float[] fArrArray2 = c0424.f6828.f7738.array();
            for (int i2 = 0; i2 < fArrArray.length; i2 += 4) {
                try {
                    if (fArrArray2[i2 / 4] == i) {
                        fArr[0] = fArrArray[i2];
                        fArr[1] = fArrArray[i2 + 1];
                        fArr[2] = fArrArray[i2 + 2];
                        Matrix.multiplyMV(fArr2, 0, c0753.f7745, 0, fArr, 0);
                        c1030.m1610(fArr2);
                    }
                } catch (BufferUnderflowException e) {
                    String string = e.toString();
                    Log.e("AndRO", string);
                    throw new nv(string);
                }
            }
            c1030.m1608();
            C1030 c10302 = c0424.f6826;
            for (int i3 = 0; i3 < 3; i3++) {
                if (c10302.f8560[i3] > c1030.f8560[i3]) {
                    c10302.f8560[i3] = c1030.f8560[i3];
                }
                if (c10302.f8559[i3] < c1030.f8559[i3]) {
                    c10302.f8559[i3] = c1030.f8559[i3];
                }
            }
        }
        c0424.f6826.m1608();
        C0753 c0753M13252 = m1325(c0105);
        for (int i4 = 0; i4 < c0747.f7734.length; i4++) {
            C0753[] c0753Arr2 = {c0753M13252, c0424.f6828.f7734[i4]};
            C0753 c07533 = new C0753();
            Matrix.setIdentityM(c07533.f7745, 0);
            for (C0753 c07534 : c0753Arr2) {
                float[] fArr4 = new float[16];
                Matrix.multiplyMM(fArr4, 0, c07533.f7745, 0, c07534.f7745, 0);
                c07533.f7745 = fArr4;
            }
            System.arraycopy(c07533.f7745, 0, c0424.f6827, i4 * 16, 16);
        }
        return c0424;
    }
}
