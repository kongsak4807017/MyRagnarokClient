package o;

import android.widget.CompoundButton;

/* renamed from: o.嫶, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0670 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0767 f7582;

    C0670(C0767 c0767) {
        this.f7582 = c0767;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C0358.f6687.m658("save_login", 0, String.valueOf(z));
        if (!z) {
            this.f7582.f7783.setChecked(false);
        }
    }
}
