package o;

import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.roworkshop.andro.c_activity;
import o.C1035;

/* renamed from: o.囩, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C0653 extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    TextView f7542;

    /* renamed from: ą, reason: contains not printable characters */
    TextView f7543;

    /* renamed from: Ć, reason: contains not printable characters */
    TextView f7544;

    /* renamed from: ć, reason: contains not printable characters */
    TextView f7545;

    /* renamed from: ċ, reason: contains not printable characters */
    TextView f7546;

    /* renamed from: đ, reason: contains not printable characters */
    Button f7547;

    /* renamed from: Ē, reason: contains not printable characters */
    Button f7548;

    /* renamed from: ē, reason: contains not printable characters */
    ProgressBar f7549;

    /* renamed from: Ė, reason: contains not printable characters */
    ProgressBar f7550;

    /* renamed from: ȃ, reason: contains not printable characters */
    TextView f7551;

    /* renamed from: Ȋ, reason: contains not printable characters */
    TextView f7552;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    TextView f7553;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    TextView f7554;

    /* renamed from: ܕ, reason: contains not printable characters */
    Button f7555;

    /* renamed from: 㥳, reason: contains not printable characters */
    ProgressBar f7556;

    /* renamed from: 䒧, reason: contains not printable characters */
    TextView f7557;

    /* renamed from: 岱, reason: contains not printable characters */
    TextView f7558;

    /* renamed from: 庸, reason: contains not printable characters */
    Button f7559;

    /* renamed from: 櫯, reason: contains not printable characters */
    TextView f7560;

    /* renamed from: 纫, reason: contains not printable characters */
    TextView f7561;

    /* renamed from: 躆, reason: contains not printable characters */
    EditText f7562;

    /* renamed from: 鷭, reason: contains not printable characters */
    TextView f7563;

    /* renamed from: 띥, reason: contains not printable characters */
    ProgressBar f7564;

    public C0653(LayoutInflater layoutInflater) {
        super(2130903138);
        this.f7563 = (TextView) this.f1994.findViewById(2131296276);
        this.f7560 = (TextView) this.f1994.findViewById(2131296351);
        this.f7553 = (TextView) this.f1994.findViewById(2131296352);
        this.f7551 = (TextView) this.f1994.findViewById(2131296353);
        this.f7542 = (TextView) this.f1994.findViewById(2131296354);
        this.f7543 = (TextView) this.f1994.findViewById(2131296355);
        this.f7544 = (TextView) this.f1994.findViewById(2131296358);
        this.f7545 = (TextView) this.f1994.findViewById(2131296515);
        this.f7554 = (TextView) this.f1994.findViewById(2131296522);
        this.f7558 = (TextView) this.f1994.findViewById(2131296528);
        this.f7552 = (TextView) this.f1994.findViewById(2131296521);
        this.f7546 = (TextView) this.f1994.findViewById(2131296534);
        this.f7561 = (TextView) this.f1994.findViewById(2131296493);
        this.f7557 = (TextView) this.f1994.findViewById(2131296533);
        this.f7562 = (EditText) this.f1994.findViewById(2131296299);
        this.f7555 = (Button) this.f1994.findViewById(2131296516);
        this.f7559 = (Button) this.f1994.findViewById(2131296536);
        this.f7547 = (Button) this.f1994.findViewById(2131296535);
        this.f7548 = (Button) this.f1994.findViewById(2131296532);
        this.f7549 = (ProgressBar) this.f1994.findViewById(2131296527);
        this.f7564 = (ProgressBar) this.f1994.findViewById(2131296526);
        this.f7556 = (ProgressBar) this.f1994.findViewById(2131296529);
        this.f7550 = (ProgressBar) this.f1994.findViewById(2131296520);
    }

    /* renamed from: Ć, reason: contains not printable characters */
    final void m1409() {
        C1035.Cif cif = C0358.f6664.f2004.f8618;
        C1035.C1038 c1038 = C0358.f6664.f2004.f8618.f8661;
        if (cif == null || c1038 == null) {
            return;
        }
        this.f7563.setText(String.valueOf((int) cif.f8667));
        this.f7560.setText(String.valueOf((int) cif.f8658));
        this.f7553.setText(String.valueOf((int) cif.f8656));
        this.f7551.setText(String.valueOf((int) cif.f8644));
        this.f7542.setText(String.valueOf((int) cif.f8645));
        this.f7543.setText(String.valueOf((int) cif.f8646));
        this.f7544.setText(String.valueOf((int) cif.f8647));
        this.f7545.setText(String.valueOf((int) cif.f8659));
        this.f7554.setText(String.valueOf((int) c1038.f8687));
        this.f7546.setText(String.valueOf(cif.f8657) + "/" + cif.f8648);
        this.f7552.setText(String.valueOf(c1038.f8688) + "/" + c1038.f8686);
        this.f7550.setMax(c1038.f8686);
        this.f7550.setProgress(c1038.f8688);
        this.f7558.setText(String.valueOf(c1038.f8693) + "/" + c1038.f8691);
        this.f7556.setMax(c1038.f8691);
        this.f7556.setProgress(c1038.f8693);
        this.f7564.setMax(100);
        this.f7564.setProgress(c1038.f8681);
        this.f7561.setText(String.valueOf((int) c1038.f8681));
        TextView textView = this.f7557;
        c_activity c_activityVar = C0358.f6674;
        textView.setText(je.m711(c1038.f8683));
        if (cif.f8652 == 1) {
            this.f7555.setVisibility(4);
            this.f7562.setEnabled(false);
            this.f7562.setInputType(524288);
            this.f7562.setTextColor(-1);
            this.f7562.setText(c1038.f8690);
        } else {
            this.f7555.setVisibility(0);
            this.f7562.setEnabled(true);
            this.f7562.setText(c1038.f8690);
        }
        if (this.f7547.getVisibility() != 4) {
            this.f7555.setOnClickListener(new ViewOnClickListenerC0809(this));
        }
        this.f7559.setOnClickListener(new ViewOnClickListenerC0820(this));
        this.f7547.setOnClickListener(new ViewOnClickListenerC0553(this));
        this.f7548.setOnClickListener(new ViewOnClickListenerC0623(this));
        md mdVarM818 = C0358.f6669.m818(c1038.f8689);
        if (mdVarM818 == null) {
            return;
        }
        mdVarM818.m847(c1038);
        mdVarM818.m838(c1038);
        mdVarM818.m836(c1038);
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        c_activity c_activityVar = C0358.f6674;
        ((ImageView) C0358.f6674.findViewById(2131296412)).setImageBitmap(C0358.f6674.f42.f1776[1]);
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        c_activity c_activityVar = C0358.f6674;
        ((ImageView) C0358.f6674.findViewById(2131296412)).setImageBitmap(C0358.f6674.f42.f1776[0]);
    }
}
