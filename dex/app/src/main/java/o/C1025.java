package o;

import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SlidingDrawer;
import android.widget.TextView;
import java.util.Iterator;
import o.C0685;

/* renamed from: o.둆, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1025 extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    private View.OnKeyListener f8545;

    /* renamed from: ȃ, reason: contains not printable characters */
    Button f8546;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    EditText f8547;

    /* renamed from: 櫯, reason: contains not printable characters */
    TextView f8548;

    /* renamed from: 鷭, reason: contains not printable characters */
    ListView f8549;

    C1025() {
        super(2130903049);
        this.f8545 = new ViewOnKeyListenerC0827(this);
        this.f8548 = (TextView) this.f1994.findViewById(2131296265);
        this.f8547 = (EditText) this.f1994.findViewById(2131296299);
        this.f8546 = (Button) this.f1994.findViewById(2131296279);
        this.f8549 = (ListView) ((LinearLayout) ((SlidingDrawer) this.f1994.findViewById(2131296329)).findViewById(2131296330)).findViewById(2131296332);
        this.f8546.setOnClickListener(new ViewOnClickListenerC0839(this));
        this.f8547.setOnKeyListener(this.f8545);
    }

    final void i_() {
        if (this.f8547.getText() == null) {
            return;
        }
        String strTrim = this.f8547.getText().toString().trim();
        if (strTrim.length() == 0) {
            return;
        }
        C0358.f6671.mo454(new C0154(C0358.f6664.f2004.f8368, strTrim));
        this.f8547.setText((CharSequence) null);
    }

    /* renamed from: Ć, reason: contains not printable characters */
    final void m1602() {
        if (C0358.f6664.f2004.f8616 == null) {
            if (this.f1994.getParent() != null) {
                mo439();
            }
        }
        int i = 0;
        String[] strArr = new String[C0358.f6664.f2004.f8616.f7620.size()];
        Iterator<C0685.C0686> it = C0358.f6664.f2004.f8616.f7620.iterator();
        while (it.hasNext()) {
            int i2 = i;
            i++;
            strArr[i2] = it.next().f7626;
        }
        this.f8549.setAdapter((ListAdapter) new ArrayAdapter(C0358.f6674, 2130903135, strArr));
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        m774();
        m1602();
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        this.f8548.setText((CharSequence) null);
        if (C0358.f6664.f2004.f8616 != null) {
            C0358.f6671.mo454(new C0561());
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1603(String str, int i) {
        CharSequence text = this.f8548.getText();
        int length = 0;
        if (text != null) {
            length = text.length();
            this.f8548.append(String.valueOf(str) + "\n");
        } else {
            this.f8548.setText(str);
        }
        ((Spannable) this.f8548.getText()).setSpan(new ForegroundColorSpan((-16777216) | i), length, str.length() + length + 1, 0);
    }
}
