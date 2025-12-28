package o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.roworkshop.andro.c_activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class gh implements AdapterView.OnItemClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ ge f1351;

    gh(ge geVar) {
        this.f1351 = geVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ge geVar = this.f1351;
        c_activity c_activityVar = (c_activity) geVar.f1994.getContext();
        ga gaVar = (ga) geVar.f1338.getAdapter();
        ga gaVar2 = (ga) geVar.f1332.getAdapter();
        gb gbVar = gaVar2.f1303[i];
        gb gbVar2 = null;
        gb[] gbVarArr = gaVar.f1303;
        int length = gbVarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            gb gbVar3 = gbVarArr[i2];
            if ((gbVar.f1308.m1585() || gbVar3.f1308.f8500 <= 0) && gbVar3.f1308.m1593(gbVar.f1308)) {
                gbVar2 = gbVar3;
                break;
            }
            i2++;
        }
        if (gbVar2 != null) {
            geVar.f1335 -= gbVar.f1310 * gbVar.f1308.f8500;
            geVar.m599();
            if (gbVar2.f1308.f8500 != -1) {
                gbVar2.f1308.f8500 += gbVar.f1308.f8500;
                gbVar2.m597(gbVar2.f1305);
            }
            if (gaVar2.f1303.length == 1) {
                geVar.f1332.setAdapter((ListAdapter) null);
                return;
            }
            gaVar2.f1303[i] = null;
            gb[] gbVarArr2 = new gb[gaVar2.f1303.length - 1];
            int i3 = 0;
            for (int i4 = 0; i4 < gaVar2.f1303.length; i4++) {
                if (gaVar2.f1303[i4] != null) {
                    int i5 = i3;
                    i3++;
                    gbVarArr2[i5] = gaVar2.f1303[i4];
                }
            }
            geVar.f1332.setAdapter((ListAdapter) new ga(c_activityVar, gbVarArr2));
        }
    }
}
