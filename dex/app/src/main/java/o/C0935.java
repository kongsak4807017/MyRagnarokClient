package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

/* renamed from: o.鬠, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0935 extends BaseAdapter {

    /* renamed from: 鷭, reason: contains not printable characters */
    C0998[] f8232 = new C0998[C0358.f6664.f2004.f8613.length];

    C0935() {
        for (int i = 0; i < C0358.f6664.f2004.f8613.length; i++) {
            this.f8232[i] = new C0998(C0358.f6664.f2004.f8613[i]);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f8232.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f8232[i];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.f8232[i].f8470.f7707;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0998 c0998 = this.f8232[i];
        c0998.f8469 = (RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903062, (ViewGroup) null);
        c0998.f8468 = (RadioButton) c0998.f8469.findViewById(2131296350);
        c0998.f8468.setText(C0358.f6679.f6830.get(Integer.valueOf(c0998.f8470.f7707)));
        c0998.f8468.setChecked(c0998.f8470.f7706);
        return this.f8232[i].f8469;
    }
}
