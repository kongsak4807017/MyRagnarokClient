package o;

import android.util.FloatMath;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class uk {

    /* renamed from: Ą, reason: contains not printable characters */
    public String[] f5278;

    /* renamed from: ą, reason: contains not printable characters */
    public float[] f5279;

    /* renamed from: Ć, reason: contains not printable characters */
    public float[] f5280;

    /* renamed from: ć, reason: contains not printable characters */
    public float[] f5281;

    /* renamed from: ȃ, reason: contains not printable characters */
    public int f5282;

    /* renamed from: Ȋ, reason: contains not printable characters */
    public int[] f5283;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public int f5284;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public int[] f5285;

    /* renamed from: 岱, reason: contains not printable characters */
    public char[] f5286;

    /* renamed from: 櫯, reason: contains not printable characters */
    public int f5287;

    /* renamed from: 鷭, reason: contains not printable characters */
    public int f5288;

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1126(C0112 c0112, int i, int i2) {
        this.f5285[i2] = i;
        this.f5286[i2] = (char) ((c0112.f5305 << 4) + c0112.f5304);
        int i3 = i2 << 2;
        this.f5281[i3 + 0] = c0112.f5302 * 0.003921569f;
        this.f5281[i3 + 1] = c0112.f5303 * 0.003921569f;
        this.f5281[i3 + 2] = c0112.f5321 * 0.003921569f;
        this.f5281[i3 + 3] = c0112.f5313 * 0.003921569f;
        int i4 = i3 << 1;
        if (c0112.f5318[0] >= c0112.f5318[1]) {
            this.f5279[i4 + 2] = c0112.f5318[1];
            this.f5279[i4 + 6] = c0112.f5318[0];
            this.f5279[i4 + 0] = c0112.f5318[2];
            this.f5279[i4 + 4] = c0112.f5318[3];
            this.f5280[i4 + 2] = c0112.f5296 + c0112.f5298;
            this.f5280[i4 + 6] = c0112.f5296;
            this.f5280[i4 + 0] = c0112.f5296 + c0112.f5298;
            this.f5280[i4 + 4] = c0112.f5296;
        } else {
            this.f5279[i4 + 2] = c0112.f5318[0];
            this.f5279[i4 + 6] = c0112.f5318[1];
            this.f5279[i4 + 0] = c0112.f5318[3];
            this.f5279[i4 + 4] = c0112.f5318[2];
            this.f5280[i4 + 2] = c0112.f5296;
            this.f5280[i4 + 6] = c0112.f5296 + c0112.f5298;
            this.f5280[i4 + 0] = c0112.f5296;
            this.f5280[i4 + 4] = c0112.f5296 + c0112.f5298;
        }
        if (c0112.f5314[1] >= c0112.f5314[2]) {
            this.f5279[i4 + 7] = c0112.f5314[2];
            this.f5279[i4 + 5] = c0112.f5314[1];
            this.f5279[i4 + 3] = c0112.f5314[3];
            this.f5279[i4 + 1] = c0112.f5314[0];
            this.f5280[i4 + 7] = c0112.f5297 + c0112.f5299;
            this.f5280[i4 + 5] = c0112.f5297;
            this.f5280[i4 + 3] = c0112.f5297 + c0112.f5299;
            this.f5280[i4 + 1] = c0112.f5297;
        } else {
            this.f5279[i4 + 7] = c0112.f5314[1];
            this.f5279[i4 + 5] = c0112.f5314[2];
            this.f5279[i4 + 3] = c0112.f5314[0];
            this.f5279[i4 + 1] = c0112.f5314[3];
            this.f5280[i4 + 7] = c0112.f5297;
            this.f5280[i4 + 5] = c0112.f5297 + c0112.f5299;
            this.f5280[i4 + 3] = c0112.f5297;
            this.f5280[i4 + 1] = c0112.f5297 + c0112.f5299;
        }
        float fSin = FloatMath.sin(c0112.f5301 * 0.0061359233f);
        float fCos = FloatMath.cos(c0112.f5301 * 0.0061359233f);
        for (int i5 = 0; i5 < 8; i5 += 2) {
            float f = this.f5279[i4 + i5 + 0];
            float f2 = this.f5279[i4 + i5 + 1];
            this.f5279[i4 + i5 + 0] = (((f * fCos) - (f2 * fSin)) + c0112.f5310) - 320.0f;
            this.f5279[i4 + i5 + 1] = (((f * fSin) + (f2 * fCos)) + c0112.f5308) - 320.0f;
        }
    }

    public uk(ByteBuffer byteBuffer) throws IOException {
        ow owVar = ow.LATIN;
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        if (!pa.m978(bArr, owVar).equals("STRM")) {
            throw new IOException("Invalid file magic");
        }
        this.f5288 = byteBuffer.getInt();
        if (this.f5288 != 148) {
            throw new RuntimeException("Invalid file version: " + this.f5288);
        }
        this.f5282 = byteBuffer.getInt();
        this.f5287 = byteBuffer.getInt();
        int i = byteBuffer.getInt();
        byteBuffer.get(new byte[24]);
        Cif[] cifArr = new Cif[i - 1];
        for (int i2 = 0; i2 < cifArr.length; i2++) {
            cifArr[i2] = new Cif(byteBuffer);
        }
        boolean z = false;
        int i3 = 0;
        ArrayList arrayList = new ArrayList();
        Integer numValueOf = 0;
        this.f5284 = 0;
        for (Cif cif : cifArr) {
            for (int i4 = 0; i4 < cif.f5295.length; i4++) {
                int[] iArr = cif.f5294;
                int iIndexOf = arrayList.indexOf(cif.f5295[i4]);
                iArr[i4] = iIndexOf;
                if (iIndexOf < 0) {
                    int[] iArr2 = cif.f5294;
                    Integer num = numValueOf;
                    numValueOf = Integer.valueOf(num.intValue() + 1);
                    iArr2[i4] = num.intValue();
                    arrayList.add(cif.f5295[i4]);
                }
            }
            cif.f5295 = null;
            C0112[] c0112Arr = cif.f5293;
            for (C0112 c0112 : c0112Arr) {
                if (c0112.f5317 == 0) {
                    if (z) {
                        this.f5284 += c0112.f5320 - i3;
                    }
                    this.f5284++;
                    i3 = c0112.f5320 + 1;
                    z = false;
                } else {
                    i3 = i3 < c0112.f5320 ? c0112.f5320 : i3;
                    z = true;
                }
            }
        }
        this.f5279 = new float[this.f5284 * 8];
        this.f5280 = new float[this.f5284 * 8];
        this.f5281 = new float[this.f5284 * 4];
        this.f5286 = new char[this.f5284];
        this.f5285 = new int[this.f5284];
        this.f5283 = new int[this.f5287 + 2];
        this.f5284 = 0;
        this.f5283[0] = 0;
        for (int i5 = 0; i5 <= this.f5287; i5++) {
            for (Cif cif2 : cifArr) {
                if (cif2.f5292.f5320 <= i5) {
                    while (cif2.f5290 < cif2.f5293.length - 1 && cif2.f5293[cif2.f5290 + 1].f5320 <= i5) {
                        cif2.f5290++;
                        if (cif2.f5293[cif2.f5290].f5317 == 0) {
                            cif2.f5292 = cif2.f5293[cif2.f5290];
                            cif2.f5289 = null;
                        } else {
                            cif2.f5289 = cif2.f5293[cif2.f5290];
                        }
                    }
                    if (cif2.f5289 != null) {
                        cif2.f5292.m1127(cif2.f5289, cif2.f5294.length);
                    } else if (cif2.f5292.f5320 >= i5) {
                    }
                    C0112 c01122 = cif2.f5292;
                    int i6 = cif2.f5294[cif2.f5292.f5319];
                    int i7 = this.f5284;
                    this.f5284 = i7 + 1;
                    m1126(c01122, i6, i7);
                }
            }
            this.f5283[i5 + 1] = this.f5284;
        }
        this.f5278 = new String[arrayList.size()];
        arrayList.toArray(this.f5278);
    }

    /* renamed from: o.uk$if, reason: invalid class name */
    public class Cif {

        /* renamed from: Ą, reason: contains not printable characters */
        C0112 f5289;

        /* renamed from: ą, reason: contains not printable characters */
        int f5290;

        /* renamed from: ȃ, reason: contains not printable characters */
        C0112 f5292;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        C0112[] f5293;

        /* renamed from: 櫯, reason: contains not printable characters */
        int[] f5294;

        /* renamed from: 鷭, reason: contains not printable characters */
        String[] f5295;

        Cif(ByteBuffer byteBuffer) {
            int i = byteBuffer.getInt();
            this.f5295 = new String[i];
            this.f5294 = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                String[] strArr = this.f5295;
                ow owVar = ow.KOREAN;
                byte[] bArr = new byte[128];
                byteBuffer.get(bArr);
                strArr[i2] = pa.m978(bArr, owVar);
            }
            this.f5293 = new C0112[byteBuffer.getInt()];
            for (int i3 = 0; i3 < this.f5293.length; i3++) {
                this.f5293[i3] = uk.this.new C0112(byteBuffer);
            }
            this.f5292 = this.f5293[0];
            this.f5290 = 0;
        }
    }

    /* renamed from: o.uk$鷭, reason: contains not printable characters */
    public class C0112 {

        /* renamed from: Ą, reason: contains not printable characters */
        public float f5296;

        /* renamed from: ą, reason: contains not printable characters */
        public float f5297;

        /* renamed from: Ć, reason: contains not printable characters */
        public float f5298;

        /* renamed from: ć, reason: contains not printable characters */
        public float f5299;

        /* renamed from: ċ, reason: contains not printable characters */
        public float f5300;

        /* renamed from: đ, reason: contains not printable characters */
        public float f5301;

        /* renamed from: Ē, reason: contains not printable characters */
        public float f5302;

        /* renamed from: ē, reason: contains not printable characters */
        public float f5303;

        /* renamed from: Ė, reason: contains not printable characters */
        public int f5304;

        /* renamed from: ė, reason: contains not printable characters */
        public int f5305;

        /* renamed from: Ę, reason: contains not printable characters */
        public int f5306;

        /* renamed from: ȃ, reason: contains not printable characters */
        public float f5308;

        /* renamed from: Ȋ, reason: contains not printable characters */
        public float f5309;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public float f5310;

        /* renamed from: ˮ͍, reason: contains not printable characters */
        public float f5311;

        /* renamed from: ܕ, reason: contains not printable characters */
        public int f5312;

        /* renamed from: 㥳, reason: contains not printable characters */
        public float f5313;

        /* renamed from: 岱, reason: contains not printable characters */
        public float f5315;

        /* renamed from: 庸, reason: contains not printable characters */
        public float f5316;

        /* renamed from: 櫯, reason: contains not printable characters */
        public int f5317;

        /* renamed from: 躆, reason: contains not printable characters */
        public int f5319;

        /* renamed from: 鷭, reason: contains not printable characters */
        public int f5320;

        /* renamed from: 띥, reason: contains not printable characters */
        public float f5321;

        /* renamed from: 纫, reason: contains not printable characters */
        public float[] f5318 = new float[4];

        /* renamed from: 䒧, reason: contains not printable characters */
        public float[] f5314 = new float[4];

        C0112(ByteBuffer byteBuffer) {
            this.f5320 = byteBuffer.getInt();
            this.f5317 = byteBuffer.getInt();
            this.f5310 = byteBuffer.getFloat();
            this.f5308 = byteBuffer.getFloat();
            this.f5296 = byteBuffer.getFloat();
            this.f5297 = byteBuffer.getFloat();
            this.f5298 = byteBuffer.getFloat();
            this.f5299 = byteBuffer.getFloat();
            this.f5311 = byteBuffer.getFloat();
            this.f5315 = byteBuffer.getFloat();
            this.f5309 = byteBuffer.getFloat();
            this.f5300 = byteBuffer.getFloat();
            oy.m949(byteBuffer, this.f5318);
            oy.m949(byteBuffer, this.f5314);
            this.f5319 = (int) byteBuffer.getFloat();
            this.f5312 = byteBuffer.getInt();
            this.f5316 = byteBuffer.getFloat();
            this.f5301 = byteBuffer.getFloat();
            this.f5302 = byteBuffer.getFloat();
            this.f5303 = byteBuffer.getFloat();
            this.f5321 = byteBuffer.getFloat();
            this.f5313 = byteBuffer.getFloat();
            this.f5304 = byteBuffer.getInt();
            this.f5305 = byteBuffer.getInt();
            this.f5306 = byteBuffer.getInt();
            if (this.f5305 == 7) {
                this.f5305 = 2;
            }
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        final void m1127(C0112 c0112, int i) {
            this.f5310 += c0112.f5310;
            this.f5308 += c0112.f5308;
            this.f5296 += c0112.f5296;
            this.f5297 += c0112.f5297;
            this.f5298 += c0112.f5298;
            this.f5299 += c0112.f5299;
            this.f5311 += c0112.f5311;
            this.f5315 += c0112.f5315;
            this.f5309 += c0112.f5309;
            this.f5300 += c0112.f5300;
            for (int i2 = 0; i2 < 4; i2++) {
                float[] fArr = this.f5318;
                fArr[i2] = fArr[i2] + c0112.f5318[i2];
                float[] fArr2 = this.f5314;
                fArr2[i2] = fArr2[i2] + c0112.f5314[i2];
            }
            this.f5302 += c0112.f5302;
            this.f5303 += c0112.f5303;
            this.f5321 += c0112.f5321;
            this.f5313 += c0112.f5313;
            this.f5301 += c0112.f5301;
            switch (c0112.f5312) {
                case 1:
                    this.f5319 += c0112.f5319;
                    break;
                case 2:
                    this.f5319 += c0112.f5319;
                    if (this.f5319 >= i) {
                        this.f5319 = i - 1;
                        break;
                    }
                    break;
                case 3:
                    this.f5319 += c0112.f5319;
                    this.f5319 %= i;
                    break;
                case 4:
                    this.f5319 -= c0112.f5319;
                    while (this.f5319 < 0) {
                        this.f5319 += i;
                    }
                    break;
            }
        }
    }
}
