package o;

import net.hockeyapp.android.UpdateActivity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class acf implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ UpdateActivity f379;

    public acf(UpdateActivity updateActivity) {
        this.f379 = updateActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f379.showDialog(0);
    }
}
