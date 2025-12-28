package o;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.NumberFormat;
import o.lo;

/* renamed from: o.ᢛ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0479 extends BaseAdapter {

    /* renamed from: 鷭, reason: contains not printable characters */
    C1023[] f6931;

    C0479() {
        this.f6931 = new C1023[0];
        this.f6931 = new C1023[C0358.f6664.f2004.f8635.f8300.size()];
        for (int i = 0; i < C0358.f6664.f2004.f8635.f8300.size(); i++) {
            this.f6931[i] = new C1023(C0358.f6664.f2004.f8635.f8300.get(i));
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f6931.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f6931[i];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.f6931[i].f8533.f8327;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1023 c1023 = this.f6931[i];
        c1023.f8532 = (RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903069, (ViewGroup) null);
        c1023.f8529 = (ImageView) c1023.f8532.findViewById(2131296297);
        c1023.f8525 = (TextView) c1023.f8532.findViewById(2131296265);
        c1023.f8526 = (TextView) c1023.f8532.findViewById(2131296277);
        c1023.f8527 = (TextView) c1023.f8532.findViewById(2131296284);
        c1023.f8528 = (TextView) c1023.f8532.findViewById(2131296302);
        c1023.f8531 = (TextView) c1023.f8532.findViewById(2131296282);
        c1023.f8525.setText(c1023.f8533.f8320);
        c1023.f8526.setText(C0358.f6664.f2004.f8635.m1554(c1023.f8533.f8324).f8313);
        TextView textView = c1023.f8527;
        lo.C0060 c0060 = C0358.f6685.f1030.f985.f2006.get(Integer.valueOf(c1023.f8533.f8315));
        textView.setText(c0060 != null ? c0060.f2013 : "Poring");
        c1023.f8528.setText("Lv " + ((int) c1023.f8533.f8316));
        if (c1023.f8533.f8317 <= 0 || C0358.f6674.f42.f1748.f7697.f9044 == 0) {
            c1023.f8531.setText((CharSequence) null);
        } else {
            c1023.f8531.setText(NumberFormat.getInstance().format(c1023.f8533.f8317) + " EXP (" + ((c1023.f8533.f8317 * 100) / C0358.f6674.f42.f1748.f7697.f9044) + "%)");
        }
        c1023.f8529.setVisibility(c1023.f8533.f8322 ? 0 : 4);
        if (c1023.f8533.f8322) {
            Bitmap bitmap = c1023.f8530 != null ? c1023.f8530 : C0358.f6674.f42.f1748.f7697.f9043.get(c1023.m1599());
            if (bitmap == null) {
                C0358.f6685.mo139(new RunnableC0777(c1023, c1023.f8533));
            } else {
                c1023.f8529.setImageBitmap(bitmap);
            }
        }
        return c1023.f8532;
    }
}
