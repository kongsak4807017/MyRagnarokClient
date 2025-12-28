package o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;

/* renamed from: o.ๆ้, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0455 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0570 f6903;

    ViewOnClickListenerC0455(C0570 c0570) {
        this.f6903 = c0570;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0358.f6664 == null || C0358.f6664.f2004 == null) {
            return;
        }
        if (C0358.f6664.f2004.f8348 == 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
            builder.setMessage("Do you want to create a Guild?");
            builder.setPositiveButton("Yes", new DialogInterfaceOnClickListenerC0672(this));
            builder.setNegativeButton("No", (DialogInterface.OnClickListener) null);
            builder.show();
            return;
        }
        this.f6903.mo439();
        C0358.f6674.f42.f1748.h_();
    }
}
