package o;

import android.opengl.Matrix;

/* renamed from: o.鴲, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0956 implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ int f8266;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ int f8267;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0851 f8268;

    RunnableC0956(C0851 c0851, int i, int i2) {
        this.f8268 = c0851;
        this.f8267 = i;
        this.f8266 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0358 c0358 = C0358.f6688;
        int i = this.f8267;
        int i2 = this.f8266;
        ly lyVar = C0358.f6669;
        lyVar.f2058.x = i;
        lyVar.f2058.y = i2;
        float f = lyVar.f2058.x / lyVar.f2058.y;
        int i3 = lyVar.f2058.x;
        int i4 = lyVar.f2058.y;
        Matrix.frustumM(lyVar.f2049.f7745, 0, -f, f, -1.0f, 1.0f, 5.0f, oc.f3233);
        C1157 c1157 = lyVar.f2057;
        c1157.f9038 = f > 1.0f ? f - ((f - 1.0f) / 2.0f) : f + ((1.0f - f) / 2.0f);
        c1157.m1661(10000.0f);
        C0753 c0753 = new C0753();
        Matrix.setIdentityM(c0753.f7745, 0);
        Matrix.translateM(c0753.f7745, 0, -1.0f, -1.0f, 0.0f);
        C0753 c07532 = new C0753();
        Matrix.setIdentityM(c07532.f7745, 0);
        Matrix.scaleM(c07532.f7745, 0, 2.0f / lyVar.f2058.x, 2.0f / lyVar.f2058.y, 1.0f);
        float[] fArr = c0753.f7745;
        float[] fArr2 = c07532.f7745;
        float[] fArr3 = new float[16];
        Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
        C0753 c07533 = new C0753();
        c07533.f7745 = fArr3;
        lyVar.f2051 = c07533;
        if (lyVar.f2063 == null || lyVar.f2063.f6881 == null) {
            return;
        }
        lyVar.f2063.f6881.mo481();
    }
}
