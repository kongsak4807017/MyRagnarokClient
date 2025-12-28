package o;

/* renamed from: o.ˮ̋, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0320 implements oe {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0558 f6623;

    C0320(C0558 c0558) {
        this.f6623 = c0558;
    }

    @Override // o.oe
    /* renamed from: 鷭 */
    public final void mo577(lg lgVar) {
        C0558 c0558 = this.f6623;
        c0558.f7280 = 0;
        c0558.f7289 = false;
        c0558.f7291.clear();
        C0358.f6674.f42.f1754.m1373();
        C0569 c0569 = C0358.f6674.f42.f1754;
        C1008 c1008 = lgVar.f1964;
        c0569.f7324.setText(c1008.m1592(C0358.f6685.f1030.f967));
        c0569.f7324.setTextColor(c1008.m1587());
        c0569.f7321.setVisibility(0);
        je jeVar = C0358.f6674.f42;
        jeVar.m730(c0569.f7321, C0358.f6685.f1030.m510(c1008.f8502, c1008.f8491, false), jeVar.f1815, null);
        c0569.f7328 = c1008.f8502;
        c0569.f7320.setText(C0358.f6685.f1030.f966.f8035.get(Integer.valueOf(c1008.f8502)));
        if (lgVar.f1964.f8502 == this.f6623.f7282 || lgVar.f1964.f8502 == this.f6623.f7283 || lgVar.f1964.f8502 == this.f6623.f7288 || lgVar.f1964.f8502 == this.f6623.f7290 || lgVar.f1964.f8502 == this.f6623.f7284 || lgVar.f1964.f8502 == this.f6623.f7292) {
            this.f6623.m1371(lgVar.f1964.f8502, true);
        } else {
            this.f6623.m1371(lgVar.f1964.f8502, false);
        }
    }

    @Override // o.oe
    /* renamed from: 鷭 */
    public final void mo576() {
        C0558 c0558 = this.f6623;
        c0558.f7280 = 0;
        c0558.f7289 = false;
        c0558.f7291.clear();
        C0358.f6674.f42.f1754.m1373();
        C0358.f6671.mo454(new C0199(0, null));
    }
}
