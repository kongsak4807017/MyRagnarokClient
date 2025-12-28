package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.Map;

/* renamed from: o.ꍀ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0979 extends BaseAdapter {

    /* renamed from: 櫯, reason: contains not printable characters */
    lg[] f8334;

    /* renamed from: 鷭, reason: contains not printable characters */
    ng f8335;

    C0979(ng ngVar) {
        this.f8335 = ng.USABLE;
        this.f8334 = new lg[0];
        this.f8335 = ngVar;
        if (C0358.f6664.f2004 == null) {
            nz.m907("Requested inventory adapter init while not ingame");
            return;
        }
        if (ngVar != ng.CART) {
            int i = 0;
            lg[] lgVarArr = new lg[C0358.f6664.f2004.f8622.size()];
            for (Map.Entry<Integer, C1008> entry : C0358.f6664.f2004.f8622.entrySet()) {
                int iIntValue = entry.getKey().intValue();
                C1008 value = entry.getValue();
                if (value != null && value.f8490 <= 0 && ng.m881(value.f8493) == ngVar) {
                    int i2 = i;
                    i++;
                    lgVarArr[i2] = new lg(value, iIntValue);
                }
            }
            this.f8334 = (lg[]) Arrays.copyOf(lgVarArr, i);
            return;
        }
        int i3 = 0;
        this.f8334 = new lg[C0358.f6664.f2004.f8592.size()];
        for (Map.Entry<Integer, C1008> entry2 : C0358.f6664.f2004.f8592.entrySet()) {
            int i4 = i3;
            i3++;
            this.f8334[i4] = new lg(entry2.getValue(), entry2.getKey().intValue());
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f8334.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f8334[i];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.f8334[i].f1964.f8502;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return this.f8334[i].m768((RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903084, (ViewGroup) null));
    }
}
