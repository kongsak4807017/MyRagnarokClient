package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.Map;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class il extends BaseAdapter {

    /* renamed from: 櫯, reason: contains not printable characters */
    lg[] f1643;

    /* renamed from: 鷭, reason: contains not printable characters */
    ng f1644;

    il(ng ngVar) {
        this.f1644 = ng.USABLE;
        this.f1644 = ngVar;
        int i = 0;
        lg[] lgVarArr = new lg[C0358.f6664.f2004.f8595.size()];
        for (Map.Entry<Integer, C1008> entry : C0358.f6664.f2004.f8595.entrySet()) {
            C1008 value = entry.getValue();
            if (value != null && ng.m881(value.f8493) == ngVar) {
                int i2 = i;
                i++;
                lgVarArr[i2] = new lg(value, entry.getKey().intValue());
            }
        }
        this.f1643 = (lg[]) Arrays.copyOf(lgVarArr, i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1643.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f1643[i];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.f1643[i].f1964.f8502;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return this.f1643[i].m768((RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903084, (ViewGroup) null));
    }
}
