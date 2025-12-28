package o;

import android.app.ProgressDialog;
import com.roworkshop.andro.c_activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class ii implements Runnable {

    /* renamed from: Ą, reason: contains not printable characters */
    private final /* synthetic */ String f1607;

    /* renamed from: ą, reason: contains not printable characters */
    private final /* synthetic */ String f1608;

    /* renamed from: ȃ, reason: contains not printable characters */
    private final /* synthetic */ long f1609;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ long f1610;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ ProgressDialog f1611;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ ib f1612;

    public ii(ib ibVar, ProgressDialog progressDialog, long j, long j2, String str, String str2) {
        this.f1612 = ibVar;
        this.f1611 = progressDialog;
        this.f1610 = j;
        this.f1609 = j2;
        this.f1607 = str;
        this.f1608 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f1611.isShowing()) {
            if (jCurrentTimeMillis < this.f1610 + this.f1609) {
                this.f1611.setProgress((int) (jCurrentTimeMillis - this.f1610));
                c_activity c_activityVar = this.f1612.f1582;
                if (c_activityVar.f47 != null) {
                    c_activityVar.f47.postDelayed(new RunnableC1014(c_activityVar, this), 30L);
                    return;
                }
                return;
            }
            this.f1611.setProgress((int) this.f1609);
            this.f1611.dismiss();
            ib ibVar = this.f1612;
            String str = this.f1607;
            String str2 = this.f1608;
            if (oc.f3247 == null) {
                oc.f3247 = new bg(null, false, false, str, str2, null);
            }
            ibVar.f1582.m137();
        }
    }
}
