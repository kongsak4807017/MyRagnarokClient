package o;

import android.graphics.Point;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import o.iu;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class ci extends co {

    /* renamed from: 鷭, reason: contains not printable characters */
    static final float f911 = (C0358.f6674.getResources().getDisplayMetrics().densityDpi / 160.0f) * 1.0f;

    /* renamed from: Ą, reason: contains not printable characters */
    int f912;

    /* renamed from: ą, reason: contains not printable characters */
    int f913;

    /* renamed from: Ć, reason: contains not printable characters */
    int f914;

    /* renamed from: 櫯, reason: contains not printable characters */
    mj f918;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    Point f917 = new Point();

    /* renamed from: ȃ, reason: contains not printable characters */
    Point f916 = new Point();

    /* renamed from: ć, reason: contains not printable characters */
    iu.Cif[] f915 = new iu.Cif[3];

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m482(int i, int i2) {
        if (i > i2) {
            i = i2;
        }
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(144).order(ByteOrder.nativeOrder()).asFloatBuffer();
        float f = i / i2;
        lq lqVar = new lq(this.f916.x / 2.0f, this.f916.y / 2.0f);
        lq lqVar2 = new lq(lqVar.f2017 - f911, lqVar.f2016 - f911);
        float f2 = f * (this.f916.x - (f911 * 2.0f));
        floatBufferAsFloatBuffer.put(new float[]{-lqVar.f2017, -lqVar.f2016, this.f915[0].f1686, -lqVar.f2017, lqVar.f2016, this.f915[0].f1686, lqVar.f2017, -lqVar.f2016, this.f915[0].f1686, lqVar.f2017, lqVar.f2016, this.f915[0].f1686, -lqVar2.f2017, -lqVar2.f2016, this.f915[1].f1686, -lqVar2.f2017, lqVar2.f2016, this.f915[1].f1686, lqVar2.f2017, -lqVar2.f2016, this.f915[1].f1686, lqVar2.f2016, lqVar2.f2016, this.f915[1].f1686, -lqVar2.f2017, -lqVar2.f2016, this.f915[2].f1686, -lqVar2.f2017, lqVar2.f2016, this.f915[2].f1686, (-lqVar2.f2017) + f2, -lqVar2.f2016, this.f915[2].f1686, (-lqVar2.f2017) + f2, lqVar2.f2016, this.f915[2].f1686});
        floatBufferAsFloatBuffer.position(0);
        this.f948 = floatBufferAsFloatBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    ci(o.md r13, int r14, int r15, com.roworkshop.andro.c_point r16, com.roworkshop.andro.c_point r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ci.<init>(o.md, int, int, com.roworkshop.andro.c_point, com.roworkshop.andro.c_point, int, int, int):void");
    }

    @Override // o.co
    /* renamed from: 櫯, reason: contains not printable characters */
    final void mo481() {
        lq lqVarM814 = C0358.f6669.m814(this.f918.f2076);
        if (lqVarM814 == null) {
            this.f949 = null;
            return;
        }
        lqVarM814.f2017 += this.f917.x;
        lqVarM814.f2016 += this.f917.y;
        lq lqVar = this.f945;
        lqVar.f2017 = lqVarM814.f2017;
        lqVar.f2016 = lqVarM814.f2016;
        super.mo481();
        if (C0358.f6669.f2051 != null) {
            float[] fArr = new float[16];
            Matrix.multiplyMM(fArr, 0, C0358.f6669.f2051.f7745, 0, this.f949.f7745, 0);
            C0753 c0753 = new C0753();
            c0753.f7745 = fArr;
            this.f949 = c0753;
        }
    }
}
