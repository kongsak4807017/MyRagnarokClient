package o;

import android.graphics.Point;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roworkshop.andro.c_activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class aj {

    /* renamed from: Ą, reason: contains not printable characters */
    private SpannableString f661;

    /* renamed from: ȃ, reason: contains not printable characters */
    private mj f662;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    Point f663;

    /* renamed from: 櫯, reason: contains not printable characters */
    long f664;

    /* renamed from: 鷭, reason: contains not printable characters */
    RelativeLayout f665;

    aj(md mdVar, String str, int i, long j) {
        this.f662 = mdVar;
        m431(str, i);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m430() {
        lq lqVarM814 = C0358.f6669.m814(this.f662.f2076);
        if (this.f665 == null && C0358.f6674.f42.f1777 != null) {
            this.f665 = (RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903121, (ViewGroup) null);
            C0358.f6674.f42.f1777.addView(this.f665);
            C0358.f6674.f42.f1777.bringChildToFront(this.f665);
            ((TextView) this.f665.findViewById(2131296434)).setText(this.f661);
            this.f665.measure(0, 0);
            this.f663 = new Point(this.f665.getMeasuredWidth(), this.f665.getMeasuredHeight());
        }
        Point point = new Point((int) lqVarM814.f2017, (int) (C0358.f6669.f2058.y - (lqVarM814.f2016 + ((C0358.f6674.getResources().getDisplayMetrics().densityDpi / 160.0f) * 45.0f))));
        c_activity c_activityVar = C0358.f6674;
        je.m714(this.f665, point, this.f663);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m431(String str, int i) {
        this.f661 = C0698.m1426(str, i, false);
        this.f664 = System.currentTimeMillis() + 5000;
        m430();
        if (this.f665 != null) {
            TextView textView = (TextView) this.f665.findViewById(2131296434);
            textView.setText(this.f661);
            textView.setLinkTextColor((-16777216) | i);
        }
    }
}
