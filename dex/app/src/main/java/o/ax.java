package o;

import android.widget.CompoundButton;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ax implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ au f743;

    ax(au auVar) {
        this.f743 = auVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            if (compoundButton == this.f743.f711) {
                this.f743.f715 = no.PICKER;
                this.f743.f706.setChecked(false);
            } else {
                this.f743.f715 = no.RANDOM;
                this.f743.f711.setChecked(false);
            }
        }
    }
}
