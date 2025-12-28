package o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.LinkedList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class iz extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    ListView f1709;

    /* renamed from: ą, reason: contains not printable characters */
    Button f1710;

    /* renamed from: Ć, reason: contains not printable characters */
    EditText f1711;

    /* renamed from: ć, reason: contains not printable characters */
    EditText f1712;

    /* renamed from: ċ, reason: contains not printable characters */
    View.OnClickListener f1713;

    /* renamed from: ȃ, reason: contains not printable characters */
    ListView f1714;

    /* renamed from: Ȋ, reason: contains not printable characters */
    AdapterView.OnItemClickListener f1715;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    TextView f1716;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    int f1717;

    /* renamed from: 岱, reason: contains not printable characters */
    AdapterView.OnItemClickListener f1718;

    /* renamed from: 櫯, reason: contains not printable characters */
    TextView f1719;

    /* renamed from: 鷭, reason: contains not printable characters */
    TextView f1720;

    iz() {
        super(2130903143);
        this.f1718 = new ja(this);
        this.f1715 = new jb(this);
        this.f1713 = new jc(this);
        this.f1719 = (TextView) this.f1994.findViewById(2131296265);
        this.f1716 = (TextView) this.f1994.findViewById(2131296259);
        this.f1720 = (TextView) this.f1994.findViewById(2131296282);
        this.f1714 = (ListView) this.f1994.findViewById(2131296332);
        this.f1709 = (ListView) this.f1994.findViewById(2131296539);
        this.f1710 = (Button) this.f1994.findViewById(2131296279);
        this.f1711 = (EditText) this.f1994.findViewById(2131296299);
        this.f1712 = (EditText) this.f1994.findViewById(2131296333);
        this.f1710.setOnClickListener(this.f1713);
        this.f1709.setOnItemClickListener(this.f1718);
        this.f1714.setOnItemClickListener(this.f1715);
        this.f1711.setTextColor(-1);
        this.f1712.setTextColor(-1);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m701(C1008 c1008) {
        LinkedList<lg> linkedListM698 = m698(true);
        if (linkedListM698 == null) {
            linkedListM698 = new LinkedList<>();
        }
        linkedListM698.add(new lg(c1008.m1589(), 0));
        m702(true, linkedListM698);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final LinkedList<lg> m698(boolean z) {
        jd jdVar = (jd) (z ? this.f1709.getAdapter() : this.f1714.getAdapter());
        if (jdVar == null) {
            return null;
        }
        return jdVar.f1730;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m702(boolean z, LinkedList<lg> linkedList) {
        jd jdVar = null;
        if (linkedList != null) {
            jdVar = new jd(linkedList);
        }
        if (z) {
            this.f1709.setAdapter((ListAdapter) jdVar);
        } else {
            this.f1714.setAdapter((ListAdapter) jdVar);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m700(String str, int i) {
        this.f1720.setText(String.valueOf(str) + " (Lv " + i + ")");
        this.f1716.setText(String.valueOf(str) + "'s items.");
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m699(int i) {
        this.f1712.setText(String.valueOf(String.valueOf(NumberFormat.getInstance().format(i))) + " Z");
    }

    /* renamed from: Ć, reason: contains not printable characters */
    final void m697() {
        this.f1717 = 0;
        m702(false, (LinkedList<lg>) null);
        m702(true, (LinkedList<lg>) null);
        this.f1714.setEnabled(true);
        this.f1709.setEnabled(true);
        this.f1710.setEnabled(true);
        this.f1710.setText("Ok");
        this.f1711.setEnabled(true);
        this.f1711.setText((CharSequence) null);
        this.f1712.setText((CharSequence) null);
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        C0358.f6674.f42.f1810.h_();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1994.getLayoutParams();
        layoutParams.addRule(10);
        layoutParams.width = -1;
        layoutParams.addRule(2, 2131296256);
        this.f1994.setLayoutParams(layoutParams);
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
    }
}
