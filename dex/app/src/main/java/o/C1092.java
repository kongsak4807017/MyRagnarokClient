package o;

import android.widget.TextView;
import java.util.Arrays;
import o.lg;

/* renamed from: o.쎥, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1092 extends C0821 {

    /* renamed from: 鷭, reason: contains not printable characters */
    TextView f8868;

    C1092() {
        super(2130903086, ng.CART);
        this.f8868 = (TextView) this.f683.findViewById(2131296265);
        m1630();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1630() {
        this.f8868.setText("Num: " + C0358.f6664.f2004.f8592.size() + " / " + C0358.f6664.f2004.f8593 + " Weight: " + (C0358.f6664.f2004.f8594 / 10) + "/" + (C0358.f6664.f2004.f8609 / 10));
    }

    @Override // o.C0821
    /* renamed from: 鷭 */
    final void mo1486(int i) {
        lg lgVar = (lg) this.f7936.getAdapter().getItem(i);
        if (C0358.f6674.f42.f1750.f1994.getParent() != null) {
            lgVar.m769(lg.EnumC0059.ADD_TO_VENDING_LIST, -1);
            return;
        }
        if (C0358.f6674.f42.f1786.f1994.getParent() != null) {
            lgVar.m769(lg.EnumC0059.FROM_CART_TO_STORAGE, -1);
        } else {
            lgVar.m769(lg.EnumC0059.FROM_CART_TO_INVENTORY, -1);
        }
    }

    @Override // o.C0821
    /* renamed from: 櫯 */
    final void mo1485(int i) {
        lg lgVar = (lg) this.f7936.getAdapter().getItem(i);
        lg.EnumC0059[] enumC0059Arr = new lg.EnumC0059[lg.EnumC0059.valuesCustom().length];
        int i2 = 0;
        if (C0358.f6674.f42.f1750.f1994.getParent() != null) {
            i2 = 0 + 1;
            enumC0059Arr[0] = lg.EnumC0059.ADD_TO_VENDING_LIST;
        }
        int i3 = i2;
        int i4 = i2 + 1;
        enumC0059Arr[i3] = lg.EnumC0059.FROM_CART_TO_INVENTORY;
        if (C0358.f6674.f42.f1786.f1994.getParent() != null) {
            i4++;
            enumC0059Arr[i4] = lg.EnumC0059.FROM_CART_TO_STORAGE;
        }
        enumC0059Arr[i4] = lg.EnumC0059.VIEW;
        lgVar.m770((lg.EnumC0059[]) Arrays.copyOf(enumC0059Arr, i4 + 1));
    }
}
