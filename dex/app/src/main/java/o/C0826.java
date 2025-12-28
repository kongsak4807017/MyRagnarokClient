package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roworkshop.andro.c_point;
import java.util.Arrays;

/* renamed from: o.稕, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0826 extends BaseAdapter {

    /* renamed from: 鷭, reason: contains not printable characters */
    C0757[] f7938;

    C0826() {
        this.f7938 = new C0757[nd.valuesCustom().length];
        int i = 0;
        for (nd ndVar : nd.valuesCustom()) {
            cv cvVar = C0358.f6685;
            if (cv.m524(ndVar.ordinal())) {
                int i2 = i;
                i++;
                this.f7938[i2] = new C0757(ndVar);
            }
        }
        this.f7938 = (C0757[]) Arrays.copyOf(this.f7938, i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f7938.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f7938[i];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0757 c0757 = this.f7938[i];
        c0757.f7751 = (RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903057, (ViewGroup) null);
        c0757.f7749 = (TextView) c0757.f7751.findViewById(2131296265);
        c0757.f7748 = (ImageView) c0757.f7751.findViewById(2131296297);
        c0757.f7749.setText(c0757.f7750.ordinal() + ". /" + c0757.f7750.name());
        ImageView imageView = c0757.f7748;
        cv cvVar = C0358.f6685;
        imageView.setImageBitmap(cv.m527(c0757.f7750.ordinal(), new c_point(64, 64)));
        return this.f7938[i].f7751;
    }
}
