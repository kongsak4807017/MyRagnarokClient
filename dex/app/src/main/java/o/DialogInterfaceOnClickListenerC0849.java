package o;

import android.content.DialogInterface;
import android.widget.Toast;

/* renamed from: o.藐, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class DialogInterfaceOnClickListenerC0849 implements DialogInterface.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0649 f7959;

    DialogInterfaceOnClickListenerC0849(C0649 c0649) {
        this.f7959 = c0649;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0649 c0649 = this.f7959;
        C0998 c0998 = (C0998) c0649.f7539.getAdapter().getItem(c0649.f7537);
        if (c0998 != null) {
            switch (i) {
                case 0:
                    if (!c0998.f8470.f7706) {
                        Toast.makeText(C0358.f6674, String.valueOf(C0358.f6679.f6830.get(Integer.valueOf(c0998.f8470.f7707))) + " is offline.", 1).show();
                        break;
                    } else {
                        c0649.mo439();
                        C0358.f6674.f42.f1792.h_();
                        C0358.f6674.f42.f1792.f7651.setText(C0358.f6679.f6830.get(Integer.valueOf(c0998.f8470.f7707)));
                        break;
                    }
                case 1:
                    C0358.f6671.mo454(new C0656(c0998.f8470.f7708, c0998.f8470.f7707));
                    break;
            }
        }
    }
}
