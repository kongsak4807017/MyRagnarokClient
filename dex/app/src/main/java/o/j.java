package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class j extends ku {

    /* renamed from: Ą, reason: contains not printable characters */
    View.OnClickListener f1721 = new l(this);

    /* renamed from: ą, reason: contains not printable characters */
    View.OnClickListener f1722 = new m(this);

    /* renamed from: ȃ, reason: contains not printable characters */
    int f1723;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    Button f1724;

    /* renamed from: 櫯, reason: contains not printable characters */
    Button f1725;

    /* renamed from: 鷭, reason: contains not printable characters */
    LinearLayout f1726;

    j(LayoutInflater layoutInflater) {
        this.f1726 = (LinearLayout) layoutInflater.inflate(2130903096, (ViewGroup) null);
        this.f1725 = (Button) this.f1726.findViewById(2131296279);
        this.f1724 = (Button) this.f1726.findViewById(2131296300);
        this.f1725.setOnClickListener(this.f1721);
        this.f1724.setOnClickListener(this.f1722);
    }

    @Override // o.ku
    final void h_() {
        if (this.f1726.getParent() != null) {
            return;
        }
        C0358.f6674.f42.f1777.addView(this.f1726);
        C0358.f6674.f42.f1799.push(this);
    }

    @Override // o.ku
    /* renamed from: 櫯 */
    final boolean mo440() {
        return this.f1726.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.ku
    /* renamed from: ˮ͈ */
    public final void mo439() {
        if (!(this.f1726.getParent() != null)) {
            return;
        }
        C0358.f6674.f42.f1799.remove(this);
        C0358.f6674.f42.f1777.removeView(this.f1726);
        if (C0358.f6667.f4791) {
            C0358.f6671.mo454(new C0168());
        }
    }
}
