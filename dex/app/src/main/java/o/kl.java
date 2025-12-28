package o;

import android.app.AlertDialog;
import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class kl implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je f1900;

    kl(je jeVar) {
        this.f1900 = jeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0358.f6664.f2004.f8642 == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
            builder.setMessage("Skill information not loaded. Please try again later");
            builder.show();
        } else {
            if (!(this.f1900.f1800.f1994.getParent() != null)) {
                this.f1900.f1800.h_();
            } else {
                this.f1900.f1800.mo439();
            }
        }
    }
}
