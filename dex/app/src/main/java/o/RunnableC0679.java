package o;

import android.app.AlertDialog;
import com.roworkshop.andro.c_activity;

/* renamed from: o.庚, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class RunnableC0679 implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ c_activity f7596;

    RunnableC0679(c_activity c_activityVar) {
        this.f7596 = c_activityVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setMessage("Failed to connect to master-server");
        builder.setCancelable(true);
        builder.setOnCancelListener(new DialogInterfaceOnCancelListenerC0560(this));
        builder.show();
    }
}
