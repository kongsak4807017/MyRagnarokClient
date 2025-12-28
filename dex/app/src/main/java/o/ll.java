package o;

import android.R;
import android.app.AlertDialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class ll extends ku {

    /* renamed from: ġ, reason: contains not printable characters */
    public View f1994;

    /* renamed from: 鷭, reason: contains not printable characters */
    private AlertDialog f1995;

    /* renamed from: Ą */
    public abstract void mo443();

    /* renamed from: ȃ */
    public abstract void mo445();

    public ll(int i) {
        this.f1994 = C0358.f6674.getLayoutInflater().inflate(i, (ViewGroup) null);
    }

    @Override // o.ku
    /* renamed from: 櫯 */
    public final boolean mo440() {
        return this.f1994.getParent() != null;
    }

    @Override // o.ku
    public final void h_() {
        if (!(this.f1994.getParent() != null)) {
            if (C0358.f6674.f42.f1777 != null) {
                C0358.f6674.f42.f1777.addView(this.f1994);
            } else {
                ((ViewGroup) C0358.f6674.findViewById(R.id.content)).addView(this.f1994);
            }
            C0358.f6674.f42.f1799.push(this);
        }
        if (C0358.f6674.f42.f1777 != null) {
            C0358.f6674.f42.f1777.bringChildToFront(this.f1994);
            mo445();
        } else {
            ((ViewGroup) C0358.f6674.findViewById(R.id.content)).bringChildToFront(this.f1994);
        }
    }

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public final void m773() {
        if (!(this.f1994.getParent() != null)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
            builder.setView(this.f1994);
            builder.setCancelable(true);
            this.f1995 = builder.create();
            this.f1995.show();
            C0358.f6674.f42.f1799.push(this);
        }
    }

    @Override // o.ku
    /* renamed from: ˮ͈ */
    public final void mo439() {
        if (this.f1994.getParent() != null) {
            if (this.f1995 != null) {
                this.f1995.dismiss();
            } else if (C0358.f6674.f42.f1777 != null) {
                C0358.f6674.f42.f1777.removeView(this.f1994);
            } else {
                ((ViewGroup) C0358.f6674.findViewById(R.id.content)).removeView(this.f1994);
            }
            while (C0358.f6674.f42.f1799.remove(this)) {
            }
        }
        mo443();
    }

    /* renamed from: ą, reason: contains not printable characters */
    void mo772() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1994.getLayoutParams();
        layoutParams.addRule(13);
        this.f1994.setLayoutParams(layoutParams);
    }

    /* renamed from: 岱, reason: contains not printable characters */
    public final void m774() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1994.getLayoutParams();
        layoutParams.addRule(10);
        layoutParams.width = -1;
        layoutParams.addRule(2, 2131296256);
        this.f1994.setLayoutParams(layoutParams);
    }
}
