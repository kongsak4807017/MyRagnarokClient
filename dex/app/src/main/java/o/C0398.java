package o;

import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.roworkshop.andro.c_activity;
import java.text.SimpleDateFormat;
import java.util.Date;
import o.C1035;

/* renamed from: o.ѥ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C0398 extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    TextView f6738;

    /* renamed from: ą, reason: contains not printable characters */
    TextView f6739;

    /* renamed from: Ć, reason: contains not printable characters */
    TextView f6740;

    /* renamed from: ć, reason: contains not printable characters */
    TextView f6741;

    /* renamed from: ċ, reason: contains not printable characters */
    TextView f6742;

    /* renamed from: đ, reason: contains not printable characters */
    Button f6743;

    /* renamed from: Ē, reason: contains not printable characters */
    ProgressBar f6744;

    /* renamed from: ē, reason: contains not printable characters */
    ProgressBar f6745;

    /* renamed from: ȃ, reason: contains not printable characters */
    TextView f6746;

    /* renamed from: Ȋ, reason: contains not printable characters */
    TextView f6747;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    TextView f6748;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    TextView f6749;

    /* renamed from: ܕ, reason: contains not printable characters */
    TextView f6750;

    /* renamed from: 䒧, reason: contains not printable characters */
    TextView f6751;

    /* renamed from: 岱, reason: contains not printable characters */
    TextView f6752;

    /* renamed from: 庸, reason: contains not printable characters */
    Button f6753;

    /* renamed from: 櫯, reason: contains not printable characters */
    TextView f6754;

    /* renamed from: 纫, reason: contains not printable characters */
    TextView f6755;

    /* renamed from: 躆, reason: contains not printable characters */
    TextView f6756;

    /* renamed from: 鷭, reason: contains not printable characters */
    TextView f6757;

    public C0398(LayoutInflater layoutInflater) {
        super(2130903139);
        this.f6757 = (TextView) this.f1994.findViewById(2131296276);
        this.f6754 = (TextView) this.f1994.findViewById(2131296351);
        this.f6748 = (TextView) this.f1994.findViewById(2131296352);
        this.f6746 = (TextView) this.f1994.findViewById(2131296353);
        this.f6738 = (TextView) this.f1994.findViewById(2131296354);
        this.f6739 = (TextView) this.f1994.findViewById(2131296355);
        this.f6740 = (TextView) this.f1994.findViewById(2131296358);
        this.f6741 = (TextView) this.f1994.findViewById(2131296515);
        this.f6749 = (TextView) this.f1994.findViewById(2131296522);
        this.f6752 = (TextView) this.f1994.findViewById(2131296528);
        this.f6747 = (TextView) this.f1994.findViewById(2131296521);
        this.f6742 = (TextView) this.f1994.findViewById(2131296533);
        this.f6751 = (TextView) this.f1994.findViewById(2131296537);
        this.f6755 = (TextView) this.f1994.findViewById(2131296534);
        this.f6756 = (TextView) this.f1994.findViewById(2131296524);
        this.f6750 = (TextView) this.f1994.findViewById(2131296299);
        this.f6753 = (Button) this.f1994.findViewById(2131296536);
        this.f6743 = (Button) this.f1994.findViewById(2131296535);
        this.f6744 = (ProgressBar) this.f1994.findViewById(2131296529);
        this.f6745 = (ProgressBar) this.f1994.findViewById(2131296520);
    }

    /* renamed from: Ć, reason: contains not printable characters */
    final void m1318() {
        C1035.Cif cif = C0358.f6664.f2004.f8632;
        C1035.C1038 c1038 = C0358.f6664.f2004.f8632.f8661;
        if (cif == null || c1038 == null) {
            return;
        }
        this.f6747.setText(String.valueOf(c1038.f8688) + "/" + c1038.f8686);
        this.f6745.setMax(c1038.f8686);
        this.f6745.setProgress(c1038.f8688);
        this.f6752.setText(String.valueOf(c1038.f8693) + "/" + c1038.f8691);
        this.f6744.setMax(c1038.f8691);
        this.f6744.setProgress(c1038.f8693);
        this.f6757.setText(String.valueOf((int) cif.f8667));
        this.f6754.setText(String.valueOf((int) cif.f8658));
        this.f6748.setText(String.valueOf((int) cif.f8656));
        this.f6746.setText(String.valueOf((int) cif.f8644));
        this.f6738.setText(String.valueOf((int) cif.f8645));
        this.f6739.setText(String.valueOf((int) cif.f8646));
        this.f6740.setText(String.valueOf((int) cif.f8647));
        this.f6741.setText(String.valueOf((int) cif.f8659));
        this.f6749.setText(String.valueOf((int) c1038.f8687));
        this.f6755.setText(String.valueOf(cif.f8669));
        this.f6742.setText(String.valueOf((int) c1038.f8683));
        this.f6751.setText(String.valueOf(cif.f8660));
        this.f6756.setText(String.valueOf(new SimpleDateFormat("MM/dd HH:mm").format(new Date(cif.f8662 * 1000))));
        this.f6750.setText(c1038.f8690);
        this.f6753.setOnClickListener(new ViewOnClickListenerC0864(this));
        this.f6743.setOnClickListener(new ViewOnClickListenerC0610(this));
        md mdVarM818 = C0358.f6669.m818(c1038.f8689);
        if (mdVarM818 == null) {
            return;
        }
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
