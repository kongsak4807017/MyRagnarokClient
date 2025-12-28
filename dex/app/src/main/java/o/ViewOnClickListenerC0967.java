package o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;

/* renamed from: o.ꂅ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0967 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1146 f8283;

    ViewOnClickListenerC0967(C1146 c1146) {
        this.f8283 = c1146;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1146 c1146 = this.f8283;
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(524);
        builder.setMessage(strM649 == null ? "MSG524" : strM649);
        EditText editText = new EditText(C0358.f6674);
        builder.setView(editText);
        builder.setPositiveButton("OK", new DialogInterfaceOnClickListenerC1051(c1146, editText));
        builder.setNegativeButton("Cancel", (DialogInterface.OnClickListener) null);
        builder.show();
    }
}
