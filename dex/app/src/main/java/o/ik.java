package o;

import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ik implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ ij f1642;

    ik(ij ijVar) {
        this.f1642 = ijVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EnumC0505 enumC0505;
        ij ijVar = this.f1642;
        if (view == ijVar.f1638) {
            enumC0505 = EnumC0505.STR;
        } else if (view == ijVar.f1632) {
            enumC0505 = EnumC0505.AGI;
        } else if (view == ijVar.f1639) {
            enumC0505 = EnumC0505.VIT;
        } else if (view == ijVar.f1629) {
            enumC0505 = EnumC0505.INT;
        } else if (view == ijVar.f1635) {
            enumC0505 = EnumC0505.DEX;
        } else {
            if (view != ijVar.f1618) {
                nz.m907("Unexpected view pressed " + view);
                return;
            }
            enumC0505 = EnumC0505.LUK;
        }
        C0358.f6671.mo454(new C0793(enumC0505));
    }
}
