package o;

import android.app.AlertDialog;
import android.view.View;

/* renamed from: o.댚, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC1015 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0490 f8517;

    ViewOnClickListenerC1015(C0490 c0490) {
        this.f8517 = c0490;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        new AlertDialog.Builder(C0358.f6674).setMessage("Cash points can be purchased from character selection screen").show();
    }
}
