package o;

import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import o.iu;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class co {

    /* renamed from: đ, reason: contains not printable characters */
    ou f944;

    /* renamed from: Ē, reason: contains not printable characters */
    lq f945;

    /* renamed from: ē, reason: contains not printable characters */
    lq f946;

    /* renamed from: ܕ, reason: contains not printable characters */
    ShortBuffer f947;

    /* renamed from: 䒧, reason: contains not printable characters */
    FloatBuffer f948;

    /* renamed from: 庸, reason: contains not printable characters */
    C0753 f949;

    /* renamed from: 躆, reason: contains not printable characters */
    FloatBuffer f950;

    /* renamed from: 띥, reason: contains not printable characters */
    float f951;

    co() {
        C0753 c0753 = new C0753();
        Matrix.setIdentityM(c0753.f7745, 0);
        this.f949 = c0753;
        this.f944 = new ou();
        this.f945 = new lq();
        this.f946 = new lq(1.0f, 1.0f);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m486(FloatBuffer floatBuffer, FloatBuffer floatBuffer2, ShortBuffer shortBuffer, lq lqVar) {
        this.f948 = floatBuffer;
        this.f950 = floatBuffer2;
        this.f947 = shortBuffer;
        ou ouVar = this.f944;
        ouVar.f3378 = 1.0f;
        ouVar.f3377 = 1.0f;
        ouVar.f3376 = 1.0f;
        ouVar.f3379 = 1.0f;
        if (lqVar != null) {
            lq lqVar2 = this.f945;
            lqVar2.f2017 = lqVar.f2017;
            lqVar2.f2016 = lqVar.f2016;
        }
        mo481();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m487(String str, iu iuVar, lq lqVar, lq lqVar2) {
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asFloatBuffer();
        ShortBuffer shortBufferAsShortBuffer = ByteBuffer.allocateDirect(12).order(ByteOrder.nativeOrder()).asShortBuffer();
        iu.Cif cif = iuVar.f1675.get(str);
        if (cif != null) {
            floatBufferAsFloatBuffer.put(new float[]{(-lqVar2.f2017) / 2.0f, lqVar2.f2016 / 2.0f, cif.f1686, (-lqVar2.f2017) / 2.0f, (-lqVar2.f2016) / 2.0f, cif.f1686, lqVar2.f2017 / 2.0f, lqVar2.f2016 / 2.0f, cif.f1686, lqVar2.f2017 / 2.0f, (-lqVar2.f2016) / 2.0f, cif.f1686});
            floatBufferAsFloatBuffer2.put(cif.m695());
            shortBufferAsShortBuffer.put(new short[]{1, 0, 3, 3, 0, 2});
        }
        floatBufferAsFloatBuffer.position(0);
        floatBufferAsFloatBuffer2.position(0);
        shortBufferAsShortBuffer.position(0);
        m486(floatBufferAsFloatBuffer, floatBufferAsFloatBuffer2, shortBufferAsShortBuffer, lqVar);
    }

    /* renamed from: 櫯 */
    void mo481() {
        float f = this.f945.f2017;
        float f2 = this.f945.f2016;
        C0753 c0753 = new C0753();
        Matrix.setIdentityM(c0753.f7745, 0);
        Matrix.translateM(c0753.f7745, 0, f, f2, 0.0f);
        float f3 = this.f946.f2017;
        float f4 = this.f946.f2016;
        C0753 c07532 = new C0753();
        Matrix.setIdentityM(c07532.f7745, 0);
        Matrix.scaleM(c07532.f7745, 0, f3, f4, 1.0f);
        float[] fArr = new float[16];
        Matrix.multiplyMM(fArr, 0, c0753.f7745, 0, c07532.f7745, 0);
        c0753.f7745 = fArr;
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, c0753.f7745, 0, C0753.m1449(this.f951, 0.0f, 0.0f, 1.0f).f7745, 0);
        c0753.f7745 = fArr2;
        this.f949 = c0753;
    }
}
