package o;

import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class az extends ll {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    AdapterView.OnItemClickListener f745;

    /* renamed from: 櫯, reason: contains not printable characters */
    ListView f746;

    /* renamed from: 鷭, reason: contains not printable characters */
    TextView f747;

    az() {
        super(2130903106);
        this.f745 = new ba(this);
        this.f747 = (TextView) this.f1994.findViewById(2131296265);
        this.f746 = (ListView) this.f1994.findViewById(2131296332);
        this.f746.setOnItemClickListener(this.f745);
    }

    /* renamed from: Ć, reason: contains not printable characters */
    final void m444() {
        TextView textView = this.f747;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(104);
        textView.setText(String.valueOf(strM649 == null ? "MSG104" : strM649) + " (" + C0358.f6664.f2004.f8596.f688 + ")");
        this.f746.setAdapter((ListAdapter) new be());
    }

    @Override // o.ll
    /* renamed from: ȃ, reason: contains not printable characters */
    public final void mo445() {
        m444();
    }

    @Override // o.ll
    /* renamed from: Ą, reason: contains not printable characters */
    public final void mo443() {
        this.f747.setText((CharSequence) null);
        this.f746.setAdapter((ListAdapter) null);
    }
}
