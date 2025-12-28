package o;

import android.widget.CompoundButton;
import o.C0804;

/* renamed from: o.Ұ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0403 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0804.C0806 f6781;

    C0403(C0804.C0806 c0806) {
        this.f6781 = c0806;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            if (compoundButton == this.f6781.f7912) {
                this.f6781.f7908.setChecked(false);
            } else if (compoundButton == this.f6781.f7908) {
                this.f6781.f7912.setChecked(false);
            }
            this.f6781.m1478();
        }
    }
}
