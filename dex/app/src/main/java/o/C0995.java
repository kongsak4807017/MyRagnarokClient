package o;

import android.opengl.Matrix;
import android.util.FloatMath;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import o.hr;

/* renamed from: o.귑, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0995 {

    /* renamed from: 㵼, reason: contains not printable characters */
    private static /* synthetic */ int[] f8426;

    /* renamed from: Ą, reason: contains not printable characters */
    public int f8429;

    /* renamed from: ć, reason: contains not printable characters */
    boolean f8432;

    /* renamed from: Ē, reason: contains not printable characters */
    float f8435;

    /* renamed from: ē, reason: contains not printable characters */
    EnumC0224 f8436;

    /* renamed from: Ė, reason: contains not printable characters */
    lr f8437;

    /* renamed from: Ę, reason: contains not printable characters */
    long f8439;

    /* renamed from: ę, reason: contains not printable characters */
    long f8440;

    /* renamed from: ȃ, reason: contains not printable characters */
    public int f8441;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    float f8443;

    /* renamed from: ঽ্, reason: contains not printable characters */
    C0996[] f8445;

    /* renamed from: 岱, reason: contains not printable characters */
    float f8449;

    /* renamed from: 廂, reason: contains not printable characters */
    long f8451;

    /* renamed from: 廅, reason: contains not printable characters */
    C0933 f8452;

    /* renamed from: 띥, reason: contains not printable characters */
    hr f8455;

    /* renamed from: 鷭, reason: contains not printable characters */
    static FloatBuffer f8428 = ByteBuffer.allocateDirect(2616).order(ByteOrder.nativeOrder()).asFloatBuffer();

    /* renamed from: 櫯, reason: contains not printable characters */
    static FloatBuffer f8427 = ByteBuffer.allocateDirect(2616).order(ByteOrder.nativeOrder()).asFloatBuffer();

    /* renamed from: ˮ͈, reason: contains not printable characters */
    static ShortBuffer f8425 = ByteBuffer.allocateDirect(1854).order(ByteOrder.nativeOrder()).asShortBuffer();

    /* renamed from: ą, reason: contains not printable characters */
    boolean f8430 = false;

    /* renamed from: Ć, reason: contains not printable characters */
    boolean f8431 = false;

    /* renamed from: Ȋ, reason: contains not printable characters */
    Cif[] f8442 = new Cif[4];

    /* renamed from: ċ, reason: contains not printable characters */
    Cif[] f8433 = new Cif[4];

    /* renamed from: 纫, reason: contains not printable characters */
    Cif[] f8453 = new Cif[4];

    /* renamed from: 䒧, reason: contains not printable characters */
    float f8447 = 0.0f;

    /* renamed from: 躆, reason: contains not printable characters */
    float f8454 = 1.0f;

    /* renamed from: ܕ, reason: contains not printable characters */
    float f8444 = 0.0f;

    /* renamed from: 庸, reason: contains not printable characters */
    float f8450 = 0.0f;

    /* renamed from: đ, reason: contains not printable characters */
    float[] f8434 = null;

    /* renamed from: 㥳, reason: contains not printable characters */
    lr f8446 = new lr(0.0f, 0.0f, 0.0f);

    /* renamed from: ė, reason: contains not printable characters */
    long f8438 = 20000;

    /* renamed from: 囃, reason: contains not printable characters */
    C0996 f8448 = new C0996();

    /* renamed from: 櫯, reason: contains not printable characters */
    static /* synthetic */ int[] m1573() {
        int[] iArr = f8426;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0224.valuesCustom().length];
        try {
            iArr2[EnumC0224.EP_2DFLASH.ordinal()] = 5;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0224.EP_2DTEXTURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0224.EP_2DTEXTURE_BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC0224.EP_3DCIRCLE.ordinal()] = 6;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC0224.EP_3DCYLINDER.ordinal()] = 8;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC0224.EP_3DHALFSPHERE.ordinal()] = 10;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC0224.EP_3DPARTICLE.ordinal()] = 11;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[EnumC0224.EP_3DRING.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[EnumC0224.EP_3DSPHERE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[EnumC0224.EP_CIRCLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[EnumC0224.EP_RING.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        f8426 = iArr2;
        return iArr2;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static void m1575(int i, float[] fArr) {
        if (i >= 0) {
            f8428.position(i * 3);
            f8427.position(i * 3);
        }
        for (int i2 = 0; i2 < fArr.length; i2 += 6) {
            f8428.put(fArr, i2, 3);
            f8427.put(fArr, i2 + 3, 3);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static void m1574(int i, int i2, int i3, int i4, int i5) {
        if (i >= 0) {
            f8425.position(i * 3);
        }
        f8425.put(new short[]{(short) (i2 + i3), (short) (i2 + i4), (short) (i2 + i5)});
    }

    static {
        m1575(-1, new float[]{-0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 4.0f, 0.5f, 0.5f, 0.0f, 1.0f, 0.0f, 4.0f, -0.5f, -0.5f, 0.0f, 0.0f, 1.0f, 4.0f, 0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 4.0f});
        m1574(-1, 0, 0, 1, 2);
        m1574(-1, 0, 2, 1, 3);
        m1575(-1, new float[]{-0.5f, 1.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.5f, 1.0f, 0.0f, 1.0f, 0.0f, 4.0f, -0.5f, 0.0f, 0.0f, 0.0f, 1.0f, 4.0f, 0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 4.0f});
        m1574(-1, 4, 0, 1, 2);
        m1574(-1, 4, 2, 1, 3);
        m1575(-1, new float[]{0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 4.0f, 0.5f, 1.0f, 0.0f, 1.0f, 1.0f, 4.0f, -0.5f, 1.0f, 0.0f, 0.0f, 1.0f, 4.0f});
        m1574(-1, 8, 0, 1, 2);
        m1575(-1, new float[]{0.0f, 0.0f, 0.0f, 0.5f, 1.0f, 4.0f});
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        short sPosition = (short) (f8428.position() / 3);
        for (int i = 0; i < 16; i++) {
            double d = 0.39269908169872414d * i;
            fArr[0] = FloatMath.sin((float) d);
            fArr[1] = FloatMath.cos((float) d);
            fArr[2] = 0.0f;
            fArr[3] = ((i & 4) > 0 ? 4 - (i & 3) : i & 3) * 0.25f;
            fArr[4] = 0.0f;
            fArr[5] = 4.0f;
            m1575(sPosition + i, fArr);
            fArr[4] = 1.0f;
            fArr[5] = 44.0f;
            m1575(sPosition + 16 + i, fArr);
            fArr[5] = 2.0f;
            m1575(sPosition + 32 + i, fArr);
            fArr[2] = 1.0f;
            fArr[4] = 0.0f;
            fArr[5] = 22.0f;
            m1575(sPosition + 48 + i, fArr);
            m1574(i + 5, sPosition, -1, i % 16, (i + 1) % 16);
            int i2 = (i % 16) + 16;
            int i3 = (i + 1) % 16;
            m1574((i * 2) + 21, sPosition, i % 16, i2, i3);
            m1574(-1, sPosition, i3, i2, ((i + 1) % 16) + 16);
            int i4 = sPosition + 32;
            int i5 = (i % 16) + 16;
            int i6 = (i + 1) % 16;
            m1574((i * 2) + 53, i4, i % 16, i5, i6);
            m1574(-1, i4, i6, i5, ((i + 1) % 16) + 16);
        }
        m1575(-1, new float[]{0.0f, 1.0f, 0.0f, 0.5f, 0.0f, 6.0f});
        short sPosition2 = (short) (f8428.position() / 3);
        fArr[5] = 6.0f;
        for (int i7 = 2; i7 < 16; i7 += 2) {
            double d2 = 0.19634954084936207d * i7;
            fArr[1] = FloatMath.cos((float) d2);
            fArr[4] = (i7 * 1.0f) / 16.0f;
            double dSin = Math.sin(d2);
            for (int i8 = 0; i8 <= 16; i8++) {
                double d3 = 0.39269908169872414d * i8;
                fArr[0] = (float) (Math.sin(d3) * dSin);
                fArr[2] = (float) (Math.cos(d3) * dSin);
                fArr[3] = (i8 * 1.0f) / 16.0f;
                m1575(-1, fArr);
            }
        }
        m1575(-1, new float[]{0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 6.0f});
        for (int i9 = 0; i9 < 16; i9++) {
            m1574(-1, sPosition2, -1, i9, i9 + 1);
        }
        int i10 = 1;
        while (i10 * 2 < 14) {
            for (int i11 = 0; i11 < 16; i11++) {
                int i12 = sPosition2 + ((i10 - 1) * 17);
                int i13 = i11 + 16 + 1;
                int i14 = i11 + 1;
                m1574(-1, i12, i11, i13, i14);
                m1574(-1, i12, i14, i13, i11 + 16 + 2);
            }
            i10++;
        }
        for (int i15 = 0; i15 < 16; i15++) {
            m1574(-1, ((i10 - 1) * 17) + sPosition2, 17, i15 + 1, i15);
        }
        f8428.position(0);
        f8427.position(0);
        f8425.position(0);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m1576() {
        if (this.f8455 != null) {
            this.f8455.m496();
        }
        this.f8455 = null;
        this.f8442 = null;
        this.f8433 = null;
        this.f8453 = null;
        this.f8445 = null;
    }

    C0995(C0933 c0933, EnumC0224 enumC0224) {
        this.f8432 = false;
        this.f8435 = 1.0f;
        this.f8452 = c0933;
        this.f8445 = new C0996[1];
        this.f8445[0] = this.f8448;
        int[] iArrM1573 = m1573();
        this.f8436 = enumC0224;
        switch (iArrM1573[enumC0224.ordinal()]) {
            case 1:
                this.f8441 = 0;
                this.f8429 = 2;
                this.f8435 = 0.14285715f;
                break;
            case 2:
                this.f8441 = 2;
                this.f8429 = 2;
                this.f8435 = 0.14285715f;
                break;
            case 3:
                this.f8441 = 5;
                this.f8429 = 16;
                this.f8435 = 0.14285715f;
                break;
            case 4:
                this.f8441 = 21;
                this.f8429 = 32;
                this.f8435 = 0.14285715f;
                break;
            case 5:
                this.f8441 = 4;
                this.f8429 = 1;
                this.f8435 = 0.14285715f;
                break;
            case 6:
                this.f8441 = 5;
                this.f8429 = 16;
                this.f8432 = true;
                break;
            case 7:
                this.f8441 = 21;
                this.f8429 = 32;
                this.f8432 = true;
                break;
            case 8:
                this.f8441 = 53;
                this.f8429 = 32;
                this.f8432 = true;
                break;
            case 9:
                this.f8441 = 85;
                this.f8429 = 224;
                this.f8432 = true;
                break;
            case 10:
                this.f8441 = 85;
                this.f8429 = 112;
                this.f8432 = true;
                break;
            case 11:
                this.f8441 = 0;
                this.f8429 = 2;
                this.f8435 = 0.14285715f;
                this.f8445 = null;
                break;
        }
        this.f8439 = c0933.f8229;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1577(Cif[] cifArr, int i, float f, float f2, float f3, float f4, float f5, float f6) {
        if (cifArr[i] == null) {
            cifArr[i] = new Cif();
        }
        cifArr[i].m1578(f, f2, f3, f4, f5, f6 > 0.0f ? f6 : this.f8438 / this.f8440);
    }

    /* renamed from: o.귑$if, reason: invalid class name */
    public class Cif {

        /* renamed from: 鷭, reason: contains not printable characters */
        float[] f8457 = {0.0f, 0.0f, 0.0f};

        public Cif() {
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        final void m1578(float f, float f2, float f3, float f4, float f5, float f6) {
            float f7 = 1.0f / f6;
            this.f8457[0] = f3 != 0.0f ? ((((float) Math.random()) * 2.0f) - 1.0f) * f3 : 0.0f;
            this.f8457[1] = (f3 < 0.0f ? 0.0f : -this.f8457[0]) + (((((float) Math.random()) * 2.0f) - 1.0f) * f4);
            float[] fArr = this.f8457;
            fArr[0] = fArr[0] + f;
            float[] fArr2 = this.f8457;
            fArr2[1] = fArr2[1] + (f2 - f);
            this.f8457[2] = ((f5 + f7) - 1.0f) * this.f8457[1] * f7;
            float[] fArr3 = this.f8457;
            fArr3[1] = fArr3[1] * (1.0f - f5);
        }
    }

    /* renamed from: o.귑$鷭, reason: contains not printable characters */
    class C0996 {

        /* renamed from: ć, reason: contains not printable characters */
        C0753 f8461;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        hr.C0048 f8463;

        /* renamed from: ˮ͍, reason: contains not printable characters */
        C0753 f8464;

        /* renamed from: 鷭, reason: contains not printable characters */
        long f8467;

        /* renamed from: 櫯, reason: contains not printable characters */
        float f8466 = 0.0f;

        /* renamed from: ȃ, reason: contains not printable characters */
        float[] f8462 = {1.0f, 1.0f, 1.0f, 1.0f};

        /* renamed from: Ą, reason: contains not printable characters */
        float[] f8458 = {0.0f, 0.0f, 0.0f};

        /* renamed from: ą, reason: contains not printable characters */
        float[] f8459 = {0.0f, 0.0f, 0.0f, 0.0f};

        /* renamed from: Ć, reason: contains not printable characters */
        float[] f8460 = {10.0f, 10.0f, 0.0f, 0.0f};

        C0996() {
            C0753 c0753 = new C0753();
            Matrix.setIdentityM(c0753.f7745, 0);
            this.f8461 = c0753;
            C0753 c07532 = new C0753();
            Matrix.setIdentityM(c07532.f7745, 0);
            this.f8464 = c07532;
        }

        C0996(C0996 c0996) {
            for (int i = 0; i < 4; i++) {
                this.f8463 = c0996.f8463;
                this.f8462[i] = c0996.f8462[i];
                this.f8459[i] = c0996.f8459[i];
                this.f8460[i] = c0996.f8460[i];
                if (i <= 2) {
                    this.f8458[i] = c0996.f8458[i];
                }
            }
            this.f8461 = new C0753((float[]) c0996.f8461.f7745.clone());
            this.f8464 = new C0753((float[]) c0996.f8464.f7745.clone());
        }
    }
}
