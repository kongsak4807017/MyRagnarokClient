package o;

import com.roworkshop.andro.c_activity;

/* renamed from: o.닎, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class RunnableC1014 implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ Runnable f8515;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ c_activity f8516;

    RunnableC1014(c_activity c_activityVar, Runnable runnable) {
        this.f8516 = c_activityVar;
        this.f8515 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f8515.run();
        } catch (Throwable th) {
            this.f8516.f40.m1487(Thread.currentThread(), th);
        }
    }
}
