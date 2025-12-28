package o;

import android.app.AlertDialog;
import com.roworkshop.andro.c_activity;

/* renamed from: o.ӗ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class RunnableC0407 implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ c_activity f6790;

    RunnableC0407(c_activity c_activityVar) {
        this.f6790 = c_activityVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setMessage("Disconnected from master-server");
        builder.setCancelable(true);
        builder.setOnCancelListener(new DialogInterfaceOnCancelListenerC0458(this));
        builder.show();
    }
}
