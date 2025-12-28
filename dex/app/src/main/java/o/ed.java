package o;

import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ed implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ eb f1169;

    ed(eb ebVar) {
        this.f1169 = ebVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f1169.f1167.getText().toString().length() <= 0) {
            C0698 c0698 = C0358.f6674.f42.f1792;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(2596);
            c0698.m1432(strM649 == null ? "MSG2596" : strM649, 16776960);
            return;
        }
        String string = this.f1169.f1158.getText().toString();
        if (string.length() < 4 || string.length() > 50) {
            C0698 c06982 = C0358.f6674.f42.f1792;
            cv cvVar2 = C0358.f6685;
            String strM6492 = C0358.f6687.m649(2597);
            c06982.m1432(strM6492 == null ? "MSG2597" : strM6492, 16776960);
            return;
        }
        if (C0358.f6667.f4800 > 20160600) {
            C0358.f6671.mo454(new C0194(this.f1169.f1167.getText().toString(), this.f1169.m572(), this.f1169.f1158.getText().toString(), this.f1169.f1156.getText().toString(), this.f1169.f1166));
        } else {
            C0358.f6671.mo454(new C0193(this.f1169.f1167.getText().toString(), this.f1169.m572(), this.f1169.f1158.getText().toString(), this.f1169.f1156.getText().toString()));
        }
    }
}
