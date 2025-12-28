package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: o.嫁, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0669 extends BaseAdapter {

    /* renamed from: 鷭, reason: contains not printable characters */
    C0646[] f7581;

    C0669() {
        C0972 c0972 = C0358.f6664.f2004.f8635;
        this.f7581 = new C0646[c0972.f8302 == null ? 0 : c0972.f8302.length];
        for (int i = 0; i < this.f7581.length; i++) {
            this.f7581[i] = new C0646(C0358.f6664.f2004.f8635.m1554(i));
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f7581.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f7581[i];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0646 c0646 = this.f7581[i];
        c0646.f7532 = (RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903072, (ViewGroup) null);
        c0646.f7531 = (TextView) c0646.f7532.findViewById(2131296265);
        c0646.f7530 = (TextView) c0646.f7532.findViewById(2131296259);
        c0646.f7528 = (CheckBox) c0646.f7532.findViewById(2131296278);
        c0646.f7529 = (CheckBox) c0646.f7532.findViewById(2131296359);
        c0646.f7531.setText(c0646.f7533.f8313);
        c0646.f7530.setText(String.valueOf(String.valueOf(c0646.f7533.f8310)) + " %");
        c0646.f7528.setChecked(c0646.f7533.f8312);
        c0646.f7529.setChecked(c0646.f7533.f8311);
        c0646.f7528.setEnabled(C0358.f6664.f2004.f812);
        c0646.f7529.setEnabled(C0358.f6664.f2004.f812);
        return c0646.f7532;
    }
}
