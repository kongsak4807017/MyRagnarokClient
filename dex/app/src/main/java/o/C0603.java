package o;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: o.䗣, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0603 {

    /* renamed from: Ą, reason: contains not printable characters */
    RelativeLayout f7401;

    /* renamed from: ą, reason: contains not printable characters */
    TextView f7402;

    /* renamed from: Ć, reason: contains not printable characters */
    TextView f7403;

    /* renamed from: ć, reason: contains not printable characters */
    TextView f7404;

    /* renamed from: ȃ, reason: contains not printable characters */
    Bitmap f7405;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    int f7406;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    ImageView f7407;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f7408;

    /* renamed from: 鷭, reason: contains not printable characters */
    C1008 f7409;

    C0603(C1008 c1008, int i, int i2) {
        this.f7408 = 0;
        this.f7409 = c1008;
        this.f7408 = i;
        this.f7406 = i2;
        String strM510 = C0358.f6685.f1030.m510(this.f7409.f8502, true, false);
        Bitmap bitmap = C0358.f6674.f42.f1790.get(strM510);
        if (bitmap != null) {
            this.f7405 = bitmap;
        } else {
            this.f7405 = C0358.f6674.f42.f1815;
            C0358.f6685.mo139(new RunnableC0659(this, strM510));
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final RelativeLayout m1380(RelativeLayout relativeLayout, boolean z) {
        this.f7401 = relativeLayout;
        this.f7402 = (TextView) this.f7401.findViewById(2131296390);
        this.f7404 = (TextView) this.f7401.findViewById(2131296391);
        this.f7403 = (TextView) this.f7401.findViewById(2131296392);
        this.f7407 = (ImageView) this.f7401.findViewById(2131296389);
        m1379(z);
        return this.f7401;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1379(boolean z) {
        this.f7402.setText(this.f7409.m1592(C0358.f6685.f1030.f967));
        this.f7402.setTextColor(this.f7409.m1587());
        if (!z) {
            TextView textView = this.f7403;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(183);
            textView.setText(String.format(strM649 == null ? "MSG183" : strM649, Integer.valueOf(this.f7409.f8500)));
        } else {
            TextView textView2 = this.f7403;
            cv cvVar2 = C0358.f6685;
            String strM6492 = C0358.f6687.m649(183);
            textView2.setText(String.format(strM6492 == null ? "MSG183" : strM6492, Integer.valueOf(this.f7409.f8500)));
        }
        TextView textView3 = this.f7404;
        StringBuilder sb = new StringBuilder(" ");
        cv cvVar3 = C0358.f6685;
        String strM6493 = C0358.f6687.m649(370);
        textView3.setText(String.valueOf(sb.append(strM6493 == null ? "MSG370" : strM6493).append(pa.m973(this.f7408)).toString()));
        this.f7407.setImageBitmap(this.f7405);
        if (this.f7409 == null) {
            this.f7402.setText((CharSequence) null);
            this.f7403.setText((CharSequence) null);
            this.f7404.setText((CharSequence) null);
            this.f7407.setImageBitmap(null);
        }
    }
}
