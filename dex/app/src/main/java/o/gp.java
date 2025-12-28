package o;

import android.view.View;
import android.widget.ListAdapter;
import java.util.List;
import o.gm;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class gp implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ gm.C0042 f1372;

    gp(gm.C0042 c0042) {
        this.f1372 = c0042;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List<gm.C0042> list = gm.this.f1358;
        int iM605 = this.f1372.m605();
        if (iM605 == -1) {
            nz.m907("Failed to find element");
            return;
        }
        list.remove(iM605);
        for (gm.C0042 c0042 : list) {
            C0358.f6687.m658("shortcuts", c0042.m605(), c0042.m606());
        }
        C0358.f6687.m658("shortcuts", list.size(), null);
        C0358.f6674.f42.f1802.f1356.setAdapter((ListAdapter) new gm());
    }
}
