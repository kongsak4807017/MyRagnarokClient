package o;

import android.opengl.Matrix;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import o.iu;
import o.uh;

/* renamed from: o.栓, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0747 {

    /* renamed from: Ą, reason: contains not printable characters */
    C0753[] f7734;

    /* renamed from: ą, reason: contains not printable characters */
    C1030[] f7735;

    /* renamed from: Ć, reason: contains not printable characters */
    String[] f7736;

    /* renamed from: ȃ, reason: contains not printable characters */
    FloatBuffer f7737;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    FloatBuffer f7738;

    /* renamed from: 櫯, reason: contains not printable characters */
    FloatBuffer f7739;

    /* renamed from: 鷭, reason: contains not printable characters */
    String f7740;

    C0747() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1445(uh uhVar) {
        int length = 0;
        for (int i = 0; i < uhVar.f5140.length; i++) {
            length += uhVar.f5140[i].f5164.length * 3;
        }
        float[] fArr = new float[length * 4];
        float[] fArr2 = new float[length * 4];
        float[] fArr3 = new float[length];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < uhVar.f5140.length; i4++) {
            float[] fArr4 = new float[uhVar.f5140[i4].f5170.length];
            float[] fArr5 = new float[4];
            for (int i5 = 0; i5 < fArr4.length; i5 += 3) {
                fArr5[0] = uhVar.f5140[i4].f5170[i5 + 0];
                fArr5[1] = uhVar.f5140[i4].f5170[i5 + 1];
                fArr5[2] = uhVar.f5140[i4].f5170[i5 + 2];
                fArr4[i5 + 0] = fArr5[0];
                fArr4[i5 + 1] = fArr5[1];
                fArr4[i5 + 2] = fArr5[2];
            }
            for (int i6 = 0; i6 < uhVar.f5140[i4].f5164.length; i6++) {
                short s = uhVar.f5140[i4].f5164[i6].f5186;
                if (s >= 0) {
                    for (int i7 = 0; i7 < 3; i7++) {
                        short s2 = uhVar.f5140[i4].f5164[i6].f5188[i7];
                        fArr[i2 + 0] = fArr4[(s2 * 3) + 0];
                        fArr[i2 + 1] = fArr4[(s2 * 3) + 1];
                        fArr[i2 + 2] = fArr4[(s2 * 3) + 2];
                        fArr3[i2 / 4] = i4;
                        i2 += 4;
                        short s3 = uhVar.f5140[i4].f5164[i6].f5187[i7];
                        fArr2[i3 + 0] = uhVar.f5140[i4].f5166[s3].f5180;
                        fArr2[i3 + 1] = uhVar.f5140[i4].f5166[s3].f5179;
                        fArr2[i3 + 2] = s;
                        i3 += 4;
                    }
                }
            }
        }
        this.f7739 = FloatBuffer.wrap(fArr);
        this.f7739.position(0);
        this.f7738 = FloatBuffer.wrap(fArr3);
        this.f7738.position(0);
        this.f7737 = FloatBuffer.wrap(fArr2);
        this.f7737.position(0);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1444(iu iuVar) {
        float[] fArrArray = this.f7739.array();
        float[] fArrArray2 = this.f7738.array();
        float[] fArrArray3 = this.f7737.array();
        this.f7738 = ByteBuffer.allocateDirect(fArrArray2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f7738.put(fArrArray2);
        this.f7738.position(0);
        int i = -1;
        iu.Cif cif = null;
        short s = oc.f3231 ? (short) 1 : (short) 0;
        for (int i2 = 0; i2 < fArrArray3.length; i2 += 4) {
            int i3 = (int) fArrArray3[i2 + 2];
            if (i3 != i) {
                i = i3;
                cif = iuVar.f1675.get(this.f7736[i3]);
            }
            if (cif != null) {
                int i4 = i2 + 0;
                fArrArray3[i4] = fArrArray3[i4] * (cif.f1684 - s);
                int i5 = i2 + 1;
                fArrArray3[i5] = fArrArray3[i5] * (cif.f1685 - s);
                fArrArray3[i2 + 2] = cif.f1689;
                fArrArray3[i2 + 3] = cif.f1688;
                fArrArray[i2 + 3] = cif.f1686;
            }
        }
        this.f7737 = ByteBuffer.allocateDirect(fArrArray3.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f7737.put(fArrArray3);
        this.f7737.position(0);
        this.f7739 = ByteBuffer.allocateDirect(fArrArray.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f7739.put(fArrArray);
        this.f7739.position(0);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1447(uh uhVar, iu iuVar) {
        this.f7736 = new String[uhVar.f5142.length];
        String[] strArr = new String[uhVar.f5142.length];
        String[] strArr2 = new String[uhVar.f5142.length];
        int i = 0;
        for (int i2 = 0; i2 < uhVar.f5142.length; i2++) {
            this.f7736[i2] = pa.m978(uhVar.f5142[i2].f5159, ow.KOREAN);
            if (!(iuVar.f1675.get(this.f7736[i2]) != null)) {
                strArr[i] = this.f7736[i2];
                strArr2[i] = "data\\texture\\" + this.f7736[i2];
                i++;
            }
        }
        if (i == 0) {
            return;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, i);
        for (int i3 = 0; i3 < strArr3.length; i3++) {
            String str = strArr3[i3];
            byte[] bArr = (byte[]) C0358.f6685.f1033.m519(str, false);
            if (bArr == null) {
                String str2 = "Failed to load texture " + str;
                Log.e("AndRO", str2);
                throw new nv(str2);
            }
            C0406 c0406M919 = od.m919(str, bArr);
            if (c0406M919 == null) {
                String str3 = "Failed to decode texture (" + str + ")";
                Log.e("AndRO", str3);
                throw new nv(str3);
            }
            iuVar.m692(c0406M919.f6789, c0406M919.f6788, c0406M919.f6787.x, c0406M919.f6787.y, strArr[i3], null, iuVar.f1667);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static C1030 m1443(uh.C0100 c0100) {
        C1030 c1030 = new C1030();
        c1030.f8559 = new float[]{-999999.0f, -999999.0f, -999999.0f};
        c1030.f8560 = new float[]{999999.0f, 999999.0f, 999999.0f};
        for (int i = 0; i < c0100.f5170.length / 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                if (c1030.f8559[i2] < c0100.f5170[(i * 3) + i2]) {
                    c1030.f8559[i2] = c0100.f5170[(i * 3) + i2];
                }
                if (c1030.f8560[i2] > c0100.f5170[(i * 3) + i2]) {
                    c1030.f8560[i2] = c0100.f5170[(i * 3) + i2];
                }
            }
        }
        return c1030;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1446(uh uhVar, int i, C0753 c0753, int i2) {
        C0753 c07532;
        if (i2 > 20) {
            throw new RuntimeException("Infinity loop in calc mesh transformation, rsm=" + pa.m978(uhVar.f5145, ow.KOREAN));
        }
        uh.C0100 c0100 = uhVar.f5140[i];
        C1030 c1030M1443 = m1443(c0100);
        this.f7735[i] = c1030M1443.clone();
        C0753 c07533 = new C0753(Arrays.copyOf(c0753.f7745, 16));
        Matrix.translateM(c07533.f7745, 0, c0100.f5161[0], c0100.f5161[1], c0100.f5161[2]);
        float[] fArr = new float[16];
        Matrix.multiplyMM(fArr, 0, c07533.f7745, 0, C0753.m1449(c0100.f5162, c0100.f5163[0], c0100.f5163[1], c0100.f5163[2]).f7745, 0);
        c07533.f7745 = fArr;
        Matrix.scaleM(c07533.f7745, 0, c0100.f5168[0], c0100.f5168[1], c0100.f5168[2]);
        C0753 c07534 = new C0753(Arrays.copyOf(c07533.f7745, 16));
        if (!c0100.f5169) {
            Matrix.translateM(c07534.f7745, 0, c0100.f5160[0], c0100.f5160[1], c0100.f5160[2]);
        }
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, c07534.f7745, 0, C0753.m1450(c0100.f5165).f7745, 0);
        c07534.f7745 = fArr2;
        c1030M1443.f8560 = C0753.m1452(c1030M1443.f8560, c07534);
        c1030M1443.f8559 = C0753.m1452(c1030M1443.f8559, c07534);
        c1030M1443.m1608();
        float f = -c1030M1443.f8557[0];
        float f2 = -c1030M1443.f8559[1];
        float f3 = -c1030M1443.f8557[2];
        C0753 c07535 = new C0753();
        Matrix.setIdentityM(c07535.f7745, 0);
        Matrix.translateM(c07535.f7745, 0, f, f2, f3);
        if (i2 == 0) {
            c07533 = C0753.m1451(c07535, c07533);
        }
        C0753[] c0753Arr = this.f7734;
        C0753[] c0753Arr2 = new C0753[3];
        c0753Arr2[0] = c07533;
        if (c0100.f5169) {
            C0753 c07536 = new C0753();
            Matrix.setIdentityM(c07536.f7745, 0);
            c07532 = c07536;
        } else {
            float f4 = c0100.f5160[0];
            float f5 = c0100.f5160[1];
            float f6 = c0100.f5160[2];
            C0753 c07537 = new C0753();
            Matrix.setIdentityM(c07537.f7745, 0);
            Matrix.translateM(c07537.f7745, 0, f4, f5, f6);
            c07532 = c07537;
        }
        c0753Arr2[1] = c07532;
        c0753Arr2[2] = C0753.m1450(c0100.f5165);
        c0753Arr[i] = C0753.m1451(c0753Arr2);
        String strM978 = pa.m978(c0100.f5174, ow.KOREAN);
        if (!strM978.equals(pa.m978(c0100.f5171, ow.KOREAN))) {
            for (int i3 = 0; i3 < uhVar.f5140.length; i3++) {
                if (strM978.equals(pa.m978(uhVar.f5140[i3].f5171, ow.KOREAN))) {
                    int i4 = i2 + 1;
                    m1446(uhVar, i3, c07533, i4);
                    i2 = i4 - 1;
                }
            }
        }
    }
}
