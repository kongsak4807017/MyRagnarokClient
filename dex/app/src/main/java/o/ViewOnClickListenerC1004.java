package o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;

/* renamed from: o.꾤, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC1004 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0570 f8479;

    ViewOnClickListenerC1004(C0570 c0570) {
        this.f8479 = c0570;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0358.f6664.f2004.f8596 != null) {
            this.f8479.mo439();
            C0358.f6674.f42.f1746.h_();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setTitle((CharSequence) null);
        builder.setMessage("You are not in a party. Do you want to organize your own?");
        builder.setPositiveButton("Yes", new DialogInterfaceOnClickListenerC1145(this));
        builder.setNegativeButton("No", (DialogInterface.OnClickListener) null);
        builder.show();
    }
}
