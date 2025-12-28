package o;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class be extends BaseAdapter {

    /* renamed from: 鷭, reason: contains not printable characters */
    bf[] f790 = new bf[C0358.f6664.f2004.f8596.f684.length];

    be() {
        for (int i = 0; i < this.f790.length; i++) {
            this.f790[i] = new bf(C0358.f6664.f2004.f8596.f684[i], i);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f790.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f790[i];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        bf bfVar = this.f790[i];
        bfVar.f795 = (RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903107, (ViewGroup) null);
        bfVar.f794 = (TextView) bfVar.f795.findViewById(2131296265);
        bfVar.f793 = (ImageView) bfVar.f795.findViewById(2131296297);
        if (!bfVar.f792.f689) {
            bfVar.f793.setImageBitmap(null);
        } else if (bfVar.f792.f693 == np.LEADER) {
            bfVar.f793.setImageResource(R.drawable.checkbox_on_background);
        } else {
            bfVar.f793.setImageResource(R.drawable.checkbox_off_background);
        }
        if (bfVar.f792.f689) {
            bfVar.f794.setText(String.valueOf(bfVar.f792.f695) + " (" + bfVar.f792.f694 + ")");
        } else {
            bfVar.f794.setText(bfVar.f792.f695);
        }
        return this.f790[i].f795;
    }
}
