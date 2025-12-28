package o;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roworkshop.andro.c_activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ij extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    TextView f1613;

    /* renamed from: ą, reason: contains not printable characters */
    TextView f1614;

    /* renamed from: Ć, reason: contains not printable characters */
    TextView f1615;

    /* renamed from: ć, reason: contains not printable characters */
    TextView f1616;

    /* renamed from: ċ, reason: contains not printable characters */
    TextView f1617;

    /* renamed from: đ, reason: contains not printable characters */
    Button f1618;

    /* renamed from: Ē, reason: contains not printable characters */
    TextView f1619;

    /* renamed from: ē, reason: contains not printable characters */
    TextView f1620;

    /* renamed from: Ė, reason: contains not printable characters */
    TextView f1621;

    /* renamed from: ė, reason: contains not printable characters */
    TextView f1622;

    /* renamed from: Ę, reason: contains not printable characters */
    TextView f1623;

    /* renamed from: ę, reason: contains not printable characters */
    TextView f1624;

    /* renamed from: ȃ, reason: contains not printable characters */
    TextView f1625;

    /* renamed from: Ȋ, reason: contains not printable characters */
    TextView f1626;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    TextView f1627;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    TextView f1628;

    /* renamed from: ܕ, reason: contains not printable characters */
    Button f1629;

    /* renamed from: ঽ্, reason: contains not printable characters */
    View.OnClickListener f1630;

    /* renamed from: 㥳, reason: contains not printable characters */
    TextView f1631;

    /* renamed from: 䒧, reason: contains not printable characters */
    Button f1632;

    /* renamed from: 囃, reason: contains not printable characters */
    TextView f1633;

    /* renamed from: 岱, reason: contains not printable characters */
    TextView f1634;

    /* renamed from: 庸, reason: contains not printable characters */
    Button f1635;

    /* renamed from: 廂, reason: contains not printable characters */
    TextView f1636;

    /* renamed from: 櫯, reason: contains not printable characters */
    TextView f1637;

    /* renamed from: 纫, reason: contains not printable characters */
    Button f1638;

    /* renamed from: 躆, reason: contains not printable characters */
    Button f1639;

    /* renamed from: 鷭, reason: contains not printable characters */
    TextView f1640;

    /* renamed from: 띥, reason: contains not printable characters */
    TextView f1641;

    ij(LayoutInflater layoutInflater) {
        super(2130903137);
        this.f1630 = new ik(this);
        this.f1640 = (TextView) this.f1994.findViewById(2131296276);
        this.f1637 = (TextView) this.f1994.findViewById(2131296351);
        this.f1627 = (TextView) this.f1994.findViewById(2131296352);
        this.f1625 = (TextView) this.f1994.findViewById(2131296353);
        this.f1613 = (TextView) this.f1994.findViewById(2131296354);
        this.f1614 = (TextView) this.f1994.findViewById(2131296355);
        this.f1638 = (Button) this.f1994.findViewById(2131296279);
        this.f1632 = (Button) this.f1994.findViewById(2131296257);
        this.f1639 = (Button) this.f1994.findViewById(2131296266);
        this.f1629 = (Button) this.f1994.findViewById(2131296268);
        this.f1635 = (Button) this.f1994.findViewById(2131296261);
        this.f1618 = (Button) this.f1994.findViewById(2131296262);
        this.f1615 = (TextView) this.f1994.findViewById(2131296269);
        this.f1616 = (TextView) this.f1994.findViewById(2131296431);
        this.f1628 = (TextView) this.f1994.findViewById(2131296432);
        this.f1634 = (TextView) this.f1994.findViewById(2131296493);
        this.f1626 = (TextView) this.f1994.findViewById(2131296494);
        this.f1617 = (TextView) this.f1994.findViewById(2131296496);
        this.f1619 = (TextView) this.f1994.findViewById(2131296357);
        this.f1641 = (TextView) this.f1994.findViewById(2131296501);
        this.f1621 = (TextView) this.f1994.findViewById(2131296502);
        this.f1623 = (TextView) this.f1994.findViewById(2131296503);
        this.f1620 = (TextView) this.f1994.findViewById(2131296504);
        this.f1631 = (TextView) this.f1994.findViewById(2131296508);
        this.f1622 = (TextView) this.f1994.findViewById(2131296509);
        this.f1624 = (TextView) this.f1994.findViewById(2131296510);
        this.f1636 = (TextView) this.f1994.findViewById(2131296512);
        this.f1633 = (TextView) this.f1994.findViewById(2131296514);
        this.f1638.setOnClickListener(this.f1630);
        this.f1632.setOnClickListener(this.f1630);
        this.f1629.setOnClickListener(this.f1630);
        this.f1639.setOnClickListener(this.f1630);
        this.f1635.setOnClickListener(this.f1630);
        this.f1618.setOnClickListener(this.f1630);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static void m674(TextView textView, int i, int i2) {
        if (i2 == 0) {
            textView.setText(String.valueOf(i));
        } else {
            textView.setText(String.valueOf(i) + " + " + i2);
        }
    }

    /* renamed from: Ć, reason: contains not printable characters */
    final void m675() {
        C1035 c1035 = C0358.f6664.f2004;
        if (c1035 == null) {
            return;
        }
        if (!(this.f1994.getParent() != null)) {
            return;
        }
        this.f1636.setText(String.valueOf(c1035.f8624));
        this.f1638.setEnabled(c1035.f8624 >= c1035.f8581 && c1035.f8581 > 0);
        this.f1632.setEnabled(c1035.f8624 >= c1035.f8582 && c1035.f8582 > 0);
        this.f1639.setEnabled(c1035.f8624 >= c1035.f8583 && c1035.f8583 > 0);
        this.f1629.setEnabled(c1035.f8624 >= c1035.f8584 && c1035.f8584 > 0);
        this.f1635.setEnabled(c1035.f8624 >= c1035.f8585 && c1035.f8585 > 0);
        this.f1618.setEnabled(c1035.f8624 >= c1035.f8586 && c1035.f8586 > 0);
        TextView textView = this.f1615;
        int i = c1035.f8581;
        textView.setText(i > 0 ? String.valueOf(i) : "");
        TextView textView2 = this.f1616;
        int i2 = c1035.f8582;
        textView2.setText(i2 > 0 ? String.valueOf(i2) : "");
        TextView textView3 = this.f1628;
        int i3 = c1035.f8583;
        textView3.setText(i3 > 0 ? String.valueOf(i3) : "");
        TextView textView4 = this.f1634;
        int i4 = c1035.f8584;
        textView4.setText(i4 > 0 ? String.valueOf(i4) : "");
        TextView textView5 = this.f1626;
        int i5 = c1035.f8585;
        textView5.setText(i5 > 0 ? String.valueOf(i5) : "");
        TextView textView6 = this.f1617;
        int i6 = c1035.f8586;
        textView6.setText(i6 > 0 ? String.valueOf(i6) : "");
        m674(this.f1640, c1035.f8626, c1035.f8627);
        m674(this.f1637, c1035.f8615, c1035.f8587);
        m674(this.f1627, c1035.f8614, c1035.f8588);
        m674(this.f1625, c1035.f8608, c1035.f8589);
        m674(this.f1613, c1035.f8580, c1035.f8628);
        m674(this.f1614, c1035.f8612, c1035.f8590);
        this.f1619.setText(String.valueOf(String.valueOf(c1035.f8620)) + " + " + String.valueOf(c1035.f8634));
        this.f1641.setText(String.valueOf(String.valueOf(c1035.f8597)) + (C0358.f6667.f4806 ? " ~ " : " + ") + String.valueOf(c1035.f8629));
        this.f1620.setText(String.valueOf(String.valueOf(c1035.f8598)) + " + " + String.valueOf(c1035.f8599));
        this.f1631.setText(String.valueOf(String.valueOf(c1035.f8623)) + " + " + String.valueOf(c1035.f8600));
        this.f1621.setText(String.valueOf(c1035.f8601));
        this.f1622.setText(String.valueOf(c1035.f8602));
        if (c1035.f8603 > 0) {
            this.f1622.append(" + " + c1035.f8603);
        }
        this.f1623.setText(String.valueOf(c1035.f8617));
        this.f1624.setText(String.valueOf(200 - ((int) (c1035.f8604 / 10.0d))));
        this.f1633.setText(C0358.f6664.f2004.f8369 != null ? C0358.f6664.f2004.f8369 : "None");
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        c_activity c_activityVar = C0358.f6674;
        ((ImageView) C0358.f6674.findViewById(2131296412)).setImageBitmap(C0358.f6674.f42.f1776[1]);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1994.getLayoutParams();
        layoutParams.addRule(3, 2131296279);
        this.f1994.setLayoutParams(layoutParams);
        m675();
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        c_activity c_activityVar = C0358.f6674;
        ((ImageView) C0358.f6674.findViewById(2131296412)).setImageBitmap(C0358.f6674.f42.f1776[0]);
    }
}
