package o;

import com.roworkshop.andro.c_activity;

/* renamed from: o.확, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class RunnableC1147 implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ int f8998;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ c_activity f8999;

    RunnableC1147(c_activity c_activityVar, int i) {
        this.f8999 = c_activityVar;
        this.f8998 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f8999.f42.f1736 == null) {
            return;
        }
        this.f8999.f42.f1736.setProgress(this.f8998);
    }
}
