package o;

import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

/* renamed from: o.䥯, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0609 extends AbstractC0769 {

    /* renamed from: 櫯, reason: contains not printable characters */
    TextView f7414;

    /* renamed from: 鷭, reason: contains not printable characters */
    ListView f7415;

    C0609() {
        super(2130903073, nf.SKILLS);
        this.f7415 = (ListView) this.f7796.findViewById(2131296332);
        this.f7414 = (TextView) this.f7796.findViewById(2131296265);
    }

    @Override // o.AbstractC0769
    /* renamed from: 鷭, reason: contains not printable characters */
    final void mo1382() {
        TextView textView = this.f7414;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(285);
        textView.setText(String.format(strM649 == null ? "MSG285" : strM649, Integer.valueOf(C0358.f6664.f2004.f8635.f8296)));
        this.f7415.setAdapter((ListAdapter) new C0870());
    }
}
