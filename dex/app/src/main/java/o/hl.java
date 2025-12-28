package o;

import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class hl implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ hj f1488;

    hl(hj hjVar) {
        this.f1488 = hjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM621 = ((hm) this.f1488.f1480.getAdapter()).m621((RelativeLayout) view);
        if (iM621 < 0) {
            return;
        }
        this.f1488.m619(iM621);
    }
}
