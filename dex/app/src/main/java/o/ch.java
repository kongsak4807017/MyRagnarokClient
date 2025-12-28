package o;

import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roworkshop.andro.c_activity;
import java.text.NumberFormat;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ch extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    TextView f891;

    /* renamed from: ą, reason: contains not printable characters */
    TextView f892;

    /* renamed from: Ć, reason: contains not printable characters */
    TextView f893;

    /* renamed from: ć, reason: contains not printable characters */
    TextView f894;

    /* renamed from: ċ, reason: contains not printable characters */
    ProgressBar f895;

    /* renamed from: ȃ, reason: contains not printable characters */
    TextView f896;

    /* renamed from: Ȋ, reason: contains not printable characters */
    ProgressBar f897;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    TextView f898;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    ProgressBar f899;

    /* renamed from: 岱, reason: contains not printable characters */
    ProgressBar f900;

    /* renamed from: 櫯, reason: contains not printable characters */
    TextView f901;

    /* renamed from: 纫, reason: contains not printable characters */
    public C0026 f902;

    /* renamed from: 鷭, reason: contains not printable characters */
    TextView f903;

    /* renamed from: o.ch$鷭, reason: contains not printable characters */
    public class C0026 extends ll {

        /* renamed from: Ą, reason: contains not printable characters */
        TextView f904;

        /* renamed from: ą, reason: contains not printable characters */
        TextView f905;

        /* renamed from: ȃ, reason: contains not printable characters */
        TextView f907;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        TextView f908;

        /* renamed from: 櫯, reason: contains not printable characters */
        ProgressBar f909;

        /* renamed from: 鷭, reason: contains not printable characters */
        ProgressBar f910;

        C0026() {
            super(2130903111);
            this.f910 = (ProgressBar) this.f1994.findViewById(2131296293);
            this.f909 = (ProgressBar) this.f1994.findViewById(2131296335);
            this.f907 = (TextView) this.f1994.findViewById(2131296284);
            this.f904 = (TextView) this.f1994.findViewById(2131296282);
            this.f908 = (TextView) this.f1994.findViewById(2131296302);
            this.f905 = (TextView) this.f1994.findViewById(2131296276);
        }

        @Override // o.ll
        /* renamed from: ȃ */
        public final void mo445() {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) C0358.f6674.f42.f1823.getLayoutParams();
            layoutParams.addRule(3, this.f1994.getId());
            C0358.f6674.f42.f1823.setLayoutParams(layoutParams);
        }

        @Override // o.ll
        /* renamed from: Ą */
        public final void mo443() {
        }
    }

    ch(c_activity c_activityVar) {
        super(2130903110);
        this.f903 = (TextView) this.f1994.findViewById(2131296326);
        this.f901 = (TextView) this.f1994.findViewById(2131296456);
        this.f898 = (TextView) this.f1994.findViewById(2131296453);
        this.f896 = (TextView) this.f1994.findViewById(2131296449);
        this.f891 = (TextView) this.f1994.findViewById(2131296448);
        this.f892 = (TextView) this.f1994.findViewById(2131296447);
        this.f893 = (TextView) this.f1994.findViewById(2131296451);
        this.f894 = (TextView) this.f1994.findViewById(2131296455);
        this.f899 = (ProgressBar) this.f1994.findViewById(2131296293);
        this.f900 = (ProgressBar) this.f1994.findViewById(2131296335);
        this.f897 = (ProgressBar) this.f1994.findViewById(2131296452);
        this.f895 = (ProgressBar) this.f1994.findViewById(2131296454);
        this.f902 = new C0026();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m479(C1035 c1035) {
        this.f893.setText("Base Lv. " + c1035.f8367);
        this.f902.f907.setText("Lv" + c1035.f8367);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final void m478(C1035 c1035) {
        this.f898.setText("Job Lv. " + c1035.f8631);
        this.f902.f904.setText("JLv" + c1035.f8631);
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final void m477(C1035 c1035) {
        if (c1035.f8619 < 1) {
            this.f897.setVisibility(4);
            this.f902.f910.setVisibility(4);
            return;
        }
        this.f897.setVisibility(0);
        this.f902.f910.setVisibility(0);
        this.f897.setMax(100);
        this.f897.setProgress((int) ((c1035.f8591 * 100) / c1035.f8619));
        this.f902.f910.setMax(this.f897.getMax());
        this.f902.f910.setProgress(this.f897.getProgress());
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    final void m476(C1035 c1035) {
        if (c1035.f8633 < 1) {
            this.f895.setVisibility(4);
            this.f902.f909.setVisibility(4);
            return;
        }
        this.f895.setVisibility(0);
        this.f902.f909.setVisibility(0);
        this.f895.setMax(100);
        this.f895.setProgress((int) ((c1035.f8630 * 100) / c1035.f8633));
        this.f902.f909.setMax(this.f895.getMax());
        this.f902.f909.setProgress(this.f895.getProgress());
    }

    /* renamed from: Ą, reason: contains not printable characters */
    final void m472(C1035 c1035) {
        this.f891.setText(c1035.f8346 + " / " + c1035.f8358);
        this.f899.setMax(c1035.f8358);
        this.f899.setProgress(c1035.f8346);
    }

    /* renamed from: ą, reason: contains not printable characters */
    final void m473(C1035 c1035) {
        this.f896.setText(c1035.f8364 + " / " + c1035.f8356);
        this.f900.setMax(c1035.f8356);
        this.f900.setProgress(c1035.f8364);
    }

    /* renamed from: Ć, reason: contains not printable characters */
    final void m474(C1035 c1035) {
        String str = NumberFormat.getInstance().format(c1035.f8636);
        this.f901.setText(String.valueOf(str) + " Z");
        this.f902.f908.setText(String.valueOf(str) + " Z");
    }

    /* renamed from: ć, reason: contains not printable characters */
    final void m475(C1035 c1035) {
        this.f894.setText("Weight : " + (c1035.f8639 / 10) + " / " + (c1035.f8643 / 10));
        this.f902.f905.setText("W: " + pa.m973(c1035.f8639 / 10) + " / " + pa.m973(c1035.f8643 / 10));
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        this.f902.mo439();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) C0358.f6674.f42.f1823.getLayoutParams();
        layoutParams.addRule(3, this.f1994.getId());
        C0358.f6674.f42.f1823.setLayoutParams(layoutParams);
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        c_activity c_activityVar = C0358.f6674;
        ((ImageView) C0358.f6674.findViewById(2131296410)).setImageBitmap(C0358.f6674.f42.f1759[0]);
    }
}
