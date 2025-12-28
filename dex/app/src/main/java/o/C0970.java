package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: o.ꅗ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0970 extends BaseAdapter {

    /* renamed from: 鷭, reason: contains not printable characters */
    C0810[] f8284 = new C0810[C0358.f6664.f2004.f8635.f8299.size()];

    C0970() {
        for (int i = 0; i < C0358.f6664.f2004.f8635.f8299.size(); i++) {
            this.f8284[i] = new C0810(C0358.f6664.f2004.f8635.f8299.get(i));
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f8284.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f8284[i];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0810 c0810 = this.f8284[i];
        c0810.f7924 = (RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903067, (ViewGroup) null);
        c0810.f7923 = (TextView) c0810.f7924.findViewById(2131296265);
        c0810.f7922 = (TextView) c0810.f7924.findViewById(2131296259);
        c0810.f7923.setText(c0810.f7925.f8309);
        c0810.f7922.setText(c0810.f7925.f8308);
        return c0810.f7924;
    }
}
