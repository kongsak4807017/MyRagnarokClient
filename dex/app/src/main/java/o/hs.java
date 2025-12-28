package o;

import android.opengl.Matrix;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import o.hr;
import o.ud;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class hs {

    /* renamed from: ċ, reason: contains not printable characters */
    hr[] f1521;

    /* renamed from: Ȋ, reason: contains not printable characters */
    hr f1522;

    /* renamed from: 䒧, reason: contains not printable characters */
    hr[] f1523;

    /* renamed from: 纫, reason: contains not printable characters */
    C0049[] f1524;

    /* renamed from: 躆, reason: contains not printable characters */
    String[] f1525;

    protected void finalize() {
        if (this.f1521 != null) {
            for (hr hrVar : this.f1521) {
                if (hrVar != null) {
                    hrVar.m496();
                }
            }
        }
        this.f1521 = null;
    }

    /* renamed from: o.hs$鷭, reason: contains not printable characters */
    class C0049 {

        /* renamed from: 鷭, reason: contains not printable characters */
        C0050[] f1527;

        /* renamed from: o.hs$鷭$鷭, reason: contains not printable characters */
        class C0050 {

            /* renamed from: Ą, reason: contains not printable characters */
            ArrayList<oh> f1528;

            /* renamed from: ą, reason: contains not printable characters */
            String[] f1529;

            /* renamed from: ȃ, reason: contains not printable characters */
            FloatBuffer f1531;

            /* renamed from: ˮ͈, reason: contains not printable characters */
            FloatBuffer f1532;

            /* renamed from: 櫯, reason: contains not printable characters */
            ShortBuffer f1533;

            /* renamed from: 鷭, reason: contains not printable characters */
            ByteBuffer f1534;

            /* synthetic */ C0050(C0049 c0049, hr[] hrVarArr, int i, int i2, hr[] hrVarArr2, String[] strArr, C0050 c0050) {
                this(hrVarArr, i, i2, hrVarArr2, strArr);
            }

            private C0050(hr[] hrVarArr, int i, int i2, hr[] hrVarArr2, String[] strArr) {
                this.f1528 = new ArrayList<>();
                this.f1529 = new String[hrVarArr.length];
                int i3 = 0;
                for (hr hrVar : hrVarArr) {
                    if (hrVar != null) {
                        int i4 = i2;
                        ud.C0086 c0086 = hrVar.f1504.f5018[i >= hrVar.f1504.f5018.length ? 0 : i];
                        if (c0086.f5028.length > 0) {
                            ud.C0086.C0087 c0087 = c0086.f5028[i2 >= c0086.f5028.length ? 0 : i4];
                            if (c0087.f5030 >= 0 && c0087.f5030 < hrVar.f1504.f5019.length) {
                                String strM978 = pa.m978(hrVar.f1504.f5019[c0087.f5030].f5025, ow.KOREAN);
                                if (strM978.contains("worm_tail_damage.wav")) {
                                    c0087.f5030 = -1;
                                } else {
                                    if (strM978.equals("atk")) {
                                        ud.Cif[] cifArr = hrVar.f1504.f5019;
                                        int length = cifArr.length;
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= length) {
                                                break;
                                            }
                                            String strM9782 = pa.m978(cifArr[i5].f5025, ow.KOREAN);
                                            if (!strM9782.endsWith("_attack.wav")) {
                                                i5++;
                                            } else {
                                                strM978 = strM9782;
                                                break;
                                            }
                                        }
                                    }
                                    if (strM978.equals("atk")) {
                                        c0087.f5030 = -1;
                                    } else {
                                        int i6 = i3;
                                        i3++;
                                        this.f1529[i6] = strM978;
                                        if (!C0358.f6663.f8211.containsKey(strM978)) {
                                            C0358.f6685.mo139(new ht(this, strM978, hrVar));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.f1529 = (String[]) Arrays.copyOf(this.f1529, i3);
                int length2 = 0;
                int length3 = 0;
                int iMax = 0;
                for (hr hrVar2 : hrVarArr) {
                    if (hrVar2 != null) {
                        iMax = Math.max(iMax, hrVar2.f1504.f5018[i >= hrVar2.f1504.f5018.length ? 0 : i].f5028.length);
                    }
                }
                for (hr hrVar3 : hrVarArr) {
                    if (hrVar3 != null) {
                        int length4 = i2;
                        ud.C0086 c00862 = hrVar3.f1504.f5018[i >= hrVar3.f1504.f5018.length ? 0 : i];
                        length4 = c00862.f5028.length != iMax ? (i2 * c00862.f5028.length) / iMax : length4;
                        if (length4 < c00862.f5028.length) {
                            ud.C0086.C0087 c00872 = c00862.f5028[length4];
                            length2 += c00872.f5033.length * 4;
                            length3 += c00872.f5033.length * 6;
                        }
                    }
                }
                FloatBuffer floatBufferWrap = FloatBuffer.wrap(new float[length2 * 4]);
                ShortBuffer shortBufferWrap = ShortBuffer.wrap(new short[length3]);
                FloatBuffer floatBufferWrap2 = FloatBuffer.wrap(new float[length2 * 4]);
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[length2 * 4]);
                for (hr hrVar4 : hrVarArr) {
                    if (hrVar4 != null) {
                        int length5 = i2;
                        int i7 = i >= hrVar4.f1504.f5018.length ? 0 : i;
                        ud.C0086 c00863 = hrVar4.f1504.f5018[i7];
                        length5 = c00863.f5028.length != iMax ? (i2 * c00863.f5028.length) / iMax : length5;
                        if (length5 < c00863.f5028.length) {
                            ud.C0086.C0087 c00873 = c00863.f5028[length5];
                            for (int i8 = 0; i8 < c00873.f5033.length; i8++) {
                                if (c00873.f5033[i8].f5044 != -1) {
                                    m636(hrVar4, i7, length5, i8, floatBufferWrap, floatBufferWrap2, byteBufferWrap, shortBufferWrap, hrVarArr2, strArr);
                                }
                            }
                        }
                    }
                }
                try {
                    this.f1532 = ByteBuffer.allocateDirect(floatBufferWrap.position() * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    this.f1532.put(floatBufferWrap.array(), 0, floatBufferWrap.position());
                    this.f1532.position(0);
                    this.f1531 = ByteBuffer.allocateDirect(floatBufferWrap2.position() * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    this.f1531.put(floatBufferWrap2.array(), 0, floatBufferWrap2.position());
                    this.f1531.position(0);
                    this.f1534 = ByteBuffer.allocateDirect(byteBufferWrap.position()).order(ByteOrder.nativeOrder());
                    this.f1534.put(byteBufferWrap.array(), 0, byteBufferWrap.position());
                    this.f1534.position(0);
                    this.f1533 = ByteBuffer.allocateDirect(shortBufferWrap.position() * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
                    this.f1533.put(shortBufferWrap.array(), 0, shortBufferWrap.position());
                    this.f1533.position(0);
                } catch (IllegalArgumentException e) {
                    throw new nv(e, "tmp_vb.position()=" + floatBufferWrap.position());
                }
            }

            /* renamed from: 鷭, reason: contains not printable characters */
            private void m636(hr hrVar, int i, int i2, int i3, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, ByteBuffer byteBuffer, ShortBuffer shortBuffer, hr[] hrVarArr, String[] strArr) {
                float[] fArr;
                hr hrVar2 = hs.this.f1522;
                ud.C0086 c0086 = hrVar.f1504.f5018[i];
                ud.C0086.C0087 c0087 = c0086.f5028[i2];
                ud.C0086.C0087.Cif cif = c0087.f5033[i3];
                hr.C0048 c0048 = cif.f5045 > 0 ? hrVar.f1501[cif.f5044] : hrVar.f1500[cif.f5044];
                lr lrVar = new lr(0.0f, c0048.f1514, 0.0f);
                lr lrVar2 = new lr(0.0f, 0.0f, 0.0f);
                lr lrVar3 = new lr(c0048.f1513, c0048.f1514, 0.0f);
                lr lrVar4 = new lr(c0048.f1513, 0.0f, 0.0f);
                lr[] lrVarArr = {lrVar, lrVar2, lrVar3, lrVar4};
                for (lr lrVar5 : lrVarArr) {
                    lrVar5.f2020 = (float) (lrVar5.f2020 - Math.ceil(c0048.f1513 / 2.0d));
                    lrVar5.f2019 = (float) (lrVar5.f2019 - Math.ceil(c0048.f1514 / 2.0d));
                }
                for (lr lrVar6 : lrVarArr) {
                    lrVar6.f2020 *= cif.f5038;
                    lrVar6.f2019 *= cif.f5039;
                }
                if (cif.f5040 != 0) {
                    C0753 c0753M1449 = C0753.m1449((cif.f5040 / 180.0f) * 3.1415927f, 0.0f, 0.0f, 1.0f);
                    for (lr lrVar7 : lrVarArr) {
                        float[] fArr2 = new float[4];
                        Matrix.multiplyMV(fArr2, 0, c0753M1449.f7745, 0, new float[]{lrVar7.f2020, lrVar7.f2019, lrVar7.f2018, 1.0f}, 0);
                        lrVar7.f2020 = fArr2[0];
                        lrVar7.f2019 = fArr2[1];
                        lrVar7.f2018 = fArr2[2];
                    }
                }
                for (lr lrVar8 : lrVarArr) {
                    lrVar8.f2020 += cif.f5049;
                    lrVar8.f2019 += cif.f5047;
                }
                if (hrVar2 != null && hrVar != hrVar2 && c0087.f5031 != null && hrVar2 != null && hrVar2.f1504 != null && hrVar2.f1504.f5018 != null && c0087.f5031 != null && c0087.f5031.length > 0) {
                    int iMin = Math.min(i, hrVar2.f1504.f5018.length - 1);
                    if (hrVar2.f1504.f5018[iMin] != null && hrVar2.f1504.f5018[iMin].f5028 != null) {
                        ud.C0086 c00862 = hrVar2.f1504.f5018[iMin];
                        ud.C0086.C0087 c00872 = c00862.f5028[(i2 * c00862.f5028.length) / c0086.f5028.length];
                        if (c00872 != null && c00872.f5031 != null && c00872.f5031.length > 0) {
                            for (lr lrVar9 : lrVarArr) {
                                lrVar9.f2020 += c00872.f5031[0].f5053;
                                lrVar9.f2019 += c00872.f5031[0].f5052;
                                lrVar9.f2020 -= c0087.f5031[0].f5053;
                                lrVar9.f2019 -= c0087.f5031[0].f5052;
                            }
                        }
                    }
                }
                short sPosition = (short) (floatBuffer.position() / 4);
                if (sPosition < 0) {
                    Log.e("AndRO", "Index buffer too large");
                    throw new nv("Index buffer too large");
                }
                short[] sArr = {(short) (sPosition + 0), (short) (sPosition + 1), (short) (sPosition + 2), (short) (sPosition + 2), (short) (sPosition + 1), (short) (sPosition + 3)};
                float f = 0.05f * sPosition;
                float[] fArr3 = {lrVar.f2020, -lrVar.f2019, -f, 0.0f, lrVar2.f2020, -lrVar2.f2019, -f, 0.0f, lrVar3.f2020, -lrVar3.f2019, -f, 0.0f, lrVar4.f2020, -lrVar4.f2019, -f, 0.0f};
                if (cif.f5042 == 1) {
                    fArr = new float[]{c0048.f1513, c0048.f1514, 0.0f, 0.0f, c0048.f1513, 0.0f, 0.0f, 0.0f, 0.0f, c0048.f1514, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                } else {
                    fArr = new float[]{0.0f, c0048.f1514, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0048.f1513, c0048.f1514, 0.0f, 0.0f, c0048.f1513, 0.0f, 0.0f, 0.0f};
                }
                String str = null;
                if (hrVarArr != null && strArr != null) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= hrVarArr.length) {
                            break;
                        }
                        if (hrVarArr[i4] != hrVar || strArr[i4] == null) {
                            i4++;
                        } else {
                            str = strArr[i4];
                            break;
                        }
                    }
                }
                ot otVar = new ot();
                int i5 = cif.f5037;
                otVar.f3372 = (byte) ((i5 >> 24) & 255);
                otVar.f3375 = (byte) ((i5 >> 16) & 255);
                otVar.f3374 = (byte) ((i5 >> 8) & 255);
                otVar.f3373 = (byte) ((i5 >> 0) & 255);
                byte[] bArr = {otVar.f3375, otVar.f3374, otVar.f3373, otVar.f3372, otVar.f3375, otVar.f3374, otVar.f3373, otVar.f3372, otVar.f3375, otVar.f3374, otVar.f3373, otVar.f3372, otVar.f3375, otVar.f3374, otVar.f3373, otVar.f3372};
                floatBuffer.put(fArr3);
                floatBuffer2.put(fArr);
                byteBuffer.put(bArr);
                shortBuffer.put(sArr);
                this.f1528.add(new oh(c0048, cv.f1007.get(str)));
            }
        }

        C0049(hr[] hrVarArr, int i, hr[] hrVarArr2, String[] strArr) {
            int iMax = 0;
            for (hr hrVar : hrVarArr) {
                if (hrVar != null) {
                    iMax = Math.max(hrVar.f1504.f5018[i >= hrVar.f1504.f5018.length ? 0 : i].f5028.length, iMax);
                }
            }
            this.f1527 = new C0050[Math.max(1, iMax)];
            for (int i2 = 0; i2 < this.f1527.length; i2++) {
                this.f1527[i2] = new C0050(this, hrVarArr, i, i2, hrVarArr2, strArr, null);
            }
        }
    }

    protected hs() {
    }

    hs(hr hrVar, hr[] hrVarArr) {
        m634(hrVar, hrVarArr);
    }

    hs(hr hrVar) {
        m634(hrVar, (hr[]) null);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    protected final void m634(hr hrVar, hr[] hrVarArr) {
        this.f1522 = hrVar;
        if (hrVarArr != null) {
            this.f1521 = hrVarArr;
        } else {
            this.f1521 = new hr[]{hrVar};
        }
        m630();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m630() {
        int iMax = 0;
        for (hr hrVar : this.f1521) {
            if (hrVar != null && hrVar.f1504 != null) {
                iMax = Math.max(hrVar.f1504.f5018.length, iMax);
            }
        }
        if (iMax == 0) {
            iMax = 1;
        }
        this.f1524 = new C0049[iMax];
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    void mo633(int i) {
        if (this.f1524[i] != null) {
            return;
        }
        this.f1524[i] = new C0049(this.f1521, i, this.f1523, this.f1525);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final C0049.C0050 m632(int i, int i2) {
        int i3 = i;
        if (i3 >= this.f1524.length) {
            i3 = 0;
        }
        if (this.f1524[i3] == null) {
            mo633(i3);
        }
        C0049 c0049 = this.f1524[i3];
        return c0049.f1527[i2 % c0049.f1527.length];
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static void m631(hr hrVar, int i, int i2, hr hrVar2, int[] iArr, int[] iArr2, int i3, int i4, int i5) {
        ud.C0086.C0087 c0087 = hrVar.f1504.f5018[i].f5028[i2];
        for (ud.C0086.C0087.Cif cif : c0087.f5033) {
            if (cif.f5044 != -1) {
                hr.C0048 c0048 = cif.f5045 > 0 ? hrVar.f1501[cif.f5044] : hrVar.f1500[cif.f5044];
                if (c0048 != null) {
                    byte[] bArr = c0048.f1520;
                    int[] iArr3 = new int[256];
                    int[] iArr4 = iArr;
                    if (iArr == null) {
                        iArr4 = c0048.f1518;
                    }
                    if (iArr4 == null) {
                        iArr4 = hrVar.f1502;
                    }
                    for (int i6 = 0; i6 < 256; i6++) {
                        int i7 = iArr4[i6];
                        iArr3[i6] = (i7 & (-16711936)) | ((i7 & 16711680) >> 16) | ((i7 & 255) << 16);
                    }
                    int[] iArr5 = new int[bArr.length];
                    for (int i8 = 0; i8 < bArr.length; i8++) {
                        iArr5[i8] = iArr3[pa.m967(bArr[i8])];
                    }
                    int[] iArr6 = {c0048.f1513 / 1, c0048.f1514 / 1};
                    int iCeil = cif.f5049 - ((int) Math.ceil(iArr6[0] / 2.0d));
                    int iCeil2 = cif.f5047 - ((int) Math.ceil(iArr6[1] / 2.0d));
                    if (hrVar2 != null) {
                        ud.C0086.C0087.C0088[] c0088Arr = hrVar2.f1504.f5018[i].f5028[i2].f5031;
                        iCeil += (c0088Arr != null ? c0088Arr[0].f5053 : 0) - c0087.f5031[0].f5053;
                        iCeil2 += (c0088Arr != null ? c0088Arr[0].f5052 : 0) - c0087.f5031[0].f5052;
                    }
                    pa.m982(iArr2, i3, i5 + (iCeil / 1), ((i4 * 4) / 5) + (iCeil2 / 1), iArr5, c0048.f1513, c0048.f1513, c0048.f1514);
                }
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final int[] m635(int[][] iArr, int i, int i2, int i3, int i4, int i5) {
        hr hrVar;
        int[] iArr2 = new int[i3 * i4];
        hr hrVar2 = this.f1521[0];
        for (int i6 = 0; i6 < this.f1521.length; i6++) {
            if (this.f1521[i6] != null) {
                if (i6 == 0) {
                    hrVar = null;
                } else {
                    hrVar = hrVar2;
                }
                int[] iArr3 = null;
                if (iArr != null && i6 < iArr.length) {
                    iArr3 = iArr[i6];
                }
                m631(this.f1521[i6], i, i2, hrVar, iArr3, iArr2, i3, i4, i5);
            }
        }
        return iArr2;
    }
}
