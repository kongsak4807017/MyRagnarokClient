package o;

import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class jc implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ iz f1729;

    jc(iz izVar) {
        this.f1729 = izVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1729.f1710.setEnabled(false);
        if (this.f1729.f1714.isEnabled()) {
            this.f1729.f1714.setEnabled(false);
            try {
                this.f1729.f1717 = Math.min(C0358.f6664.f2004.f8636, Integer.parseInt(this.f1729.f1711.getText().toString()));
            } catch (NumberFormatException unused) {
                this.f1729.f1717 = 0;
            }
            if (this.f1729.f1717 > 0) {
                C0358.f6671.mo454(new C0897(-2, this.f1729.f1717));
            }
            C0358.f6671.mo454(new C0203());
            return;
        }
        C0358.f6671.mo454(new C0202());
    }
}
