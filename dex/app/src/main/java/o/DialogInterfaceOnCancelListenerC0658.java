package o;

import android.content.DialogInterface;
import com.roworkshop.andro.c_activity;

/* renamed from: o.場, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class DialogInterfaceOnCancelListenerC0658 implements DialogInterface.OnCancelListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ c_activity f7565;

    DialogInterfaceOnCancelListenerC0658(c_activity c_activityVar) {
        this.f7565 = c_activityVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        System.exit(1);
    }
}
