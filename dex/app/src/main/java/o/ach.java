package o;

import net.hockeyapp.android.UpdateActivity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class ach implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ UpdateActivity f381;

    public ach(UpdateActivity updateActivity) {
        this.f381 = updateActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f381.showDialog(0);
    }
}
