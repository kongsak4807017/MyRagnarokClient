package o;

import android.widget.CompoundButton;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class aw implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ au f742;

    aw(au auVar) {
        this.f742 = auVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            if (compoundButton == this.f742.f700) {
                this.f742.f710 = nn.KILLER;
                this.f742.f701.setChecked(false);
            } else {
                this.f742.f710 = nn.ANYONE;
                this.f742.f700.setChecked(false);
            }
        }
    }
}
