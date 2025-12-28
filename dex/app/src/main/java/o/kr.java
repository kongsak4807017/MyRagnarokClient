package o;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import o.je;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class kr implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je.C0056 f1906;

    kr(je.C0056 c0056) {
        this.f1906 = c0056;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws NumberFormatException {
        je.C0056 c0056 = this.f1906;
        TextView textView = (TextView) c0056.f1837.findViewById(2131296436);
        String string = textView.getText().toString();
        if (string.length() != 0) {
            if (c0056.f1836) {
                int i = -1;
                try {
                    i = Integer.parseInt(string);
                } catch (NumberFormatException unused) {
                }
                if (i < 0) {
                    Toast.makeText(C0358.f6674, "Please input a valid number", 0).show();
                    return;
                }
                C0358.f6671.mo454(new C0724(i, c0056.f1835));
            } else {
                C0358.f6671.mo454(new C0422(string, c0056.f1835));
            }
            textView.setText("");
            c0056.f1837.dismiss();
        }
    }
}
