package o;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.roworkshop.andro.c_activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class y extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    Button f5867;

    /* renamed from: ą, reason: contains not printable characters */
    private View.OnClickListener f5868;

    /* renamed from: Ć, reason: contains not printable characters */
    private View.OnClickListener f5869;

    /* renamed from: ć, reason: contains not printable characters */
    private View.OnClickListener f5870;

    /* renamed from: ȃ, reason: contains not printable characters */
    Button f5871;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    Button f5872;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private View.OnClickListener f5873;

    /* renamed from: 岱, reason: contains not printable characters */
    private View.OnClickListener f5874;

    /* renamed from: 櫯, reason: contains not printable characters */
    Button f5875;

    /* renamed from: 鷭, reason: contains not printable characters */
    Button f5876;

    y() {
        super(2130903104);
        this.f5868 = new z(this);
        this.f5869 = new aa(this);
        this.f5870 = new ab(this);
        this.f5873 = new ac(this);
        this.f5874 = new ad(this);
        this.f5875 = (Button) this.f1994.findViewById(2131296279);
        this.f5876 = (Button) this.f1994.findViewById(2131296300);
        this.f5872 = (Button) this.f1994.findViewById(2131296404);
        this.f5871 = (Button) this.f1994.findViewById(2131296264);
        this.f5867 = (Button) this.f1994.findViewById(2131296260);
        this.f5875.setOnClickListener(this.f5868);
        this.f5871.setOnClickListener(this.f5873);
        this.f5872.setOnClickListener(this.f5870);
        this.f5876.setOnClickListener(this.f5869);
        this.f5867.setOnClickListener(this.f5874);
    }

    @Override // o.ll
    /* renamed from: ą */
    final void mo772() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1994.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.addRule(13);
        this.f1994.setLayoutParams(layoutParams);
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1994.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.addRule(13);
            this.f1994.setLayoutParams(layoutParams);
        }
        c_activity c_activityVar = C0358.f6674;
        ((ImageView) C0358.f6674.findViewById(2131296414)).setImageBitmap(C0358.f6674.f42.f1784[1]);
        this.f5867.setVisibility((C0358.f6664 == null || C0358.f6664.f2004 == null || !C0358.f6664.f2004.f8371) ? 8 : 0);
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        c_activity c_activityVar = C0358.f6674;
        if (((ImageView) C0358.f6674.findViewById(2131296414)) != null) {
            c_activity c_activityVar2 = C0358.f6674;
            ((ImageView) C0358.f6674.findViewById(2131296414)).setImageBitmap(C0358.f6674.f42.f1784[0]);
        }
    }
}
