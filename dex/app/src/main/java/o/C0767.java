package o;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import o.pj;

/* renamed from: o.櫲, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0767 {

    /* renamed from: Ȋ, reason: contains not printable characters */
    private View.OnClickListener f7784 = new ViewOnClickListenerC0390(this);

    /* renamed from: ċ, reason: contains not printable characters */
    private CompoundButton.OnCheckedChangeListener f7782 = new C0670(this);

    /* renamed from: 纫, reason: contains not printable characters */
    private CompoundButton.OnCheckedChangeListener f7792 = new C1113(this);

    /* renamed from: 䒧, reason: contains not printable characters */
    private View.OnClickListener f7788 = new ViewOnClickListenerC0614(this);

    /* renamed from: 躆, reason: contains not printable characters */
    private View.OnClickListener f7793 = new ViewOnClickListenerC0840(this);

    /* renamed from: ܕ, reason: contains not printable characters */
    private View.OnClickListener f7787 = new ViewOnClickListenerC1143(this);

    /* renamed from: 庸, reason: contains not printable characters */
    private View.OnClickListener f7790 = new ViewOnClickListenerC0624(this);

    /* renamed from: Ą, reason: contains not printable characters */
    private Button f7778 = (Button) C0358.f6674.findViewById(2131296404);

    /* renamed from: ą, reason: contains not printable characters */
    private TextView f7779 = (TextView) C0358.f6674.findViewById(2131296265);

    /* renamed from: Ć, reason: contains not printable characters */
    private Button f7780 = (Button) C0358.f6674.findViewById(2131296279);

    /* renamed from: ć, reason: contains not printable characters */
    private Button f7781 = (Button) C0358.f6674.findViewById(2131296300);

    /* renamed from: 鷭, reason: contains not printable characters */
    AutoCompleteTextView f7794 = (AutoCompleteTextView) C0358.f6674.findViewById(2131296403);

    /* renamed from: 櫯, reason: contains not printable characters */
    EditText f7791 = (EditText) C0358.f6674.findViewById(2131296299);

    /* renamed from: ˮ͈, reason: contains not printable characters */
    CheckBox f7785 = (CheckBox) C0358.f6674.findViewById(2131296278);

    /* renamed from: ȃ, reason: contains not printable characters */
    CheckBox f7783 = (CheckBox) C0358.f6674.findViewById(2131296359);

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private Button f7786 = (Button) C0358.f6674.findViewById(2131296263);

    /* renamed from: 岱, reason: contains not printable characters */
    private Button f7789 = (Button) C0358.f6674.findViewById(2131296260);

    C0767() {
        AutoCompleteTextView autoCompleteTextView;
        String str;
        EditText editText;
        String str2;
        this.f7778.setOnClickListener(this.f7784);
        this.f7780.setOnClickListener(this.f7793);
        this.f7779.setText("Server: " + C0358.f6667.f4851);
        this.f7781.setVisibility((C0358.f6667.f4810 == null || C0358.f6667.f4810.length() <= 0) ? 4 : 0);
        this.f7780.setOnClickListener(this.f7793);
        CheckBox checkBox = this.f7785;
        String strM655 = C0358.f6687.m655("save_login", 0);
        String str3 = strM655 == null ? null : strM655;
        checkBox.setChecked(str3 == null ? false : Boolean.parseBoolean(str3));
        this.f7785.setOnCheckedChangeListener(this.f7782);
        CheckBox checkBox2 = this.f7783;
        String strM6552 = C0358.f6687.m655("save_password", 0);
        String str4 = strM6552 == null ? null : strM6552;
        checkBox2.setChecked(str4 == null ? false : Boolean.parseBoolean(str4));
        this.f7783.setOnCheckedChangeListener(this.f7792);
        this.f7781.setOnClickListener(this.f7787);
        this.f7786.setOnClickListener(this.f7788);
        this.f7789.setOnClickListener(this.f7790);
        if (oc.f3247 != null && oc.f3247.f799 != null && oc.f3247.f799.length() > 0) {
            autoCompleteTextView = this.f7794;
            str = oc.f3247.f799;
        } else {
            autoCompleteTextView = this.f7794;
            String strM6553 = C0358.f6687.m655("last_login", 0);
            str = strM6553 == null ? null : strM6553;
        }
        autoCompleteTextView.setText(str);
        if (oc.f3247 != null && oc.f3247.f798 != null && oc.f3247.f798.length() > 0) {
            editText = this.f7791;
            str2 = oc.f3247.f798;
        } else {
            editText = this.f7791;
            String strM6554 = C0358.f6687.m655("last_password", 0);
            str2 = strM6554 == null ? null : strM6554;
        }
        editText.setText(str2);
        this.f7778.setVisibility(C0358.f6688.f6695 ? 0 : 4);
        this.f7786.setVisibility(C0358.f6667.f4834 != null ? 0 : 4);
        this.f7789.setVisibility((C0358.f6667.f4773 == null || !(C0358.f6667.f4771 == pj.aux.RagnarevivalCom || C0358.f6667.f4771 == pj.aux.RebirthRO_Ancyker)) ? 4 : 0);
        je.m704(2131296320);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1458() {
        boolean zIsChecked = this.f7785.isChecked();
        C0358.f6687.m658("save_login", 0, String.valueOf(zIsChecked));
        if (zIsChecked) {
            C0358.f6687.m658("last_login", 0, this.f7794.getText().toString());
        } else {
            C0358.f6687.m658("last_login", 0, null);
        }
        boolean zIsChecked2 = this.f7783.isChecked();
        C0358.f6687.m658("save_password", 0, String.valueOf(zIsChecked2));
        if (zIsChecked2) {
            C0358.f6687.m658("last_password", 0, this.f7791.getText().toString());
        } else {
            C0358.f6687.m658("last_password", 0, null);
        }
    }
}
