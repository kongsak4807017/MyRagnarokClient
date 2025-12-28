package o;

import net.hockeyapp.android.UpdateActivity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class acg implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ UpdateActivity f380;

    public acg(UpdateActivity updateActivity) {
        this.f380 = updateActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f380.showDialog(0);
    }
}
