package o;

import android.opengl.GLES20;
import java.nio.IntBuffer;
import o.C0851;
import o.cv;
import o.hr;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class bs implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ boolean[] f854;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ bo f855;

    bs(bo boVar, boolean[] zArr) {
        this.f855 = boVar;
        this.f854 = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0851 c0851 = C0358.f6669.f2066;
        c0851.f7970 = nh.UNLOADING;
        if (c0851.f7976 != null) {
            GLES20.glDeleteTextures(C0851.Cif.valuesCustom().length, c0851.f7976);
            c0851.f7976 = null;
        }
        synchronized (cv.f1006) {
            for (hr hrVar : cv.f1006.values()) {
                if (hrVar.f1500 != null) {
                    for (hr.C0048 c0048 : hrVar.f1500) {
                        if (c0048 != null) {
                            if (c0048.f1519 > 0) {
                                GLES20.glDeleteTextures(1, IntBuffer.wrap(new int[]{c0048.f1519}));
                                c0048.f1519 = 0;
                            }
                            if (c0048.f1517 > 0) {
                                GLES20.glDeleteTextures(1, IntBuffer.wrap(new int[]{c0048.f1517}));
                                c0048.f1517 = 0;
                            }
                        }
                    }
                }
                if (hrVar.f1501 != null) {
                    for (hr.C0048 c00482 : hrVar.f1501) {
                        if (c00482 != null) {
                            if (c00482.f1519 > 0) {
                                GLES20.glDeleteTextures(1, IntBuffer.wrap(new int[]{c00482.f1519}));
                                c00482.f1519 = 0;
                            }
                            if (c00482.f1517 > 0) {
                                GLES20.glDeleteTextures(1, IntBuffer.wrap(new int[]{c00482.f1517}));
                                c00482.f1517 = 0;
                            }
                        }
                    }
                }
            }
        }
        synchronized (cv.f1007) {
            for (cv.Cif cif : cv.f1007.values()) {
                if (cif.f1036 > 0) {
                    GLES20.glDeleteTextures(1, IntBuffer.wrap(new int[]{cif.f1036}));
                }
            }
        }
        c0851.f7974 = null;
        c0851.f7970 = nh.UNLOADED;
        this.f854[0] = true;
    }
}
