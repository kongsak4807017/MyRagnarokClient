package o;

import android.app.AlertDialog;
import com.roworkshop.andro.c_activity;

/* renamed from: o.ಽೂ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class RunnableC0452 implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ String f6900;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ c_activity f6901;

    RunnableC0452(c_activity c_activityVar, String str) {
        this.f6901 = c_activityVar;
        this.f6900 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setTitle("Fatal error");
        builder.setMessage(this.f6900);
        builder.show();
    }
}
