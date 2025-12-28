package o;

import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import org.apache.http.HttpStatus;

/* renamed from: o.療, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1152 extends AbstractC0769 {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    ListView f9005;

    /* renamed from: 櫯, reason: contains not printable characters */
    TextView f9006;

    /* renamed from: 鷭, reason: contains not printable characters */
    TextView f9007;

    C1152() {
        super(2130903066, nf.EXPULSIONS);
        this.f9007 = (TextView) this.f7796.findViewById(2131296265);
        this.f9006 = (TextView) this.f7796.findViewById(2131296259);
        this.f9005 = (ListView) this.f7796.findViewById(2131296332);
        TextView textView = this.f9007;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(HttpStatus.SC_REQUEST_TIMEOUT);
        textView.setText(strM649 == null ? "MSG408" : strM649);
        TextView textView2 = this.f9006;
        cv cvVar2 = C0358.f6685;
        String strM6492 = C0358.f6687.m649(463);
        textView2.setText(strM6492 == null ? "MSG463" : strM6492);
    }

    @Override // o.AbstractC0769
    /* renamed from: 鷭 */
    final void mo1382() {
        this.f9005.setAdapter((ListAdapter) new C0970());
    }
}
