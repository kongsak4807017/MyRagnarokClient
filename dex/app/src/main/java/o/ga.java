package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import com.roworkshop.andro.c_activity;
import java.util.ArrayList;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ga extends BaseAdapter {

    /* renamed from: 鷭, reason: contains not printable characters */
    gb[] f1303;

    ga(c_activity c_activityVar, gb[] gbVarArr) {
        this.f1303 = gbVarArr;
    }

    ga(ArrayList<gb> arrayList) {
        this.f1303 = new gb[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.f1303[i] = arrayList.get(i);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1303.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        RelativeLayout relativeLayout;
        Context context = viewGroup.getContext();
        if (view == null) {
            relativeLayout = (RelativeLayout) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(2130903100, (ViewGroup) null);
        } else {
            relativeLayout = (RelativeLayout) view;
        }
        this.f1303[i].m597(relativeLayout);
        return relativeLayout;
    }
}
