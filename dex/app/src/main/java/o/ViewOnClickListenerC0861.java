package o;

import android.view.View;
import android.widget.Toast;

/* renamed from: o.討, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0861 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0502 f8036;

    ViewOnClickListenerC0861(C0502 c0502) {
        this.f8036 = c0502;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws NumberFormatException {
        C0502 c0502 = this.f8036;
        String string = c0502.f6985.getText().toString();
        String string2 = c0502.f6984.getText().toString();
        String string3 = c0502.f6983.getText().toString();
        if (string != null) {
            string = string.trim();
        }
        if (string3 != null) {
            string3 = string3.trim();
        }
        if (string == null || string.length() <= 0) {
            Toast.makeText(C0358.f6674, "You should enter a room title", 1).show();
            return;
        }
        byte[] bArrM986 = (string2 == null || string2.length() == 0) ? new byte[8] : pa.m986(string2, ow.LOCAL, 8);
        try {
            int i = Integer.parseInt(string3);
            c0502.mo439();
            C0358.f6671.mo454(new C0982(i, string2 != null && string2.length() > 0, bArrM986, string));
        } catch (NumberFormatException unused) {
            Toast.makeText(C0358.f6674, "Invalid users count", 1).show();
        }
    }
}
