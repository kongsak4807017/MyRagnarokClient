package o;

import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import org.apache.commons.net.bsd.RCommandClient;

/* renamed from: o.쮱, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1115 extends AbstractC0769 {

    /* renamed from: Ą, reason: contains not printable characters */
    TextView f8913;

    /* renamed from: ȃ, reason: contains not printable characters */
    TextView f8914;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    TextView f8915;

    /* renamed from: 櫯, reason: contains not printable characters */
    TextView f8916;

    /* renamed from: 鷭, reason: contains not printable characters */
    ListView f8917;

    C1115() {
        super(2130903071, nf.POSITIONS);
        this.f8917 = (ListView) this.f7796.findViewById(2131296332);
        this.f8916 = (TextView) this.f7796.findViewById(2131296265);
        this.f8915 = (TextView) this.f7796.findViewById(2131296277);
        this.f8914 = (TextView) this.f7796.findViewById(2131296282);
        this.f8913 = (TextView) this.f7796.findViewById(2131296259);
        TextView textView = this.f8916;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(512);
        textView.setText(strM649 == null ? "MSG512" : strM649);
        TextView textView2 = this.f8915;
        cv cvVar2 = C0358.f6685;
        String strM6492 = C0358.f6687.m649(513);
        textView2.setText(strM6492 == null ? "MSG513" : strM6492);
        TextView textView3 = this.f8914;
        cv cvVar3 = C0358.f6685;
        String strM6493 = C0358.f6687.m649(RCommandClient.DEFAULT_PORT);
        textView3.setText(strM6493 == null ? "MSG514" : strM6493);
        TextView textView4 = this.f8913;
        cv cvVar4 = C0358.f6685;
        String strM6494 = C0358.f6687.m649(515);
        textView4.setText(strM6494 == null ? "MSG515" : strM6494);
    }

    @Override // o.AbstractC0769
    /* renamed from: 鷭 */
    final void mo1382() {
        this.f8917.setAdapter((ListAdapter) new C0669());
    }
}
