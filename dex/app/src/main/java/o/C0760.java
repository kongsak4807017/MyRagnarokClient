package o;

import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: o.橠, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0760 extends AbstractC0733 {

    /* renamed from: Ą, reason: contains not printable characters */
    ImageView f7756;

    /* renamed from: ą, reason: contains not printable characters */
    TextView f7757;

    /* renamed from: Ć, reason: contains not printable characters */
    TextView f7758;

    /* renamed from: ć, reason: contains not printable characters */
    TextView f7759;

    /* renamed from: ȃ, reason: contains not printable characters */
    int f7760;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    int f7761;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f7762;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f7763;

    C0760(int i, int i2, int i3, int i4) {
        super(2130903045);
        this.f7763 = i;
        this.f7762 = i2;
        this.f7761 = i3;
        this.f7760 = i4;
    }

    @Override // o.AbstractC0733
    /* renamed from: 鷭 */
    final void mo485() {
        this.f7756 = (ImageView) this.f7711.findViewById(2131296297);
        this.f7757 = (TextView) this.f7711.findViewById(2131296265);
        this.f7758 = (TextView) this.f7711.findViewById(2131296259);
        this.f7759 = (TextView) this.f7711.findViewById(2131296282);
        C1008 c1008 = new C1008(this.f7763);
        je jeVar = C0358.f6674.f42;
        jeVar.m730(this.f7756, C0358.f6685.f1030.m510(c1008.f8502, c1008.f8491, true), jeVar.f1815, null);
        this.f7757.setText(c1008.m1592(C0358.f6685.f1030.f967));
        this.f7758.setText(String.valueOf(pa.m973(this.f7762)) + " CP");
        if (this.f7761 > 0) {
            this.f7759.setVisibility(0);
            this.f7759.setText(String.valueOf(this.f7761));
        } else {
            this.f7759.setVisibility(8);
        }
    }
}
