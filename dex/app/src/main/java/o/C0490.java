package o;

import android.app.AlertDialog;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;

/* renamed from: o.ῡ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C0490 extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    TextView f6957;

    /* renamed from: ą, reason: contains not printable characters */
    Button f6958;

    /* renamed from: Ć, reason: contains not printable characters */
    Button f6959;

    /* renamed from: ć, reason: contains not printable characters */
    EditText f6960;

    /* renamed from: ċ, reason: contains not printable characters */
    int f6961;

    /* renamed from: ȃ, reason: contains not printable characters */
    TextView f6962;

    /* renamed from: Ȋ, reason: contains not printable characters */
    TextView f6963;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    TextView f6964;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    ImageView f6965;

    /* renamed from: 岱, reason: contains not printable characters */
    TextView f6966;

    /* renamed from: 櫯, reason: contains not printable characters */
    GridView f6967;

    /* renamed from: 纫, reason: contains not printable characters */
    private View.OnClickListener f6968;

    /* renamed from: 鷭, reason: contains not printable characters */
    GridView f6969;

    public C0490() {
        super(2130903044);
        this.f6961 = -1;
        this.f6968 = new ViewOnClickListenerC1015(this);
        this.f6964 = (TextView) this.f1994.findViewById(2131296277);
        this.f6962 = (TextView) this.f1994.findViewById(2131296302);
        this.f6957 = (TextView) this.f1994.findViewById(2131296282);
        this.f6959 = (Button) this.f1994.findViewById(2131296279);
        LinearLayout linearLayout = (LinearLayout) this.f1994.findViewById(2131296280);
        this.f6969 = (GridView) linearLayout.findViewById(2131296294);
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(2131296295);
        this.f6967 = (GridView) linearLayout2.findViewById(2131296301);
        this.f6963 = (TextView) linearLayout2.findViewById(2131296284);
        LinearLayout linearLayout3 = (LinearLayout) linearLayout2.findViewById(2131296296);
        this.f6965 = (ImageView) linearLayout3.findViewById(2131296297);
        this.f6966 = (TextView) linearLayout3.findViewById(2131296276);
        LinearLayout linearLayout4 = (LinearLayout) linearLayout2.findViewById(2131296298);
        this.f6958 = (Button) linearLayout4.findViewById(2131296300);
        this.f6960 = (EditText) linearLayout4.findViewById(2131296299);
        this.f6969.setOnItemClickListener(new C1013(this));
        this.f6967.setOnItemClickListener(new C1016(this));
        this.f6958.setOnClickListener(new ViewOnClickListenerC1062(this));
        this.f6963.setMovementMethod(new ScrollingMovementMethod());
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final C0760[] m1352() {
        C1019 c1019 = (C1019) this.f6967.getAdapter();
        if (c1019 == null) {
            return new C0760[0];
        }
        return (C0760[]) c1019.f8521;
    }

    /* renamed from: o.ῡ$鷭, reason: contains not printable characters */
    class C0491 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f6971;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f6972;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f6973;

        C0491() {
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final C0491 m1351(C0760[] c0760Arr) {
        C0491 c0491 = new C0491();
        c0491.f6973 = C0358.f6679.f6831.f8575;
        c0491.f6972 = C0358.f6679.f6831.f8574;
        for (C0760 c0760 : c0760Arr) {
            int i = c0760.f7762 * c0760.f7761;
            c0491.f6971 += i;
            if (i > c0491.f6972) {
                int i2 = i - c0491.f6972;
                c0491.f6972 = 0;
                if (i2 > c0491.f6973) {
                    return null;
                }
                c0491.f6973 -= i2;
            } else {
                c0491.f6972 -= i;
            }
        }
        return c0491;
    }

    final void e_() {
        if (m1351(m1352()) == null) {
            return;
        }
        this.f6964.setText("Cash points : " + pa.m973(r4.f6973));
        this.f6962.setText("Kafra points : " + pa.m973(r4.f6972));
        this.f6957.setText("Purchase : " + pa.m973(r4.f6971));
    }

    final void f_() {
        C0760 c0760 = (C0760) this.f6969.getItemAtPosition(this.f6961);
        boolean z = c0760 != null;
        this.f6965.setVisibility(z ? 0 : 8);
        this.f6966.setVisibility(z ? 0 : 8);
        this.f6963.setVisibility(z ? 0 : 8);
        this.f6960.setVisibility(z ? 0 : 8);
        this.f6958.setVisibility(z ? 0 : 8);
        if (z) {
            TextView textView = this.f6966;
            C0432 c0432M1648 = C0358.f6685.f1030.f967.m1648(c0760.f7763);
            textView.setText(c0432M1648 == null ? null : c0432M1648.m1328(true));
            TextView textView2 = this.f6963;
            C0432 c0432M16482 = C0358.f6685.f1030.f967.m1648(c0760.f7763);
            textView2.setText(je.m710(c0432M16482 == null ? null : c0432M16482.f6852, true));
            this.f6963.setScrollY(0);
            je jeVar = C0358.f6674.f42;
            ImageView imageView = this.f6965;
            C1008 c1008 = new C1008(c0760.f7763);
            jeVar.m730(imageView, C0358.f6685.f1030.m510(c1008.f8502, c1008.f8491, false), jeVar.f1815, null);
        }
    }

    public final void g_() {
        C0760[] c0760Arr = new C0760[C0358.f6679.f6831.f8573.size()];
        for (int i = 0; i < c0760Arr.length; i++) {
            c0760Arr[i] = new C0760(C0358.f6679.f6831.f8573.get(i).f8578, C0358.f6679.f6831.f8573.get(i).f8577, 0, C0358.f6679.f6831.f8573.get(i).f8579);
        }
        if (this.f6961 >= c0760Arr.length) {
            this.f6961 = -1;
        }
        this.f6969.setAdapter((ListAdapter) new C1019(c0760Arr));
        e_();
        f_();
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        g_();
        this.f6967.setAdapter((ListAdapter) null);
        if (C0358.f6667.f4858 && C0358.f6681.endsWith("@ragnadeep.com")) {
            if (C0358.f6679.f6831.f8575 == 0 && C0358.f6679.f6831.f8574 == 0) {
                new AlertDialog.Builder(C0358.f6674).setMessage("You haven't got any cash points. Go to character select screen to purchase cash points").show();
            }
            this.f6959.setText("Buy cash points");
            this.f6959.setOnClickListener(this.f6968);
        }
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        this.f6969.setAdapter((ListAdapter) null);
        this.f6967.setAdapter((ListAdapter) null);
        C0358.f6671.mo454(new C0748());
    }
}
