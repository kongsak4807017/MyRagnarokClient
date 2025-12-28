package o;

import com.roworkshop.andro.c_activity;
import o.du;

/* renamed from: o.閣, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class RunnableC0900 implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ c_activity f8181;

    public RunnableC0900(c_activity c_activityVar) {
        this.f8181 = c_activityVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        du duVar = this.f8181.f45;
        if (duVar == null) {
            return;
        }
        if (duVar.f1098 != null) {
            if (duVar.f757 != null) {
                if (duVar.f757 != null) {
                    duVar.f757.f774 = true;
                }
                duVar.mo139(new RunnableC0635(this, duVar));
            }
            C0358.f6688.f6694 = duVar.f1098;
            C0358.f6688.m1313(true);
            return;
        }
        if (System.currentTimeMillis() - this.f8181.f46 > 20000) {
            throw new ut("Failed to connect to master-server (timed out).", false);
        }
        if (duVar.f1097 == du.EnumC0030.NOTFOUND || duVar.f1097 == du.EnumC0030.CORRUPTED) {
            throw new ut("System error 1 while connecting to master-server. Please report this.", false);
        }
        c_activity c_activityVar = this.f8181;
        if (c_activityVar.f47 != null) {
            c_activityVar.f47.postDelayed(new RunnableC1014(c_activityVar, this), 100L);
        }
    }
}
