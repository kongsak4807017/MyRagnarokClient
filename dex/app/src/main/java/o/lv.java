package o;

import android.util.Log;
import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import o.iu;
import o.uf;
import o.ui;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class lv {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    ok[] f2033;

    /* renamed from: 櫯, reason: contains not printable characters */
    float[] f2034;

    /* renamed from: 鷭, reason: contains not printable characters */
    String[] f2035;

    /* renamed from: 鷭, reason: contains not printable characters */
    private static int[] m805(uf ufVar, float f) {
        int[] iArr = new int[ufVar.f5081.f5085 * ufVar.f5081.f5084];
        int i = 0;
        for (int i2 = 0; i2 < ufVar.f5074.length; i2++) {
            uf.C0097 c0097 = ufVar.f5074[i2];
            if ((-f) > (-c0097.f5125) || (-f) > (-c0097.f5124) || (-f) > (-c0097.f5123) || (-f) > (-c0097.f5122)) {
                int i3 = i;
                i++;
                iArr[i3] = i2;
            }
        }
        return Arrays.copyOf(iArr, i);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m804(ir irVar, int[] iArr, int i, float f) {
        c_activity c_activityVar = C0358.f6674;
        c_activityVar.mo139(new RunnableC1147(c_activityVar, 69));
        float[] fArr = new float[iArr.length * 16];
        short[] sArr = new short[iArr.length * 6];
        float[] fArr2 = new float[iArr.length * 16];
        FloatBuffer floatBufferWrap = FloatBuffer.wrap(fArr);
        ShortBuffer shortBufferWrap = ShortBuffer.wrap(sArr);
        FloatBuffer floatBufferWrap2 = FloatBuffer.wrap(fArr2);
        int i2 = irVar.f1657;
        this.f2033 = new ok[i2 * irVar.f1658];
        int i3 = 0;
        int length = 500 / this.f2033.length;
        for (int i4 = 0; i4 < this.f2033.length; i4++) {
            floatBufferWrap.position(0);
            shortBufferWrap.position(0);
            floatBufferWrap2.position(0);
            C1030 c1030 = new C1030();
            int i5 = i4 % i2;
            int i6 = i4 / i2;
            int i7 = i5 * 8;
            int i8 = ((i5 + 1) * 8) - 1;
            int i9 = i6 * 8;
            int i10 = ((i6 + 1) * 8) - 1;
            for (int i11 : iArr) {
                int i12 = i11 % i;
                int i13 = i11 / i;
                if (i12 >= i7 && i12 <= i8 && i13 >= i9 && i13 <= i10) {
                    int iPosition = floatBufferWrap.position() / 4;
                    float[] fArr3 = {(-(i12 - (irVar.f1655 / 2))) * irVar.f1662, -f, (i13 - (irVar.f1656 / 2)) * irVar.f1662, 0.0f};
                    float[] fArr4 = {(-((i12 + 1) - (irVar.f1655 / 2))) * irVar.f1662, -f, (i13 - (irVar.f1656 / 2)) * irVar.f1662, 0.0f};
                    float[] fArr5 = {(-(i12 - (irVar.f1655 / 2))) * irVar.f1662, -f, ((i13 + 1) - (irVar.f1656 / 2)) * irVar.f1662, 0.0f};
                    float[] fArr6 = {(-((i12 + 1) - (irVar.f1655 / 2))) * irVar.f1662, -f, ((i13 + 1) - (irVar.f1656 / 2)) * irVar.f1662, 0.0f};
                    floatBufferWrap.put(fArr3);
                    floatBufferWrap.put(fArr4);
                    floatBufferWrap.put(fArr5);
                    floatBufferWrap.put(fArr6);
                    c1030.m1610(fArr3);
                    c1030.m1610(fArr4);
                    c1030.m1610(fArr5);
                    c1030.m1610(fArr6);
                    shortBufferWrap.put(new short[]{(short) (iPosition + 0), (short) (iPosition + 2), (short) (iPosition + 1), (short) (iPosition + 1), (short) (iPosition + 2), (short) (iPosition + 3)});
                    float f2 = 0.25f * (i12 % 4);
                    float f3 = f2 + 0.25f;
                    float f4 = 0.25f * (i13 % 4);
                    float f5 = f4 + 0.25f;
                    floatBufferWrap2.put(new float[]{f2, f4, 0.0f, 0.0f, f3, f4, 0.0f, 0.0f, f2, f5, 0.0f, 0.0f, f3, f5, 0.0f, 0.0f});
                }
            }
            c1030.m1608();
            if (floatBufferWrap.position() != 0) {
                this.f2033[i3] = new ok();
                this.f2033[i3].f3340 = FloatBuffer.wrap(Arrays.copyOf(floatBufferWrap.array(), floatBufferWrap.position()));
                this.f2033[i3].f3338 = ShortBuffer.wrap(Arrays.copyOf(shortBufferWrap.array(), shortBufferWrap.position()));
                this.f2033[i3].f3339 = FloatBuffer.wrap(Arrays.copyOf(floatBufferWrap2.array(), floatBufferWrap2.position()));
                this.f2033[i3].f3337 = c1030;
                i3++;
                c_activity c_activityVar2 = C0358.f6674;
                c_activityVar2.mo139(new RunnableC1147(c_activityVar2, ((length * i4) / 100) + 69));
            }
        }
        this.f2033 = (ok[]) Arrays.copyOf(this.f2033, i3);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m806(iu iuVar) {
        short s = oc.f3231 ? (short) 1 : (short) 0;
        for (ok okVar : this.f2033) {
            float[] fArrArray = okVar.f3339.array();
            float[] fArrArray2 = okVar.f3340.array();
            for (int i = 0; i < fArrArray.length; i += 4) {
                iu.Cif cif = iuVar.f1675.get(this.f2035[(int) fArrArray[i + 2]]);
                int i2 = i + 0;
                fArrArray[i2] = fArrArray[i2] * (cif.f1684 - s);
                int i3 = i + 1;
                fArrArray[i3] = fArrArray[i3] * (cif.f1685 - s);
            }
            okVar.f3339 = ByteBuffer.allocateDirect(okVar.f3339.capacity() * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            okVar.f3339.put(fArrArray);
            okVar.f3339.position(0);
            okVar.f3340 = ByteBuffer.allocateDirect(okVar.f3340.capacity() * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            okVar.f3340.put(fArrArray2);
            okVar.f3340.position(0);
            okVar.f3338.position(0);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m803(ir irVar, uf ufVar, ui.C0107 c0107, iu iuVar, boolean z) {
        c_activity c_activityVar = C0358.f6674;
        c_activityVar.mo139(new RunnableC1147(c_activityVar, 65));
        String str = "data\\texture\\" + C0358.f6685.f1030.f982.f8938.f8961 + "\\water" + c0107.f5238;
        c_activity c_activityVar2 = C0358.f6674;
        c_activityVar2.mo139(new RunnableC1147(c_activityVar2, 66));
        this.f2035 = new String[32];
        int length = 400 / this.f2035.length;
        for (int i = 0; i < this.f2035.length; i++) {
            this.f2035[i] = String.format("%1$s%2$02d.jpg", str, Integer.valueOf(i));
            byte[] bArr = (byte[]) C0358.f6685.f1033.m519(this.f2035[i], false);
            if (bArr == null) {
                String str2 = "File not found: " + this.f2035[i];
                Log.e("AndRO", str2);
                throw new nv(str2);
            }
            C0406 c0406M919 = od.m919(this.f2035[i], bArr);
            iuVar.m692(c0406M919.f6789, c0406M919.f6788, c0406M919.f6787.x, c0406M919.f6787.y, this.f2035[i], null, iuVar.f1667);
            c_activity c_activityVar3 = C0358.f6674;
            c_activityVar3.mo139(new RunnableC1147(c_activityVar3, ((length * i) / 100) + 66));
        }
        if (z) {
            return;
        }
        int[] iArrM805 = m805(ufVar, c0107.f5239);
        if (iArrM805.length == 0) {
            c_activity c_activityVar4 = C0358.f6674;
            c_activityVar4.mo139(new RunnableC1147(c_activityVar4, 75));
        } else {
            m804(irVar, iArrM805, ufVar.f5081.f5085, c0107.f5239);
        }
    }

    lv(ir irVar, uf ufVar, ui.C0107 c0107, iu iuVar, int i, int i2, boolean z) {
        m803(irVar, ufVar, c0107, iuVar, z);
    }
}
