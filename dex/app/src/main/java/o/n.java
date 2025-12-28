package o;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class n extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    View.OnClickListener f2322;

    /* renamed from: ą, reason: contains not printable characters */
    View.OnClickListener f2323;

    /* renamed from: ȃ, reason: contains not printable characters */
    lq f2324;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    TextView f2325;

    /* renamed from: 櫯, reason: contains not printable characters */
    Button f2326;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f2327;

    n() {
        super(2130903097);
        this.f2324 = new lq();
        this.f2322 = new o(this);
        this.f2323 = new p(this);
        this.f2326 = (Button) this.f1994.findViewById(2131296435);
        this.f2325 = (TextView) this.f1994.findViewById(2131296434);
        this.f2325.setMovementMethod(LinkMovementMethod.getInstance());
        this.f1994.setOnTouchListener(new q(this));
    }

    @SuppressLint({"NewApi"})
    /* renamed from: Ć, reason: contains not printable characters */
    final void m872() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1994.getLayoutParams();
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.removeRule(13);
        }
        layoutParams.topMargin = ((int) this.f2324.f2016) - this.f1994.getHeight();
        layoutParams.leftMargin = ((int) this.f2324.f2017) - (this.f1994.getWidth() / 2);
        this.f1994.setLayoutParams(layoutParams);
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        if (this.f2324.f2017 != 0.0f || this.f2324.f2016 != 0.0f) {
            m872();
        } else {
            mo772();
        }
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        this.f2325.setText("");
        this.f2326.setVisibility(4);
        C0358.f6674.f42.f1752.mo439();
    }
}
