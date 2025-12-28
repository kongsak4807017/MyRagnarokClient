package o;

import android.view.View;
import android.widget.ListAdapter;
import java.util.List;
import o.gm;
import o.gm.C0042;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class gl implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ gk f1357;

    gl(gk gkVar) {
        this.f1357 = gkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gm gmVar = (gm) this.f1357.f1356.getAdapter();
        if (gmVar == null) {
            gmVar = new gm();
        }
        List<gm.C0042> list = gmVar.f1358;
        list.add(0, gmVar.new C0042("/!"));
        for (int i = 0; i < list.size(); i++) {
            C0358.f6687.m658("shortcuts", i, list.get(i).m606());
        }
        this.f1357.f1356.setAdapter((ListAdapter) new gm());
    }
}
