package o;

import android.view.ViewGroup;

/* renamed from: o.鰤, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0952 implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ Runnable f8249;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ long f8250;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ RunnableC1121 f8251;

    RunnableC0952(RunnableC1121 runnableC1121, long j, Runnable runnable) {
        this.f8251 = runnableC1121;
        this.f8250 = j;
        this.f8249 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((ViewGroup) this.f8251.f8929.getWindow().getDecorView()).removeView(this.f8251.f8929.f48);
        this.f8249.run();
    }
}
