package o;

import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import o.iu;
import o.uf;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ir {

    /* renamed from: Ą, reason: contains not printable characters */
    int f1655;

    /* renamed from: ą, reason: contains not printable characters */
    int f1656;

    /* renamed from: Ć, reason: contains not printable characters */
    int f1657;

    /* renamed from: ć, reason: contains not printable characters */
    int f1658;

    /* renamed from: ȃ, reason: contains not printable characters */
    iu f1659;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    String[] f1660;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    boolean f1661;

    /* renamed from: 櫯, reason: contains not printable characters */
    float f1662;

    /* renamed from: 鷭, reason: contains not printable characters */
    ok[] f1663;

    ir() {
        this.f1659 = new iu(oc.f3239 ? 1 : 2, 0, 0, false);
        this.f1661 = false;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final boolean m682(uf ufVar, iu iuVar) {
        byte[] bArr;
        this.f1660 = new String[ufVar.f5080.f5106];
        int i = ufVar.f5080.f5106 > 0 ? 600 / ufVar.f5080.f5106 : 0;
        for (int i2 = 0; i2 < ufVar.f5080.f5106; i2++) {
            this.f1660[i2] = pa.m978(ufVar.f5080.f5104[i2].f5108, ow.KOREAN).trim();
            String str = "data\\texture\\" + this.f1660[i2];
            try {
                bArr = (byte[]) C0358.f6685.f1033.m519(str, false);
            } catch (uw unused) {
                bArr = (byte[]) C0358.f6685.f1033.m519("data\\texture\\black.bmp", false);
            }
            C0406 c0406M919 = od.m919(str, bArr);
            if (c0406M919 == null) {
                throw new nv("Failed to decode texture " + i2 + "(" + str + ")");
            }
            iuVar.m692(c0406M919.f6789, c0406M919.f6788, c0406M919.f6787.x, c0406M919.f6787.y, this.f1660[i2], null, iuVar.f1667);
            c_activity c_activityVar = C0358.f6674;
            c_activityVar.mo139(new RunnableC1147(c_activityVar, ((i * i2) / 100) + 45));
        }
        return true;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private final void m679(uf.C0091.C0092 c0092, FloatBuffer floatBuffer, ShortBuffer shortBuffer, FloatBuffer floatBuffer2, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, C1030 c1030) {
        int iPosition = floatBuffer.position() / 4;
        floatBuffer.put(fArr);
        floatBuffer.put(fArr2);
        floatBuffer.put(fArr3);
        floatBuffer.put(fArr4);
        c1030.m1610(fArr);
        c1030.m1610(fArr2);
        c1030.m1610(fArr3);
        c1030.m1610(fArr4);
        short[] sArr = new short[6];
        sArr[1] = 2;
        sArr[2] = 1;
        sArr[3] = 1;
        sArr[4] = 2;
        sArr[5] = 3;
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = (short) (sArr[i] + iPosition);
        }
        shortBuffer.put(sArr);
        if (!this.f1661) {
            floatBuffer2.put(new float[]{c0092.f5102, c0092.f5091, c0092.f5099, 0.0f});
            floatBuffer2.put(new float[]{c0092.f5101, c0092.f5092, c0092.f5099, 0.0f});
            floatBuffer2.put(new float[]{c0092.f5098, c0092.f5093, c0092.f5099, 0.0f});
            floatBuffer2.put(new float[]{c0092.f5096, c0092.f5094, c0092.f5099, 0.0f});
            return;
        }
        floatBuffer2.put(new float[]{c0092.f5101, c0092.f5092, c0092.f5099, 0.0f});
        floatBuffer2.put(new float[]{c0092.f5096, c0092.f5094, c0092.f5099, 0.0f});
        floatBuffer2.put(new float[]{c0092.f5102, c0092.f5091, c0092.f5099, 0.0f});
        floatBuffer2.put(new float[]{c0092.f5098, c0092.f5093, c0092.f5099, 0.0f});
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final boolean m681(uf ufVar) {
        c_activity c_activityVar = C0358.f6674;
        c_activityVar.mo139(new RunnableC1147(c_activityVar, 51));
        this.f1662 = ufVar.f5081.f5082;
        this.f1655 = ufVar.f5081.f5085;
        this.f1656 = ufVar.f5081.f5084;
        int i = 0;
        for (int i2 = 0; i2 < this.f1656; i2++) {
            for (int i3 = 0; i3 < this.f1655; i3++) {
                if (ufVar.f5074[(this.f1655 * i2) + i3].f5118 >= 0) {
                    i++;
                }
                if (ufVar.f5074[(this.f1655 * i2) + i3].f5119 >= 0) {
                    i++;
                }
                if (ufVar.f5074[(this.f1655 * i2) + i3].f5120 >= 0) {
                    i++;
                }
            }
        }
        FloatBuffer floatBufferWrap = FloatBuffer.wrap(new float[i * 16]);
        ShortBuffer shortBufferWrap = ShortBuffer.wrap(new short[i * 6]);
        FloatBuffer floatBufferWrap2 = FloatBuffer.wrap(new float[i * 16]);
        this.f1657 = (this.f1655 / 8) + (this.f1655 % 8 > 0 ? 1 : 0);
        this.f1658 = (this.f1656 / 8) + (this.f1656 % 8 > 0 ? 1 : 0);
        this.f1663 = new ok[this.f1657 * this.f1658];
        c_activity c_activityVar2 = C0358.f6674;
        c_activityVar2.mo139(new RunnableC1147(c_activityVar2, 52));
        int i4 = 1300 / this.f1658;
        for (int i5 = 0; i5 < this.f1658; i5++) {
            for (int i6 = 0; i6 < this.f1657; i6++) {
                floatBufferWrap.position(0);
                floatBufferWrap2.position(0);
                shortBufferWrap.position(0);
                int i7 = i6 * 8;
                int iMin = Math.min(i7 + 8, this.f1655);
                int i8 = i5 * 8;
                int iMin2 = Math.min(i8 + 8, this.f1656);
                C1030 c1030 = new C1030();
                while (i8 < iMin2) {
                    for (int i9 = i7; i9 < iMin; i9++) {
                        int i10 = i8;
                        int i11 = i9;
                        int i12 = this.f1655;
                        int i13 = this.f1656;
                        uf.C0097 c0097 = ufVar.f5074[(i10 * i12) + i11];
                        float f = i11;
                        float f2 = i10;
                        if (c0097.f5118 >= 0) {
                            m679(ufVar.f5078.f5089[c0097.f5118], floatBufferWrap, shortBufferWrap, floatBufferWrap2, new float[]{(-(f - (this.f1655 / 2))) * this.f1662, -c0097.f5125, (f2 - (this.f1656 / 2)) * this.f1662, 0.0f}, new float[]{(-((f + 1.0f) - (this.f1655 / 2))) * this.f1662, -c0097.f5124, (f2 - (this.f1656 / 2)) * this.f1662, 0.0f}, new float[]{(-(f - (this.f1655 / 2))) * this.f1662, -c0097.f5123, ((f2 + 1.0f) - (this.f1656 / 2)) * this.f1662, 0.0f}, new float[]{(-((f + 1.0f) - (this.f1655 / 2))) * this.f1662, -c0097.f5122, ((f2 + 1.0f) - (this.f1656 / 2)) * this.f1662, 0.0f}, c1030);
                        }
                        if (c0097.f5120 >= 0 && i11 + 1 < i12) {
                            uf.C0097 c00972 = ufVar.f5074[(i10 * i12) + i11 + 1];
                            float[] fArr = {(-((f + 1.0f) - (this.f1655 / 2))) * this.f1662, -c0097.f5124, (f2 - (this.f1656 / 2)) * this.f1662, 0.0f};
                            float[] fArr2 = {(-((f + 1.0f) - (this.f1655 / 2))) * this.f1662, -c00972.f5125, (f2 - (this.f1656 / 2)) * this.f1662, 0.0f};
                            float[] fArr3 = {(-((f + 1.0f) - (this.f1655 / 2))) * this.f1662, -c0097.f5122, ((f2 + 1.0f) - (this.f1656 / 2)) * this.f1662, 0.0f};
                            float[] fArr4 = {(-((f + 1.0f) - (this.f1655 / 2))) * this.f1662, -c00972.f5123, ((f2 + 1.0f) - (this.f1656 / 2)) * this.f1662, 0.0f};
                            this.f1661 = true;
                            m679(ufVar.f5078.f5089[c0097.f5120], floatBufferWrap, shortBufferWrap, floatBufferWrap2, fArr, fArr2, fArr3, fArr4, c1030);
                            this.f1661 = false;
                        }
                        if (c0097.f5119 >= 0 && i10 + 1 < i13) {
                            uf.C0097 c00973 = ufVar.f5074[((i10 + 1) * i12) + i11];
                            m679(ufVar.f5078.f5089[c0097.f5119], floatBufferWrap, shortBufferWrap, floatBufferWrap2, new float[]{(-(f - (this.f1655 / 2))) * this.f1662, -c0097.f5123, ((f2 + 1.0f) - (this.f1656 / 2)) * this.f1662, 0.0f}, new float[]{(-((f + 1.0f) - (this.f1655 / 2))) * this.f1662, -c0097.f5122, ((f2 + 1.0f) - (this.f1656 / 2)) * this.f1662, 0.0f}, new float[]{(-(f - (this.f1655 / 2))) * this.f1662, -c00973.f5125, ((f2 + 1.0f) - (this.f1656 / 2)) * this.f1662, 0.0f}, new float[]{(-((f + 1.0f) - (this.f1655 / 2))) * this.f1662, -c00973.f5124, ((f2 + 1.0f) - (this.f1656 / 2)) * this.f1662, 0.0f}, c1030);
                        }
                    }
                    i8++;
                }
                c1030.m1608();
                this.f1663[(this.f1657 * i5) + i6] = new ok();
                this.f1663[(this.f1657 * i5) + i6].f3340 = FloatBuffer.wrap(Arrays.copyOf(floatBufferWrap.array(), floatBufferWrap.position()));
                this.f1663[(this.f1657 * i5) + i6].f3338 = ShortBuffer.wrap(Arrays.copyOf(shortBufferWrap.array(), shortBufferWrap.position()));
                this.f1663[(this.f1657 * i5) + i6].f3339 = FloatBuffer.wrap(Arrays.copyOf(floatBufferWrap2.array(), floatBufferWrap2.position()));
                this.f1663[(this.f1657 * i5) + i6].f3337 = c1030;
            }
            c_activity c_activityVar3 = C0358.f6674;
            c_activityVar3.mo139(new RunnableC1147(c_activityVar3, ((i4 * i5) / 100) + 51));
        }
        return true;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m680() {
        short s = oc.f3231 ? (short) 1 : (short) 0;
        for (ok okVar : this.f1663) {
            float[] fArrArray = okVar.f3339.array();
            float[] fArrArray2 = okVar.f3340.array();
            for (int i = 0; i < fArrArray.length; i += 4) {
                iu.Cif cif = this.f1659.f1675.get(this.f1660[(int) fArrArray[i + 2]]);
                int i2 = i + 0;
                fArrArray[i2] = fArrArray[i2] * (cif.f1684 - s);
                int i3 = i + 1;
                fArrArray[i3] = fArrArray[i3] * (cif.f1685 - s);
                fArrArray[i + 2] = cif.f1689;
                fArrArray[i + 3] = cif.f1688;
                fArrArray2[i + 3] = cif.f1686;
            }
            okVar.f3339 = ByteBuffer.allocateDirect(fArrArray.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            okVar.f3339.put(fArrArray);
            okVar.f3339.position(0);
            okVar.f3340 = ByteBuffer.allocateDirect(fArrArray2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            okVar.f3340.put(fArrArray2);
            okVar.f3340.position(0);
        }
    }
}
