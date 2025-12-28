package o;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import o.iu;

/* renamed from: o.즸, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1106 extends co {

    /* renamed from: Ą, reason: contains not printable characters */
    EnumC1107 f8889;

    /* renamed from: ą, reason: contains not printable characters */
    mj f8890;

    /* renamed from: Ć, reason: contains not printable characters */
    float f8891 = 1.0f;

    /* renamed from: ȃ, reason: contains not printable characters */
    ne f8892;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    boolean f8893;

    /* renamed from: 櫯, reason: contains not printable characters */
    long f8894;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f8895;

    /* renamed from: ć, reason: contains not printable characters */
    static long f8883 = 1500;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    static float f8886 = 0.06f;

    /* renamed from: 岱, reason: contains not printable characters */
    static float f8887 = 0.5f;

    /* renamed from: Ȋ, reason: contains not printable characters */
    static float f8885 = 0.08f;

    /* renamed from: ċ, reason: contains not printable characters */
    static float f8884 = 0.1f;

    /* renamed from: 纫, reason: contains not printable characters */
    static float f8888 = 0.5f;

    /* renamed from: o.즸$鷭, reason: contains not printable characters */
    enum EnumC1107 {
        LEFT,
        RIGHT,
        UP;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC1107[] valuesCustom() {
            EnumC1107[] enumC1107ArrValuesCustom = values();
            int length = enumC1107ArrValuesCustom.length;
            EnumC1107[] enumC1107Arr = new EnumC1107[length];
            System.arraycopy(enumC1107ArrValuesCustom, 0, enumC1107Arr, 0, length);
            return enumC1107Arr;
        }
    }

    C1106(int i, md mdVar, long j, ne neVar) {
        C1106 c1106;
        EnumC1107 enumC1107;
        hr hrVar = C0358.f6669.f2048.f1540;
        hr hrVar2 = C0358.f6669.f2048.f1541;
        boolean z = mdVar.f2123.f1997 == nu.PC;
        int i2 = neVar == ne.CRITICAL ? 1 : 0;
        this.f8892 = neVar;
        this.f8895 = i;
        this.f8894 = j;
        this.f8890 = mdVar;
        this.f8893 = z;
        if (this.f8892 == ne.HEAL || this.f8892 == ne.SP_HEAL) {
            c1106 = this;
            enumC1107 = EnumC1107.UP;
        } else {
            if (this.f8892 == ne.FIXED_DIR) {
                c1106 = this;
            } else {
                c1106 = this;
                if (Math.random() > 0.5d) {
                    enumC1107 = EnumC1107.LEFT;
                }
            }
            enumC1107 = EnumC1107.RIGHT;
        }
        c1106.f8889 = enumC1107;
        int[] iArr = new int[12];
        int i3 = 0;
        while (i3 < iArr.length) {
            iArr[i3] = i % 10;
            i /= 10;
            if (i == 0) {
                break;
            } else {
                i3++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i3 + 1);
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect((iArrCopyOf.length + 1) * 48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect((iArrCopyOf.length + 1) * 64).order(ByteOrder.nativeOrder()).asFloatBuffer();
        ShortBuffer shortBufferWrap = ShortBuffer.wrap(new short[(iArrCopyOf.length + 1) * 6]);
        lq lqVar = new lq(f8886 / (C0358.f6669.f2058.x / C0358.f6669.f2058.y), f8886);
        lq lqVar2 = new lq();
        lq lqVar3 = new lq();
        if (neVar == ne.CRITICAL && !this.f8893) {
            lqVar2.f2017 = lqVar.f2017 * ((((iArrCopyOf.length / 2.0f) - 0.5f) - iArrCopyOf.length) - 1.0f);
            lqVar2.f2016 = lqVar.f2016 * 3.0f;
            lqVar3.f2017 = lqVar.f2017 * (((iArrCopyOf.length / 2.0f) - 0.5f) + 2.0f);
            lqVar3.f2016 = lqVar.f2016 * (-3.0f);
            C0358.f6669.f2048.f1554.m691(hrVar2.f1500[3].f1520, hrVar2.f1502 != null ? hrVar2.f1502 : hrVar2.f1500[3].f1518, hrVar2.f1500[3].f1513, hrVar2.f1500[3].f1514, String.valueOf(hrVar2.f1507) + 3, null);
            C0851 c0851 = C0358.f6669.f2066;
            RunnableC1082 runnableC1082 = new RunnableC1082(this);
            synchronized (c0851) {
                c0851.f7979.add(runnableC1082);
            }
            iu.Cif cif = C0358.f6669.f2048.f1554.f1675.get(String.valueOf(hrVar2.f1507) + 3);
            if (cif != null) {
                float[] fArr = {lqVar2.f2017, lqVar2.f2016, cif.f1686, lqVar2.f2017, lqVar3.f2016, cif.f1686, lqVar3.f2017, lqVar2.f2016, cif.f1686, lqVar3.f2017, lqVar3.f2016, cif.f1686};
                floatBufferAsFloatBuffer2.put(cif.m695());
                floatBufferAsFloatBuffer.put(fArr);
                shortBufferWrap.put(new short[]{0, 1, 2, 2, 1, 3});
            }
        }
        for (int i4 = 0; i4 < iArrCopyOf.length; i4++) {
            float length = ((iArrCopyOf.length / 2.0f) - 0.5f) - i4;
            int i5 = iArrCopyOf[i4];
            lqVar2.f2017 = lqVar.f2017 * (length - ((hrVar.f1500[i5].f1513 * 0.5f) / 8.0f));
            lqVar2.f2016 = lqVar.f2016 * ((hrVar.f1500[i5].f1514 * 1.0f) / 11.0f);
            lqVar3.f2017 = lqVar.f2017 * (length + ((hrVar.f1500[i5].f1513 * 0.5f) / 8.0f));
            lqVar3.f2016 = lqVar.f2016 * ((hrVar.f1500[i5].f1514 * (-1.0f)) / 11.0f);
            String str = String.valueOf(hrVar.f1507) + i5;
            if (!(C0358.f6669.f2048.f1554.f1675.get(str) != null)) {
                C0358.f6669.f2048.f1554.m691(hrVar.f1500[i5].f1520, hrVar.f1502 != null ? hrVar.f1502 : hrVar.f1500[i5].f1518, hrVar.f1500[i5].f1513, hrVar.f1500[i5].f1514, str, hrVar.f1507);
                C0851 c08512 = C0358.f6669.f2066;
                RunnableC0695 runnableC0695 = new RunnableC0695(this);
                synchronized (c08512) {
                    c08512.f7979.add(runnableC0695);
                }
            }
            iu.Cif cif2 = C0358.f6669.f2048.f1554.f1675.get(str);
            if (cif2 != null) {
                float[] fArr2 = {lqVar2.f2017, lqVar2.f2016, cif2.f1686, lqVar2.f2017, lqVar3.f2016, cif2.f1686, lqVar3.f2017, lqVar2.f2016, cif2.f1686, lqVar3.f2017, lqVar3.f2016, cif2.f1686};
                floatBufferAsFloatBuffer2.put(cif2.m695());
                floatBufferAsFloatBuffer.put(fArr2);
                shortBufferWrap.put(new short[]{(short) (((i4 + i2) * 4) + 0), (short) (((i4 + i2) * 4) + 1), (short) (((i4 + i2) * 4) + 2), (short) (((i4 + i2) * 4) + 2), (short) (((i4 + i2) * 4) + 1), (short) (((i4 + i2) * 4) + 3)});
            }
        }
        floatBufferAsFloatBuffer.position(0);
        shortBufferWrap.position(0);
        floatBufferAsFloatBuffer2.position(0);
        this.f948 = floatBufferAsFloatBuffer;
        this.f950 = floatBufferAsFloatBuffer2;
        this.f947 = shortBufferWrap;
        m1634(j);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final boolean m1634(long j) {
        float f = ((j - this.f8894) * 100) / f8883;
        float f2 = 100.0f - f;
        if (f2 < 50.0f) {
            this.f8891 = f2 / 50.0f;
        } else {
            this.f8891 = 1.0f;
        }
        if (this.f8891 < 0.0f) {
            this.f8891 = 0.0f;
        }
        if (this.f8891 > 0.0f) {
            if (this.f8889 == EnumC1107.LEFT || this.f8889 == EnumC1107.RIGHT) {
                float f3 = ((f8888 * f) * f8887) / 100.0f;
                float fPow = f8888 * 7.0f * (f8885 - ((float) Math.pow(((f8887 * f) - 30.0f) / 100.0d, 2.0d)));
                if (this.f8889 == EnumC1107.LEFT) {
                    f3 = -f3;
                }
                mj mjVar = this.f8890;
                ly lyVar = C0358.f6669;
                lq lqVarM810 = ly.m810(mjVar.f2076);
                lqVarM810.f2017 += f3;
                lqVarM810.f2016 += fPow;
                lq lqVar = this.f945;
                lqVar.f2017 = lqVarM810.f2017;
                lqVar.f2016 = lqVarM810.f2016;
                lq lqVar2 = new lq(1.0f, 1.0f);
                if (f2 < 70.0f) {
                    float f4 = (f2 / 100.0f) + 0.3f;
                    lqVar2.f2016 = f4;
                    lqVar2.f2017 = f4;
                }
                lq lqVar3 = this.f946;
                lqVar3.f2017 = lqVar2.f2017;
                lqVar3.f2016 = lqVar2.f2016;
                mo481();
            } else if (this.f8889 == EnumC1107.UP) {
                mj mjVar2 = this.f8890;
                ly lyVar2 = C0358.f6669;
                lq lqVarM8102 = ly.m810(mjVar2.f2076);
                float f5 = f8884 + (f / 500.0f);
                lqVarM8102.f2017 += 0.0f;
                lqVarM8102.f2016 += f5;
                lq lqVar4 = this.f945;
                lqVar4.f2017 = lqVarM8102.f2017;
                lqVar4.f2016 = lqVarM8102.f2016;
                lq lqVar5 = new lq(0.5f, 0.5f);
                lq lqVar6 = this.f946;
                lqVar6.f2017 = lqVar5.f2017;
                lqVar6.f2016 = lqVar5.f2016;
                mo481();
            } else {
                String str = "unexpected damage direction: " + this.f8889;
                Log.e("AndRO", str);
                throw new nv(str);
            }
        }
        if (this.f8892 == ne.HEAL) {
            float f6 = this.f8891;
            ou ouVar = this.f944;
            ouVar.f3378 = 0.0f;
            ouVar.f3377 = 1.0f;
            ouVar.f3376 = 0.0f;
            ouVar.f3379 = f6;
        } else if (this.f8892 == ne.SP_HEAL) {
            float f7 = this.f8891;
            ou ouVar2 = this.f944;
            ouVar2.f3378 = 0.0f;
            ouVar2.f3377 = 0.0f;
            ouVar2.f3376 = 1.0f;
            ouVar2.f3379 = f7;
        } else if (this.f8893) {
            float f8 = this.f8891;
            ou ouVar3 = this.f944;
            ouVar3.f3378 = 1.0f;
            ouVar3.f3377 = 0.0f;
            ouVar3.f3376 = 0.0f;
            ouVar3.f3379 = f8;
        } else {
            float f9 = this.f8891;
            ou ouVar4 = this.f944;
            ouVar4.f3378 = 1.0f;
            ouVar4.f3377 = 1.0f;
            ouVar4.f3376 = 1.0f;
            ouVar4.f3379 = f9;
        }
        return this.f8891 == 0.0f;
    }
}
