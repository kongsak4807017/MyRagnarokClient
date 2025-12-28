package o;

import android.widget.CompoundButton;
import o.C0804;

/* renamed from: o.端, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0829 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0804.C0806 f7941;

    C0829(C0804.C0806 c0806) {
        this.f7941 = c0806;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            if (compoundButton == this.f7941.f7906) {
                this.f7941.f7913.setChecked(false);
            } else if (compoundButton == this.f7941.f7913) {
                this.f7941.f7906.setChecked(false);
            }
            this.f7941.m1478();
        }
    }
}
