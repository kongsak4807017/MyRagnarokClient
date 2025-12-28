package o;

import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class gy extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    TextView f1435;

    /* renamed from: ą, reason: contains not printable characters */
    TextView f1436;

    /* renamed from: Ć, reason: contains not printable characters */
    TextView f1437;

    /* renamed from: ć, reason: contains not printable characters */
    ImageView f1438;

    /* renamed from: ċ, reason: contains not printable characters */
    private View.OnClickListener f1439;

    /* renamed from: ȃ, reason: contains not printable characters */
    SeekBar f1440;

    /* renamed from: Ȋ, reason: contains not printable characters */
    private View.OnClickListener f1441;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    Button f1442;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    gt f1443;

    /* renamed from: 岱, reason: contains not printable characters */
    SeekBar.OnSeekBarChangeListener f1444;

    /* renamed from: 櫯, reason: contains not printable characters */
    Button f1445;

    /* renamed from: 鷭, reason: contains not printable characters */
    TextView f1446;

    gy() {
        super(2130903132);
        this.f1444 = new gz(this);
        this.f1441 = new ha(this);
        this.f1439 = new hb(this);
        this.f1435 = (TextView) this.f1994.findViewById(2131296282);
        this.f1446 = (TextView) this.f1994.findViewById(2131296265);
        this.f1436 = (TextView) this.f1994.findViewById(2131296259);
        this.f1437 = (TextView) this.f1994.findViewById(2131296277);
        this.f1438 = (ImageView) this.f1994.findViewById(2131296297);
        this.f1440 = (SeekBar) this.f1994.findViewById(2131296311);
        this.f1445 = (Button) this.f1994.findViewById(2131296300);
        this.f1442 = (Button) this.f1994.findViewById(2131296279);
        this.f1446.setMovementMethod(new ScrollingMovementMethod());
        this.f1445.setOnClickListener(this.f1441);
        this.f1442.setOnClickListener(this.f1439);
        this.f1440.setOnSeekBarChangeListener(this.f1444);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m614(int i) {
        gx gxVarM613 = C0358.f6685.f1030.f968.m613(this.f1443.f1409);
        this.f1436.setText("Lv. : " + i + " / " + this.f1443.f1407);
        if (gxVarM613.f1422 != null && i > 0 && i <= gxVarM613.f1422.length) {
            this.f1437.setText("SP : " + gxVarM613.f1422[i - 1]);
        } else {
            this.f1437.setText("SP : ???");
        }
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        gx gxVarM613 = C0358.f6685.f1030.f968.m613(this.f1443.f1409);
        this.f1435.setText(gxVarM613.f1427);
        je jeVar = C0358.f6674.f42;
        jeVar.m730(this.f1438, C0358.f6685.f1030.m511(C0358.f6685.f1030.f968.m613(this.f1443.f1409).f1429), jeVar.f1821, null);
        this.f1446.setText(je.m710(gxVarM613.f1428, false));
        this.f1442.setEnabled(!(this.f1443.f1408 == 0) && this.f1443.f1407 > 0);
        this.f1445.setEnabled(!(this.f1443.f1408 == 0) && this.f1443.f1407 > 0);
        if (this.f1443.f1407 > 0) {
            this.f1436.setText("Lv : " + this.f1443.f1407);
        } else {
            this.f1436.setText((CharSequence) null);
        }
        if (this.f1443.f1407 > 0) {
            if (this.f1443.f1408 == 0) {
                this.f1437.setText("Passive");
            } else {
                this.f1437.setText("SP : " + this.f1443.f1406);
            }
        } else if (gxVarM613.f1422 != null) {
            this.f1437.setText("SP : " + gxVarM613.f1422[0] + " (Lv1)");
        } else {
            this.f1437.setText((CharSequence) null);
        }
        if (this.f1443.f1407 > 0 && gxVarM613.f1424) {
            if (!(this.f1443.f1408 == 0)) {
                this.f1440.setVisibility(0);
                this.f1440.setMax(this.f1443.f1407 - 1);
                this.f1440.setProgress(this.f1443.f1407 - 1);
                m614(this.f1443.f1407);
                return;
            }
        }
        this.f1440.setVisibility(4);
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
    }
}
