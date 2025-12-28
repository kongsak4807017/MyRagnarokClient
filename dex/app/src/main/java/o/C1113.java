package o;

import android.widget.CompoundButton;

/* renamed from: o.쭅, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1113 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0767 f8912;

    C1113(C0767 c0767) {
        this.f8912 = c0767;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C0358.f6687.m658("save_password", 0, String.valueOf(z));
        if (z) {
            this.f8912.f7785.setChecked(true);
        }
    }
}
