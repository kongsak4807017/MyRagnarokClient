package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: o.髚, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0927 extends BaseAdapter {

    /* renamed from: 鷭, reason: contains not printable characters */
    ArrayList<C0603> f8218 = new ArrayList<>();

    /* renamed from: 鷭, reason: contains not printable characters */
    private static int m1537(C1008 c1008) {
        for (Map.Entry<Integer, C1008> entry : C0358.f6664.f2004.f8622.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if (c1008.f8502 == entry.getValue().f8502) {
                return iIntValue;
            }
        }
        return 0;
    }

    C0927(C1008[] c1008Arr, int[] iArr, int[] iArr2) {
        for (int i = 0; i < c1008Arr.length; i++) {
            this.f8218.add(new C0603(c1008Arr[i], iArr2[i], -1));
        }
    }

    C0927(ArrayList<C1008> arrayList, ArrayList<Integer> arrayList2, ArrayList<Integer> arrayList3) {
        for (int i = 0; i < arrayList.size(); i++) {
            this.f8218.add(new C0603(arrayList.get(i), arrayList3.get(i).intValue(), arrayList2 == null ? -1 : arrayList2.get(i).intValue()));
        }
    }

    C0927(ArrayList<C0603> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            this.f8218.add(new C0603(arrayList.get(i).f7409, arrayList.get(i).f7408, m1537(arrayList.get(i).f7409)));
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f8218.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f8218.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return this.f8218.get(i).m1380((RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903084, (ViewGroup) null), false);
    }
}
