package o;

import android.view.View;
import com.roworkshop.andro.c_activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ha implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ gy f1449;

    ha(gy gyVar) {
        this.f1449 = gyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c_activity c_activityVar = C0358.f6674;
        je.m709(this.f1449.f1443.f1409, this.f1449.f1440.getVisibility() == 0 ? this.f1449.f1440.getProgress() + 1 : this.f1449.f1443.f1407);
        this.f1449.mo439();
        C0358.f6674.f42.f1800.mo439();
    }
}
