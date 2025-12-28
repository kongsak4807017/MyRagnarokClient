package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import java.util.ArrayList;

/* renamed from: o.ᗔ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0471 extends BaseAdapter {

    /* renamed from: 鷭, reason: contains not printable characters */
    ArrayList<lg> f6927 = new ArrayList<>();

    C0471(int[] iArr, C1008[] c1008Arr) {
        for (int i = 0; i < c1008Arr.length; i++) {
            this.f6927.add(new lg(c1008Arr[i], iArr != null ? iArr[i] : -1));
        }
    }

    C0471(int[] iArr, ArrayList<C1008> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            this.f6927.add(new lg(arrayList.get(i), -1));
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f6927.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f6927.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.f6927.get(i).f1964.f8502;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return this.f6927.get(i).m768((RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903084, (ViewGroup) null));
    }
}
