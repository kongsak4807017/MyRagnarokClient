package o;

import android.view.View;
import com.roworkshop.andro.c_activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class m implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ j f2068;

    m(j jVar) {
        this.f2068 = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j jVar = this.f2068;
        c_activity c_activityVar = (c_activity) jVar.f1726.getContext();
        C0358.f6671.mo454(new C0165(jVar.f1723, true));
        c_activityVar.f42.f1777.removeView(jVar.f1726);
    }
}
