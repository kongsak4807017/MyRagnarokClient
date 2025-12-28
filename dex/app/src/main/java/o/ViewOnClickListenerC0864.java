package o;

import android.app.AlertDialog;
import android.view.View;

/* renamed from: o.谆, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0864 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0398 f8039;

    ViewOnClickListenerC0864(C0398 c0398) {
        this.f8039 = c0398;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0398 c0398 = this.f8039;
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setTitle("Message");
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(1371);
        builder.setMessage(je.m710(String.valueOf(strM649 == null ? "MSG1371" : strM649) + "\n", true));
        builder.setPositiveButton("Ok", new DialogInterfaceOnClickListenerC0845(c0398));
        builder.setNegativeButton("Cancel", new DialogInterfaceOnClickListenerC0552(c0398));
        builder.show();
    }
}
