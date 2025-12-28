package o;

import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import java.text.NumberFormat;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class s {

    /* renamed from: Ą, reason: contains not printable characters */
    int f4969;

    /* renamed from: ą, reason: contains not printable characters */
    int f4970;

    /* renamed from: Ć, reason: contains not printable characters */
    C0906 f4971;

    /* renamed from: ć, reason: contains not printable characters */
    C0906 f4972;

    /* renamed from: ȃ, reason: contains not printable characters */
    Button f4974;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    Button f4976;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    boolean f4977;

    /* renamed from: 岱, reason: contains not printable characters */
    boolean f4979;

    /* renamed from: 櫯, reason: contains not printable characters */
    lg f4980;

    /* renamed from: 鷭, reason: contains not printable characters */
    RelativeLayout f4983;

    /* renamed from: Ȋ, reason: contains not printable characters */
    View.OnClickListener f4975 = new t(this);

    /* renamed from: ċ, reason: contains not printable characters */
    View.OnClickListener f4973 = new u(this);

    /* renamed from: 纫, reason: contains not printable characters */
    View.OnClickListener f4981 = new v(this);

    /* renamed from: 䒧, reason: contains not printable characters */
    View.OnClickListener f4978 = new w(this);

    /* renamed from: 躆, reason: contains not printable characters */
    View.OnClickListener f4982 = new x(this);

    s(C1008 c1008, int i, int i2, boolean z) {
        this.f4980 = new lg(c1008, i);
        this.f4969 = i2;
        this.f4977 = z;
    }

    s(C1008 c1008, int i, int i2, int i3, boolean z) {
        this.f4980 = new lg(c1008, i);
        this.f4969 = i2;
        this.f4970 = i3;
        this.f4977 = z;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1086() {
        if (!this.f4979 || this.f4980.f1964 == null) {
            return;
        }
        C1008 c1008 = C0358.f6664.f2004.f8592.get(Integer.valueOf(this.f4980.f1967));
        if (c1008 == null) {
            C0358.f6664.f2004.f8592.put(Integer.valueOf(this.f4980.f1967), this.f4980.f1964);
        } else {
            c1008.f8500 += this.f4980.f1964.f8500;
        }
        C0358.f6674.f42.f1810.m1465(ng.CART);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1088(int i, boolean z) {
        if (this.f4980.f1964 == null) {
            return;
        }
        r rVar = (r) C0358.f6674.f42.f1750.f2025.getAdapter();
        if (this.f4979) {
            if (i == -1) {
                i = this.f4980.f1964.f8500;
            }
            this.f4980.f1964.f8500 -= i;
            if (this.f4980.f1964.f8500 <= 0) {
                rVar.f4968.remove(this);
                rVar.f4968.add(new s(null, 0, 0, false));
            }
        } else {
            rVar.f4968.remove(this);
            rVar.f4968.add(new s(null, 0, 0, 0, false));
        }
        C0358.f6674.f42.f1750.f2025.setAdapter((ListAdapter) new r(rVar.f4968, z));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1087(int i) {
        this.f4969 = i;
        if (this.f4976 != null) {
            this.f4976.setText(String.valueOf(NumberFormat.getInstance().format(this.f4969)) + " Z");
        }
    }
}
