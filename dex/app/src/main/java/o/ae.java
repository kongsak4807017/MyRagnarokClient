package o;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roworkshop.andro.c_activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ae {

    /* renamed from: Ą, reason: contains not printable characters */
    md f549;

    /* renamed from: ȃ, reason: contains not printable characters */
    C0014 f553;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    C0015 f554;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    Point f555;

    /* renamed from: 櫯, reason: contains not printable characters */
    C0013 f557;

    /* renamed from: 鷭, reason: contains not printable characters */
    Cif f558;

    /* renamed from: 岱, reason: contains not printable characters */
    View.OnClickListener f556 = new af(this);

    /* renamed from: ą, reason: contains not printable characters */
    RelativeLayout f550 = (RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903105, (ViewGroup) null);

    /* renamed from: Ć, reason: contains not printable characters */
    TextView f551 = (TextView) this.f550.findViewById(2131296265);

    /* renamed from: ć, reason: contains not printable characters */
    ImageView f552 = (ImageView) this.f550.findViewById(2131296297);

    /* renamed from: o.ae$if, reason: invalid class name */
    class Cif {

        /* renamed from: ȃ, reason: contains not printable characters */
        Runnable f560;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        String f561;

        /* renamed from: 櫯, reason: contains not printable characters */
        Bitmap f562;

        Cif(Bitmap bitmap, String str, Runnable runnable) {
            this.f562 = bitmap;
            this.f561 = str;
            this.f560 = runnable;
        }
    }

    /* renamed from: o.ae$ˮ͈, reason: contains not printable characters */
    class C0013 extends Cif {
        C0013(String str) {
            super(C0358.f6685.f1021, str, new ai(ae.this));
        }
    }

    /* renamed from: o.ae$鷭, reason: contains not printable characters */
    class C0015 extends Cif {
        C0015(String str) {
            super(C0358.f6685.f1010, str, new ag(ae.this));
        }
    }

    /* renamed from: o.ae$櫯, reason: contains not printable characters */
    class C0014 extends Cif {

        /* renamed from: ą, reason: contains not printable characters */
        int f564;

        /* renamed from: Ć, reason: contains not printable characters */
        int f565;

        /* renamed from: ć, reason: contains not printable characters */
        String f566;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f568;

        C0014(String str, int i, mz mzVar, int i2, int i3) {
            super(mzVar == mz.PROTECTED ? C0358.f6685.f1008 : C0358.f6685.f1019, String.valueOf(str) + "(" + i3 + "/" + i2 + ")", new ah(ae.this, i));
            this.f566 = str;
            this.f565 = i;
            this.f568 = i2;
            this.f564 = i3;
        }
    }

    ae(md mdVar) {
        this.f550.setOnClickListener(this.f556);
        this.f552.setOnClickListener(this.f556);
        this.f551.setOnClickListener(this.f556);
        this.f549 = mdVar;
        C0358.f6674.f42.f1777.addView(this.f550);
        C0358.f6674.f42.f1777.bringChildToFront(this.f550);
        this.f550.measure(0, 0);
        this.f555 = new Point(this.f550.getMeasuredWidth(), this.f550.getMeasuredHeight());
        m386();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m387() {
        if (this.f554 != null) {
            this.f558 = this.f554;
        } else if (this.f553 != null) {
            this.f558 = this.f553;
        } else {
            this.f558 = this.f557;
        }
        if (this.f558 != null) {
            this.f552.setImageBitmap(this.f558.f562);
            this.f551.setText(this.f558.f561);
            return;
        }
        md mdVar = this.f549;
        if (mdVar.f2097 != null) {
            C0358.f6674.f42.f1777.removeView(mdVar.f2097.f550);
            mdVar.f2097 = null;
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final void m386() {
        if (C0358.f6674.f44 == null) {
            return;
        }
        lq lqVarM814 = C0358.f6669.m814(this.f549.f2076);
        if (lqVarM814.f2017 <= 0.0f || lqVarM814.f2017 >= C0358.f6669.f2058.x || lqVarM814.f2016 <= 0.0f || lqVarM814.f2016 >= C0358.f6669.f2058.y) {
            this.f550.setVisibility(8);
            return;
        }
        this.f550.setVisibility(0);
        Point point = new Point((int) lqVarM814.f2017, (int) (C0358.f6674.f44.getHeight() - (lqVarM814.f2016 + ((C0358.f6674.getResources().getDisplayMetrics().densityDpi / 160.0f) * 45.0f))));
        point.y -= this.f555.y / 2;
        c_activity c_activityVar = C0358.f6674;
        je.m714(this.f550, point, this.f555);
    }
}
