package o;

import android.view.View;
import android.widget.AdapterView;
import o.ge;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class gg implements AdapterView.OnItemClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ ge f1350;

    gg(ge geVar) {
        this.f1350 = geVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ga gaVar = (ga) this.f1350.f1338.getAdapter();
        ga gaVar2 = (ga) this.f1350.f1332.getAdapter();
        if (!C0358.f6667.f4821 && this.f1350.f1340 == ge.EnumC0041.CASHSHOP && gaVar2 != null && gaVar2.f1303 != null && gaVar2.f1303.length > 0) {
            return;
        }
        if (!gaVar.f1303[i].f1308.m1585() || !this.f1350.f1333.isChecked()) {
            this.f1350.m600(i, -1);
            return;
        }
        ge geVar = this.f1350;
        ga gaVar3 = (ga) geVar.f1338.getAdapter();
        geVar.f1336 = i;
        if (geVar.f1340 == ge.EnumC0041.NPCSHOP_BUYFROMNPC || geVar.f1340 == ge.EnumC0041.VENDING || geVar.f1340 == ge.EnumC0041.CASHSHOP) {
            geVar.f1341.f8193.setText("Input [" + ((Object) gaVar3.f1303[i].f1306.getText()) + "] amount to buy");
        } else {
            if (geVar.f1340 != ge.EnumC0041.NPCSHOP_SELLTONPC && geVar.f1340 != ge.EnumC0041.CHANGE_MATERIAL) {
                throw new nv();
            }
            geVar.f1341.f8193.setText("Input [" + ((Object) gaVar3.f1303[i].f1306.getText()) + "] amount to sell");
        }
        geVar.f1341.h_();
    }
}
