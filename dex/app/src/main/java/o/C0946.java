package o;

import java.util.Iterator;
import java.util.Map;
import o.C0558;

/* renamed from: o.魭, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0946 implements oe {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ boolean f8243;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ C0558.C0559 f8244;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0558 f8245;

    C0946(C0558 c0558, C0558.C0559 c0559, boolean z) {
        this.f8245 = c0558;
        this.f8244 = c0559;
        this.f8243 = z;
    }

    @Override // o.oe
    /* renamed from: 鷭 */
    public final void mo577(lg lgVar) {
        if ((lgVar.f1964.f8502 == this.f8245.f7282 || lgVar.f1964.f8502 == this.f8245.f7283 || lgVar.f1964.f8502 == this.f8245.f7288 || lgVar.f1964.f8502 == this.f8245.f7290) && !this.f8245.f7289) {
            this.f8245.f7289 = true;
        }
        if (this.f8245.f7280 < this.f8245.f7285) {
            Iterator<Map.Entry<Integer, C1008>> it = C0358.f6664.f2004.f8622.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Integer, C1008> next = it.next();
                int iIntValue = next.getKey().intValue();
                if (next.getValue() != null && lgVar.f1964.f8502 == C0358.f6664.f2004.f8622.get(Integer.valueOf(iIntValue)).f8502) {
                    int[] iArr = this.f8245.f7287;
                    C0558 c0558 = this.f8245;
                    int i = c0558.f7280;
                    c0558.f7280 = i + 1;
                    iArr[i] = iIntValue;
                    C0558 c05582 = this.f8245;
                    int i2 = this.f8245.f7287[this.f8245.f7280 - 1];
                    C1008 c1008 = C0358.f6664.f2004.f8622.get(Integer.valueOf(i2));
                    c05582.f7291.add(c1008);
                    if (c1008 != null) {
                        c1008.f8500--;
                        if (c1008.f8500 <= 0) {
                            C0358.f6664.f2004.f8622.remove(Integer.valueOf(i2));
                        }
                        C0778 c0778 = C0358.f6674.f42.f1810;
                        EnumC0680 enumC0680 = c1008.f8493;
                        if (c0778.f1994.getParent() != null) {
                            c0778.m1465(ng.m881(enumC0680));
                        }
                    }
                }
            }
            C0569 c0569 = C0358.f6674.f42.f1754;
            C1008 c10082 = lgVar.f1964;
            int i3 = this.f8245.f7280;
            if (c10082.f8502 != 0) {
                int i4 = i3 - 1;
                c0569.f7319[i4].setText(c10082.m1592(C0358.f6685.f1030.f967));
                c0569.f7319[i4].setTextColor(c10082.m1587());
                c0569.f7322[i4].setVisibility(0);
                je jeVar = C0358.f6674.f42;
                jeVar.m730(c0569.f7322[i4], C0358.f6685.f1030.m510(c10082.f8502, c10082.f8491, false), jeVar.f1815, null);
                c0569.f7325[i4] = c10082.f8502;
            }
        }
        this.f8245.m1371(this.f8244.f7296, this.f8243);
    }

    @Override // o.oe
    /* renamed from: 鷭 */
    public final void mo576() {
        C0558.m1370(this.f8245.f7287, this.f8245.f7291);
        C0358.f6671.mo454(new C0199(0, null));
    }
}
