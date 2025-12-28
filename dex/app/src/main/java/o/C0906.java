package o;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: o.顰, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0906 extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    View.OnClickListener f8188;

    /* renamed from: ą, reason: contains not printable characters */
    View.OnClickListener f8189;

    /* renamed from: ȃ, reason: contains not printable characters */
    String f8190;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    Button f8191;

    /* renamed from: 櫯, reason: contains not printable characters */
    EditText f8192;

    /* renamed from: 鷭, reason: contains not printable characters */
    TextView f8193;

    C0906(String str, boolean z, String str2, View.OnClickListener onClickListener) {
        super(2130903098);
        this.f8189 = new ViewOnClickListenerC1021(this);
        this.f8193 = (TextView) this.f1994.findViewById(2131296434);
        this.f8192 = (EditText) this.f1994.findViewById(2131296436);
        this.f8191 = (Button) this.f1994.findViewById(2131296435);
        this.f8193.setText(str);
        if (z) {
            this.f8192.setInputType(12290);
        } else {
            this.f8192.setInputType(0);
            this.f8192.setRawInputType(1);
        }
        this.f8190 = str2;
        this.f8188 = onClickListener;
        this.f8191.setOnClickListener(this.f8189);
        this.f8192.setOnKeyListener(new ViewOnKeyListenerC0943(this));
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        this.f8192.setText(this.f8190);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1994.getLayoutParams();
        layoutParams.addRule(15);
        this.f1994.setLayoutParams(layoutParams);
        ((InputMethodManager) C0358.f6674.getSystemService("input_method")).toggleSoftInput(1, 0);
        this.f8192.requestFocus();
        this.f8192.selectAll();
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        ((InputMethodManager) C0358.f6674.getSystemService("input_method")).toggleSoftInput(1, 0);
    }
}
