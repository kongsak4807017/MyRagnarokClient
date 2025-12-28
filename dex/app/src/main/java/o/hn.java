package o;

import android.app.AlertDialog;
import android.view.View;
import android.widget.RelativeLayout;
import com.roworkshop.andro.c_activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class hn implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ hm f1492;

    hn(hm hmVar) {
        this.f1492 = hmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c_activity c_activityVar = (c_activity) view.getContext();
        int iM621 = this.f1492.m621((RelativeLayout) view.getParent());
        if (iM621 == -1) {
            return;
        }
        if (oc.f3251) {
            C0358.f6671.mo454(new C0789(this.f1492.f1491[iM621].f3344.f1409));
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(c_activityVar);
        builder.setTitle((CharSequence) null);
        builder.setMessage("Are you sure you want to learn " + this.f1492.f1491[iM621].f3343.f1427 + " [Lv. " + (this.f1492.f1491[iM621].f3344.f1407 + 1) + "] ?");
        builder.setPositiveButton("Yes", new ho(this, iM621));
        builder.setNegativeButton("No", new hp(this));
        builder.create().show();
    }
}
