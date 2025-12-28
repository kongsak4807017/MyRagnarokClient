package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import java.util.LinkedList;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class jd extends BaseAdapter {

    /* renamed from: 鷭, reason: contains not printable characters */
    LinkedList<lg> f1730;

    jd(LinkedList<lg> linkedList) {
        this.f1730 = linkedList;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1730.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f1730.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.f1730.get(i).f1964.f8502;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return this.f1730.get(i).m768((RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903084, (ViewGroup) null));
    }
}
