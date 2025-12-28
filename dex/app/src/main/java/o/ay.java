package o;

import android.view.View;
import android.widget.Toast;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ay implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ au f744;

    ay(au auVar) {
        this.f744 = auVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string = this.f744.f713.getText().toString();
        if (string == null || string.length() < 4) {
            Toast.makeText(C0358.f6674, "Name is too short.", 1).show();
        } else {
            C0358.f6671.mo454(new C1102(string, this.f744.f710, this.f744.f715));
        }
    }
}
