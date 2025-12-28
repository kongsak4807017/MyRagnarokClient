package o;

import android.opengl.GLSurfaceView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class it extends GLSurfaceView {
    public it(RunnableC1121 runnableC1121) {
        super(C0358.f6674);
        setEGLContextClientVersion(2);
        super.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        setRenderer(new is(runnableC1121));
    }
}
