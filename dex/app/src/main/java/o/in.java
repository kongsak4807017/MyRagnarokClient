package o;

import android.view.View;
import android.widget.AdapterView;
import o.lg;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class in implements AdapterView.OnItemClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ im f1649;

    in(im imVar) {
        this.f1649 = imVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        lg lgVar = (lg) this.f1649.f1647.getAdapter().getItem(i);
        if (lgVar != null) {
            if (C0358.f6674.f42.f1810.f7818 == ng.CART) {
                lgVar.m769(lg.EnumC0059.FROM_STORAGE_TO_CART, -1);
            } else {
                lgVar.m769(lg.EnumC0059.FROM_STORAGE_TO_INVENTORY, -1);
            }
        }
    }
}
