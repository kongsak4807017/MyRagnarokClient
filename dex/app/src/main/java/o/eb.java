package o;

import android.content.res.ColorStateList;
import android.support.v4.internal.view.SupportMenu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Arrays;
import o.lo;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class eb extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    ImageView[] f1151;

    /* renamed from: ą, reason: contains not printable characters */
    TextView[] f1152;

    /* renamed from: Ć, reason: contains not printable characters */
    ImageView f1153;

    /* renamed from: ć, reason: contains not printable characters */
    EditText f1154;

    /* renamed from: ċ, reason: contains not printable characters */
    Button f1155;

    /* renamed from: ȃ, reason: contains not printable characters */
    EditText f1156;

    /* renamed from: Ȋ, reason: contains not printable characters */
    TextView f1157;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    EditText f1158;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    TextView f1159;

    /* renamed from: ܕ, reason: contains not printable characters */
    C0906 f1160;

    /* renamed from: 䒧, reason: contains not printable characters */
    C1008[] f1161;

    /* renamed from: 岱, reason: contains not printable characters */
    TextView f1162;

    /* renamed from: 庸, reason: contains not printable characters */
    ColorStateList f1163;

    /* renamed from: 櫯, reason: contains not printable characters */
    Button f1164;

    /* renamed from: 纫, reason: contains not printable characters */
    int[] f1165;

    /* renamed from: 躆, reason: contains not printable characters */
    int f1166;

    /* renamed from: 鷭, reason: contains not printable characters */
    EditText f1167;

    eb() {
        super(2130903118);
        this.f1151 = new ImageView[5];
        this.f1152 = new TextView[5];
        this.f1165 = new int[5];
        this.f1161 = new C1008[5];
        this.f1167 = (EditText) this.f1994.findViewById(2131296472);
        this.f1164 = (Button) this.f1994.findViewById(2131296279);
        this.f1158 = (EditText) this.f1994.findViewById(2131296462);
        this.f1156 = (EditText) this.f1994.findViewById(2131296473);
        this.f1151[0] = (ImageView) this.f1994.findViewById(2131296474);
        this.f1151[1] = (ImageView) this.f1994.findViewById(2131296475);
        this.f1151[2] = (ImageView) this.f1994.findViewById(2131296476);
        this.f1151[3] = (ImageView) this.f1994.findViewById(2131296477);
        this.f1151[4] = (ImageView) this.f1994.findViewById(2131296478);
        this.f1152[0] = (TextView) this.f1994.findViewById(2131296464);
        this.f1152[1] = (TextView) this.f1994.findViewById(2131296465);
        this.f1152[2] = (TextView) this.f1994.findViewById(2131296466);
        this.f1152[3] = (TextView) this.f1994.findViewById(2131296467);
        this.f1152[4] = (TextView) this.f1994.findViewById(2131296468);
        this.f1153 = (ImageView) this.f1994.findViewById(2131296471);
        this.f1154 = (EditText) this.f1994.findViewById(2131296290);
        this.f1159 = (TextView) this.f1994.findViewById(2131296480);
        this.f1162 = (TextView) this.f1994.findViewById(2131296481);
        this.f1157 = (TextView) this.f1994.findViewById(2131296482);
        this.f1163 = this.f1159.getTextColors();
        this.f1155 = (Button) this.f1994.findViewById(2131296479);
        Arrays.fill(this.f1165, -1);
        this.f1164.setOnClickListener(new ec(this));
        this.f1155.setOnClickListener(new ed(this));
        ee eeVar = new ee(this);
        for (int i = 0; i < this.f1151.length; i++) {
            this.f1151[i].setOnClickListener(eeVar);
            this.f1151[i].setImageBitmap(null);
            this.f1152[i].setVisibility(4);
        }
    }

    /* renamed from: Ć, reason: contains not printable characters */
    final long m572() {
        try {
            return Long.parseLong(this.f1154.getText().toString());
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m575(int i, int i2, int i3, String str) {
        this.f1166 = i;
        this.f1164.setVisibility(4);
        this.f1157.setVisibility(0);
        TextView textView = this.f1157;
        StringBuilder sbAppend = new StringBuilder("Lv").append(i3).append(" ");
        lo.C0060 c0060 = C0358.f6685.f1030.f985.f2006.get(Integer.valueOf(i2));
        textView.setText(sbAppend.append(c0060 != null ? c0060.f2013 : "Poring").toString());
        if (str != null) {
            this.f1167.setText(str);
        }
        this.f1167.setEnabled(false);
    }

    /* renamed from: ć, reason: contains not printable characters */
    final void m573() {
        long jM572 = m572() / 50;
        for (int i = 0; i < this.f1161.length; i++) {
            if (this.f1161[i] != null) {
                jM572 += 2500;
            }
        }
        this.f1159.setText("Tax: " + pa.m973(jM572) + " Z");
        if (jM572 > C0358.f6664.f2004.f8636) {
            this.f1159.setTextColor(SupportMenu.CATEGORY_MASK);
        } else {
            this.f1159.setTextColor(this.f1163);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m574(int i) {
        TextView textView = this.f1162;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(1993);
        textView.setText(String.format(strM649 == null ? "MSG1993" : strM649, Integer.valueOf(i), 2000));
        if (i > 2000) {
            this.f1162.setTextColor(SupportMenu.CATEGORY_MASK);
        } else {
            this.f1162.setTextColor(this.f1163);
        }
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        mo772();
        this.f1167.setEnabled(true);
        this.f1164.setVisibility(0);
        this.f1157.setVisibility(4);
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        C0358.f6671.mo454(new C0187());
    }
}
