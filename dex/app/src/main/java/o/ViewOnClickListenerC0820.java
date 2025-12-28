package o;

import android.app.AlertDialog;
import android.view.View;

/* renamed from: o.磨, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0820 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0653 f7932;

    ViewOnClickListenerC0820(C0653 c0653) {
        this.f7932 = c0653;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0653 c0653 = this.f7932;
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setTitle("Message");
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(956);
        builder.setMessage(je.m710(String.valueOf(strM649 == null ? "MSG956" : strM649) + "\n", true));
        builder.setPositiveButton("Ok", new DialogInterfaceOnClickListenerC0448(c0653));
        builder.setNegativeButton("Cancel", new DialogInterfaceOnClickListenerC1156(c0653));
        builder.show();
    }
}
