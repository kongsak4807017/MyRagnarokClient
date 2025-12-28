package o;

import android.annotation.SuppressLint;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roworkshop.andro.c_point;
import o.gs;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class gq {

    /* renamed from: Ą, reason: contains not printable characters */
    c_point f1373;

    /* renamed from: ȃ, reason: contains not printable characters */
    gs.Cif f1374;

    /* renamed from: 鷭, reason: contains not printable characters */
    RelativeLayout f1377 = (RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903105, (ViewGroup) null);

    /* renamed from: 櫯, reason: contains not printable characters */
    TextView f1376 = (TextView) this.f1377.findViewById(2131296265);

    /* renamed from: ˮ͈, reason: contains not printable characters */
    ImageView f1375 = (ImageView) this.f1377.findViewById(2131296297);

    @SuppressLint({"NewApi"})
    gq(gs.Cif cif) {
        this.f1374 = cif;
        this.f1376.setText(this.f1374.f1383);
        if (this.f1374.f1384 != 0) {
            this.f1376.setTextColor(this.f1374.f1384 | ViewCompat.MEASURED_STATE_MASK);
        }
        C0358.f6674.f42.m730(this.f1375, "data/texture/" + this.f1374.f1382, null, new gr(this));
        if (this.f1374.f1381 != gs.EnumC0043.SIGNBOARD) {
            ViewGroup.LayoutParams layoutParams = this.f1376.getLayoutParams();
            layoutParams.width = -2;
            this.f1376.setLayoutParams(layoutParams);
            this.f1376.setVisibility(8);
            if (Build.VERSION.SDK_INT < 16) {
                this.f1377.setBackgroundDrawable(null);
            } else {
                this.f1377.setBackground(null);
            }
            ViewGroup.LayoutParams layoutParams2 = this.f1375.getLayoutParams();
            layoutParams2.width = -2;
            layoutParams2.height = -2;
        }
        C0358.f6674.f42.f1777.addView(this.f1377);
        C0358.f6674.f42.f1777.bringChildToFront(this.f1377);
        this.f1377.measure(0, 0);
        this.f1373 = new c_point(this.f1377.getMeasuredWidth(), this.f1377.getMeasuredHeight());
    }
}
