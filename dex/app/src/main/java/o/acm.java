package o;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.roworkshop.andro.c_activity;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class acm {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static add f393 = null;

    /* renamed from: 櫯, reason: contains not printable characters */
    private static acn f392 = null;

    /* renamed from: 鷭, reason: contains not printable characters */
    public static void m313(c_activity c_activityVar, String str, C0601 c0601) throws PackageManager.NameNotFoundException {
        String strM377 = adz.m377(str);
        f392 = c0601;
        WeakReference weakReference = new WeakReference(c_activityVar);
        if (adz.m382().booleanValue()) {
            Activity activity = (Activity) weakReference.get();
            boolean z = (activity == null || activity.getFragmentManager().findFragmentByTag("hockey_update_dialog") == null) ? false : true;
            if (z) {
                return;
            }
        }
        if (m314(weakReference)) {
            return;
        }
        if (f393 == null || f393.getStatus() == AsyncTask.Status.FINISHED) {
            ade adeVar = new ade(weakReference, "https://sdk.hockeyapp.net/", strM377, c0601, false);
            f393 = adeVar;
            adp.m350(adeVar);
        } else {
            add addVar = f393;
            Context context = (Context) weakReference.get();
            if (context != null) {
                addVar.f472 = context.getApplicationContext();
                aba.m282(context);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* renamed from: 鷭, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m314(java.lang.ref.WeakReference<? extends android.content.Context> r3) {
        /*
            r2 = 0
            java.lang.Object r0 = r3.get()
            android.content.Context r0 = (android.content.Context) r0
            r3 = r0
            if (r3 == 0) goto L2b
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r0.getInstallerPackageName(r1)     // Catch: java.lang.Throwable -> L2b
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L26
            if (r3 == 0) goto L28
            java.lang.String r0 = "adb"
            boolean r0 = android.text.TextUtils.equals(r3, r0)     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L28
        L26:
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            r2 = r0
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.acm.m314(java.lang.ref.WeakReference):boolean");
    }
}
