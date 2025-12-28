package o;

import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ec implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ eb f1168;

    ec(eb ebVar) {
        this.f1168 = ebVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string = this.f1168.f1167.getText().toString();
        if (string.length() <= 0) {
            C0698 c0698 = C0358.f6674.f42.f1792;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(2596);
            c0698.m1432(strM649 == null ? "MSG2596" : strM649, 16776960);
            return;
        }
        C0358.f6671.mo454(new C0183(string));
    }
}
