package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import com.roworkshop.andro.c_activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class au extends ku {

    /* renamed from: 纫, reason: contains not printable characters */
    nm f714 = nm.EACH_TAKE;

    /* renamed from: 䒧, reason: contains not printable characters */
    nn f710 = nn.KILLER;

    /* renamed from: 躆, reason: contains not printable characters */
    no f715 = no.PICKER;

    /* renamed from: ܕ, reason: contains not printable characters */
    CompoundButton.OnCheckedChangeListener f709 = new av(this);

    /* renamed from: 庸, reason: contains not printable characters */
    CompoundButton.OnCheckedChangeListener f712 = new aw(this);

    /* renamed from: đ, reason: contains not printable characters */
    CompoundButton.OnCheckedChangeListener f703 = new ax(this);

    /* renamed from: Ē, reason: contains not printable characters */
    View.OnClickListener f704 = new ay(this);

    /* renamed from: 鷭, reason: contains not printable characters */
    ScrollView f716 = (ScrollView) C0358.f6674.getLayoutInflater().inflate(2130903108, (ViewGroup) null);

    /* renamed from: 櫯, reason: contains not printable characters */
    EditText f713 = (EditText) this.f716.findViewById(2131296299);

    /* renamed from: ˮ͈, reason: contains not printable characters */
    TextView f707 = (TextView) this.f716.findViewById(2131296265);

    /* renamed from: ȃ, reason: contains not printable characters */
    RadioButton f705 = (RadioButton) this.f716.findViewById(2131296350);

    /* renamed from: Ą, reason: contains not printable characters */
    RadioButton f698 = (RadioButton) this.f716.findViewById(2131296440);

    /* renamed from: ą, reason: contains not printable characters */
    TextView f699 = (TextView) this.f716.findViewById(2131296259);

    /* renamed from: Ć, reason: contains not printable characters */
    RadioButton f700 = (RadioButton) this.f716.findViewById(2131296441);

    /* renamed from: ć, reason: contains not printable characters */
    RadioButton f701 = (RadioButton) this.f716.findViewById(2131296442);

    /* renamed from: ˮ͍, reason: contains not printable characters */
    TextView f708 = (TextView) this.f716.findViewById(2131296282);

    /* renamed from: 岱, reason: contains not printable characters */
    RadioButton f711 = (RadioButton) this.f716.findViewById(2131296443);

    /* renamed from: Ȋ, reason: contains not printable characters */
    RadioButton f706 = (RadioButton) this.f716.findViewById(2131296444);

    /* renamed from: ċ, reason: contains not printable characters */
    Button f702 = (Button) this.f716.findViewById(2131296279);

    au() {
        this.f705.setOnCheckedChangeListener(this.f709);
        this.f698.setOnCheckedChangeListener(this.f709);
        this.f701.setOnCheckedChangeListener(this.f712);
        this.f700.setOnCheckedChangeListener(this.f712);
        this.f711.setOnCheckedChangeListener(this.f703);
        this.f706.setOnCheckedChangeListener(this.f703);
        this.f702.setOnClickListener(this.f704);
    }

    @Override // o.ku
    /* renamed from: 櫯, reason: contains not printable characters */
    final boolean mo440() {
        return this.f716.getParent() != null;
    }

    @Override // o.ku
    final void h_() {
        if (!(this.f716.getParent() != null)) {
            C0358.f6674.f42.f1777.addView(this.f716);
            C0358.f6674.f42.f1799.push(this);
        }
        C0358.f6674.f42.f1777.bringChildToFront(this.f716);
        c_activity c_activityVar = C0358.f6674;
        ((ImageView) C0358.f6674.findViewById(2131296412)).setImageBitmap(C0358.f6674.f42.f1776[1]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.ku
    /* renamed from: ˮ͈, reason: contains not printable characters */
    public final void mo439() {
        if (this.f716.getParent() != null) {
            C0358.f6674.f42.f1777.removeView(this.f716);
            while (C0358.f6674.f42.f1799.remove(this)) {
            }
        }
        c_activity c_activityVar = C0358.f6674;
        ((ImageView) C0358.f6674.findViewById(2131296412)).setImageBitmap(C0358.f6674.f42.f1776[0]);
    }
}
