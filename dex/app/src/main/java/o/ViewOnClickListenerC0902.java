package o;

import android.view.View;
import android.widget.Toast;

/* renamed from: o.隵, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0902 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0570 f8182;

    ViewOnClickListenerC0902(C0570 c0570) {
        this.f8182 = c0570;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string = this.f8182.f7366.f8192.getText().toString();
        if (string == null || string.length() < 4) {
            Toast.makeText(C0358.f6674, "Guild name is too short", 1).show();
        } else {
            C0358.f6671.mo454(new C0156(string));
        }
    }
}
