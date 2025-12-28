package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import o.AbstractC0733;

/* renamed from: o.덛, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class C1019<T extends AbstractC0733> extends BaseAdapter {

    /* renamed from: 鷭, reason: contains not printable characters */
    T[] f8521;

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.f8521[i];
    }

    C1019(T[] tArr) {
        this.f8521 = tArr;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f8521.length;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        T t = this.f8521[i];
        t.f7711 = (RelativeLayout) C0358.f6674.getLayoutInflater().inflate(t.f7710, (ViewGroup) null);
        t.mo485();
        return t.f7711;
    }
}
