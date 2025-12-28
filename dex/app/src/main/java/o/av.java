package o;

import android.widget.CompoundButton;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class av implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ au f741;

    av(au auVar) {
        this.f741 = auVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            if (compoundButton == this.f741.f705) {
                this.f741.f714 = nm.EACH_TAKE;
                this.f741.f698.setChecked(false);
            } else {
                this.f741.f714 = nm.EVEN_SHARE;
                this.f741.f705.setChecked(false);
            }
        }
    }
}
