package o;

import android.opengl.GLES20;
import com.roworkshop.andro.c_activity;
import java.nio.IntBuffer;

/* renamed from: o.촧, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class RunnableC1121 implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ Runnable f8927;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ long f8928;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ c_activity f8929;

    public RunnableC1121(c_activity c_activityVar, long j, Runnable runnable) {
        this.f8929 = c_activityVar;
        this.f8928 = j;
        this.f8927 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IntBuffer intBufferWrap = IntBuffer.wrap(new int[2]);
        GLES20.glGetIntegerv(3379, intBufferWrap);
        iu.f1665 = intBufferWrap.get(0);
        C0358.f6687.m658("GL_MAX_TEXTURE_SIZE", 0, String.valueOf(iu.f1665));
        this.f8929.mo139(new RunnableC0952(this, this.f8928, this.f8927));
    }
}
