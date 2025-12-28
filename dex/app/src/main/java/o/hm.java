package o;

import android.graphics.LightingColorFilter;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class hm extends BaseAdapter {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    View.OnClickListener f1489 = new hn(this);

    /* renamed from: 櫯, reason: contains not printable characters */
    View.OnClickListener f1490;

    /* renamed from: 鷭, reason: contains not printable characters */
    ol[] f1491;

    hm(ol[] olVarArr, View.OnClickListener onClickListener) {
        this.f1491 = olVarArr;
        this.f1490 = onClickListener;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1491.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final int m621(RelativeLayout relativeLayout) {
        for (int i = 0; i < this.f1491.length; i++) {
            if (relativeLayout == this.f1491[i].f3341) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        RelativeLayout relativeLayout = (RelativeLayout) ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(2130903134, (ViewGroup) null);
        this.f1491[i].f3341 = relativeLayout;
        ol olVar = this.f1491[i];
        TextView textView = (TextView) olVar.f3341.findViewById(2131296265);
        ImageView imageView = (ImageView) olVar.f3341.findViewById(2131296297);
        TextView textView2 = (TextView) olVar.f3341.findViewById(2131296259);
        TextView textView3 = (TextView) olVar.f3341.findViewById(2131296282);
        Button button = (Button) olVar.f3341.findViewById(2131296279);
        textView.setText(olVar.f3343.f1427);
        if (olVar.f3344.f1405 && olVar.f3342) {
            button.setVisibility(0);
        } else {
            button.setVisibility(4);
        }
        button.setOnClickListener(this.f1489);
        if (olVar.f3344.f1407 > 0) {
            textView2.setText("Lv : " + olVar.f3344.f1407);
            olVar.f3341.setBackgroundColor(-13421773);
            imageView.setColorFilter(new LightingColorFilter(-1, 0));
        } else {
            textView2.setText("Not learned");
            olVar.f3341.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            imageView.setColorFilter(new LightingColorFilter(-4473925, 0));
        }
        je jeVar = C0358.f6674.f42;
        jeVar.m730(imageView, C0358.f6685.f1030.m511(C0358.f6685.f1030.f968.m613(olVar.f3344.f1409).f1429), jeVar.f1821, null);
        if (olVar.f3344.f1407 > 0) {
            if (olVar.f3344.f1408 == 0) {
                textView3.setText("Passive");
            } else {
                textView3.setText("SP : " + olVar.f3344.f1406);
            }
        } else {
            textView3.setText((CharSequence) null);
        }
        olVar.f3341.setOnClickListener(this.f1490);
        return relativeLayout;
    }
}
