package o;

import android.app.AlertDialog;
import com.roworkshop.andro.c_activity;
import java.io.File;

/* renamed from: o.ր, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class RunnableC0415 implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ c_activity f6808;

    public RunnableC0415(c_activity c_activityVar) {
        this.f6808 = c_activityVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c_activity c_activityVar = this.f6808;
        if (iu.f1665 > 0 && iu.f1665 < 2048) {
            AlertDialog.Builder builder = new AlertDialog.Builder(c_activityVar);
            builder.setMessage("Sorry, this application is not compatible with your device (max. texture dimension=" + iu.f1665 + " < 2048");
            builder.show();
            builder.setOnCancelListener(new DialogInterfaceOnCancelListenerC0658(c_activityVar));
            return;
        }
        if (iu.f1665 < 4096) {
            oc.f3239 = false;
            oc.f3241 = false;
            C0358.f6687.m645();
        }
        if (oc.f3250 == my.localclient) {
            File file = new File(oc.f3245);
            if (!pl.m1051(file) || C0358.f6682) {
                C0358.f6682 = false;
                c_activityVar.f42.f1778.h_();
                return;
            } else {
                oc.f3240 = oc.f3245;
                c_activityVar.m138(file);
                return;
            }
        }
        c_activityVar.f45 = new du("Temporary masterserver thread");
        c_activityVar.f46 = System.currentTimeMillis();
        du duVar = c_activityVar.f45;
        byte b = c_activity.f36[7];
        duVar.mo139(new e(duVar, c_activity.m135(b, b - 1, c_activity.f36[7]), 4121, ns.MASTER, c_activityVar, new RunnableC0397(c_activityVar), new RunnableC0679(c_activityVar), new RunnableC0407(c_activityVar)));
        Runnable runnable = c_activityVar.f43;
        if (c_activityVar.f47 != null) {
            c_activityVar.f47.postDelayed(new RunnableC1014(c_activityVar, runnable), 100L);
        }
    }
}
