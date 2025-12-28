package o;

import android.view.View;
import android.widget.AdapterView;
import java.util.Arrays;
import o.lg;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class io implements AdapterView.OnItemLongClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ im f1650;

    io(im imVar) {
        this.f1650 = imVar;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        lg lgVar = (lg) this.f1650.f1647.getAdapter().getItem(i);
        if (lgVar != null) {
            lg.EnumC0059[] enumC0059Arr = new lg.EnumC0059[lg.EnumC0059.valuesCustom().length];
            int i2 = 0 + 1;
            enumC0059Arr[0] = lg.EnumC0059.FROM_STORAGE_TO_INVENTORY;
            C1035 c1035 = C0358.f6664.f2004;
            if (c1035.f8351.containsKey(nt.ON_PUSH_CART) || (c1035.f8357 & 1928) > 0) {
                i2++;
                enumC0059Arr[1] = lg.EnumC0059.FROM_STORAGE_TO_CART;
            }
            enumC0059Arr[i2] = lg.EnumC0059.VIEW;
            lgVar.m770((lg.EnumC0059[]) Arrays.copyOf(enumC0059Arr, i2 + 1));
            return true;
        }
        return true;
    }
}
